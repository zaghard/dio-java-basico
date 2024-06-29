public class FormatadorCep {
    public static void main(String[] args) {
        String cepFormatado = null;
        try {
            cepFormatado = formatarCep("2376506");
        } catch (CepInvalidoException e) {
            System.out.println("O Cep não corresponde as regras de negócio.");
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println(cepFormatado);
    }

    static String formatarCep(String cep) throws CepInvalidoException {
        if (cep.length() != 8)
            throw new CepInvalidoException();
        // simulando um cep formatado;
        return "23.765-064";
    }

}
