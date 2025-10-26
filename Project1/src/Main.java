import model.*;
import model.constants.Colour;
import service.ShoppingCart;
//
public class Main {
    public static void main(String[] args) {
        Food meat = new Meat(5, 100);
        Food appleRed = new Apple(10, 50, Colour.RED);
        Food appleGreen = new Apple(8,60,Colour.GREEN);

        Food[] foods  = {meat, appleRed, appleGreen};

        ShoppingCart shoppingCart =  new ShoppingCart(foods);

        System.out.println("Общая сумма товаров без скидок: " + shoppingCart.getSumNoDiscount());
        System.out.println("Общая сумма товаров со скидкой: " + shoppingCart.getSumDiscount());
        System.out.println("Общая сумма всех вегетарианских продуктов в корзине без скидки: " + shoppingCart.getSumVeganNoDiscount());
    }

}
