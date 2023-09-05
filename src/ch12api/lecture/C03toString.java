package ch12api.lecture;

public class C03toString {
    public static void main(String[] args) {
        Car car1 = new Car("tesla", 5000);
        Car car2 = new Car("kia", 4000);
        Car car3 = new Car("bmw", 2000);

        //originally
        System.out.println(car1.getModel() + ": " + car1.getPrice());
        System.out.println(car2.getModel() + ": " + car2.getPrice());

        System.out.println();

        System.out.println(car1.toString());
        System.out.println(car2.toString());
        System.out.println(car3.toString());
        //notice that toString shows up as grey -> can be omitted
        //this is bc println prints a String.valueOf(x) to gets Objects string value and terminates the line
        //since car1 type = object, and valueOf(Object x) returns toString if it's null

        //look for more explanation in api site
    }
}

class Car {
    private String model;
    private int price;

    public Car(String model, int price) {
        this.model = model;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return this.model + ": " + this.price;
    }
/*
    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", price=" + price +
                '}';
    }*/
}