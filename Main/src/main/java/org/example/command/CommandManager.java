package org.example.command;

import java.util.Scanner;

import org.example.main.Main;
import org.example.rooms.Room1;

public class CommandManager
{
    public static Scanner scan;

    public Room1 room1;

    public Help help;
    public Speak speak;
    public Exit exit;

    public CommandManager(Main main)
    {
        scan = new Scanner(System.in);
        help = new Help(main);
        exit = new Exit(main);
        speak = new Speak(main);

        room1 = new Room1();
    }

    public void readCommand()
    {
        String input = scan.nextLine().trim().toLowerCase();
        {
            if(input.isBlank())
            {
                System.out.println("The command cannot be empty.");
                return;
            }

            switch (input)
            {
                case "help":
                    org.example.command.Help.helpCommand();
                    break;

                case "exit":
                    org.example.command.Exit.exitCommand();
                    break;

                case "speak with ghost":
                    org.example.command.Speak.talkToGhost();
                    break;

                case "enter room":
                    room1.room1();
                    break;

                default:
                    System.out.println("'" + input + "' is not a valid command. Type 'help' for a list of commands.");

            }
        }
    }
}
