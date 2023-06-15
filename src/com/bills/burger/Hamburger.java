package com.bills.burger;

import java.util.Scanner;

public class Hamburger {
    private String name;
    private String breadRoll;
    private String meat;
    private AdditionnalItem additionnalItem;
    private double price;

    private int count = 0;

    public Hamburger(String breadRoll, String meat) {
        this.breadRoll = breadRoll;
        this.meat = meat;
        this.price = 10;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreadRoll() {
        return breadRoll;
    }

    public void setBreadRoll(String breadRoll) {
        this.breadRoll = breadRoll;
    }

    public String getMeat() {
        return meat;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    public AdditionnalItem getAdditionnalItem() {
        return additionnalItem;
    }

    public void setAdditionnalItem(AdditionnalItem additionnalItem) {
        this.additionnalItem = additionnalItem;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void addAditionnalItem(){


        AdditionnalItem item = new AdditionnalItem();

        do {
            System.out.println("Enter the name of your item");
            System.out.println(" We have tomato, laitue, carrot, oignon. Enter the name of the add item, to stop enter exit");

            Scanner sc = new Scanner(System.in);
            item.setName(sc.nextLine());

            if (item.getName().toLowerCase().equals("laitue") && count < 4){
                item.setPrice(2.0);
                this.price += item.getPrice();
                System.out.println("The price of laitue is 2.0 the total price of "+ getName() +" is "+getPrice() );
            }
            else if (item.getName().toLowerCase().equals("carrot") && count < 4 ){
                item.setPrice(1.0);
                this.price += item.getPrice();
                System.out.println("The price of carrot is 1.0 and the total price of "+ getName()+" is "+getPrice() );
            }
            else if (item.getName().toLowerCase().equals("tomato") && count < 4 ){
                item.setPrice(3.0);
                this.price += item.getPrice();
                System.out.println("The price of tomato is 3.0 and the total price of "+ getName()+ " is "+getPrice() );
            } else if (item.getName().toLowerCase().equals("oignon") && count < 4){
                item.setPrice(6.0);
                this.price += item.getPrice();
                System.out.println("The price of oignon is 6.0 and the total price of "+ getName() + "is "+getPrice() );
            } else if (item.getName().toLowerCase().equals("exit")){
                break;
            }else {
                this.price += 0;
                count--;
            }
            count++;
        } while (count < 4);

        System.out.println("The total price of "+getName() +" is "+getPrice() +"$" );
    }

}
