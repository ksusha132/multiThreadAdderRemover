package com.company;

public class Parcer {
    public static int parse(String str) {
        int dig = 0;
        String[] words = str.split(" ");
        for (int i = words.length - 1; i >= 0; i--) {
            if (words[i].equalsIgnoreCase("hundred")) {
                dig += 100 * toInt(words[i - 1]);
                i--;
                continue;
            }
            if (words[i].equalsIgnoreCase("thousand")) {
                dig += 1000 * toInt(words[i - 1]);
                i--;
                continue;
            }
            dig += toInt(words[i]);
        }
        return dig;
    }

    public static int toInt(String str) {
        switch (str) {
            case "one":
                return 1;

            case "two":
                return 2;

            case "three":
                return 3;

            case "four":
                return 4;

            case "five":
                return 5;

            case "six":
                return 6;

            case "seven":
                return 7;

            case "eight":
                return 8;

            case "nine":
                return 9;

            case "ten":
                return 10;

            case "eleven":
                return 11;

            case "twelve":
                return 12;

            case "thirteen":
                return 13;

            case "fourteen":
                return 14;

            case "fifteen":
                return 15;

            case "sixteen":
                return 16;

            case "seventeen":
                return 17;

            case "eighteen":
                return 18;

            case "nineteen":
                return 19;

            case "twenty":
                return 20;

            case "thirty":
                return 30;

            case "forty":
                return 40;

            case "fifty":
                return 50;

            case "sixty":
                return 60;

            case "seventy":
                return 70;

            case "eighty":
                return 80;

            case "ninety":
                return 90;

            default:
                return 0;

        }
    }
}
