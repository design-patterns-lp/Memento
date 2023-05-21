package memento;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

class EstadoTest {

    @Test
    void deveArmazenarEstados(){
        Tarefa tarefa = new Tarefa();
        tarefa.setEstado(TarefaEstadoToDo.getInstance());
        tarefa.setEstado(TarefaEstadoDelivered.getInstance());
        assertEquals(2, tarefa.getEstados().size());
    }

    @Test
    void deveRetornarEstadoInicial(){
        Tarefa tarefa = new Tarefa();
        tarefa.setEstado(TarefaEstadoToDo.getInstance());
        tarefa.setEstado(TarefaEstadoDelivered.getInstance());
        tarefa.restauraEstado(0);
        assertEquals(TarefaEstadoToDo.getInstance(), tarefa.getEstado());
    }

    @Test
    void deveRetornarEstadoAnterior(){
        Tarefa tarefa = new Tarefa();
        tarefa.setEstado(TarefaEstadoToDo.getInstance());
        tarefa.setEstado(TarefaEstadoDoing.getInstance());
        tarefa.setEstado(TarefaEstadoTesting.getInstance());
        tarefa.setEstado(TarefaEstadoDelivered.getInstance());
        tarefa.restauraEstado(2);
        assertEquals(TarefaEstadoTesting.getInstance(), tarefa.getEstado());
    }

    @Test
    void deveRetornarExcecaoIndiceInvalido(){
        try{
            Tarefa tarefa = new Tarefa();
            tarefa.restauraEstado(0);
            fail();
        } catch (IllegalArgumentException e){
            assertEquals("Índice inválido", e.getMessage());
        }
    }

}