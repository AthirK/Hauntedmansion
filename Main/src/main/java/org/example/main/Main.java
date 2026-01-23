package org.example.main;

import org.example.command.CommandManager;
import org.example.command.Speak;

public class Main
{

    public boolean run = true;
    public static boolean key = false;
    public static boolean rom1 = false;

    public CommandManager commandManager = new CommandManager(this);

    public static void main(String[] args)
    {
        Main main = new Main();

        Speak.ghostWelcome();

        while (main.run)

        {
            main.commandManager.readCommand();
        }
    }
}
