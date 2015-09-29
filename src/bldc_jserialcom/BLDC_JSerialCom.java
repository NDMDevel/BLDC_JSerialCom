/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bldc_jserialcom;

import java.util.ArrayList;
import java.util.Collections;
import jssc.SerialPort;
import jssc.SerialPortException;

/**
 *
 * @author damian
 */
public class BLDC_JSerialCom
{
    /**
     * @param args the command line arguments
     */
    public synchronized static void main(String[] args) throws SerialPortException, InterruptedException
    {
/*        SerialPort serialPort = new SerialPort("/dev/ttyUSB0");
        try
        {
            System.out.println("Port opened: " + serialPort.openPort());
            System.out.println("Params setted: " + serialPort.setParams(9600,8,1,0));
//            System.out.println("\"Hello World!!!\" successfully writen to port: "
//                    + serialPort.writeBytes("Hello World!!!".getBytes()));
//            System.out.println(serialPort.readString());
            //System.out.println("Port closed: " + serialPort.closePort());
        }
        catch(SerialPortException ex)
        {
            System.out.println(ex);
        }
        serialPort.writeBytes("d5\0".getBytes());
        serialPort.writeBytes("s\0".getBytes());
*/        
//synchronizedList<String> Ans;
/*        ArrayList<String> Ans;

        Ans = (ArrayList<String>) Collections.synchronizedCollection(new ArrayList());
        
        SerialReciverThread thread = new SerialReciverThread(Ans);
        thread.start();

        while(true)
        {
            if( !Ans.isEmpty() )
            {
                System.out.println("<-- Removed from main Thread: "+Ans.remove(0));
            }
        }
*/
        MainWindow win = new MainWindow();
        win.setVisible(true);
        
        
        /*** Linux: ***
        Para ver la lista de puertos Serie disponibles, ejecutar en consola:

            $ dmesg | grep tty

        En linux, por defecto la aplicacion java no tendra permiso para 
        usar el puerto serie (/dev/ttyUSBx o /dev/tty). Para dar permiso a la
        aplicacion, ejecutar los siguientes comandos
        (probado en Ubuntu 14.04 64 bits):

            $ sudo usermod -a -G dialout <username>
            $ sudo chmod a+rw /dev/ttyUSBx

        */

        /* 
            Segun el sistema operativo (SO) sera el nombre del puerto.
            En windows los puertos se llaman COM<PortNumber>, mientras que
            en linux son /dev/tty<PortNumber> o /dev/ttyUSB<PortNumber>
        */
/*        String OS = System.getProperty("os.name");
        System.out.println("OS: "+OS);
        if( "Linux".equals(OS) )    //que sistema operativo se esta usando?
        {
            //Linux:
        }
        else
        {
            //Windows:
        }
        while(true)
        {
            System.out.println("  Main thread...");
            Thread.sleep(250);
        }
        */
/*
        SerialPort serialPort = new SerialPort("/dev/ttyUSB1");
        try
        {
            System.out.println("Port opened: " + serialPort.openPort());
            System.out.println("Params setted: " + serialPort.setParams(9600,8,1,0));
//            System.out.println("\"Hello World!!!\" successfully writen to port: "
//                    + serialPort.writeBytes("Hello World!!!".getBytes()));
//            System.out.println(serialPort.readString());
            //System.out.println("Port closed: " + serialPort.closePort());
        }
        catch(SerialPortException ex)
        {
            System.out.println(ex);
        }
*/
//        MainWindow maingui = new MainWindow();
//        maingui.setVisible(true);
 /*       while(true)
        {
            byte[] buffer = serialPort.readBytes(1);
            System.out.print(new String(buffer));
        }
*/
    }
}
/*
package jssc_test;

import jssc.SerialPort;
import jssc.SerialPortException;

public class Main {
    public static void main(String[] args) {
        SerialPort serialPort = new SerialPort("COM1");
        try {
            System.out.println("Port opened: " + serialPort.openPort());
            System.out.println("Params setted: " + serialPort.setParams(9600, 8, 1, 0));
            System.out.println("\"Hello World!!!\" successfully writen to port: " + serialPort.writeBytes("Hello World!!!".getBytes()));
            System.out.println("Port closed: " + serialPort.closePort());
        }
        catch (SerialPortException ex){
            System.out.println(ex);
        }
    }
}
*/