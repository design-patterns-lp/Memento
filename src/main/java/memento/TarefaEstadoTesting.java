package memento;

public class TarefaEstadoTesting implements TarefaEstado{

    private TarefaEstadoTesting() {};

    private static TarefaEstadoTesting instance = new TarefaEstadoTesting();

    public static TarefaEstadoTesting getInstance() { return instance;}

    public String getNomeEstado() { return "Tarefa sendo testada";}

}