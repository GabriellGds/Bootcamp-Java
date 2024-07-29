package list;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {

    private List<Tarefa> tarefas;

    public ListaTarefa() {
        this.tarefas = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        this.tarefas.add(new Tarefa(descricao));
    }

    public void removeTarefa(String descricao) {
       List<Tarefa> tarefaToRemove = new ArrayList<>();
       for (Tarefa t : this.tarefas) {
           if (t.getDescricao().equalsIgnoreCase(descricao)) {
               tarefaToRemove.add(t);
           }
       }

       this.tarefas.removeAll(tarefaToRemove);
    }

    public int numeroTotalDeTarefas() {
        return this.tarefas.size();
    }

    public void obterDescricoesTarefa() {
        System.out.println(tarefas);
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();

        System.out.println(listaTarefa.numeroTotalDeTarefas());
        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 2");
        System.out.println(listaTarefa.numeroTotalDeTarefas());
        listaTarefa.removeTarefa("Tarefa 1");
        System.out.println(listaTarefa.numeroTotalDeTarefas());

    }
}
