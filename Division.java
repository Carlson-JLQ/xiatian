public class Division {
    public static void main (String[] args){
        int k = 1;
        for(int num = 100; 200 >= num; num++){
            if(deby5(num)^deby6(num)){
                if(k==10){
                    System.out.println(num);
                    k=1;
                    continue;
                }
                System.out.print(num+" ");
                k++;
            }
        }

    }
    public static boolean deby5(int num1){
        return num1 % 5 == 0;
    }
    public static boolean deby6(int num1){
        return num1 % 6 == 0;
    }
}
