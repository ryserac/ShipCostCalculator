public class Main {
    public static void main(String[] args) {
        double itemPrice = 120;
        int FREE_SHIPPING = 100;
        double totalPrice;
        double shippingPrice;
        if (itemPrice >= FREE_SHIPPING) {
            totalPrice = itemPrice;
            System.out.println("Shipping cost for a $" + itemPrice + " item is free and the total price is $" + totalPrice);
        }
        else {
            shippingPrice = itemPrice * .02;
            totalPrice = itemPrice + shippingPrice;
            System.out.println("Shipping cost for a $" + itemPrice + " item is $" + shippingPrice + " and the total price is $" + totalPrice);
        }
    }
}