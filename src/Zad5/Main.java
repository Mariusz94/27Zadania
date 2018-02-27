package Zad5;

public class Main {
    public static void main(String[] args) {
        Product product = new Product("car", " ", " ");
        Guarantee guaranteecar = new Guarantee(product,"2018/02/29");

        Boolean test = guaranteecar.isVaild("2018/02/27");
        System.out.println(test);
        product=null;
        System.out.println(product);
    }

}
