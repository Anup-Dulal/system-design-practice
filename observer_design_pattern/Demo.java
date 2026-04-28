package observer_design_pattern;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Demo {
    public static void main(String[] args) {
        YoutubeChannel channel = new YoutubeChannel();

        Subscriber subscriber1 = new Subscriber("Alice");
        Subscriber subscriber2 = new Subscriber("Bob");

        channel.subscribe(subscriber1);
        channel.subscribe(subscriber2);

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            System.out.println("Enter command (subscribe/unsubscribe/notify/exit): ");
            try {
                String command = reader.readLine();

                if (command.equals("subscribe")) {
                    System.out.println("Enter subscriber name: ");
                    String name = reader.readLine();
                    Subscriber subscriber = new Subscriber(name);
                    channel.subscribe(subscriber);
                } else if (command.equals("unsubscribe")) {
                    System.out.println("Enter subscriber name: ");
                    String name = reader.readLine();
                    Subscriber subscriber = new Subscriber(name);
                    channel.unsubscribe(subscriber);
                } else if (command.equals("notify")) {
                    System.out.println("Enter message: ");
                    String message = reader.readLine();
                    channel.notifyObservers(message);
                } else if (command.equals("exit")) {
                    break;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
