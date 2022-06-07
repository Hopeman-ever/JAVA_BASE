import javax.jws.soap.SOAPBinding;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入姓名：");
        String name = scanner.next();
        System.out.println("输入年龄：");
        int age = scanner.nextInt();
        System.out.println("输入工资：");
        double sal = scanner.nextDouble();
        System.out.println(name + '\n' + age + '\n' + sal);
    }
}
