public class PlanoOperadora2 {
    public static void main(String[] args) {
        String plano = "T"; //B /T / M;

        switch (plano) {
            case "T": {
                System.out.println("5G Youtube");
            }
            case "M": {
                System.out.println("Whatsapp e Instagram grátis");
            }
            case "B": {
                System.out.println("100 minutos de ligação");

            }
        }
    }
}
