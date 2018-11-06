package com.singtel.singteltest.model.animal.bird;

public class Chicken extends Bird{

    @Override
    public void sing() {
        System.out.println("says Cluck Cluck");
    }

    public void fly(){
        System.out.println("can fly");
    }


}

