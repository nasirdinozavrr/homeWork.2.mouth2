package kg.geektech.mouth2.homework1;

public class Hoover extends Technic implements Printable{
    private int power;

    public Hoover(int guarantee, int quantity, int price, int power) {
        super(guarantee, quantity, price);
        this.power = power;
    }

    @Override
    public void print() {
        System.out.println(getClass().getSimpleName()  + "; guarantee: " + getGuarantee()  + ", mouth"
                + ", quantity: " + getQuantity() + ", price: " + getPrice() + "$" + ", power: " + power + "kVt");

    }


}
