package List.Pesquisa;

public class Livro {
    private String livro;
    private String autor;
    private int anoPublicacao;

    public Livro(String livro, String autor, int anoPublicacao) {
        this.livro = livro;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    public String getLivro() {
        return livro;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    @Override
    public String toString() {
        return "\nLivro: " + livro + "\n" +
                "Autor: " + autor + "\n" +
                "Ano de publicação: " + anoPublicacao + "\n";
    }
}
