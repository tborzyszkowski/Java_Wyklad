import java.util.Comparator;

public class WorkerComparator implements Comparator<Worker> {
    @Override
    public int compare(Worker firstWorker, Worker secondWorker) {
        return (firstWorker.getValue() - secondWorker.getValue());
    }
}
