package com.example.admin.app_28_abstract_interface;

/**
 * Created by admin on 2/12/2018.
 */

public class SmartphoneComputer extends Computer {

    private String operatingSystem;
    private double cpuPower;
    private double ram;


    public SmartphoneComputer(String name, String screen, String keyboard, String operatingSystem,
                              double cpuPower, double ram){
        super(name,screen,keyboard);

        if(cpuPower <=0)
            throw new IllegalArgumentException("cpu power must be greater than zero");

        if(ram <= 0)
            throw new IllegalArgumentException("ram must be greater than zero");

        this.operatingSystem = operatingSystem;
        this.cpuPower = cpuPower;
        this.ram = ram;

    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
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
        return String.format("%s\n%s : %f\n%s : %f",super.toString(),"Cpu Power", getCpuPower(),"ram", getRam());
    }
}
