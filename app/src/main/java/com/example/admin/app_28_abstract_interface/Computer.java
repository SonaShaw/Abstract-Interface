package com.example.admin.app_28_abstract_interface;

/**
 * Created by admin on 2/12/2018.
 */

public abstract class Computer {

    private final String name;
    private final String screen;
    private final String keyboard;


    public Computer(String name, String screen, String keyboard){

        this.name = name;
        this.screen = screen;
        this.keyboard = keyboard;


    }

    public String getName() {
        return name;
    }

    public String getScreen() {
        return screen;
    }

    public String getKeyboard() {
        return keyboard;
    }

    @Override
    public String toString() {
        return String.format("%s\n %s\n %s",getName(),getScreen(),getKeyboard());
    }

    public abstract double evaluatePerforance();      //   abstract method does not have body.
                                                        //  object of abstract class can't be created

}
