package kg.geektech.mouth2.homework1;

public class Fridje extends Technic implements Printable{
    private int weight;


    public Fridje(int guarantee, int quantity, int price, int weight) {
        super(guarantee, quantity, price);
        this.weight = weight;
    }

    @Override
    public void print() {
        System.out.println( getClass().getSimpleName()  + "; guarantee: " + getGuarantee()  + ", mouth"
                + ", quantity: " + getQuantity() + ", price: " + getPrice() + "$" + ", weight: " + weight + "kg");


    }
}
