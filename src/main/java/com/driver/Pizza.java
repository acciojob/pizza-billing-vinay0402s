package com.driver;

public class Pizza {

    private int totalprice;
    private Boolean isVeg;
    private String bill;

    private int cheesePrice;
    private int baseprice;
    private int toppingprice;
    private int paperBagPrice;

    private boolean isCheeseAdded ;
    private boolean isToppingsAdded;
    private boolean isPaperBagAdded;
    private boolean isBillGenerated;

    public Pizza(Boolean isVeg){//constructor
        this.isVeg = isVeg;
        // your code goes here

        if(isVeg==true){
            baseprice=300;
            toppingprice=70;
        }else{
            baseprice=400;
            toppingprice=120;
        }
        cheesePrice=80;
        paperBagPrice=20;
        totalprice=baseprice;
        bill="Base Price Of The Pizza: "+baseprice+"\n";
    }

    public int getPrice(){
        return this.totalprice;
    }

    public void addExtraCheese(){
        // your code goes here
        if(isCheeseAdded == false){
            //means previously cheese is not added
            totalprice = totalprice + cheesePrice;
            isCheeseAdded = true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(isToppingsAdded==false){
            //means previously toppings is not added
            totalprice = totalprice + toppingprice;
            isToppingsAdded = true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!isPaperBagAdded){
            //means previously paperbag is not added
            totalprice = totalprice + paperBagPrice;
            isPaperBagAdded = true;
        }
    }

    public String getBill(){
        // your code goes here
        if(!isBillGenerated){
            isBillGenerated=true;

            if(isCheeseAdded==true)
                bill=bill+ "Extra Cheese Added: " +cheesePrice+"\n" ;

            if(isToppingsAdded)
                bill=bill+"Extra Toppings Added: " +toppingprice+"\n";

            if(isPaperBagAdded)
                bill = bill + "Paperbag Added: "+paperBagPrice+ "\n";

            bill = bill + "Total Price: "+totalprice+"\n";
        }
        return this.bill;
    }
}
