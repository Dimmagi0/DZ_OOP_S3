package Dz3S_1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Stream stream1 = new Stream();
        stream1.addGroup(new Group("Group 2"));
        stream1.addGroup(new Group("Group 1"));

        Stream stream2 = new Stream();
        stream2.addGroup(new Group("Group 3"));

        List<Stream> streams = new ArrayList<>();
        streams.add(stream1);
        streams.add(stream2);

        StreamService streamService = new StreamService();

        Controller controller = new Controller(streamService);

        System.out.println("Перед сортировкой");
        for (Stream stream : streams) {
            for (Group group : stream) {
                System.out.println(group.getName());
            }
        }

        controller.sortStreams(streams);

        System.out.println("После сортировки");
        for (Stream stream : streams) {
            for (Group group : stream) {
                System.out.println(group.getName());
            }
        }
    }
}
