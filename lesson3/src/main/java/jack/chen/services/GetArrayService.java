package jack.chen.services;
import java.util.Random;
import java.util.stream.IntStream;

public class GetArrayService {
    public int[] GetRandomArray(){
        int[] container = new int[1000];

        Random random = new Random();
        // 使用Java并行ForEach生成数组，样本为1000的情况下慢于普通的for循环
        /*IntStream.range(0, 1000).parallel().forEach(i -> {
                    container[i] = i * 2;
                }
        );*/
        for(int i = 0; i < 1000; i++){
            container[i] = i * 10 + random.nextInt(9);
        }
        return container;
    }
}
