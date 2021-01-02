import java.util.*;

public class MoveZero1 {

    public List<Integer> moveZero(int[] num) {
        List<Integer> intList = new ArrayList<Integer>();
        List<Integer> zeroList = new ArrayList<Integer>();

        if(num != null){
            for(int n : num){
                if(n == 0){
                    zeroList.add(n);
                } else {
                    intList.add(n);
                }
            }
        }

        intList.addAll(zeroList);
        return intList;
    
    }

    public void println(List<Integer> list) {
        for(Integer n : list){
            System.out.println("list : " + n);
        }
    }

    public static void main(String[] args){
        int[] num = {0,3,2,0,8,5};

        MoveZero1 moveZero = new MoveZero1();

        moveZero.println(moveZero.moveZero(num));
    }
}