package com.sdajava.factory;

/**
 * Created by lukas on 29.03.2017.
 */
public class Factory {

    public static Shape getShape(String type){

        Shape obj = null;

        if(type.equals("circle")){
            obj = new Circle();
        } else if(type.equals("square")){
            obj = new Square();
        }

        return obj;

    }

}
