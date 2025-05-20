import java.util.ArrayList;

public class Portfolio {
    public String name;
    public String owner;
    public ArrayList<Valuable> valuables;

    Portfolio(String name,String owner ) {
        this.name = name;
        this.owner = owner;
        this.valuables = new ArrayList<>();


    }

    public void add(Valuable valuable) {
        this.valuables.add(valuable);

    }

    public double getValue() {
        double total = 0;
        for (Valuable valuable : valuables) {
            total = total + valuable.getValue();


        }
        return total;
    }


}
