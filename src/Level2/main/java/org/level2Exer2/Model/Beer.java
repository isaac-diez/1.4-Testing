package org.level2Exer2.Model;

import java.util.Objects;

public class Beer {

    private String name;
    private double proof;

    public Beer(String name, double proof) {
        this.name = name;
        this.proof = proof;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Beer beer)) return false;
        return Double.compare(proof, beer.proof) == 0 && Objects.equals(name, beer.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, proof);
    }


}
