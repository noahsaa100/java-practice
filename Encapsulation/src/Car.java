public class Car {
    private String make;
    private String model;
    private int year;

    Car(String make, String model, int year){
        this.make = make;
        this.setMake(make);
        this.model = model;
        this.setModel(model);
        this.year = year;
        this.setYear(year);
    }
    public String getMake(){
        return make;
    }
    public String getModel(){
        return model;
    }
    public int getYear(){
        return year;
    }

    public void setMake(String make){
        this.make = make;
    }
    public void setModel(String model){
        this.model = model;
    }
    public void setYear(int year){
        this.year = year;
    }


    @Override
    public String toString() {
        return this.make + "\n" + this.model + "\n" + this.year;
    }
}
