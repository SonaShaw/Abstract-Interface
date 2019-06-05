package com.example.admin.app_28_abstract_interface;

/**
 * Created by admin on 2/12/2018.
 */

public class TabletComputer extends SmartphoneComputer {

    private int screenSize;

    public TabletComputer(String name, String screen, String keyboard, String operatingSystem,
                          double cpuPower, double ram, int screenSize){

        super(name, screen, keyboard,operatingSystem,cpuPower,ram);

        if(screenSize <= 0)
            throw new IllegalArgumentException("Screen Size can't be zero");

        this.screenSize = screenSize;

    }

    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    @Override
    public String toString() {
        return String.format("%s\n%s : %d",super.toString(),"Screen Size",getScreenSize());
    }
}
