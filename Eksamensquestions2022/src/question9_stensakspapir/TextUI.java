package question9_stensakspapir;

import java.util.Scanner;

public class TextUI {

    Scanner scan = new Scanner(System.in);

    public void sendMsg(String s){
        System.out.println(s);
    }


    public String getInput(String s){
        System.out.println(s);
        return scan.nextLine();
    }


    public int getIntInput(String s){
        System.out.println(s);
        int output = scan.nextInt();
        scan.nextLine();
        return output;
    }

}
