package decoratorPattern.perfume;

import decoratorPattern.Perfume;

import static utils.PerfumePriceConstants.NINA_RICCI_PRICE;

/**
 * Created by Anastasiya on 29.03.2017.
 */
public class NinaRicci extends Perfume{
    public NinaRicci() {
        description = "NinaRicci";
    }

    @Override
    public double cost() {
        return NINA_RICCI_PRICE;
    }
}
