package service;

import model.Apple;
import model.Discountable;
import model.Food;


public class ShoppingCart {

    private final Food[] foods ;

    public ShoppingCart(Food[] foods){
        this.foods = foods;
    }

    public double getSumNoDiscount(){
        double sum = 0;
        for (Food food : foods){
            sum += food.getAmount() * food.getPrice();
        }
        return sum;
    }

    public double getSumDiscount(){
       double sum = 0;
        for (Food food : foods){
            if ((food instanceof Discountable)){
                double sale = ((Discountable) food).getDiscount();
                sum += food.getAmount() * food.getPrice() * (100 - sale)/100;
            }
            else {
                sum += food.getAmount() * food.getPrice();

            }
        }
        return sum;
    }

    public double getSumVeganNoDiscount(){
        double sum = 0;
        for (Food food : foods){
            if (food.isVegetarian()){
                sum += food.getAmount() * food.getPrice();
            }
        }
        return sum;
    }
}
