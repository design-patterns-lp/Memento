package memento;

public class TarefaEstadoDoing implements TarefaEstado{

    private TarefaEstadoDoing() {};

    private static TarefaEstadoDoing instance = new TarefaEstadoDoing();

    public static TarefaEstadoDoing getInstance() { return instance;}

    public String getNomeEstado() { return "Tarefa sendo feita";}

}