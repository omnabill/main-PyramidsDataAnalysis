import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

public interface Mianinterface {
    public ArrayList<pyramid> readPyramidsFromCSV() throws IOException;
    public pyramid createPyramid(String [] metadata) throws IOException;
    public Map<String,Integer> Map_ret(ArrayList<pyramid> o);
        
}
