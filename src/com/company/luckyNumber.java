package com.company;

public class luckyNumber {

    //State vars
    public int ranNumGen;

    public luckyNumber(int rng){
        ranNumGen = rng;
    }

    public int perfectRandom(){
        ranNumGen = (int)Math.sqrt(ranNumGen);
        return ranNumGen;
    }

}
