package Assignment3;

import java.util.Date;
import java.util.Scanner;
import java.net.*;
import java.util.Calendar;

public class TimeToPing {
    public static void main(String args[]) throws UnknownHostException {
        System.out.println("Enter an IP Address");
        Scanner sc=new Scanner(System.in);
        String ipAddress=sc.nextLine();
        calculatePingTime(ipAddress);
    }
    static void calculatePingTime(String ipAddress) throws UnknownHostException{
        InetAddress ip;
        ip = InetAddress.getByName(ipAddress);
        long start = new Date().getTime();
        try {
            if (ip.isReachable(5000)) {
                long finish = new Date().getTime();
                System.out.println("Ip you are trying to ping is "+ ip);
                System.out.println("Ping Time: " + (finish - start + "ms"));
            }
            else {
                System.out.println(ip + " NOT reachable.");
            }
        }
        catch (UnknownHostException ex){
            System.out.println("Host Not Present");
        }
        catch(Exception e){
            System.out.println(e);
        }




    }
}
