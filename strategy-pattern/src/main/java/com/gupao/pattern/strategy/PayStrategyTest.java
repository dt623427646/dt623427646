package com.gupao.pattern.strategy;

public class PayStrategyTest {

    public static void main(String[] args) {

        Order order = new Order("2","45645645645645",324.45);
        System.out.println(order.pay(PayStrategy.JD_PAY));

    }

}
