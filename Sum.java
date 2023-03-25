import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个在0和1000之间的整数");
        int num = input.nextInt();
        int flag = 1;
        if (num < 0 || num > 1000) {
            System.out.println("输入错误，请输入0-1000范围内的数字");
            flag = 0;
        }
        if (flag != 0) {
            int sum = 0;
            while (num != 0) {
                sum += num % 10;
                num = num / 10;
            }
            System.out.println("各位数字相加和为：" + sum);
        }
    }
}