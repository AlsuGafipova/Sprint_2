package model;

import model.constants.Colour;
import model.constants.Discount;
import java.util.Objects;

public class Apple extends Food implements Discountable{

    private final String colour;

    public Apple(int amount, double price, String colour){
        super(amount, price, true);
        this.colour = colour;
    }

    @Override
    public double getDiscount(){
        if(Objects.equals(colour, Colour.RED)){
            return Discount.DISCOUNT;
        }
        return 0;
    }

    public String getColour(){
        return colour;
    }
}
