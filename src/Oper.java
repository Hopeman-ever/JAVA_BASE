public class Oper {
    public static void main(String[] args) {
        int i =1;
        i = i++;
        System.out.println(i); //1 temp = i; i = i+1; i = temp;
        i = ++i;
        System.out.println(i); //2 i = i+1; temp = i; i = temp;
    }
}
