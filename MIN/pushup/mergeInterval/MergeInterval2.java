import java.util.*;

class Interval {
    int start;
    int end;
    Interval(){};
    Interval(int start, int end){
        this.start = start;
        this.end = end;
    }
}

public class MergeInterval2 {

    public static void main(String[] args){
        //[[1,3],[2,6],[8,10],[15,18]]
        MergeInterval2 mi = new MergeInterval2();

        List<Interval> list = new ArrayList<>();

        Interval iv1 = new Interval(1,3);
        Interval iv2 = new Interval(2,6);
        Interval iv3 = new Interval(8,10);
        Interval iv4 = new Interval(15,16);
        list.add(iv1);
        list.add(iv2);
        list.add(iv3);
        list.add(iv4);

        mi.solve(list);
    }

    public List<Interval> solve(List<Interval> list){
        List<Interval> result = new ArrayList<>();

        Collections.sort(list, (a,b) -> a.start- b.start);

        Interval before = list.get(0);
        for(int i=1; i<list.size(); i++){
            Interval current = list.get(i);
            if(before.end >= current.start){
                before.end = Math.max(before.end, current.end);
            } else {
                result.add(before);
                before = current;
            }
        }

        if(!result.contains(before)){
            result.add(before);
        }

        println(result);

        return result;
    }

    Comparator<Interval> comp = new Comparator<Interval>(){
        
        @Override
        public int compare(Interval iv1, Interval iv2) {
            return iv1.start - iv2.start;
        }
    };

    public void println(List<Interval> result){
        for(Interval interval : result) {
            System.out.println(interval.start + " : " + interval.end);
        }
    }

}
