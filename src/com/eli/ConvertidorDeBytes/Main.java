package com.eli.ConvertidorDeBytes;

import com.sun.org.apache.xpath.internal.SourceTree;

public class Main {

    public static void main(String[] args) {


        long input = 1532300001;
        Main algorithm = new Main();


        int iterator = 0;
        double output = input;
        while (output > 999 && iterator <= 4) {
            output = output / 1024;
            iterator++;
        }

        algorithm.printValue(iterator,output);
    }

    public void printValue(int iterator, double output) {
        switch (iterator) {
            case 0:
                System.out.println(output + " Bytes");
                break;
            case 1:
                System.out.println(output + " KBytes");
                break;
            case 2:
                System.out.println(output + " MBytes");
                break;
            case 3:
                System.out.println(output + " GBytes");
                break;
            case 4:
                System.out.println(output + " TBytes");
                break;
        }
    }
}
