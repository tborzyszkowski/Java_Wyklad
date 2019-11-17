public class ManualWorker extends Worker{

    private static int count = 0;
    private int manualPositionId;
    private int physicalStrength;

    public ManualWorker(String name, int age, String experiance, BuildingAddress buildingAddress, int physicalStrength) {
        super(name, age, experiance, buildingAddress);
        this.manualPositionId = manualPositionId;

        try {
            if (physicalStrength >= 1 && physicalStrength <= 100) {
                this.physicalStrength = physicalStrength;
            }
            else {
                throw new IllegalArgumentException();
            }
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            System.out.println("Psychical strength 1 - 100.");
        }

        manualPositionId = ++count;
    }

    @Override
    public String toString() {
        return workertoString() +
                "ManualWorker{" +
                "manualPositionId=" + manualPositionId +
                ", physicalStrength=" + physicalStrength +
                '}';
    }
}
