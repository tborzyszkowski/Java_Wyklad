public class Main {

    public static void main(String[] args) {

        WorkersStorage workersStorage = new WorkersStorage();

        BuildingAddress buildingAddress = new BuildingAddress("Gdańsk", "Grunwaldzka", 8, 3);
        OfficeWorker officeWorker =  new OfficeWorker("Krzysztof", 29, "3 years junior java developer", buildingAddress,80);
        workersStorage.addWorkerToStorage(officeWorker);

        BuildingAddress buildingAddress1 = new BuildingAddress("Pruszcz Gdański", "Mickiewicza", 15, 2);
        OfficeWorker officeWorker1 =  new OfficeWorker("Piotr", 35, "10 years senior java developer", buildingAddress1,120);
        workersStorage.addWorkerToStorage(officeWorker1);

//        System.out.println(officeWorker.toString());
//        System.out.println(officeWorker1.toString());

        BuildingAddress buildingAddress2 = new BuildingAddress("Kolbudy", "Szczęśliwa", 58, 9);
        ManualWorker manualWorker = new ManualWorker("Przemek", 34, "12 years carrying cardboard boxes", buildingAddress2, 67);
        workersStorage.addWorkerToStorage(manualWorker);

        System.out.println(workersStorage.getAllWorkers());
        System.out.println(workersStorage.getAllOfficeWorkers());
        System.out.println(workersStorage.getAllManualWorkers());

//        System.out.println(manualWorker.toString());

    }

}
