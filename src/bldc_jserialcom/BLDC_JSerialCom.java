/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bldc_jserialcom;

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
    public static void main(String[] args)
    {
        // TODO code application logic here
        SerialPort serialPort = new SerialPort("COM1");
        try
        {
            System.out.println("Port opened: " + serialPort.openPort());
            System.out.println("Params setted: " + serialPort.setParams(9600, 8, 1, 0));
            System.out.println("\"Hello World!!!\" successfully writen to port: " + serialPort.writeBytes("Hello World!!!".getBytes()));
            System.out.println("Port closed: " + serialPort.closePort());
        }
        catch(SerialPortException ex)
        {
            System.out.println(ex);
        }
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