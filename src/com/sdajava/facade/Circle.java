package com.sdajava.facade;

/**
 * Created by lukas on 29.03.2017.
 */
public class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("Draw");
    }

    @Override
    public void fill() {
        System.out.println("Fill");
    }

    @Override
    public void size() {
        System.out.println("Size");
    }
}
