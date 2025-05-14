package Set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContado(String nome, int numero) {
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContatos() {
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatosPorNome = new HashSet<>();
        for(Contato c : contatoSet) {
            if(c.getNome().startsWith(nome)) {
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero) {
        Contato contatoAtualizado = null;
        for(Contato c : contatoSet) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }


    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContatos();

        agendaContatos.adicionarContado("Maria", 1698988842);
        agendaContatos.adicionarContado("Maria", 256665985);
        agendaContatos.adicionarContado("Maria Silva", 1699856241);
        agendaContatos.adicionarContado("Maria Eduarda", 1698985123);
        agendaContatos.adicionarContado("Robson", 1698985116);

        agendaContatos.exibirContatos();
        System.out.println(agendaContatos.pesquisarPorNome("Robson"));
        System.out.println("Contato atualizado: " + agendaContatos.atualizarNumeroContato("Maria Eduarda", 981981523));

    }
}
