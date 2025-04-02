package de.lubowiecki;

public class KontrollstrukturTest1 {

    public static void main(String[] args) {

        int i = 10;

        String msg;

        if(i > 10)
            msg = "Über";
        else
            msg = "Unter";

        System.out.println(msg);

        System.out.println((i > 10) ? "Über" : "Unter");

        String msg2 = (i > 10) ? "Über" : "Unter";
        System.out.println(msg2);

        msg2 = (i > 10) ? "Über" : (i < 5) ? "Ganz klein!" : "Unter";
        System.out.println(msg2);


    }
}
