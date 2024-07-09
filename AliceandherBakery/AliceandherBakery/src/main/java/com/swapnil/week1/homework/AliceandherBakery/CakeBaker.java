package com.swapnil.week1.homework.AliceandherBakery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CakeBaker {
    @Autowired
    final Frosting frosting;
    @Autowired
    final Syrup syrup;


    public CakeBaker(Frosting frosting, Syrup syrup) {
        this.frosting = frosting;
        this.syrup = syrup;
    }


    String bakeCake() {
        return "Cake with " + frosting.getFrostingType() + "  and " + syrup.getSyrupType() + ".";
    }
}
