package Eksamensopgave;

public class Main {

    static TextUI ui = new TextUI();
    public static void main(String[] args) {

        int[] ageLimits = new int[]{
                10,
                16,
                68
        };
        TicketMaster tm = new TicketMaster(ageLimits);

        /*
        ui.sendMsg(""+tm.calculatePrice(10)); //10 år, børnebillet.
        ui.sendMsg("--------------------------------------------");
        ui.sendMsg(""+tm.calculatePrice(30)); //30 år, voksenbillet.
        ui.sendMsg("--------------------------------------------");
        ui.sendMsg(""+tm.calculatePrice(68)); //68 år, seniorbillet .
        ui.sendMsg("--------------------------------------------");
        */

        tm.dialog();



    }
}
