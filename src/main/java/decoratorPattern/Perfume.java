package decoratorPattern;

/**
 * Created by Anastasiya on 29.03.2017.
 */
public abstract class Perfume {
    protected String description = "Unknown Perfume";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
