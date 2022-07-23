package com.github.AndrewAlbizati;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bot token: ");
        String token = scanner.nextLine();

        Bot bot = new Bot(token);

        // Ask to delete Slash Commands
        do {
            System.out.print("Would you like to delete all Slash Commands (y/n)? ");
            String response = scanner.nextLine();
            if (response.equalsIgnoreCase("y")) {
                bot.run();
                break;
            } else if (response.equalsIgnoreCase("n")) {
                bot.getApi().disconnect();
                break;
            } else {
                System.out.println("Invalid response!");
            }
        } while (true);
    }
}
