package com.dynamiconlinemarket;

public class Discount {
    //Create a generic for applyDiscount to calculate discount and set new price
   public static <T extends Product<?>> void applyDiscount(T product, double percent){
        double discountValue = product.getPrice() * percent / 100;
        product.setPrice(product.getPrice() - discountValue);
       System.out.println("Discount Applied to: " + product.getName());
    }
}
