package application;
import model.Kotik;

public class Application {
    public static void main(String[] args) {

        Kotik cat1=new Kotik("Pushok", 13,12,"meeeeow");
        Kotik cat2=new Kotik();
        cat2.setKotik("Snezhok", 12, 11, "meeeeeowwwww");


        if (cat2.getVoice()==cat1.getVoice()) {
            System.out.println("Their voice is the same");
        }
        else {
            System.out.println("Their voice is NOT the same");


        }
        System.out.println("Your cat's name is "+cat2.getName());
        System.out.println("Your cat's weight is "+cat2.getWeight());

        cat2.liveAnotherDay();
        cat2.showCounter();
    }

}
