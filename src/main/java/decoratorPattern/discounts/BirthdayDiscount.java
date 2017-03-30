package decoratorPattern.discounts;

import decoratorPattern.DiscountsDecorator;
import decoratorPattern.Perfume;

import static utils.DiscountConstants.BIRTHDAY_DISCOUNT;

/**
 * Created by Anastasiya on 29.03.2017.
 */
public class BirthdayDiscount extends DiscountsDecorator {
    //why package private?
    Perfume perfume;

    public BirthdayDiscount(Perfume perfume) {
        this.perfume = perfume;
    }

    @Override
    public String getDescription() {
        return perfume.getDescription() + " + BirthdayDiscount(" + BIRTHDAY_DISCOUNT + "%)";
    }

    @Override
    public double cost() {
        return perfume.cost() - (perfume.cost() * (BIRTHDAY_DISCOUNT / 100));
    }
}
