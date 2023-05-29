package question8_zoologiskHave;
/*I denne opgave skal man kunne lave en abstrakt klasse som skal fungere som blueprint til nogle dyreklasser.
* Som bonus skal man kunne lave nogle metoder, som kan tjekke listen af dyr igennem og sortere dem.*/

import java.util.ArrayList;

public class Main {

    private static ArrayList<Animal> animals = new ArrayList<>();
    public static void main(String[] args) {
        Animal lion = new Lion(true);
        Animal parrot = new Parrot(false);

        animals.add(lion);
        animals.add(parrot);

        for(Animal a: animals){
            a.makeSound();
        }

        ArrayList<Animal> mammals = areMammals(animals);
        for(Animal a: mammals){
            System.out.println(a.toString());
        }

        ArrayList<Animal> lions = areLions(animals);
        for(Animal a: lions){
            System.out.println(a);
        }
    }

    public static ArrayList<Animal> areMammals(ArrayList<Animal> animals){
        ArrayList<Animal> mammals = new ArrayList<>();
        for(Animal a: animals){
            if(a.isMammal){
                mammals.add(a);
            }
        }
        return mammals;
    }

    public static ArrayList<Animal> areLions(ArrayList<Animal> animals){
        ArrayList<Animal> lions = new ArrayList<>();
        for(Animal a: animals){
            if(a instanceof Lion){
                lions.add(a);
            }
        }
        return lions;
    }

}
