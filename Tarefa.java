package br.sp.uninove.kanban;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Tarefa {
    private String id;
    private String titulo;
    private Prioridade prioridade;
    private Status status;
    
    public enum Prioridade { ALTA, MEDIA, BAIXA }
    public enum Status { TODO, DOING, DONE }
    
    // Construtores, getters e setters...
    public Tarefa(String id, String titulo, Prioridade prioridade) {
        this.id = id;
        this.titulo = titulo;
        this.prioridade = prioridade;
        this.status = Status.TODO;
    }
    
    // getters e setters omitidos por brevidade
}
