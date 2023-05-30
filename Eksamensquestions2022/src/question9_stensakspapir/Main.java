package question9_stensakspapir;

import java.util.Random;

public class Main {

    static TextUI ui = new TextUI();
    static Player p1;
    static Player p2;
    public static void main(String[] args) {
        ui.sendMsg("Hello, welcome to rock, paper, scissors");
        p1 = new Player(ui.getInput("Please state your name:"));
        ui.sendMsg("Hello "+p1.getName());

        switch (ui.getIntInput("Do you want to play against a player, or a CPU? 1: CPU, 2: Player")) {
            case 1 -> cpuGame();
            case 2 -> playerGame();
            default -> ui.sendMsg("Not a valid input");
        }
    }


    public static void cpuGame(){
        boolean game = true;
        while(game){
            String move = ui.getInput("Please type out a move: Rock, Paper, Scissors:");
            if(!isValid(move)){
                ui.sendMsg("Not a valid input!");
            }else{
                p1.setMove(move);
                Random random = new Random();
                int cpuMove = random.nextInt(1,4);
                String cpuStrMove = "";
                switch(cpuMove){
                    case 1 -> cpuStrMove = "Rock";
                    case 2 -> cpuStrMove = "Paper";
                    case 3 -> cpuStrMove = "Scissors";
                }
                if(p1.getMove().equalsIgnoreCase(cpuStrMove)){
                    ui.sendMsg("Its a tie! You chose: "+p1.getMove()+" and the CPU chose: "+cpuStrMove);
                    if(!resume()){
                        System.exit(0);
                    }

                }else if(p1.getMove().equalsIgnoreCase("Rock") && cpuStrMove.equalsIgnoreCase("Paper")){
                    ui.sendMsg(p1.getName()+", You lose! You chose "+p1.getMove()+" and the CPU chose: "+cpuStrMove);
                    if(!resume()){
                        System.exit(0);
                    }

                }else if(p1.getMove().equalsIgnoreCase("Rock") && cpuStrMove.equalsIgnoreCase("Scissors")){
                    ui.sendMsg(p1.getName()+", You win! You chose "+p1.getMove()+" and the CPU chose: "+cpuStrMove);
                    if(!resume()){
                        System.exit(0);
                    }

                } else if (p1.getMove().equalsIgnoreCase("Paper") && cpuStrMove.equalsIgnoreCase("Scissors")) {
                    ui.sendMsg(p1.getName()+", You lose! You chose "+p1.getMove()+" and the CPU chose: "+cpuStrMove);
                    if(!resume()){
                        System.exit(0);
                    }

                }else if(p1.getMove().equalsIgnoreCase("Paper") && cpuStrMove.equalsIgnoreCase("Rock")){
                    ui.sendMsg(p1.getName()+", You win! You chose "+p1.getMove()+" and the CPU chose: "+cpuStrMove);
                    if(!resume()){
                        System.exit(0);
                    }

                }else if(p1.getMove().equalsIgnoreCase("Scissors") && cpuStrMove.equalsIgnoreCase("Rock")){
                    ui.sendMsg(p1.getName()+", You lose! You chose "+p1.getMove()+" and the CPU chose: "+cpuStrMove);
                    if(!resume()){
                        System.exit(0);
                    }

                } else if (p1.getMove().equalsIgnoreCase("Scissors") && cpuStrMove.equalsIgnoreCase("Paper")) {
                    ui.sendMsg(p1.getName()+", You win! You chose "+p1.getMove()+" and the CPU chose: "+cpuStrMove);
                    if(!resume()){
                        System.exit(0);
                    }
                }
            }
        }

    }

    public static void playerGame(){
        boolean game = true;
        p2 = new Player(ui.getInput("Player 2: Please state your name:"));
        while(game){
            String p1Move = ui.getInput(p1.getName()+", Please type out a move: Rock, Paper, Scissors:");
            if(!isValid(p1Move)){
                ui.sendMsg("Not a valid input!");
            }else{
                p1.setMove(p1Move);
                String p2Move = ui.getInput(p2.getName()+", Please type out a move: Rock, Paper, Scissors:");

                if(!isValid(p2Move)){
                    ui.sendMsg("Not a valid input!");
                }else{

                p2.setMove(p2Move);

                if(p1.getMove().equalsIgnoreCase(p2Move)){
                    ui.sendMsg("Its a tie! "+p1.getName()+" chose: "+p1.getMove()+" and "+p2.getName()+" chose: "+p2.getMove());
                    if(!resume()){
                        System.exit(0);
                    }

                }else if(p1.getMove().equalsIgnoreCase("Rock") && p2.getMove().equalsIgnoreCase("Paper")){
                    ui.sendMsg(p2.getName()+", You Win! "+p1.getName()+" chose: "+p1.getMove()+" and "+p2.getName()+" chose: "+p2.getMove());
                    if(!resume()){
                        System.exit(0);
                    }

                }else if(p1.getMove().equalsIgnoreCase("Rock") && p2.getMove().equalsIgnoreCase("Scissors")){
                    ui.sendMsg(p1.getName()+", You Win! "+p1.getName()+" chose: "+p1.getMove()+" and "+p2.getName()+" chose: "+p2.getMove());
                    if(!resume()){
                        System.exit(0);
                    }

                } else if (p1.getMove().equalsIgnoreCase("Paper") && p2.getMove().equalsIgnoreCase("Scissors")) {
                    ui.sendMsg(p2.getName()+", You Win! "+p1.getName()+" chose: "+p1.getMove()+" and "+p2.getName()+" chose: "+p2.getMove());
                    if(!resume()){
                        System.exit(0);
                    }

                }else if(p1.getMove().equalsIgnoreCase("Paper") && p2.getMove().equalsIgnoreCase("Rock")){
                    ui.sendMsg(p1.getName()+", You Win! "+p1.getName()+" chose: "+p1.getMove()+" and "+p2.getName()+" chose: "+p2.getMove());
                    if(!resume()){
                        System.exit(0);
                    }

                }else if(p1.getMove().equalsIgnoreCase("Scissors") && p2.getMove().equalsIgnoreCase("Rock")){
                    ui.sendMsg(p2.getName()+", You Win! "+p1.getName()+" chose: "+p1.getMove()+" and "+p2.getName()+" chose: "+p2.getMove());
                    if(!resume()){
                        System.exit(0);
                    }

                } else if (p1.getMove().equalsIgnoreCase("Scissors") && p2.getMove().equalsIgnoreCase("Paper")) {
                    ui.sendMsg(p1.getName() + ", You Win! " + p1.getName() + " chose: " + p1.getMove() + " and " + p2.getName() + " chose: " + p2.getMove());
                    if(!resume()){
                        System.exit(0);
                    }
                    }
                }
            }
        }
    }

    public static boolean isValid(String s){
        if(s.equalsIgnoreCase("Rock") || s.equalsIgnoreCase("Scissors") || s.equalsIgnoreCase("Paper")){
            return true;
        }else {
            return false;
        }
    }

    public static boolean resume(){
        if(ui.getInput("Do you want to continue?").equalsIgnoreCase("Y")){
            return true;
        }else{
            return false;
        }
    }


}
