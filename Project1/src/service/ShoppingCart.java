package service;

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
            sum += food.getAmount() * food.getPrice() * (100 - food.getDiscount())/100;
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
