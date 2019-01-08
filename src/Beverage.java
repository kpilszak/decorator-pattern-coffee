public abstract class Beverage {
    String description = "Unknown Beerage";

    public String getDescription(){
        return description;
    }

    public abstract double cost();
}
