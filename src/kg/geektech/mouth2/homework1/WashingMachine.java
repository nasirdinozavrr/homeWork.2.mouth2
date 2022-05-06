package kg.geektech.mouth2.homework1;

public class WashingMachine extends Technic implements Printable{
    private int load;


    public WashingMachine(int guarantee, int quantity, int price, int load) {
        super(guarantee, quantity, price);
        this.load = load;
    }


    @Override
    public void print() {
        System.out.println(getClass().getSimpleName()  + "; guarantee: " + getGuarantee()  + ", mouth"
                + ", quantity: " + getQuantity() + ", price: " + getPrice() + "$" + ", load: " + load + "kg");

    }
}
