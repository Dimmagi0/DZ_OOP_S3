package Dz3S_1;

import java.util.Collections;
import java.util.List;

public class StreamService {

    public void sortStreams(List<Stream> streams){
        Collections.sort(streams, new StreamComparator());
    }
}
