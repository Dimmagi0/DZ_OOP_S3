package Dz3S_1;

import java.util.List;

public class Controller {
    private StreamService streamService;

    public Controller(StreamService streamService){
        this.streamService = streamService;
    }

    public void sortStreams(List<Stream> streams){
        streamService.sortStreams(streams);
    }
}
