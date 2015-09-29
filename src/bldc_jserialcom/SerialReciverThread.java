/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bldc_jserialcom;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author damian
 */
public class SerialReciverThread extends Thread
{
    public boolean stopthread;
    private static ArrayList<String> Ans;
    public SerialReciverThread(ArrayList ans)
    {
        Ans = ans;
    }
    public synchronized void run()
    {
        stopthread = false;
        while(stopthread == false)
        {
            double aux = Math.random();
            System.out.println("Adding data from Thread... "+aux);
            Ans.add("--> Number_"+aux);
            try
            {
                Thread.sleep(500);
                notifyAll();
            }
            catch (InterruptedException ex)
            {
                Logger.getLogger(SerialReciverThread.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        System.out.println("Thread exiting...");
    }
}
