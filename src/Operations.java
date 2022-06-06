import java.util.Arrays;
import java.util.Comparator;

public class Operations implements Printer, Comparator {
    Data data = new Data();
    Integer[] array;
    public void Operating(){
        array = data.createArray(30);
        print("Wczytano tablicę: ");
        System.out.println(Arrays.toString(array));
        print("Posortowana Tablica rosnąco: ");
        Arrays.sort(array);
        print(Arrays.toString(array));
        print("Sortujemy malejąco: ");


        Arrays.sort(array, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return -o1.compareTo(o2);
            }
        });

        print(Arrays.toString(array));

    }

    @Override
    public int compare(Object o1, Object o2) {
        return 0;
    }
}
