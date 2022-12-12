package com.driver;

public class Pizza {

    private int price = 300;
    private Boolean isVeg;
    private String bill;

    private int cheeseprice=0;
    private int toppingprice=0;
    private int paperprice=0;
    private boolean cheese,topping,paper;

    public Pizza(Boolean isVeg){

        this.isVeg = isVeg;
        if(!this.isVeg)
            this.price+=100;

        // your code goes here
    }
    public int getPrice(){

        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        this.cheese = true;
        this.cheeseprice+=80;
    }

    public void addExtraToppings(){
        // your code goes here
        this.topping = true;
        this.toppingprice+=70;
    }

    public void addTakeaway(){
        // your code goes here
        this.paper=true;
        this.paperprice+=20;
    }

    public String getBill(){
        // your code goes here

        System.out.println("Base Price Of The Pizza: "+this.price);
        if(cheese)
        System.out.println("Extra Cheese Added: "+this.cheeseprice);
        if(topping)
        System.out.println("Extra Toppings Added: "+this.toppingprice);
        if(paper)
        System.out.println("Paperbag Added: "+this.paperprice);
        int abc = this.price+this.cheeseprice+this.toppingprice+this.paperprice;
        return "Total Price: "+abc;
    }
}
