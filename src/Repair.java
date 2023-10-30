public class Repair {
    private int daysOfRepair;
    private int priceOfParts;
    private int priceOfWork;
    private int finalPrice;
    private int parts;
    private Master master;
    private Car car;

    public int getDaysOfRepair() {
        switch (master.getLevel()){
            case(1):
                daysOfRepair = 5 + (int)(car.getPrice() / 10000);
            case(2):
                daysOfRepair = 3 + (int)(car.getPrice() / 10000);
            case(3):
                daysOfRepair = 1 + (int)(car.getPrice() / 10000);
        }
        return daysOfRepair;
    }
    public void setDaysOfRepair(int daysOfRepair) {
        this.daysOfRepair = daysOfRepair;
    }
    public int getPriceOfParts() {
        priceOfParts = parts * (car.getPrice() / 1000);
        return priceOfParts;
    }
    public void setPriceOfParts(int priceOfParts) {
        this.priceOfParts = priceOfParts;
    }
    public int getPriceOfWork() {
        switch (master.getLevel()){
            case(1):
                priceOfWork = 5000 + (car.getPrice() / 1000);
            case(2):
                priceOfWork = 10000 + (car.getPrice() / 1000);
            case(3):
                priceOfWork = 15000 + (car.getPrice() / 1000);
        }
        return priceOfWork;
    }
    public void setPriceOfWork(int priceOfWork) {
        this.priceOfWork = priceOfWork;
    }
    public int getFinalPrice() {
        finalPrice = getPriceOfParts() + getPriceOfWork();
        return finalPrice;
    }
    public void setFinalPrice(int finalPrice) {
        this.finalPrice = finalPrice;
    }
    public Repair(int parts, Master master, Car car) {
        this.parts = parts;
        this.master = master;
        this.car = car;
    }
    public String determiningTheCost(){
       return "Стоимость ремонта обойдётся в " + getFinalPrice() + " рублай"; 
    }
    @Override
    public String toString() {
        return master.toString() + " Чинит машину " + car.toString();
    }   
}
