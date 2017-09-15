import java.util.stream.IntStream;
import java.util.Random;

public class ParallelArrayGenerate {

    public static void main(String[] args) {

        int[] container = new int[1000];

        long startTime = System.nanoTime();
        IntStream.range(0, 1000).parallel().forEach(i -> {
                container[i] = i;
        });

        long endTime = System.nanoTime();
        System.out.println("\r<br> 执行耗时 : "+(endTime-startTime)+" 纳秒 ");

        for(int i = 0; i < 10000 -3; i++)
        {
            System.out.println(container[i]);
        }
    }
}