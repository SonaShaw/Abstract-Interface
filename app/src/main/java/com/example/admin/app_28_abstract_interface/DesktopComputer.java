package com.example.admin.app_28_abstract_interface;

/**
 * Created by admin on 2/12/2018.
 */

public class DesktopComputer extends Computer {

    private String mouse;
    private double cpuPower;
    private double ram;

    public DesktopComputer(String name, String screen, String keyboard, String mouse,
                            double cpuPower, double ram){

        super(name,screen,keyboard);


        this.mouse = mouse;
        this.cpuPower = cpuPower;
        this.ram = ram;

    }


    public String getMouse() {
        return mouse;
    }

    public void setMouse(String mouse) {
        this.mouse = mouse;
    }

    public double getCpuPower() {
        return cpuPower;
    }

    public void setCpuPower(double cpuPower) {

        if(cpuPower <=0)
            throw new IllegalArgumentException("cpu power must be greater than zero");
        this.cpuPower = cpuPower;
    }

    public double getRam() {
        return ram;
    }

    public void setRam(double ram) {

        if(ram <= 0)
            throw new IllegalArgumentException("ram must be greater than zero");
        this.ram = ram;
    }

    @Override
    public double evaluatePerforance() {
        return cpuPower*ram;
    }

    @Override
    public String toString() {
        return String.format("%s\n%s : %f\n%s : %f",super.toString(),"Cpu Power",getCpuPower(),"Ram",getRam());
    }
}
