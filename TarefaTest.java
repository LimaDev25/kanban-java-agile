package br.sp.uninove.kanban;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TarefaTest {
    @Test
    void testePrioridadeAlta() {
        Tarefa t = new Tarefa("1", "Urgente", Tarefa.Prioridade.ALTA);
        assertEquals(Tarefa.Prioridade.ALTA, t.getPrioridade());
    }
}
