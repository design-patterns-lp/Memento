package memento;

public class TarefaEstadoDelivered implements TarefaEstado{

    private TarefaEstadoDelivered() {};

    private static TarefaEstadoDelivered instance = new TarefaEstadoDelivered();

    public static TarefaEstadoDelivered getInstance() { return instance;}

    public String getNomeEstado() { return "Tarefa entregue";}

}