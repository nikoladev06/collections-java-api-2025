package Map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if(!agendaContatoMap.isEmpty()) {
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContatos() {
        if(!agendaContatoMap.isEmpty()) {
            System.out.println(agendaContatoMap);
        }
    }

    public Integer pesquisarPorNome(String nome) {
        Integer numeroPorNome = null;
        if(!agendaContatoMap.isEmpty()) {
            numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContatos();

        agendaContatos.adicionarContato("Maria", 1698988842);
        agendaContatos.adicionarContato("Maria", 256665985);
        agendaContatos.adicionarContato("Maria Silva", 1699856241);
        agendaContatos.adicionarContato("Maria Eduarda", 1698985123);
        agendaContatos.adicionarContato("Robson", 1698985116);

        agendaContatos.exibirContatos();
        agendaContatos.removerContato("Maria Silva");
        System.out.println(agendaContatos.pesquisarPorNome("Robson"));
        agendaContatos.exibirContatos();
    }
}
