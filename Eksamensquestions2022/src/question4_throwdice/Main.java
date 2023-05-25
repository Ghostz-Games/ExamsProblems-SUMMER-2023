package question4_throwdice;
//Denne opgave skal man kunne slå med en terning, se resultatet, og kunne lave en cup med terninger i hvori man kan
// kan tjekke hvor mange af slagene der er identiske. Som bonus, skal man kunne returnere et int array med resultaterne fra en mængde rolls

import java.util.Arrays;

public class Main {

    public static void main(String[] args){
        Die die = new Die(4);
        Cup cup = new Cup(die, die);


        System.out.println(cup.howManyIdenticalThrows(4));
        System.out.println(Arrays.toString(cup.results(6)));
    }

}
