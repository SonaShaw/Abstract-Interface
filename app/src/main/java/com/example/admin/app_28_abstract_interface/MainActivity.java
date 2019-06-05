package com.example.admin.app_28_abstract_interface;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        TextView txtDesktopComputer = (TextView) findViewById(R.id.txtDesktopComputer);
        TextView txtLaptopComputer = (TextView) findViewById(R.id.txtLaptopComputer);
        TextView txtSmartphoneComputer = (TextView) findViewById(R.id.txtSmartPhoneComputer);
        TextView txtTabletCoomputer = (TextView) findViewById(R.id.txtTabletComputer);

        TextView txtDesktopComputerPerformance = (TextView) findViewById(R.id.txtDesktopComputerPerfomance);
        TextView txtLaptopComputerPerformance = (TextView) findViewById(R.id.txtLaptopComputerPerformance);
        TextView txtSmartphoneComputerPerformance = (TextView) findViewById(R.id.txtSmartPhoneComputerPerformance);
        TextView txtTabletComputerPerformance = (TextView) findViewById(R.id.txtTabletComputerPerformance);

        DesktopComputer desktopComputer = new DesktopComputer("pavilion","led","jhakaas",
                                                                "bolder",100,500);

        LaptopComputer laptopComputer = new LaptopComputer("hp","hd","american",
                                                            "smooth",200,600);

        SmartphoneComputer smartphoneComputer = new SmartphoneComputer("galaxy","full hd",
                                                            "touch","android",
                                                                50,250);


        TabletComputer tabletComputer = new TabletComputer("ipad","latest","general",
                                                            "ios",80,400,50);


        txtDesktopComputerPerformance.setText("performance : " + desktopComputer.evaluatePerforance() + "\n");
        txtLaptopComputerPerformance.setText("performance : " + laptopComputer.evaluatePerforance() + "\n");
        txtSmartphoneComputerPerformance.setText("perfomance " + smartphoneComputer.evaluatePerforance() + "\n");
        txtTabletComputerPerformance.setText("performance " + tabletComputer.evaluatePerforance() + "\n");


        Computer[] computers = new Computer[4];
        computers[0] = desktopComputer;
        computers[1] = laptopComputer;
        computers[2] = smartphoneComputer;
        computers[3] = tabletComputer;


        for(Computer a : computers){
            if(a instanceof DesktopComputer){
                DesktopComputer current = (DesktopComputer) a;
                txtDesktopComputer.setText(current.toString());
            }

            if(a instanceof LaptopComputer){
                LaptopComputer current = (LaptopComputer) a;
                txtLaptopComputer.setText(current.toString());
            }

            if(a instanceof SmartphoneComputer && !(a instanceof TabletComputer)){
                SmartphoneComputer current = (SmartphoneComputer) a;
                txtSmartphoneComputer.setText(current.toString());
            }

            if(a instanceof TabletComputer){
                TabletComputer current = (TabletComputer) a;
                txtTabletCoomputer.setText(current.toString());
            }

        }


        //....................................................................................
        //...........APP : 29 .................................................................
        //////......contains class Sport, Boxing, KickBoxing, Student and interface LifeInsurance...
        //..................................................................................



        TextView txtPolymorphism = (TextView) findViewById(R.id.txtPolymorphism);

        LifeInsurance[] lifeInsurances = new LifeInsurance[3];
        lifeInsurances[0] = new Student("sona","android developement",5000);
        lifeInsurances[1] = new Boxing("souvik","Fighting with only hands","white",10,
                                        50,100,30,10000);

        lifeInsurances[2] = new KickBoxing("subhojit","use only legs","black",15,
                                            40,40,15,15000,
                                                    26,62);


        String oldValue;
        for(LifeInsurance life : lifeInsurances){
            oldValue = txtPolymorphism.getText().toString();

            txtPolymorphism.setText(String.format(oldValue + "%s\n%s   :   %f\n\n\n",life.toString(),
                                    "Insurance cost",life.costOfInsurance()));
        }


    }
}
