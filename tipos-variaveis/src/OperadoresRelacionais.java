public class OperadoresRelacionais {
    public static void main(String[] args) {
        String nomeUm = "Mauricio";
        String nomeDois = "Mauricio";

        System.out.println(nomeUm == nomeDois);

        nomeDois = new String("Mauricio");

        System.out.println(nomeUm == nomeDois);

        System.out.println(nomeUm.equals(nomeDois));

        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;
        if (numero1 < numero2) { // true
            System.out.println("A nossa condição é verdadeira.");
        }

        System.out.println("numeroUM é igual a numeroDois? " + simNao);

        simNao = numero1 != numero2;

        System.out.println("numeroUM é igual a numeroDois? " + simNao);

        simNao = numero1 > numero2;

        System.out.println("numeroUM é igual a numeroDois? " + simNao);
    }

}
