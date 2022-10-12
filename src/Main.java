public class Main {
    public static void main(String[] args) {

        Endereco enderecoRestaurante = new Endereco("00000-000","Endereco rua tal");

        Restaurante restaurante = new Restaurante();
        restaurante.setId(1L);
        restaurante.setNomeFantasia("Restaurante Daniel");
        restaurante.setCnpj("000.000.0001-00");
        restaurante.setEndereco(enderecoRestaurante);


        System.out.println(restaurante);
        

    }
}