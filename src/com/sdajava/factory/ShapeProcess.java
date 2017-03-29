package com.sdajava.factory;

import sun.security.provider.SHA;

/**
 * Created by lukas on 29.03.2017.
 */
public class ShapeProcess {



    public void doAction(String type){
        Shape shape = Factory.getShape(type);
        shape.draw();
        shape.fill();
        shape.size();

    }
}
