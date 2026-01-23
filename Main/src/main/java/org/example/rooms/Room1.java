package org.example.rooms;

import java.util.Random;
import java.util.Scanner;

import org.example.main.Main;

public class Room1 {
    public Main main;

    public void room1(Main main)
    {
        this.main = main;
    }

    public void room1()
    {
        System.out.println("You are now in the room. Type 'search [object]' to explore the room.");
        System.out.println("You see a Bed, a Wardrobe, and a Chest.");

        Main.rom1 = true;
        Random random = new Random();

        String[] objects = { "Bed", "Wardrobe", "Chest" };
        String keyLocation = objects[random.nextInt(objects.length)];

        while (Main.rom1 == true)
        {
            Scanner scan = org.example.command.CommandManager.scan;
            String input = scan.nextLine().trim().toLowerCase();

            if (input.isBlank())
            {
                System.out.println("The command cannot be empty.");
                return;
            }

            else if (input.equals("help"))
            {
                org.example.command.Help.helpCommand();
            }

            else if (input.equals("exit"))
            {
                org.example.command.Exit.exitCommand();
            }

            else if (input.equals("cheat"))
            {
                System.out.println("The key is hidden in: " + keyLocation);
            }

            else if (input.equalsIgnoreCase("search " + keyLocation))
            {
                System.out.println("you found the key, seek out the Ghost!");
                Main.key = true;
            }

            else if (input.equalsIgnoreCase("search bed") && !input.equalsIgnoreCase(keyLocation))
            {
                System.out.println("nothing found");
            }

            else if (input.equalsIgnoreCase("search wardrobe") && !input.equalsIgnoreCase(keyLocation))
            {
                System.out.println("nothing found");
            }

            else if (input.equalsIgnoreCase("search chest") && !input.equalsIgnoreCase(keyLocation))
            {
                System.out.println("nothing found");
            }

            else
            {
                System.out.println("'" + input + "' is not a command. Type 'help' for a list of commands.");
            }
        }
    }
}
