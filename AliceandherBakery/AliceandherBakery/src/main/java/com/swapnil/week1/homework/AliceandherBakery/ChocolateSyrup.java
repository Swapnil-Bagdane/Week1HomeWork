package com.swapnil.week1.homework.AliceandherBakery;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class ChocolateSyrup implements Syrup{

    @Override
    public String getSyrupType(){
        return "Chocolate Syrup";
    }
}
