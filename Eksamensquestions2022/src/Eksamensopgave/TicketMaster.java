package Eksamensopgave;

import java.util.ArrayList;

public class TicketMaster {

    private boolean isAdult;
    private boolean isSenior;
    private int[] ageLimits;

    public TicketMaster(int[] ageLimits){
        this.ageLimits = ageLimits;
    }

    public int calculatePrice(int age){
        int price = 0;
        if(age > ageLimits[2]){
            isSenior = true;
            isAdult = false;
            price = 15; //Seniorbillet
        }else if(age <= ageLimits[1] && age >= 0){
            isAdult = false;
            isSenior = false;
            price = 10; //Børnebillet
        }else if(age >= ageLimits[1]){
            isAdult = true;
            isSenior = false;
            price = 30; //Voksenbillet
        }
        return price;
    }

    public int calculateFullPrice(int[] passengers){
        int finalPrice = 0;
        int kidAmount = 0;
        int adultAmount = 0;

        for(int i = 0; i<passengers.length; i++){
            if(passengers[i] > 67){
                finalPrice += 15;
            }else if(passengers[i] <= 15 && passengers[i] >= 0){
                kidAmount++;
                finalPrice += 10;
            }else if(passengers[i] >= 16){
                adultAmount++;
                finalPrice +=30;
            }
        }

        if(kidAmount >= 2){
            finalPrice -=20;
        }

        if(adultAmount >= 10){
            finalPrice -= finalPrice/4;
        }

        return finalPrice;
    }

    public void dialog(){
        TextUI ui = new TextUI();
        int[] passengers;
        int passengerCount =  ui.getIntInput("Hello! How many people are you buying tickets for?");
        passengers = new int[passengerCount];
        for(int i = 0; i<passengers.length; i++) {
            int age = ui.getIntInput("How old is the passenger?");
            int price = calculatePrice(age);
            passengers[i] = price;


            if(!isAdult && !isSenior){
                ui.sendMsg("The person added is "+age+" years old and therefore need to pay "+price+" DKK. Which is a childrens ticket");
            }else if(isSenior){
                ui.sendMsg("The person added is "+age+" years old and therefore need need to pay "+price+" DKK. Which is a seniors ticket");

            }else{
                ui.sendMsg("The person added is "+age+" years old and therefore need to pay "+price+" DKK. Which is an adults ticket");
            }

        }

        int fullPrice = calculateFullPrice(passengers);
        System.out.println("The final price for: "+passengerCount+" passengers, is: "+fullPrice);

    }



}
