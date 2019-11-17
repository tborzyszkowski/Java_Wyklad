public class OfficeWorker extends Worker {

    private static int count = 0;
    private int officePositionId;
    private int iq;
    private WorkersStorage workersStorage;


    public OfficeWorker(String name, int age, String experiance, BuildingAddress buildingAddress, int iq) {
        super(name, age, experiance, buildingAddress);
        this.officePositionId = officePositionId;

        try {
            if (iq >= 70 && iq <= 150) {
                this.iq = iq;
            }
            else {
                throw new IllegalArgumentException();
            }
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            System.out.println("Iq must be in the range 70 - 150.");
        }

        officePositionId = ++count;
    }

    public static int getCount() {
        return count;
    }

    public int getOfficePositionId() {
        return officePositionId;
    }

    public int getIq() {
        return iq;
    }

    public WorkersStorage getWorkersStorage() {
        return workersStorage;
    }

    @Override
    public String toString() {
        return workertoString() +
                "OfficeWorker{" +
                "officePositionId=" + officePositionId +
                ", iq=" + iq +
                '}';
    }

    //    intelekt: wyrażony w iq w skali 70 - 150

}
