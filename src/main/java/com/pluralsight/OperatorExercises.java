package com.pluralsight;

import java.security.spec.MGF1ParameterSpec;

public class OperatorExercises {
    public static void main(String[] args) {
        // 1) Coin Pouch
        int a = 4, b = 6;
        System.out.println(a++ + ++b); // 4 + 7 + 11 !

        // 2) Combo Attack
        int x = 5, y = 3, z = 2;
        System.out.println(x++ + ++y * z++); // 5 + 4 * 2 = 13

        // 3) Loot Bags
        int eggs = 150, perBox = 12;
        System.out.println(eggs / perBox + " " + eggs % perBox); // 150 / 12 + 150 % 12 = 12 6 !

        // 4) Mana Surge
        int n = 10;
        n += n++ + ++n;
        System.out.println(n); // 11 10 + 11 = 32 !

        // 5) Triple Buff
        int p = 7;
        System.out.println(p++ + p++ + ++p); // 7 + 8 + 10 = 25 !

        // 6) Bow Shot
        int u = 2, v = 5;
        System.out.println(++u * v-- - u++); // 3 * 5 - 3 = 12 !

        // 7) Average Loot (gotcha: integer division stored in double)
        int gold = 10, players = 3;
        double avg = gold / players;
        System.out.println(avg); // 3

        // 8) Arena Math
        int m = 5, d = 3;
        System.out.println(m / d * d + m % d); // 5 / 3 * 3 + 5 % 3 = ?

        // 9) Level Trick
        int lvl = 1;
        lvl = lvl++ + ++lvl + lvl;
        System.out.println(lvl); // 1 = 1 + 2 + 2 ?

        // 10) Final Boss Formula
        int A = 5, B = 3, C = 2;
        System.out.println(A++ * --B + C++ / B); // 5 * 2 + 2 / 2 = 11 !

        System.out.println("Counting Coins A player collects 137 gold coins. Each bag can hold 20 coins. How many full bags can the player fill, and how many coins are left over?");
        System.out.println(137 % 20); // 17

        System.out.println("Potion Mixing A potion requires 3 red herbs and 2 blue herbs. The player has 17 red herbs and 11 blue herbs. 👉 How many potions can they make?");
        int red = 17, blue = 11;
        int potionsred = 17 / 3;
        int potionsblue = 11 / 2;
        int maxPotions = Math.min(potionsblue, potionsblue);
        System.out.println("WE can make this many potions: " + maxPotions);
        System.out.println(x = potionsred + potionsblue);
        System.out.println("If it were up to red herbs, we could create this many potions: " + potionsred);
        System.out.println("If it were up to blue herbs, we could create this many potions: " + potionsblue);

        System.out.println("Dice Damage Simulate rolling a 6-sided die (int dieRoll = 4;) and add it to the player’s base damage (10). 👉 Print the total damage.");
        int dieRoll = 6;
        int baseDamage = 10;
        int totalDamage = dieRoll + baseDamage;
        System.out.println(totalDamage);

        System.out.println("Character Health A monster hits the hero for 12 points of damage. The hero starts with 100 HP. 👉 Print the hero’s HP after the attack.");
        int monsterHit = 12;
        int startingHP = 100;
        int leftover = 100 - 12;
        System.out.println(leftover);

        System.out.println("Mana Recharge Mana starts at 45. Each turn it regenerates by 10. 👉 Show the mana after 1, 2, and 3 turns (without loops, just calculation).");
        int Manastarts = 45;
        int M3 = Manastarts + 10 * 3;
        System.out.println(M3);

        System.out.println("Ammo Reloading A player has 53 bullets, and each magazine holds 7. 👉 Print how many full magazines they have and how many bullets are left.");
        System.out.println(53 % 7); // 4

        System.out.println("Level Up XP The player has 1180 XP. Each level requires 500 XP. 👉 Print the current level and leftover XP.");
        System.out.println(1180 % 500);
        System.out.println("180 leftover and 2 levels achieved.");
    }
}
