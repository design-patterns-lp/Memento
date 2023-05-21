package memento;

public class TarefaEstadoToDo implements TarefaEstado {

    private TarefaEstadoToDo() {}
    private static TarefaEstadoToDo instance = new TarefaEstadoToDo();

    public static TarefaEstadoToDo getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Tarefa a ser feita";
    }
}