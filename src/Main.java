import java.util.ArrayList;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        String faculdade = lerTexto("Digite o nome da faculdade: ");
        String aluno = lerTexto("Digite seu nome completo: ");
        Cabecalho cabecalho = new Cabecalho(faculdade, aluno,
                "Brenno Pimenta", "Fundamentos de Java");
        cabecalho.escrever();
        System.out.println("Responda às 15 questões digitando A, B, C, D ou E.");
        ArrayList<Questao> questoes = criarQuestoes();
        int acertos = 0;
        for (int i = 0; i < questoes.size(); i++) {
            System.out.println("\nQuestão " + (i + 1) + " de " + questoes.size());
            Questao questao = questoes.get(i);
            questao.escrevaQuestao();
            String resposta = questao.leiaResposta();
            if (questao.isCorreta(resposta)) {
                acertos++;
            }
        }
        // O fator decimal evita a divisão inteira e preserva as casas decimais.
        double percentual = acertos * 100.0 / questoes.size();
        double nota = acertos * 10.0 / questoes.size();
        Locale brasil = new Locale("pt", "BR");
        System.out.println("============================================");
        System.out.println("RESULTADO FINAL");
        System.out.println("Questões acertadas: " + acertos + " de " + questoes.size());
        System.out.printf(brasil, "Média de acerto: %.2f%%\n", percentual);
        System.out.printf(brasil, "Nota de 0 a 10: %.2f\n", nota);
        System.out.println("Obrigado por participar do quiz, " + aluno + "!");
    }

    private static String lerTexto(String mensagem) {
        String texto;
        do {
            System.out.print(mensagem);
            texto = Questao.ENTRADA.nextLine().trim();
            if (texto.isEmpty()) {
                System.out.println("Preencha este campo antes de continuar.");
            }
        } while (texto.isEmpty());
        return texto;
    }

    private static Questao criarQuestao(String pergunta, String a, String b,
            String c, String d, String e, String correta) {
        Questao questao = new Questao();
        questao.pergunta = pergunta;
        questao.opcaoA = "A) " + a;
        questao.opcaoB = "B) " + b;
        questao.opcaoC = "C) " + c;
        questao.opcaoD = "D) " + d;
        questao.opcaoE = "E) " + e;
        questao.correta = correta;
        return questao;
    }

    private static ArrayList<Questao> criarQuestoes() {
        ArrayList<Questao> questoes = new ArrayList<>();
        questoes.add(criarQuestao("Qual tipo primitivo armazena um número inteiro?", "int", "boolean", "String", "double", "char", "A"));
        questoes.add(criarQuestao("Qual comando imprime uma mensagem e muda de linha?", "Scanner.nextLine()", "System.out.println()", "System.in.read()", "Integer.parseInt()", "Math.sqrt()", "B"));
        questoes.add(criarQuestao("Qual operador compara a igualdade de dois valores int?", "=", "!=", "==", "++", "+=", "C"));
        questoes.add(criarQuestao("Qual estrutura escolhe um bloco com base em uma condição?", "import", "package", "class", "if", "new", "D"));
        questoes.add(criarQuestao("Qual estrutura repete um bloco enquanto uma condição for verdadeira?", "return", "break", "import", "class", "while", "E"));
        questoes.add(criarQuestao("O que i++ faz com uma variável inteira i?", "Aumenta i em 1", "Diminui i em 1", "Multiplica i por 2", "Zera i", "Compara i com 1", "A"));
        questoes.add(criarQuestao("Qual classe pode ler dados digitados no console?", "Math", "Scanner", "System.out", "ArrayList", "StringBuilder", "B"));
        questoes.add(criarQuestao("Qual método adiciona um elemento ao final de um ArrayList?", "get()", "size()", "add()", "set()", "clear()", "C"));
        questoes.add(criarQuestao("Qual é o índice do primeiro elemento de uma lista Java?", "1", "-1", "2", "0", "10", "D"));
        questoes.add(criarQuestao("O que lista.get(2) faz em uma lista com pelo menos três elementos?", "Remove o terceiro elemento", "Adiciona dois elementos", "Altera o segundo elemento", "Retorna a quantidade de elementos", "Retorna o terceiro elemento", "E"));
        questoes.add(criarQuestao("O que lista.size() retorna?", "A quantidade de elementos da lista", "O último elemento", "O primeiro elemento", "A soma dos elementos", "O índice do maior elemento", "A"));
        questoes.add(criarQuestao("O que lista.set(0, \"Java\") faz em uma lista não vazia?", "Remove todos os elementos", "Substitui o primeiro elemento por \"Java\"", "Adiciona \"Java\" sempre ao final", "Retorna o tamanho da lista", "Ordena a lista", "B"));
        questoes.add(criarQuestao("Qual regra descreve uma pilha?", "Primeiro a entrar, primeiro a sair", "Saída sempre em ordem alfabética", "Último a entrar, primeiro a sair", "Saída sempre do menor número", "Saída aleatória", "C"));
        questoes.add(criarQuestao("Na classe Stack, qual método remove e retorna o elemento do topo?", "push()", "peek()", "size()", "pop()", "isEmpty()", "D"));
        questoes.add(criarQuestao("Na classe Stack, qual método consulta o topo sem removê-lo?", "pop()", "push()", "clear()", "removeAll()", "peek()", "E"));
        return questoes;
    }
}
