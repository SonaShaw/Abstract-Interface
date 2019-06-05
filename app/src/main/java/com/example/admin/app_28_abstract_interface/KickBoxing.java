package com.example.admin.app_28_abstract_interface;

/**
 * Created by admin on 2/13/2018.
 */

public class KickBoxing extends Boxing {

    private int kickPower, kickSpeed;

    public KickBoxing(String name, String rules, String uniform, int speedRequired, int powerRequired,
                      int punchingPower, int punchingSpeed, int costOfInsurance,int kickPower, int kickSpeed){

        super(name, rules, uniform, speedRequired, powerRequired, punchingPower, punchingSpeed, costOfInsurance);

        this.kickPower = kickPower;
        this.kickSpeed = kickSpeed;

    }

    public int getKickPower() {
        return kickPower;
    }

    public void setKickPower(int kickPower) {
        this.kickPower = kickPower;
    }

    public int getKickSpeed() {
        return kickSpeed;
    }

    public void setKickSpeed(int kickSpeed) {
        this.kickSpeed = kickSpeed;
    }

    @Override
    public String toString() {
        return String.format("%s\n%s : %d\n%s : %d",super.toString(),"Kick Power",getKickPower(),
                            "Kick Speed", getKickSpeed());
    }
}
