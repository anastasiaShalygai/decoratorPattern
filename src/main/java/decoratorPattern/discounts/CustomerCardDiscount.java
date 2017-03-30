package decoratorPattern.discounts;

import decoratorPattern.DiscountsDecorator;
import decoratorPattern.Perfume;

import static utils.DiscountConstants.CUSTOMER_CARD_DISCOUNT;

/**
 * Created by Anastasiya on 29.03.2017.
 */
public class CustomerCardDiscount extends DiscountsDecorator{
    Perfume perfume;

    public CustomerCardDiscount(Perfume perfume) {
        this.perfume = perfume;
    }

    @Override
    public String getDescription() {
        return perfume.getDescription() + " + CustomerCardDiscount(" + CUSTOMER_CARD_DISCOUNT + "%)";
    }

    @Override
    public double cost() {
        return perfume.cost() - (perfume.cost() * (CUSTOMER_CARD_DISCOUNT / 100));
    }
}
