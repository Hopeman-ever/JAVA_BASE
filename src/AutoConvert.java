/**
 * 数据类型转换
 */
public class AutoConvert {
    public static void main(String[] args) {
        int n1 = 10;
        float f1 = n1 + 1.1F;
        double d2 = n1 + 1.1;
        String s1 = n1 + "";
        System.out.println(s1);
        String s2 = "123456";
        System.out.println(Double.parseDouble(s2));

        // 测试分支切换
        for (int i = 0; i <9; i++) {
            System.out.println("测试分支切换");
        }

        // git stash
        for (int i = 0; i < 10; i++) {
            System.out.println("先stash再切换分支");
        }
    }
}
