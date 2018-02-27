public class Obiektowosc {

    public static void main(String[] args) {

        Person personMariusz = new Person("Mariusz", "Lyszczarz", 23 , "Facet");

        System.out.println(personMariusz.getName());

        Car car= new Car("BMW", "X5",50000);
        car.show(car.getBrand(), car.getPrice());
    }
}
