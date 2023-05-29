package question8_zoologiskHave;

public class Parrot extends Animal{


    public Parrot(boolean isMammal) {
        super(isMammal);
    }

    @Override
    public void makeSound() {
        System.out.println("Tweet bruh tweet");
    }
}
