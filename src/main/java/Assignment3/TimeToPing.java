package Assignment3;

import java.util.*;
import java.util.Date;
import java.net.*;

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
        ArrayList<Long> time=new ArrayList<>();
        int t=1;
        while(t<=5) {
            long start = new Date().getTime();
            try {
                if (ip.isReachable(5000)) {
                    long finish = new Date().getTime();
                    System.out.println("Ping Time : "+ (finish - start + "ms"));
                    time.add(finish - start);
                    t++;
                } else {
                    System.out.println(ip + " NOT reachable.");
                    break;
                }
            } catch (UnknownHostException ex) {
                System.out.println("Host Not Present");
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        System.out.println("Median Time to Ping is "+Median(time));
    }
    public static double Median(ArrayList<Long> values) {
        Collections.sort(values);
        if (values.size() % 2 == 1)
            return values.get((values.size() + 1) / 2 - 1);
        else {
            double lower = values.get(values.size() / 2 - 1);
            double upper = values.get(values.size() / 2);

            return (lower + upper) / 2;
        }
    }
}
