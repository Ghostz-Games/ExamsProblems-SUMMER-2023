package question5_dialogmedbruger;

import java.util.Scanner;

public class Dialog {
    private int currentYear;

    public Dialog(int currentYear){
        this.currentYear = currentYear;
    }

    public void getYearOfBirth(){
        System.out.println("Hello, please insert your birth year:");
        Scanner scan = new Scanner(System.in);
        try {
            int birthYear = scan.nextInt();
            scan.nextLine();
            if(isValid(birthYear)){
                int output = getYearsToRetirement(birthYear);
                System.out.println("You have "+output+" years 'till retirement!");
            }else {
                System.out.println("Not valid input");
            }
        }catch (Exception e ){
            System.out.println("Not valid input");
        }

    }

    public int getYearsToRetirement(int i){
        return (i + 67) - currentYear;
    }

    public boolean isValid(int i){
        if(i < currentYear && i <= 9999 && i >= 999 && i > 0){
            return true;
        }else {
            return false;
        }
    }
}
