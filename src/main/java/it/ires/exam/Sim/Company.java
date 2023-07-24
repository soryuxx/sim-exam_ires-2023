package it.ires.exam.Sim;

import java.util.ArrayList;
import java.util.List;

public class Company implements  PricePlan{
    private String name;
    private List <PricePlan> pricePlans;

    public Company(String name) {
        this.name = name;
        this.pricePlans = new ArrayList<>();
    }

}
