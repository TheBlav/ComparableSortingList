import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class Data implements Comparable<Integer>{
    Random random = new Random();
    public Integer[] createArray(int length){
        Integer[] array = new Integer[length];
        for (int i=0; i<length; i++){
            array[i] = random.nextInt((999-1)+2);
        }
        return array;
    }


    @Override
    public int compareTo(Integer o) {
        return 0;
    }
}
