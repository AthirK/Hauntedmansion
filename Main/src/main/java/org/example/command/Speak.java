package org.example.command;

import org.example.main.Main;
import org.example.utility.SlowPrint;

public class Speak {
    public Main main;

    public Speak(Main main) {
        this.main = main;
    }

    public static void ghostWelcome() {
        SlowPrint.slowPrint("GHOST: Welcome stranger!");
        SlowPrint.slowPrint("GHOST: My name is Ghost and funny enough I'm actually a ghost... ha ha!");
        SlowPrint.slowPrint("GHOST: I think it's funny... Anyways!");
        SlowPrint.slowPrint(
                "GHOST: THIS! Is the spooky haunted house and\n       I need some help finding my lost key, ");
        SlowPrint.slowPrint("       which is hidden somewhere in the room.");
        SlowPrint.slowPrint("GHOST: Say stranger, if you find the key, speak to me again.");
        System.out.println("Type: 'Help' for a list of commands to use!");
    }

    public static void talkToGhost() {
        if (Main.key == true && Main.rom1 == false) {
            SlowPrint.slowPrint("GHOST: Hello again stranger!");
            SlowPrint.slowPrint("GHOST: Woooah what do you have there? My key!!");
            SlowPrint.slowPrint(
                    "GHOST: I have been looking for this key for over 5000 years.. Now I can FINALLY escape this HELLHOLE!");
            SlowPrint.slowPrint("GHOST: Please accept this treasure as a token of my gratitude.");

            System.out.println("                     _.--.");
            System.out.println("                _.-'_:-'||");
            System.out.println("            _.-'_.-::::'||");
            System.out.println("       _.-:'_.-::::::'  ||");
            System.out.println("     .'`-.-:::::::'     ||");
            System.out.println("    /.'`;|:::::::'      ||_");
            System.out.println("   ||   ||::::::'     _.;._'-._");
            System.out.println("   ||   ||:::::'  _.-!oo @.!-._'-.");
            System.out.println("   \\'.  ||:::::.-!()oo @!()@.-'_.|");
            System.out.println("    '.'-;|:.-'.&$@.& ()$%-'o.'\\U||");
            System.out.println("      `>'-.!@%()@'@_%-'_.-o _.|'||");
            System.out.println("       ||-._'-.@.-'_.-' _.-o  |'||");
            System.out.println("       ||=[ '-._.-\\U/.-'    o |'||");
            System.out.println("       || '-.]=|| |'|      o  |'||");
            System.out.println("       ||      || |'|        _| ';");
            System.out.println("       ||      || |'|    _.-' _.-'");
            System.out.println("       |'-._   || |'|_.-' _.-'");
            System.out.println("       '-._ '-.|| |' `_.-'");
            System.out.println("            '-.||_/.-'");

            /*
             * System.out.println(" . : ::::  ::::::::::::::::::::  :::: : .");
             * System.out.println(":: : :::: :::::::::::::::::::::: :::: : ::");
             * System.out.println(":: : :::: :::::::::::::::::::::: :::: : ::");
             * System.out.println("------------------'''''''-----------------");
             * System.out.println(":: : :::: :::::::: :'''': :::::: :::: : ::");
             * System.out.println(":: : :::: :::::::: ::  :: :::::: :::: : ::");
             * System.out.println(":: : :::: :::::::: ::  :: :::::: :::: : ::");
             * System.out.println(":: : :::: :::::::::::::::::::::: :::: : ::");
             */

            System.out.println("GGWP!");
            System.out.println("Congratulations, you have completed the game");
        }

        else if (Main.key == false && Main.rom1 == false)
        {
            SlowPrint.slowPrint("GHOST: Hmmm, well well well, i see no shiny key here! BACK TO SEARCHING!");
        }

        // lägga till break; för att avsluta programmet?
    }
}
