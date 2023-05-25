package question5_dialogmedbruger;
//I denne opgave skal man skabe en dialog med brugeren. Heri, skal man spørge om ens fødselsår og returnere hvornår
// de kan gå på pension. Som bonus kan man implementere, at der er regler for inputtet.

public class Main {
    public static void main(String[] args) {

        Dialog dialog = new Dialog(2023);
        dialog.getYearOfBirth();

    }
}
