package question4_throwdice;

import java.util.ArrayList;

public class Cup {

    private Die die1;
    private Die die2;

    public Cup(Die die1, Die die2){
        this.die1 = die1;
        this.die2 = die2;
    }

    public int howManyIdenticalThrows(int times){
        int amount = 0;
        for(int i = 0; i < times; i++){
            int output1 = die1.roll();
            int output2 = die2.roll();
            if(output1 == output2){
                amount++;
            }
        }
        return amount;
    }

    public int[] results(int times){
        int[] result = new int[times];
        for(int i = 0; i < times; i++){
            int output1 = die1.roll();
            int output2 = die1.roll();
            int output3 = output1 + output2;
            result[i] = output3;
        }
        return result;
    }


}
