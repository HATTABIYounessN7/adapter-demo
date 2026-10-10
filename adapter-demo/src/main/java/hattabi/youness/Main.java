package hattabi.youness;

import adapter.*;

public class Main {
    public static void main(String[] args) {
        UniteCentre uc = new UniteCentre();

        uc.setVga(new VideoProjecteur());
        uc.print("Hello");

        uc.setVga(new Ecran());
        uc.print("Hello");

        uc.setVga(new HdmiVgaAdapter(new TV()));
        uc.print("Hello");

        uc.setVga(new HdmiVgaAdapterH());
        uc.print("Hello");

        uc.setVga(new SuperVP());
        uc.print("Hello");
    }
}