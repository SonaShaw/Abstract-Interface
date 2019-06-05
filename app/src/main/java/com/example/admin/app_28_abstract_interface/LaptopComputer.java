package com.example.admin.app_28_abstract_interface;

/**
 * Created by admin on 2/12/2018.
 */

public class LaptopComputer extends Computer{

    private String touchPad;
    private double cpuPower;
    private double ram;

    public LaptopComputer(String name,String screen, String keyboard, String touchpad, double cpuPower,
                          double ram){

        super(name, screen, keyboard);

        this.touchPad = touchpad;
        this.cpuPower = cpuPower;
        this.ram = ram;
    }


    public String getTouchPad() {
        return touchPad;
    }

    public void setTouchPad(String touchPad) {
        this.touchPad = touchPad;
    }

    public double getCpuPower() {
        return cpuPower;
    }

    public void setCpuPower(double cpuPower) {
        this.cpuPower = cpuPower;
    }

    public double getRam() {
        return ram;
    }

    public void setRam(double ram) {
        this.ram = ram;
    }

    @Override
    public double evaluatePerforance() {
        return cpuPower * ram;
    }

    @Override
    public String toString() {
        return String.format("%s\n%s : %s",super.toString(),"Touchpad" , getTouchPad());
    }
}
