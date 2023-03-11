package teachclasses;

public class NoteBook {
    private byte RAM;
    private int capacityHD;
    private OperationSystem operationSystem;
    private String color;
    private String brand;

    public NoteBook(byte RAM, int capacityHD, OperationSystem operationSystem, String color, String brand) {
        this.RAM = RAM;
        this.capacityHD = capacityHD;
        this.operationSystem = operationSystem;
        this.color = color;
        this.brand = brand;
    }

    public byte getRAM() {
        return RAM;
    }

    public void setRAM(byte RAM) {
        this.RAM = RAM;
    }

    public int getCapacityHD() {
        return capacityHD;
    }

    public void setCapacityHD(int capacityHD) {
        this.capacityHD = capacityHD;
    }

    public OperationSystem getOperationSystem() {
        return operationSystem;
    }

    public void setOperationSystem(OperationSystem operationSystem) {
        this.operationSystem = operationSystem;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "NoteBook{" +
                "опер память=" + RAM +
                ", объем ЖД=" + capacityHD +
                ", операционная система =" + operationSystem +
                ", цвет ='" + color + '\'' +
                ",  марка='" + brand + '\'' +
                '}';
    }
}
