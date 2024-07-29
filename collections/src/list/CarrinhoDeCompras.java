package list;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> itens;

    public CarrinhoDeCompras() {
        this.itens = new ArrayList<>();
    }

    public void adicionarItens(String name, Double price, Integer quantity) {
        itens.add(new Item(name, price, quantity));
    }

    public void removeItens(String name) {
        List<Item> itensToRemove = new ArrayList<>();
        for (Item item : this.itens) {
            if(item.getName().equalsIgnoreCase(name)) {
                itensToRemove.add(item);
            }
        }

        this.itens.removeAll(itensToRemove);
    }

    public Double calculateTotalValue() {
        Double sum = 0d;
        for(Item i : this.itens) {
            sum += i.getPrice() * i.getQuantity();
        }
        return sum;
    }

    public void showItens() {
        for(Item i : this.itens) {
            System.out.println("Nome: " + i.getName() + " Preco: " + i.getPrice() + " quantidade: " + i.getQuantity());
        }
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
        carrinhoDeCompras.adicionarItens("teclado", 100d, 5);
        carrinhoDeCompras.adicionarItens("mouse", 100d, 5);
        carrinhoDeCompras.adicionarItens("monitor", 100d, 5);
        carrinhoDeCompras.adicionarItens("teclado", 100d, 5);

        System.out.println(carrinhoDeCompras.calculateTotalValue());
        carrinhoDeCompras.removeItens("teclado");
        System.out.println(carrinhoDeCompras.calculateTotalValue());
        carrinhoDeCompras.showItens();
    }
}

