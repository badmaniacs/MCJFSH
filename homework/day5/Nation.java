package homework.day5;
//미완성
public class Nation {
    static String planet = "earth";
    public int area;
    public int population;

    public void nameChange (String name) {
    }

    public void areaChange (int area) {
        this.area = area;
    }

    public void populationChange (int population) {
        this.population = population;
    }
}

class China extends Nation {
    String kungfu;

    void manyHuman () {
        this.population = population*2;
    }
}
class Usa extends Nation {
    String power;

    void warMake (int area) {
        this.area += area;
    }
}
class Soviet extends Nation {
    String communism;

    void purge () {
        this.population /= 2;
    }
}    
   
