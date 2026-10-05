public class Cabecalho {
    private final String faculdade;
    private final String aluno;
    private final String professor;
    private final String tema;

    public Cabecalho(String faculdade, String aluno, String professor, String tema) {
        this.faculdade = faculdade;
        this.aluno = aluno;
        this.professor = professor;
        this.tema = tema;
    }

    public void escrever() {
        System.out.println("============================================");
        System.out.println("TRABALHO - QUIZ DE PERGUNTAS E RESPOSTAS");
        System.out.println("Faculdade: " + faculdade);
        System.out.println("Aluno: " + aluno);
        System.out.println("Professor: " + professor);
        System.out.println("Período: 2º período");
        System.out.println("Tema: " + tema);
        System.out.println("============================================");
    }
}
