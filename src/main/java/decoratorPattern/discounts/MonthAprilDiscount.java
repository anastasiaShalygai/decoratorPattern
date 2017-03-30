package decoratorPattern.discounts;

import decoratorPattern.DiscountsDecorator;
import decoratorPattern.Perfume;

import static utils.DiscountConstants.MONTH_APRIL_DISCOUNT;

/**
 * Created by Anastasiya on 29.03.2017.
 */
public class MonthAprilDiscount extends DiscountsDecorator{
    Perfume perfume;

    public MonthAprilDiscount(Perfume perfume) {
        this.perfume = perfume;
    }

    @Override
    public String getDescription() {
        return perfume.getDescription() + " + MonthAprilDiscount(" + MONTH_APRIL_DISCOUNT + "%)";
    }

    @Override
    public double cost() {
        return perfume.cost() - (perfume.cost() * (MONTH_APRIL_DISCOUNT / 100));
    }
}
