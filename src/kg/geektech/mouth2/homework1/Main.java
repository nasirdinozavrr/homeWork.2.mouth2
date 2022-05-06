package kg.geektech.mouth2.homework1;

public class Main {

    public static void main(String[] args) {
        Printable[] technic  = {createObject("Fridje"), createObject("Hoover"), createObject("WashingMachine")};
        for (int i = 0; i < technic.length; i++) {
            technic[i].print();
        }
    }

    private static Printable createObject(String className) {
        switch (className) {
            case "Fridje":
                return new Fridje(8, 10, 800, 12);
            case "Hoover":
                return new Hoover(12, 20, 500, 1200);
            case "WashingMachine":
                return new WashingMachine(6, 15, 1200, 8);
        }
        return new Fridje(9, 8, 800, 12);
    }
}