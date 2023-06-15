package com.bills.burger;

public class HealthyBurger extends Hamburger{
    public HealthyBurger( String meat) {
        super("brown rye", meat);
        this.setPrice(15);
        this.setName("Heatly burger");
    }

    @Override
    public void addAditionnalItem() {
        super.setCount(2);
        super.addAditionnalItem();
    }
}
