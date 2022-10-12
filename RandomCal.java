import java.util.*;
import java.lang.Math;

public class RandomCal {

    static int getNum(ArrayList<Integer> v) {
        int n = v.size();

        int index = (int) (Math.random() * n);

        int num = v.get(index);

        v.set(index, v.get(n - 1));
        v.remove(n - 1);

        return num;
    }
    static void generateRandom(int n) {
        ArrayList<Integer> v = new ArrayList<>(n);

        for (int i = 0; i < n; i++)
            v.add(i + 1);

        while (v.size() > 0) {
            System.out.print(getNum(v) + " ");
        }
    }
}
