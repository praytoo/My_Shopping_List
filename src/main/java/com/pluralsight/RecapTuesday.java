package com.pluralsight;

public class RecapTuesday {
    public static void main(String[] args) {
        //("Challenge A: Double Trouble Create an double with any value you like. Multiply it by 2. Print both the original and the doubled value.");
        double theDouble = 6.7;
        System.out.println(theDouble);
        double theDouble2 = theDouble * 2;
        System.out.println(theDouble2);
        System.out.println("Original:" + theDouble + "Doubled:" + theDouble2);

        //("Challenge B: Name + Number Make a String with your name. Make an int with your favorite number. Print them in one sentence using concatenation.");
        String nam = "Prince";
        int fav = 87;
        System.out.println("My name is" + " " + nam + " " + "My favorite number is" + " " + fav);

        //("Challenge C: Random Surprise Generate a random number between 0 and 10. Print it. Add 5 to it and print the new value.");
        double randomVar = Math.random();
        System.out.println(randomVar * 10);
        double randomVar1 = randomVar * 10;
        System.out.println(randomVar1 + 5);

        //Bonus 1: Clock Math ⏰
       // Take a number of hours (e.g. 27) and calculate what hour that would be on a 24-hour clock. Use % 24.
        int hours = 27;
        int hoursclock = 27 % 24;
        System.out.println(hoursclock + " " + "o'clock");

        //🔹 Bonus 2: Minutes to Hours and Minutes ⏳
        //Take a number of minutes (e.g. 130) and figure out how many full hours and leftover minutes that is.
        int minutes = 130;
        int minutesinhour = minutes / 60;
        int leftovers = minutes % 60;
        System.out.println(minutesinhour + " " + "hours" + " " + leftovers + " " + "minutes");

        // Exercise: Time Calculator (No if statements)
        int nrHours = 3;
        int nrMinutes = 23;
        int minutesToAdd = 183;
        int newhours = (minutesToAdd + nrMinutes) / 60 + nrHours;
        System.out.println(newhours);
        int leftoverminutes = (minutesToAdd + nrMinutes) % 60;
        System.out.println("Final time: " + newhours + ":" + leftoverminutes);
    }
}
