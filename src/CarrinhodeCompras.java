import java.util.ArrayList;
import java.util.List;

public class CarrinhodeCompras {
    private List<Item> listItem;

    public CarrinhodeCompras() {
        this.listItem = new ArrayList<>();
    }

    public void adicionarIten(String nome, double preco, int quantidade){
        listItem.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        List <Item> itensParaRemover = new ArrayList<>();
        if (listItem.isEmpty()) {
            for (Item I : listItem) {
                if (I.getNome() == nome) {
                    itensParaRemover.add(I);
                }
            }
            listItem.removeAll(itensParaRemover);
        }else{
            System.out.println("A lista está fazia");
        }
    }

    public double calcularValorTotal(){
        double valorTotal = 0d;
        for (Item item : listItem) {
            double valorItem = item.getPreco() * item.getQuantidade();
            valorTotal = valorTotal + valorItem;
        }
        return valorTotal;
    }
    public void exibirItens(){
        System.out.println(this.listItem);
    }
}
