package chapter9;

public class TasteTester {

    public static void main(String[] args){
        Cake cake = new Cake("grape");
        cake.setPrice(29.99);
        System.out.println("Cake flavor is " + cake.getFlavor());
        System.out.println("Cake price is " + cake.getPrice());

        BirthdayCake birthdayCake = new BirthdayCake();
        birthdayCake.setPrice(39.99);
        System.out.println("Birthday cake flavor is " + birthdayCake.getFlavor());
        System.out.println("Cake price is " + birthdayCake.getPrice());

        WeddingCake weddingCake = new WeddingCake();
        weddingCake.setFlavor("pina colada");
        System.out.println("Wedding cake flavor is " + weddingCake.getFlavor());
        System.out.println("Wedding Cake price is " + weddingCake.getPrice());
    }

}
