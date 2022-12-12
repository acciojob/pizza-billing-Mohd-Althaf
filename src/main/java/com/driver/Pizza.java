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
    StringBuilder ans = new StringBuilder();
        ans.append("Base Price Of The Pizza: "+this.price + "\n");
        if(cheese)
        ans.append("Extra Cheese Added: "+this.cheeseprice + "\n");
        if(topping)
        ans.append("Extra Toppings Added: "+this.toppingprice+"\n");
        if(paper)
        ans.append("Paperbag Added: "+this.paperprice+"\n");
        int abc = this.price+this.cheeseprice+this.toppingprice+this.paperprice;
        ans.append("Total Price: "+abc+"\n");
        return ans.toString();
    }
}
