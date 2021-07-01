import java.util.Comparator;

public class SortByHeight implements Comparator<pyramid>{

    @Override
    public int compare(pyramid o1, pyramid o2) {
        return (int) (o1.getHeight()-o2.getHeight());
    }
    
}
