public class ExemploForArray {
    public static void main(String[] args) {
        //Em arrays o indice inicia no ZERO;
        String alunos[] = { "FELIPE", "jONAS", "JULIA", "MARCOS" };

        for (int x = 0; x < alunos.length; x++) {

            System.out.println("O aluno no indice x = " + x + " é " + alunos[x]);
        }
    }

}
