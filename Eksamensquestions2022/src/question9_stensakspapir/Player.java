package question9_stensakspapir;

public class Player {

    private String name;
    private String move;

    public Player(String name){
        this.name = name;
    }

    public void setMove(String move){
        this.move = move;
    }

    public String getMove(){
        return this.move;
    }

    public String getName(){
        return this.name;
    }
}
