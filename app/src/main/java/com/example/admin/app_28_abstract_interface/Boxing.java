package com.example.admin.app_28_abstract_interface;

/**
 * Created by admin on 2/13/2018.
 */

public class Boxing extends Sport {

    private int punchingPower, punchingSpeed, costOfInsurance;

    public Boxing(String name, String rules, String uniform, int speedRequired, int powerRequired,
                 int punchingPower, int punchingSpeed, int costOfInsurance){


        super(name, rules, uniform, speedRequired, powerRequired);

        this.punchingPower = punchingPower;
        this.punchingSpeed = punchingSpeed;
        this.costOfInsurance = costOfInsurance;
    }

    public int getPunchingPower() {
        return punchingPower;
    }

    public void setPunchingPower(int punchingPower) {
        this.punchingPower = punchingPower;
    }

    public int getPunchingSpeed() {
        return punchingSpeed;
    }

    public void setPunchingSpeed(int punchingSpeed) {
        this.punchingSpeed = punchingSpeed;
    }



    @Override
    public String toString() {
        return String.format("%s\n%s : %d\n%s : %d",super.toString(),"Punching Power", getPunchingPower(),
                               "Punching Speed", getPunchingSpeed() );
    }


    @Override
    public double costOfInsurance() {
        return costOfInsurance;
    }
}
