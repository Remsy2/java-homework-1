package model;

public class Kotik {

    private static int counter=0;
    private int bellyfulLevel=10;

    private String name;
    private int weight;
    private int prettiness;
    private String meow;
    private String eatenFood;



    public Kotik() { //constructor with no parameter
        counter++;

    }
    public Kotik(String name, int weight,int prettiness, String meow){  //constructor with all necessary parameters
        this.name=name;
        this.weight=weight;
        this.prettiness=prettiness;
        this.meow=meow;

        counter++;
    }

    public void setKotik(String name, int weight,int prettiness, String meow) {
        this.name=name;
        this.weight=weight;
        this.prettiness=prettiness;
        this.meow=meow;
    }


    public String getName() {
        return this.name;

    }
    public String getFoodName() {
        return this.eatenFood;

    }
    public int getWeight() {
        return this.weight;

    }
    public String getVoice() {
        return this.meow;
    }
    public int getPrettiness() {
        return this.prettiness;

    }

    public void eat(int eaten) { //method with one parameter
        bellyfulLevel+=eaten;
    }

    public void eat(int eaten, String foodName) { //overloaded method with two parameter
        bellyfulLevel+=eaten; //increase bellyful level to given parameter
        this.eatenFood=foodName;

    }
    public void eat() { //method with no parameter calling overloaded method
        this.eat(1,"Milk");
    }

    public boolean sleep(){
        if (bellyfulLevel<=0) { //first it checks did the cat eat
            System.out.println("Your cat is hungry, give it some food...");
            return false; //if not them returns false
        }
        else {
            System.out.println("Your cat has eaten so it can sleep");
            bellyfulLevel--; //decrease bellyfulLEvel to one because action takes energy
            return true;
        }


    }

    public boolean play() {
        if (bellyfulLevel<=0) {
            System.out.println("Your cat is hungry, give it some food...");
            return false;
        }
        else {

            System.out.println("Your cat has eaten so it can play");
            bellyfulLevel--;
            return true;
        }
    }

    public boolean chaseMouse() {
        if (bellyfulLevel<=0) {
            System.out.println("Your cat is hungry, give it some food...");

            return false;
        }
        else {
            System.out.println("Your cat has eaten so it can chase mouse");
            bellyfulLevel--;
            return true;
        }
    }
    public boolean makeMess(){
        if (bellyfulLevel<=0) { //first it checks did the cat eat
            System.out.println("Your cat is hungry, give it some food...");
            return false; //if not them returns false
        }
        else {
            System.out.println("Your cat has eaten so it can make a mess");
            bellyfulLevel--; //decrease bellyfulLEvel to 1 because action takes energy
            return true;
        }


    }
    public boolean doCrap(){
        if (bellyfulLevel<=0) { //first it checks did the cat eat
            System.out.println("Your cat is hungry, give it some food...");
            return false; //if not them returns false
        }
        else {
            System.out.println("Your cat has eaten so it can do a crap");
            bellyfulLevel--; //decrease bellyfulLEvel to one because action takes energy
            return true;
        }


    }

    public void liveAnotherDay() {
        for (int i=1; i<=24; i++) { //loop for
            int methodNo=(int)(Math.random()*6 + 1);//method number

            switch(methodNo) {
                case 1:
                    this.sleep();
                    break;
                case 2:
                    this.play();
                    break;
                case 3:
                    this.doCrap();
                    break;
                case 4:
                    this.makeMess();
                    break;
                case 5:
                    this.chaseMouse();
                    break;
                case 6:
                    this.eat();
                    break;
            }

        }

    }
    public void showCounter() {  // method which shows number of objects created
        System.out.println(counter +" objects are created");
    }
}
