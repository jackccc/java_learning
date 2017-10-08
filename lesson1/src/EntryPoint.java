public class EntryPoint {

    public static void main(String[] args) {

        /**陈文斌 09.11 - 09.17作业
         * 题目：生成一个长度为1000，有序但是值不连续的整形数组。
         * 输入：无
         * 执行时间：57毫秒
         */

        long startTime = System.nanoTime();
        Task0911_0917 arrayGenerate = new Task0911_0917();
        int[] result = arrayGenerate.ParallelArrayGenerate();
        long endTime = System.nanoTime();
        System.out.println("\r执行耗时 : " + ((endTime - startTime) / 1000000)  + "毫秒");

        arrayGenerate.PrintResultInfo(result);
    }
}