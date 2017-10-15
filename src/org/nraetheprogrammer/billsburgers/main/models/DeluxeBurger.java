package org.nraetheprogrammer.billsburgers.main.models;

import java.util.Set;

public class DeluxeBurger extends Burger {

    public DeluxeBurger(BreadRollType breadRollType, Meat meat, Set<String> extras, double price) {
        super(breadRollType, meat, extras, price);
    }
}
