package org.example.command;

import org.example.main.Main;

public class Help
{
    public Main main;

    public Help(Main main)
    {
        this.main = main;
    }

    public static void helpCommand()
    {

        if (Main.rom1 == true) {
            System.out.println("Type name of command to execute.");
            System.out.println();
            System.out.println("List of commands:");
            System.out.println();
            System.out.println("'help'              - Show list of commands.");
            System.out.println("'search <object>'   - Search an object, eg. 'search wardrobe'.");
            System.out.println("'exit'              - Exit room.");
        }

        else {
            System.out.println("Type name of command to execute.");
            System.out.println();
            System.out.println("List of commands:");
            System.out.println();
            System.out.println("'help'              - Show list of commands.");
            System.out.println("'speak with ghost'  - Speak with ghost.");
            System.out.println("'enter room'        - Enter the room.");
            System.out.println("'exit'              - Exit game.");
        }
    }
}