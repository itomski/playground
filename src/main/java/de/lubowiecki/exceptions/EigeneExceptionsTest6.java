package de.lubowiecki.exceptions;

import java.util.UUID;

public class EigeneExceptionsTest6 {

    public static void main(String[] args) {
        try {
            System.out.println(generateEintrittskarte(10));
        }
        catch(ZuAltException e) {
            System.out.println("Sie sind zu alt. Sorry!");
        }
        catch(ZuJungException e) {
            System.out.println("Du bist zu jung. Sorry!");
        }
//        catch(RuntimeException e) {
//            System.out.println(e.getMessage());
//        }
    }

//    public static UUID generateEintrittskarte(int alter) {
//        if(alter < 18) {
//            throw new RuntimeException("Zu jung");
//        }
//        else if(alter > 80) {
//            throw new RuntimeException("Zu alt");
//        }
//        else {
//            return UUID.randomUUID();
//        }
//    }

    public static UUID generateEintrittskarte(int alter) {
        if(alter < 18) {
            throw new ZuJungException("Zu jung");
        }
        else if(alter > 80) {
            throw new ZuAltException("Zu alt");
        }
        else {
            return UUID.randomUUID();
        }
    }
}

class ZuJungException extends RuntimeException {
    public ZuJungException(String message) {
        super(message);
    }
}

class ZuAltException extends RuntimeException {
    public ZuAltException(String message) {
        super(message);
    }
}
