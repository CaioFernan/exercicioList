public class App {
    public static void main(String[] args) throws Exception {
        CarrinhodeCompras compras = new CarrinhodeCompras();

        compras.adicionarIten("Arroz", 18.70, 2);
        compras.adicionarIten("feijão", 5.29, 2);
        compras.adicionarIten("macarrão", 5.87, 4);

        System.err.println(compras.calcularValorTotal());
        compras.exibirItens();
    }
}
