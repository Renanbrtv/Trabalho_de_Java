# Quiz — Fundamentos de Java

Trabalho do 2º período: sistema de perguntas e respostas em Java, executado no console.

## Requisitos atendidos

- Classe `Cabecalho` (Cabeçalho), com faculdade, aluno, professor e tema exibidos na execução.
- 15 questões, com cinco alternativas e uma resposta correta em cada questão.
- Uso da classe `Questao` disponibilizada pelo professor.
- Questões armazenadas em `ArrayList<Questao>`.
- Respostas A–E, aceitando letras maiúsculas e minúsculas e ignorando espaços nas extremidades.
- Quantidade de acertos, percentual com duas casas decimais e agradecimento.
- Nota de 0 a 10 como informação adicional.

## Identificação

O programa pede o nome da faculdade e o nome completo do aluno ao iniciar. Digite seus dados reais na apresentação. O professor está configurado como Brenno Pimenta; se necessário, ajuste em `src/Main.java`.

## Como executar no Windows

1. Extraia o ZIP: botão direito → Extrair tudo.
2. Tenha um **JDK 17 ou superior** instalado. O JDK inclui `java` e `javac`; apenas o JRE não é suficiente.
3. Abra o Prompt de Comando e execute `java -version` e `javac -version`. Ambos precisam funcionar. Se `javac` não for reconhecido, configure o PATH com a pasta `bin` do JDK ou use uma IDE configurada com JDK.
4. Abra a pasta extraída `quiz-java` e clique duas vezes em `executar.bat`.
5. Digite a faculdade e seu nome completo.
6. Responda às 15 questões com A, B, C, D ou E.
7. Confira o resultado final.

### Pelo terminal

Abra um terminal dentro da pasta `quiz-java` e execute:

```sh
mkdir out
javac -encoding UTF-8 -d out src/Main.java src/Cabecalho.java src/Questao.java
java -Dfile.encoding=UTF-8 -cp out Main
```

Se `out` já existir, não precisa criá-la novamente. No Linux/macOS, também é possível executar `sh executar.sh`.

### Em uma IDE

Abra a pasta como projeto Java, configure o JDK e execute o método `main` de `src/Main.java`. Os três arquivos de `src` devem estar no mesmo diretório de fontes.

## Como publicar no seu GitHub — repositório público

1. Entre em https://github.com com sua conta.
2. Clique em **+** e depois em **New repository** (ou acesse https://github.com/new).
3. No campo **Repository name**, escreva `quiz-java`.
4. Marque **Public**. O trabalho exige um repositório público de sua propriedade.
5. Clique em **Create repository**.
6. Na página criada, use **uploading an existing file**. Se o repositório já tiver arquivos, use **Add file → Upload files**.
7. Abra a pasta extraída no Explorador. Arraste o conteúdo de `quiz-java`, incluindo a pasta `src`, para a página. Envie os arquivos extraídos, não apenas o ZIP. Não envie a pasta `out`.
8. Escreva a mensagem `Adicionar sistema de quiz em Java` e clique em **Commit changes**.
9. Confira se `src/Main.java`, `src/Cabecalho.java`, `src/Questao.java` e `README.md` aparecem no repositório.
10. Copie o endereço real do repositório, por exemplo `https://github.com/SEU_USUARIO/quiz-java`.
11. Abra o endereço em uma janela anônima para confirmar que o projeto é público.

O exemplo de endereço acima precisa ser substituído pelo endereço real da sua conta.

## Entrega por email

- Destinatário: `brennocripto1@gmail.com`
- Assunto: seu nome completo com espaços substituídos por `_`, seguido de `_2_Periodo`.
- Exemplo de formato: `Seu_Nome_Completo_2_Periodo`.
- Corpo: somente o link real do seu repositório público.

Veja `ENTREGA.txt`. Substitua os campos indicados antes de enviar. A criação do ZIP não publica o repositório nem envia o email.

## P1 e P2

- **P1:** repositório público criado, projeto Java iniciado e classe `Questao` presente. Este projeto já contém a implementação completa.
- **P2:** executar as 15 questões, exibir o resultado e apresentar individualmente.
- As datas não foram informadas no enunciado: confirme a data da P1 e da P2 com o professor.

## Entenda o código para a apresentação

1. `Cabecalho` guarda os dados de identificação e os imprime com `escrever()`.
2. `Questao` guarda a pergunta, as cinco alternativas e a letra correta. `escrevaQuestao()` exibe a questão, `leiaResposta()` lê e valida a alternativa, e `isCorreta()` compara com o gabarito e retorna `true` ou `false`.
3. `Main` lê os dados, monta um `ArrayList` de 15 objetos `Questao` e usa `for` para percorrê-los.
4. O `if` incrementa `acertos` somente quando `isCorreta()` retorna `true`.
5. `acertos * 100.0 / questoes.size()` calcula o percentual. Usar `100.0` faz a conta com casas decimais.
6. `printf` com `%.2f` mostra duas casas decimais; o formato brasileiro utiliza vírgula.
7. Exemplo: 10 acertos em 15 → `66,67%` e nota `6,67`.

## Origem da classe Questao

Base fornecida pelo professor: https://github.com/brennopimenta/universidadeESN2_QUIZ

Os atributos e métodos da classe original foram mantidos. A leitura foi ajustada para compartilhar um único `Scanner` e usar `nextLine().trim()`, evitando vários leitores sobre `System.in` e permitindo validar a resposta completa. Uma cópia sem alterações está em `referencia/Questao-original.java.txt`.

`GABARITO.md` auxilia a revisão e a apresentação.
