public class CartTest {
    
    public static void main(String[] args){
        //Create a new cart
        Cart anOrder = new Cart();
        //Setup your Cart
        Cart.setup();
        //Create new dvd objects and add them to the cart
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        anOrder.addDigitalVideoDisc(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        anOrder.addDigitalVideoDisc(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", "null", 0, 18.99f);
        anOrder.addDigitalVideoDisc(dvd3);

        //anOrder.RemoveDigitalVideoDisc(dvd3);

        if(Cart.isMatch("Aladin") == false){
            System.out.println("No DVD in Cart");
        }
        else System.out.println("DVD in Cart");
    }
}
