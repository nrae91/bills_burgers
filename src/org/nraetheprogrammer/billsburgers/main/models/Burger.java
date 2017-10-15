package org.nraetheprogrammer.billsburgers.main.models;

import java.util.Set;

public class Burger {
    private BreadRollType breadRollType;
    private Meat meat;
    private Set<String> extras;
    private double price;

    public Burger(BreadRollType breadRollType, Meat meat, Set<String> extras, double price) {
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.extras = extras;
        this.price = price;
    }
}
