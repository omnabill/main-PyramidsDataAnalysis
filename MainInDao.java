import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class MainInDao {
    public static void main(String[] args) throws IOException {


        PyramaidCsvDao Dao = new PyramaidCsvDao();

        ArrayList<pyramid>  pyramids = Dao.readPyramidsFromCSV();
        for(pyramid pyramid1:pyramids){
            System.out.println(pyramid1);
            System.out.println("-----------------------------------------------------------------------------");
        }
        Collections.sort(pyramids, new SortByHeight());
        for(pyramid pyramid1:pyramids){
            System.out.println("Pyramid Height Sorted is : "+pyramid1.getHeight());
        }
        System.out.println(Dao.Map_ret(pyramids));
    }
        
    }
    
  
