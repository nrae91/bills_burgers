package org.nraetheprogrammer.billsburgers.main.models;

import java.util.Set;

public class HealthyBurger extends Burger {

    public HealthyBurger(BreadRollType breadRollType, Meat meat, Set<String> extras, double price) {
        super(breadRollType, meat, extras, price);
    }
}
