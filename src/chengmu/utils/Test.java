package chengmu.utils;

// 引入工具方法
import static java.lang.System.*;
import java.util.Arrays;

public class Test {

    /**
     * 输出乘法表
     * 编译：javac -d out ./src/Test.java
     * 执行：java -classpath out Test
     * @param n
     */
    public void multiplicationTable(int n) {
        for (int i = 1; i <= n; i++) {
            String[] arr = new String[i];
            String ret = "";
            for (int j = 1; j <= i; j++) {
                arr[j - 1] = i + "x" + j + '=' + (i*j);
            }
            out.println(Arrays.toString(arr));
            arr = null;
        }
    }

    /**
     * 输出等腰三角形图形
     * @param n
     */
    public void isoscelesTriangle(int n) {
        int lineNum = 2 * n - 1;
        for (int i = 1; i <= n; i++) {
            String ret = "";
            int start = n - i + 1;
            int end = start + (2 * i - 1);
            for (int j = 1; j <= lineNum; j++) {
                if (j >= start && j < end) {
                    ret += "*";
                } else {
                    ret += " ";
                }
            }
            out.println(ret);
            ret = null;
        }
    }
}