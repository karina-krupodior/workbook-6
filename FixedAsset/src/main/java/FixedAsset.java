abstract public class FixedAsset implements Valuable{
    protected String name;
    protected double marketValue;

    FixedAsset(String name ,double marketValue ) {
        this.name = name;
        this.marketValue = marketValue;

    }

    public abstract double getValue ();
}


