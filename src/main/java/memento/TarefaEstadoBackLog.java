package memento;

public class TarefaEstadoBackLog implements TarefaEstado{

    private TarefaEstadoBackLog() {};

    private static TarefaEstadoBackLog instance = new TarefaEstadoBackLog();

    public static TarefaEstadoBackLog getInstance() { return instance;}

    public String getNomeEstado() { return "Tarefa em BackLog";}

}
