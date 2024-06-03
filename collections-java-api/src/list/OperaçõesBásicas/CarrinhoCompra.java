package list.OperaçõesBásicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompra {
//Atributo
    private List<Item> compraCarrinho; 

    public CarrinhoCompra() {
        this.compraCarrinho = new ArrayList<>();
    }

    public void adicionarItem(String descricao) {
        compraCarrinho.add(new Item(descricao));
    }

    public void removerItem(String descricao) {
        List<Item> itensParaRemover = new ArrayList<>();
        for(Item t : compraCarrinho) {
            if(t.getDescricao().equalsIgnoreCase(descricao)) {
                itensParaRemover.add(t);
            }
        }
        compraCarrinho.removeAll(itensParaRemover);
    }

    public int obterNumeroItens() {
        return compraCarrinho.size();
    }

    public void obterDescricaoItens() {
        System.out.println(compraCarrinho);
    }

    public static void main(String[] args) {
        CarrinhoCompra carrinhoCompra = new CarrinhoCompra();

        System.out.println("Número de itens é: " + carrinhoCompra.obterNumeroItens());

        carrinhoCompra.adicionarItem("açúcar");
        System.out.println("Número de itens é: " + carrinhoCompra.obterNumeroItens());

        carrinhoCompra.obterDescricaoItens();
    }
}
