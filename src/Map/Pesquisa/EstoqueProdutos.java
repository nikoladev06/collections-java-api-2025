package Map.Pesquisa;

import javax.print.attribute.standard.PrinterURI;
import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long, Produto> estoqueProdutosMap;

    public EstoqueProdutos() {
        this.estoqueProdutosMap = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, double preco, int quantidade) {
        estoqueProdutosMap.put(cod, new Produto(nome, preco, quantidade));
    }

    public void exibirProdutos() {
        System.out.println(estoqueProdutosMap);
    }

    public double calcularValorTotalEstoque() {
        double valorTotalEstoque = 0d;
        if(!estoqueProdutosMap.isEmpty()) {
            for(Produto p : estoqueProdutosMap.values()) {
                valorTotalEstoque += p.getQuantidade() * p.getPreco();
            }
        }
        return valorTotalEstoque;
    }

    public Produto obterProdutoMaisCaro() {
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if(!estoqueProdutosMap.isEmpty()) {
            for(Produto p : estoqueProdutosMap.values()) {
                if(p.getPreco() > maiorPreco)
                {
                    produtoMaisCaro = p;
                    maiorPreco = p.getPreco();
                }
            }
        }
        return produtoMaisCaro;
    }

    public static void main(String[] args) {
        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();
        estoqueProdutos.exibirProdutos();

        estoqueProdutos.adicionarProduto(1L, "Produto 1", 19.99, 100);
        estoqueProdutos.adicionarProduto(2L, "Produto 2", 29.99, 100);
        estoqueProdutos.adicionarProduto(3L, "Produto 3", 9.99, 100);
        estoqueProdutos.adicionarProduto(4L, "Produto 4", 1.99, 100);
        estoqueProdutos.adicionarProduto(4L, "Produto 5", 99.99, 100);


        estoqueProdutos.exibirProdutos();
        System.out.println("A soma dos preços de todo o estoque é: " + estoqueProdutos.calcularValorTotalEstoque());
        System.out.println("O produto mais caro é: " + estoqueProdutos.obterProdutoMaisCaro());
    }

}