package org.example.command;

import org.example.main.Main;

public class Exit
{
    public Main main;

    public Exit(Main main)
    {
        this.main = main;
    }

    public static void exitCommand()
    {
        if (Main.rom1 == true)
        {
            System.out.println("You exit the room and return to the main hall");
            Main.rom1 = false;
        }

        else
        {
            System.out.println("You exit the spooky haunted house...");
            System.exit(0);
        }

    }
}