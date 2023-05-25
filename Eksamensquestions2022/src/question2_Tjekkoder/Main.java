package question2_Tjekkoder;

//Opgave hvor man skal lave et program der tjekker om en kode opfylder en mængde regler. Reglerne er som følgende:
//Koden skal være over eller lig minimum længden.
//Koden skal være under eller lig max længden.
//Og hvis numre er et krav, skal den tjekke om koden indeholder mindst 1 nummer.

//Som bonus, kan man tjekke om koden indeholder mindst 1 upperCase bogstav.

public class Main {

    public static void main(String[] args){

        String goodPassword = "Test123";
        String passwordOverMax = "Test123456789";
        String passwordUnderMin = "Te";
        String passwordWithoutNumber = "Testagain";
        String passwordWithoutUpper = "test123";

        //PasswordValidator som har reglerne at koden skal være længere eller lig 4, mindre eller lig 12 og den behøver ikke indeholde numre eller et stort bogstav.
        PasswordValidator p1 = new PasswordValidator(4,12,false, false);
        //PasswordValidator som har reglerne at koden skal være længere eller lig 4, mindre eller lig 12 og den SKAL indeholde et tal og et stort bogstav.
        PasswordValidator p2 = new PasswordValidator(4,12,true, true);


        System.out.println(p1.isValid(goodPassword)); //TRUE
        System.out.println(p2.isValid(goodPassword)); //TRUE

        System.out.println(p1.isValid(passwordOverMax)); //FALSE
        System.out.println(p1.isValid(passwordUnderMin)); //FALSE
        System.out.println(p2.isValid(passwordWithoutNumber)); //FALSE

        System.out.println(p2.isValid(passwordWithoutUpper)); //FALSE
    }

}
