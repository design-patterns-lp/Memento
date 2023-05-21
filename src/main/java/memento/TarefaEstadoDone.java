package memento;

public class TarefaEstadoDone implements TarefaEstado{

    private TarefaEstadoDone() {};

    private static TarefaEstadoDone instance = new TarefaEstadoDone();

    public static TarefaEstadoDone getInstance() { return instance;}

    public String getNomeEstado() { return "Tarefa feita";}

}
