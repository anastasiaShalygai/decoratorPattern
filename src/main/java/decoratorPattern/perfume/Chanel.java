package decoratorPattern.perfume;

import decoratorPattern.Perfume;

import static utils.PerfumePriceConstants.*;

/**
 * Created by Anastasiya on 29.03.2017.
 */
public class Chanel extends Perfume {
    public Chanel() {
        description = "Chanel";
    }

    @Override
    public double cost() {
        return CHANEL_PRICE;
    }
}
