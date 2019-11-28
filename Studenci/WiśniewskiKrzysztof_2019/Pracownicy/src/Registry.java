import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class Registry {
    private ArrayList<Worker> list;

    public Registry() {
        this.list = new ArrayList<>();
    }
    public void addWorker(Worker worker){
        this.list.add(worker);
    }

    public ArrayList<Worker> getWorkers() {
        return list;
    }
    public void removeWorker(int workerId){
        this.list.removeIf(item -> item.id == workerId);

    }
    public void addWorkers(ArrayList<Worker> workers){
        list.addAll(workers);
    }
    public void printWorkers(){
        this.list.sort(Comparator.comparing(Worker::getSurname));
        this.list.sort(Comparator.comparing(Worker::getAge));
        this.list.sort(Comparator.comparing(Worker::getExperience).reversed());
        this.list.forEach(item -> System.out.println(item));
    }
    public ArrayList<Worker> getWorkers(String cityName) {
        ArrayList<Worker> list = new ArrayList<>();
        for (Iterator<Worker> it = this.list.iterator(); it.hasNext(); ) {
            Worker x = it.next();
            if (x.getAddress().getCity().equals(cityName)) {
                list.add(x);
            }
        }
        return list;
    }
}
