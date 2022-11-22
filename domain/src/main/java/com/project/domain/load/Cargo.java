package com.project.domain.load;

import com.project.domain.carriage.CarriageHelper;

public class Cargo extends CarriageHelper {
    private int weight;
    public int getWeight() {
        return weight;
    }

    public Cargo(int weight) {
        this.weight = weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "weight: " + weight;
    }
}

