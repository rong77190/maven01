/**
 * Created by dell on 2016/3/14.
 */
//找零钱算法
//输入：数组m，依次存放从大到小排列的面值数，n为需要找的钱数，单位全部为分
//输出：数组num，对照数组m中的面值存放不同面值的硬币的个数，就找钱方案


public class Hello {
    public static void main(String[] args) {
        int m[] = {50, 10, 5, 20, 1};
        int n = 99;
        int[] num = new int[m.length];
        num = zhaoqian(m, n);
        System.out.println(n + "的找钱方案：");
        for (int i = 0; i < m.length; i++)
            System.out.println(num[i] + "枚" + m[i] + "面值");
    }

    public static int[] zhaoqian(int m[], int n) {
        int temp = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = i + 1; j < m.length; j++) {
                if (m[i] < m[j]) {
                    temp = m[i];
                    m[i] = m[j];
                    m[j] = temp;
                }
            }
        }
        int k = m.length;
        int[] num = new int[k];
        for (int i = 0; i < k; i++) {
            num[i] = n / m[i];
            n = n % m[i];
        }
        return num;
    }

}




















