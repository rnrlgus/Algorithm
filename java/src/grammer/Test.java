package grammer;

public class Test {
    String name;
    boolean gasoline;
    
    void run() {
        if (gasoline) {
            System.out.println("brrr");
        } else {
            System.out.println("dkdk");
        } 
    }

    void stop() {
        System.out.println("keeeeek");
    }

//    public static void main(String[] args) {
//        Test car = new Test();
//        car.name = "bongbongee";
//        car.gasoline = true;
//
//        car.run();
//        car.stop();
//    }
}

class Car {
    public static void main(String[] args) {
        Test car = new Test();
        car.name = "bongbongee";
        car.gasoline = true;

        car.run();
        car.stop();
    }
}
