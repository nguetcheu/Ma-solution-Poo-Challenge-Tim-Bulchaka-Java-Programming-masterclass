package com.bills.burger;

public class DeluxeBurger extends Hamburger{

    public DeluxeBurger() {
        super("bread deluxe", "deluxe meat");
        this.setName("Deluxe burger");
        this.setPrice(20);
    }

    @Override
    public void addAditionnalItem() {
        System.out.println("Chips add amount is 5");
        System.out.println("Drinks add amount is 10");
        this.setPrice(35);
        System.out.println("The total price of "+getName() +" is "+getPrice() +"$" );
    }
}
