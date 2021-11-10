package com.hamid.designPatterns.builder;

import java.util.Scanner;

public class OrderBuilder {
    public OrderItems combo()
    {
        OrderItems order= new OrderItems();

        Scanner input = new Scanner(System.in);
        System.out.println(" Enter the choice of Pizza ");
        System.out.println("============================");
        System.out.println("        1. Veg-Pizza       ");
        System.out.println("        2. Non-Veg Pizza   ");
        System.out.println("============================");

        int choice= input.nextInt();
        switch (choice)
        {
            case 1: order.addItems(new VegPizza());
                    break;
            case 2: order.addItems(new NonVegPizza());
                    break;
            default:break;
        }

        System.out.println(" Enter the choice of ColdDrink ");
        System.out.println("============================");
        System.out.println("        1. Pepsi            ");
        System.out.println("        2. Coke             ");
        System.out.println("============================");

        choice=input.nextInt();
        switch(choice)
        {
            case 1: order.addItems(new Pepsi());
                    break;
            case 2: order.addItems(new Coke());
                    break;
            default:break;
        }
        return order;
    }
}
