package com.vishal.CollectionsFramework.ComparableAndComparator;

import java.util.Comparator;

public class MyCustomComparator implements Comparator<Animal> {
    @Override
    public int compare(Animal o1, Animal o2) {
        return o1.Weight-o2.Weight;
    }

    @Override
    public boolean equals(Object obj) {
        return false;
    }
}
