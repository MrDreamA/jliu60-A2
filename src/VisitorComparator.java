import java.util.Comparator;

public class VisitorComparator implements Comparator<Visitor> {
    @Override
    public int compare(Visitor o1, Visitor o2) {
        // Compare VIP first, then compare age.
        if(o1.getVip() != o2.getVip()){
            return Integer.compare(o1.getVip(), o2.getVip());
        }
        else{
            return Integer.compare(o1.getAge(), o2.getAge());
        }
    }
}
