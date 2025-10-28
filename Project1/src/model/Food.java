package model;

import model.constants.Colour;
import model.constants.Discount;

import java.util.Objects;

public class Food implements Discountable{
    protected int amount;
    protected  double price;
    protected  boolean isVegetarian;

    public Food(int amount, double price, boolean isVegetarian) {
        this.amount = amount;
        this.price = price;
        this.isVegetarian = isVegetarian;
    }

    @Override
    public double getDiscount(){
        return 0;
    }

    public int getAmount(){
        return amount;
    }

    public  double getPrice(){
        return price;
    }

    public boolean isVegetarian(){
        return isVegetarian;
    }


}
