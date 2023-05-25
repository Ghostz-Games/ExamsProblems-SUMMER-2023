package question4_throwdice;

import java.util.Random;

public class Die {

    private int sides;

    public Die(int sides){
        this.sides = sides;
    }

    public int roll(){
        Random r = new Random();
        return r.nextInt(1, sides+1);
    }

}
