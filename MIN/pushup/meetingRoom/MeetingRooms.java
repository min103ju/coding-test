import java.util.Arrays;
import java.util.Comparator;

class Interval{
    int start;
    int end;
    Interval(){
        this.start = 0;
        this.end =0;
    }
    Interval(int s, int e){
        this.start = s;
        this.end = e;
    }
}

public class MeetingRooms {

    public static void main(String[] args) {

        MeetingRooms meetingRooms = new MeetingRooms();

        boolean result = false;

        Interval in1 = new Interval(7,10);
        Interval in2 = new Interval(2,4);

        Interval[] inArr = {in1, in2};
        System.out.println("result : " + meetingRooms.solve(inArr));
	}

	public boolean solve(Interval[] inArr) {

        if(inArr == null) return false;
        //1 sorting
        print(inArr);
        Arrays.sort(inArr, Comp);
        System.out.println("===after sort====");
        print(inArr);

        for(int i=1; i<inArr.length; i++) {
            if(inArr[i-1].end >inArr[i].start)
                return false;
        }

        return true;
    }

    public void print(Interval[] intervals) {
        for(int i=0; i<intervals.length; i++) {
            Interval in = intervals[i];
            System.out.println(in.start+" "+in.end);

        }
    }

    Comparator<Interval> Comp = new Comparator<Interval>() {

        @Override
        public int compare(Interval a, Interval b) {
            // TODO Auto-generated method stub
            return a.start - b.start;
        }

    };

}

