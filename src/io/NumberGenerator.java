package io;

import java.util.Random;

public class NumberGenerator {
    Random random = new Random();

    String generate4DigitPin(){
        int pin = random.nextInt(9999) - 999;
        return pin + "";
    }

}
