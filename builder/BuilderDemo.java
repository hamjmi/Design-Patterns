package com.hamid.designPatterns.builder;

public class BuilderDemo {

    public static void main(String[] args) {
	    OrderBuilder builder = new OrderBuilder();
        OrderItems order = builder.combo();
        order.print();
        System.out.println("Total Price : " + order.getPrice());
    }
}
