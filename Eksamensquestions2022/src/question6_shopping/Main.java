package question6_shopping;
/*I denne opgave skal man lave en shoppingcart. Heri, skal man kunne lave items, og tilføje og fjerne dem fra kurven.
* Man skal kunne få den totale pris og som bonus skulle kunne se en liste af items og sætte en rabat*/

public class Main {
    public static void main(String[] args) {

        ShoppingCart shoppingCart = new ShoppingCart();
        Item apple = new Item("apple", 10);
        Item pear = new Item("pear", 20);
        Item banana = new Item("banana", 5);

        shoppingCart.addItem(apple);
        shoppingCart.addItem(pear);
        shoppingCart.addItem(banana);


        System.out.println(shoppingCart.getTotalPrice());

        shoppingCart.removeItem(apple);

        System.out.println(shoppingCart.getTotalPrice());

        shoppingCart.getItems();

        shoppingCart.setDiscount(5);

        System.out.println(shoppingCart.getTotalPrice());
    }
}
