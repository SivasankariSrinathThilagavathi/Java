import java.util.Scanner;
class Vehicle{
    String brand;
    String model;
    int year;
    Scanner sc=new Scanner(System.in);
    public void set_veh_details(){
        System.out.print("Enter Brand name of the Vehicle: ");
        brand=sc.next();
        System.out.print("Enter Model name of the Vehicle: ");
        model=sc.next();
        System.out.print("Enter year of the Vehicle: ");
        year=sc.nextInt();
    }
    public void get_veh_details(){
        System.out.println("Brand name of the Vehicle: "+brand);
        System.out.println("Model name of the Vehicle: "+model);
        System.out.println("Year of the Vehicle: "+year);
    }
}

class Car extends Vehicle{
    String fuelType;
    int seatingCapacity;
    Scanner sc=new Scanner(System.in);
    public void set_car_details(){
        set_veh_details();
        System.out.print("Enter Fuel Type of the Vehicle: ");
        fuelType=sc.next();
        System.out.print("Enter Seating Capacity of the Vehicle: ");
        seatingCapacity=sc.nextInt();
    }
    public void get_car_details(){
        get_veh_details();
        System.out.println("Fuel Type of the Vehicle: "+fuelType);
        System.out.println("Enter Seating Capacity of the Vehicle: "+seatingCapacity);
    }
}

class Problem1{
    public static void main(String[] args) {
        Car ob1=new Car();
        Car ob2=new Car();
        ob1.set_car_details();
        ob1.get_car_details();
        ob2.set_car_details();
        ob2.get_car_details();

    }
}
