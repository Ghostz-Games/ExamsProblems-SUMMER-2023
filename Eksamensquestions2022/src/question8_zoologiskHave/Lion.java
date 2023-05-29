package question8_zoologiskHave;

public class Lion extends Animal{


    public Lion(boolean isMammal) {
        super(isMammal);
    }

    @Override
    public void makeSound() {
        System.out.println("Rawr!");
    }
}
