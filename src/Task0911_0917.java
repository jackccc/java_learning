import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.Random;

public class Task0911_0917 {

    public int[] ParallelArrayGenerate(){
        int[] container = new int[1000];
        Random rand = new Random();

        // 使用Java并行ForEach生成数组，样本为1000的情况下慢于普通的for循环
        IntStream.range(0, 1000).parallel().forEach(i -> {
                    container[i] = i * 2;
                }
        );
        return container;
    }

    public void PrintResultInfo(int[] container){
        System.out.println("数组长度为 ：" +  container.length);
        System.out.println("数组元素为 ：" );
        System.out.println(Arrays.toString(container));
    }
}
