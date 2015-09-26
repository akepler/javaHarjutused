package foor;

import javafx.application.Application;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by krister on 4/30/15.
 */
public class Ristmik extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception {

        Foor foor1 = new Foor("üleval", primaryStage);
        Foor foor2 = new Foor("all", primaryStage);
        Foor foor3 = new Foor("paremal", primaryStage);
        Foor foor4 = new Foor("vasakul", primaryStage);

        foor1.punane();
        foor2.punane();
        foor3.roheline();
        foor4.roheline();

        for (int i = 0; i < 5; i++) {
            vertikaalsed(foor1);
            vertikaalsed(foor2);
            horisontaalsed(foor3);
            horisontaalsed(foor4);

        }

    }

    private void vertikaalsed( Foor foor) {
        foor.paus(11);
        punasestRoheliseks(foor);
        foor.paus(5);
        rohelisestPunaseks(foor);
        foor.paus(3);
    }

    private void horisontaalsed(Foor foor) {
        foor.paus(5);
        rohelisestPunaseks(foor);
        foor.paus(14);
        punasestRoheliseks(foor);
    }

    private void rohelisestPunaseks(Foor foor) {

        //Vilgutame rohelist 6x
        for (int i = 0; i < 6; i++) {
            foor.roheline();
            foor.paus(0.5);

        }

        foor.roheline();
        foor.kollane();
        foor.paus(1);
        foor.kollane();
        foor.punane();
    }

    private void punasestRoheliseks(Foor foor) {
        foor.kollane();
        foor.paus(1);
        foor.punane();
        foor.kollane();
        foor.roheline();
    }
}
