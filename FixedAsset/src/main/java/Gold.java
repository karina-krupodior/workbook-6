public class Gold extends FixedAsset {
    private double weight;
    Gold(double weight, String name, double marketValue) {
        super(name,marketValue);
        this.weight = weight;
    }

    @Override
   public double getValue() {
     return    marketValue + (weight * 50);

    }
}




