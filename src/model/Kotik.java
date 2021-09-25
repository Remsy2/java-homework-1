package model;

public class Kotik {

    private int prettiness;
    private double weight;
    private String name;
    private String meow;
    private boolean satietyOfTheCat;
    private

    public Kotik(int prettiness, double weight, String name, String meow, boolean satietyOfTheCat) {
        this.prettiness = prettiness;
        this.weight = weight;
        this.name = name;
        this.meow = meow;
        this.satietyOfTheCat = satietyOfTheCat;
    }

    public int getPrettiness() {
        return prettiness;
    }

    public double getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public String getMeow() {
        return meow;
    }

    public double getSatietyOfTheCat() {
        return satietyOfTheCat;
    }

    public boolean eat(String name) {
        if (getSatietyOfTheCat() == false) {
            this.name = name;
            System.out.println("Котик не сытый. Нужно покормить!");
        } else {
            this.name = name;
            System.out.println("Котик сытый!");

        }
    }

//
//        private void sayMeow () {
//            System.out.println(name + "Say " + meow);
//
//        }


//        public boolean sleep () {
//            System.out.print("Sleeping zz-z-z-z...");
//            return sleep;
//        }
//

