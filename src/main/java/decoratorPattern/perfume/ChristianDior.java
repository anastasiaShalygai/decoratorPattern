package decoratorPattern.perfume;

import decoratorPattern.Perfume;

import static utils.PerfumePriceConstants.CHRISTIAN_DIOR_PRICE;

/**
 * Created by Anastasiya on 29.03.2017.
 */
public class ChristianDior extends Perfume {
    public ChristianDior() {
        description = "ChristianDior";
    }

    @Override
    public double cost() {
        return CHRISTIAN_DIOR_PRICE;
    }
}
