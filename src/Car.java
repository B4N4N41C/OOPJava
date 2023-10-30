public class Car {
    private String carMake;
    private String model;
    private int price;
    private int yearOfIssue;

    public String getCarMake() {
        return carMake;
    }
    public void setCarMake(String carMake) {
        this.carMake = carMake;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public int getYearOfIssue() {
        return yearOfIssue;
    }
    public void setYearOfIssue(int yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + price;
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Car other = (Car) obj;
        if (price != other.price)
            return false;
        return true;
    }
    @Override
    public String toString() {
        return carMake + " " + model + " " + yearOfIssue + " Года выпуска";
    }
    public Car(String carMake, String model, int yearOfIssue, int price) {
        this.carMake = carMake;
        this.model = model;
        this.price = price;
        this.yearOfIssue = yearOfIssue;
    }
}
