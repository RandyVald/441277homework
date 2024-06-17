package stream;

import java.util.List;

public class StreamService {

    public static void StremSort(List<Stream> listStream2){
        listStream2.sort(new StreamComporator());
    }
    
}
