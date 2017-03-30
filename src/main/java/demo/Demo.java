package demo;

import decoratorPattern.Perfume;
import decoratorPattern.discounts.BirthdayDiscount;
import decoratorPattern.discounts.CustomerCardDiscount;
import decoratorPattern.discounts.MonthAprilDiscount;
import decoratorPattern.perfume.Chanel;
import decoratorPattern.perfume.ChristianDior;
import decoratorPattern.perfume.NinaRicci;

/**
 * Created by Anastasiya on 29.03.2017.
 */
public class Demo {
    public static void main(String[] args) {
        Perfume perfumeChanel = new Chanel();
        System.out.println(perfumeChanel.getDescription() + " $ " + perfumeChanel.cost());

        Perfume perfumeChristianDior = new ChristianDior();
        perfumeChristianDior = new BirthdayDiscount(perfumeChristianDior);
        System.out.println(perfumeChristianDior.getDescription() + " $ " + perfumeChristianDior.cost());

        Perfume perfumeNinaRicci = new NinaRicci();
        perfumeNinaRicci = new CustomerCardDiscount(perfumeNinaRicci);
        perfumeNinaRicci = new MonthAprilDiscount(perfumeNinaRicci);
        System.out.println(perfumeNinaRicci.getDescription() + " $ " + perfumeNinaRicci.cost());
    }
}
