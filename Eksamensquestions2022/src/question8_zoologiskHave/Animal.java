package question8_zoologiskHave;

public abstract class Animal {

    boolean isMammal;

    public Animal(boolean isMammal){
        this.isMammal = isMammal;
    }

    public abstract void makeSound();

}
