package com.swapnil.week1.homework.AliceandherBakery;

import org.springframework.stereotype.Component;

@Component
public class StrawberrySyrup implements Syrup{

    @Override
    public String getSyrupType(){
        return "Strawberry Syrup";
    }
}
