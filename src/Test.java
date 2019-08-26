// 引入工具方法
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
            System.out.println(Arrays.toString(arr));
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
            System.out.println(ret);
            ret = null;
        }
    }

    // 入口
    public static void main(String[] args) {
        Test t1 = new Test();
        t1.multiplicationTable(9);
        t1.isoscelesTriangle(4);
    }
}