package question3_Sammenlignbyer;

//I denne opgave skal man lave et program som kan sammenligne en mængde byer i en samling af byer.
//Man skal kunne sammenligne størrelserne af byerne i population og kunne finde den samlet mængde population.
//Som bonus, skal man kunne få den gennemsnitligt indbyggertal

public class Main {

    public static void main(String[] args){

        Cities cities = new Cities();
        cities.addCity(new City("Kongens Lyngby", 57500));
        cities.addCity(new City("Ribe", 8257));
        cities.addCity(new City("Storvorde", 3425));
        cities.addCity(new City("Tarm", 4010));
        cities.addCity(new City("Horreby", 305));


        System.out.println(cities.getBiggestCity().getName());
        System.out.println(cities.getTotalPopulation());
        System.out.println(cities.getAveragePopulation());

    }

}
