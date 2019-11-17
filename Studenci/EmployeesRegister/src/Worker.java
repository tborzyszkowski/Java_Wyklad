import java.util.ArrayList;
import java.util.List;

public class Worker {

    private static int count = 1;
    private int workerId;
    private String name;
    private int age;
    private String experiance;
    private BuildingAddress buildingAddress;

    public Worker(String name, int age, String experiance, BuildingAddress buildingAddress) {
        workerId = count++;
        this.name = name;
        this.age = age;
        this.experiance = experiance;
        this.buildingAddress = buildingAddress;
    }

    public static int getCount() {
        return count;
    }

    public int getWorkerId() {
        return workerId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getExperiance() {
        return experiance;
    }

    public BuildingAddress getBuildingAddress() {
        return buildingAddress;
    }

    public String workertoString() {
        return "Worker{" +
                "workerId=" + workerId +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", experiance='" + experiance + '\'' +
                ", buildingAddress=" + buildingAddress.toString() +
                '}';
    }
}
