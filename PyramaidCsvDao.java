import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PyramaidCsvDao implements Mianinterface{
    public static void main(String[] args) {
        
    }   
    ArrayList<pyramid> pyramids=new ArrayList<>();
    public PyramaidCsvDao(){
    }
    @Override
    public ArrayList<pyramid> readPyramidsFromCSV() throws IOException{
        BufferedReader br=null;;
            try {
                 br = new BufferedReader(new FileReader("D:\\pyramids.csv"));
            }catch(FileNotFoundException e){
                e.printStackTrace();
            }
                String line=null;;
                try {
                    line = br.readLine();
            //        System.out.println(line);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                do {

                    try {
                        line = br.readLine();
                      //  System.out.println(line);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
        
                    if (line != null) {        
                        String[] metadata = line.split(",");
                        pyramids.add(createPyramid(metadata));
                    }
                    } while (line != null);
        
                return pyramids;
            }
    @Override
    public pyramid createPyramid(String [] metadata) throws IOException{
        return (new pyramid(metadata[0],metadata[2],metadata[4],metadata[7]));
        }
    @Override
    public Map<String, Integer> Map_ret(ArrayList<pyramid> o) {
        Map<String, Integer> map = new HashMap<>();
        for(pyramid p:o){
            if(!map.containsKey(p.getsite())){
                map.put(p.getsite(), 1);
            }else{
                map.put(p.getsite(), map.get(p.getsite())+1);
            }
        }
        return map;
    }
    
        
        
    }
