public class Poker {
    public static void main(String[] args){
        int num = (int) (1 + (Math.random() * 52));
        switch(num%13){
            case 1:System.out.print("The card you picked is Ace of ");break;
            case 2:System.out.print("The card you picked is 2 of ");break;
            case 3:System.out.print("The card you picked is 3 of ");break;
            case 4:System.out.print("The card you picked is 4 of ");break;
            case 5:System.out.print("The card you picked is 5 of ");break;
            case 6:System.out.print("The card you picked is 6 of ");break;
            case 7:System.out.print("The card you picked is 7 of ");break;
            case 8:System.out.print("The card you picked is 8 of ");break;
            case 9:System.out.print("The card you picked is 9 of ");break;
            case 10:System.out.print("The card you picked is 10 of ");break;
            case 11:System.out.print("The card you picked is Jack of ");break;
            case 12:System.out.print("The card you picked is Queen of ");break;
            case 0:System.out.print("The card you picked is King of ");break;
        }
        if(1<=num&&num<=13)
            System.out.print("Clubs");
        else if(14<=num&&num<=26)
            System.out.print("Diamond");
        else if(27<=num&&num<=39)
            System.out.print("Heart");
        else if(40<=num&&num<=52)
            System.out.print("Spades");
    }
}
