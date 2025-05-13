package List.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> livroList;

    public CatalogoLivros(){
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();

        if(!livroList.isEmpty()){
            for(Livro l : livroList){
                if(l.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisaPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();

        if(!livroList.isEmpty()){
            for(Livro l : livroList){
                if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal){
                    livrosPorIntervaloAnos.add(l);
                }
            }
        }
        return livrosPorIntervaloAnos;
    }

    public Livro pesquisarPorTitulo(String titulo){
        Livro livroPesquisado = null;

        if(!livroList.isEmpty()){
            for(Livro l : livroList){
                if(l.getLivro().equalsIgnoreCase(titulo)){
                    livroPesquisado = l;
                    break;
                }
            }
        }
        return livroPesquisado;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();

        catalogoLivros.adicionarLivro("Livro 1", "Júlio", 2020);
        catalogoLivros.adicionarLivro("Livro 2", "Júlio", 2021);
        catalogoLivros.adicionarLivro("Livro 2", "Albert", 2022);
        catalogoLivros.adicionarLivro("Livro 4", "Perônio", 2023);
        catalogoLivros.adicionarLivro("Livro 5", "Tíbio", 1985);

        System.out.println(catalogoLivros.pesquisarPorAutor("Júlio"));
        System.out.println(catalogoLivros.pesquisaPorIntervaloAnos(2020, 2022));
        System.out.println(catalogoLivros.pesquisarPorTitulo("Livro 2"));

    }

}
