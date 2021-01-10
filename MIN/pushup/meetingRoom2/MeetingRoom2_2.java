import java.util.*;



public class MeetingRoom2_2 {
    public static void main(String[] args){
        //[[0,30],[5,10],[15,20]]
        Interval iv1 = new Interval(0,30);
        Interval iv2 = new Interval(5,10);
        Interval iv3 = new Interval(15,20);

        List<Interval> list = new ArrayList<>();
        list.add(iv1);
        list.add(iv2);
        list.add(iv3);
 
        MeetingRoom2_2 mr2 = new MeetingRoom2_2();

        System.out.println("result : " + mr2.solve(list));
        
    }

    public int solve(List<Interval> list) {
        if(list != null && list.size() != 0){
            //start 순으로 정렬
            Collections.sort(list, (a,b) -> a.start - b.start);

            //Queue는 end 순으로 우선순위 정렬
            Queue<Interval> minHeap = new PriorityQueue<>(list.size(), (a, b) -> (a.end - b.end));
            
            //minHeap의 size가 필요 회의실 갯수
            for(int i=0; i<list.size(); i++){
                //minHeap.peek()(=앞 회의실 예약)의 end과 list.get(i).start(=뒷 회의실 예약)을
                //비교하여 회의실이 필요하지 않을 경우(minHeap.peek().end <= list.get(i).start)에는
                //Queue에 poll을 실행한다.
                while(!minHeap.isEmpty() && minHeap.peek().end <= list.get(i).start){
                    minHeap.poll();
                }
                minHeap.offer(list.get(i));
            }

            return minHeap.size();
        } else {
            return 0;
        }
        
    }
}
