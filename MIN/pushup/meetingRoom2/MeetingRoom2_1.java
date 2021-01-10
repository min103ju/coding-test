import java.util.*;

public class MeetingRoom2_1 {
    
    public static void main(String[] args){
        //[[0,30],[5,10],[15,20]]
        Interval iv1 = new Interval(0,30);
        Interval iv2 = new Interval(5,10);
        Interval iv3 = new Interval(15,20);

        //[[7,10],[2,4]]
        // Interval iv1 = new Interval(7,10);
        // Interval iv2 = new Interval(2,8);

        List<Interval> list = new ArrayList<>();
        list.add(iv1);
        list.add(iv2);
        list.add(iv3);

        MeetingRoom2_1 mr2 = new MeetingRoom2_1();

        System.out.println("result : " + mr2.solve(list));
        
    }

    public int solve(List<Interval> list) {

        if(list != null && list.size() != 0) {
            int result = 1;
            
            Collections.sort(list, (a,b) -> a.start - b.start);

            for(int i=0; i<list.size()-1; i++){
                //겹치는 회의실이 있을 경우 필요 회의실 갯수를 +1 한다.
                //겹쳐지는 회의실 판단은 sorting된 list에서 이전 원소 end값과 이후 원소 start값을 비교
                //a.end < b.start의 경우를 겹쳐진다고 판단한다.

                if(list.get(i).end > list.get(i+1).start) result++;
            }

            return result;
        } else {
            return 0;   
        }
        
    }

}
