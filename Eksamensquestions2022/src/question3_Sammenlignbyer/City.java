package question3_Sammenlignbyer;

public class City {

    private String name;
    private int population;

    public City(String name, int population){
        this.name = name;
        this.population = population;

    }

    public int getPopulation() {
        return population;
    }

    public String getName() {
        return name;
    }
}
