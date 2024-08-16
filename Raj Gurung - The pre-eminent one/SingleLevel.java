class Vehicles {
    int reg;
    String name;
    String brand;

    public void setVehicle(int reg, String name, String brand) {
        this.reg = reg;
        this.name = name;
        this.brand = brand;

    }
    public void display(){
        System.out.println("Register number"+this.reg);
        System.out.println("Name"+this.name);
        System.out.println("Brand"+this.brand);
    }
}

class Cars extends Vehicles{
        int mileage;
        int price;
        public void setCar(int mileage, int price){
            this.mileage = mileage;
            this.price = price;
        }
        public void displayCar(){
            System.out.println("Mileage:"+this.mileage);
            System.out.println("Price "+this.price);
        }


    }


public class SingleLevel{
    public static void main(String[]args){
        Cars c1= new Cars();
        
        c1.setVehicle(123,"Toyota", "Camry");
        c1.display();
        c1.setCar(1000,100000);
        c1.displayCar();
        
    }
}