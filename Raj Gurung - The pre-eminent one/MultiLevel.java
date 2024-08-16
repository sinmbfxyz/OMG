class Vehicless {
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

class Carss extends Vehicless{
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
    class Ecar extends Carss{
        int battery;
        public void setEcar(int battery){
            this.battery=battery;
            
        }
        public void displayEcar(){
            System.out.println("Battery"+this.battery);
        }

    }


public class MultiLevel{
    public static void main(String[]args){
        Ecar c1= new Ecar();
        c1.setVehicle(123,"Toyota", "Camry");
        c1.display();
        c1.setCar(1000,100000);
        c1.displayCar();
        c1.setEcar(4);
        c1.displayEcar();
    }
}