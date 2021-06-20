package com.company.decorator;

public class Main {

    public static void main(String[] args) {

        Pizza pizza = new ThinCrustPizza();
        Pizza bbqChicken = new BBQChicken(pizza);
        Pizza bbqChickenWithExtraCheese = new ExtraCheese(bbqChicken);

        System.out.println("Cost of bbq chicken with extra cheese " + bbqChickenWithExtraCheese.getCost());

        Pizza pizza1 = new PanPizza();
        Pizza thandooriChicken = new ThandooriChicken(pizza1);

        System.out.println("Cost of the pan pizza with tandoori chicken " + thandooriChicken.getCost());

        //pizza -> Thin Crust pizza -> BBQ chickens -> extra cheese => ThinCrustBBQExtraCheese.java
        //pizza -> Pan pizza -> Tandoori Chicken => PanTandooriChicken.java
    }
}
