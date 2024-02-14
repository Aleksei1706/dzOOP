package org.example;

public class Main {
    public static void main(String[] args) {


        HotDrinksMachine drink = new HotDrinksMachine();
        drink.addHotDrink(new HotDrink("американо", 120, 0.4, 40));
        drink.addHotDrink(new HotDrink("капучино", 150, 0.5, 45));
        drink.addHotDrink(new HotDrink("латте", 160, 0.6, 50));
        System.out.println(drink.getProductList());
        System.out.println(drink.getProduct("капучино"));
    }
}