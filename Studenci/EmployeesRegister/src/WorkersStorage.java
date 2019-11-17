import java.util.ArrayList;
import java.util.List;

public class WorkersStorage {

    private static List<Worker> allWorkers = new ArrayList<>();
    private static List<Worker> allOfficeWorkers = new ArrayList<>();
    private static List<Worker> allManualWorkers = new ArrayList<>();

    public void addWorkerToStorage(Worker worker) {
        allWorkers.add(worker);
        addOfficeWorkerToOfficeStorage(worker);
        addManualWorkerManualStorage(worker);
    }

    public void addOfficeWorkerToOfficeStorage(Worker worker) {
        if (OfficeWorker.class.equals(worker.getClass())) {
            allOfficeWorkers.add(worker);
        }
    }

    public void addManualWorkerManualStorage(Worker worker) {
        if (ManualWorker.class.equals(worker.getClass())) {
            allManualWorkers.add(worker);
        }
    }

    public List<Worker> getAllWorkers() {
        return allWorkers;
    }

    public List<Worker> getAllOfficeWorkers() {
        return allOfficeWorkers;
    }

    public List<Worker> getAllManualWorkers() {
        return allManualWorkers;
    }

}
