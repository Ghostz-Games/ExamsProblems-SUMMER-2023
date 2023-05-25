package question3_Sammenlignbyer;

import java.util.ArrayList;

public class Cities {

    private ArrayList<City> cities = new ArrayList<>();

    public void addCity(City city){
        cities.add(city);
    }

    public City getBiggestCity(){
        City result = new City(null,0);
        for(City c : cities){
            if(result.getPopulation() < c.getPopulation()){
                result = c;
            }
        }
        return result;
    }

    public int getTotalPopulation(){
        int output = 0;
        for(City c : cities){
            output += c.getPopulation();
        }
        return output;
    }

    public int getAveragePopulation(){
        int output = getTotalPopulation();
        output = output/cities.size();
        return output;
    }

}
