package com.androidtraining.lib;

import java.util.ArrayList;

public class MyClass {
    public MyClass() {

    }

    /**
     * Creates a list with as many elements as provided
     * in the elementCount {@link int} parameter.
     * @param elementCount {@link int} elements to be added
     * @return {@link ArrayList <String>} list of elements
     */
    public ArrayList<String> createList(int elementCount) {
        ArrayList<String> elements = new ArrayList<>(elementCount);
        for(int i=0; i<elementCount; i++) {
            elements.add("Element " + i);
        }
        return elements;
    }
}
