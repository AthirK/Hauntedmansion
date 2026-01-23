package org.example.utility;

public class SlowPrint {
    public static void slowPrint(String message)
    {
        for (char c : message.toCharArray())
        {
            System.out.print(c);
            try
            {
                Thread.sleep(35);
            }
            catch (InterruptedException e)
            {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println();
    }
}
