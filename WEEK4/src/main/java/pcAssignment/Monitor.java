package pcAssignment;

public class Monitor<drawPixel> {

    public String model;
    public String  manufacturer;
    public int size;
    public double resoulution;

    public Monitor(String model, String manufacturer, int size, double resoulution){
        this.model = model;
        this.manufacturer = manufacturer;
        this.size = size;
        this.resoulution = resoulution;
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getSize(){
        return size;
    }

    public double getResoulution(){
        return resoulution;
    }

    public String drawPixel(int x, int y, String color){
        return "Drawing pixel at" + x + y + " in color " + color;

    }

    @Override
    public String toString() {
        return "Monitor{" +
                "model='" + model + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", size=" + size +
                ", resoulution=" + resoulution +
                '}';
    }
}
