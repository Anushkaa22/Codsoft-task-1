import java.util.Scanner;

class range {
    public int generate(int max, int min){
        return (int) (Math.random()*(max-min+1)+min);
    }
}

public class NumGame{
    public static void main(String[] agrs){
        Scanner ob = new Scanner(System.in);
        range rg = new range();
        int TA = 0;
        int win = 0;

        while(true){
            System.out.println("Enter the minimum number:");
            int min = ob.nextInt();
            System.out.println("Enter the maximum number:");
            int max = ob.nextInt();
            ob.nextLine();
            int p = rg.generate(max,min);
            int A = 0;

            while(true){
                System.out.println("Guess a number between"+min+ "and"+max);
                int c = ob.nextInt();
                A++;

                if(c>p){
                    System.out.println("Its Greater");
                }
                else if(c<p){
                    System.out.println("Its Lower");
                }
                else{
                    System.out.println("Correct guess");
                    win++;
                    break;
                }
            }
            TA=TA+A;
            System.out.println("attempt="+A);
            System.out.println("Wins="+win);

            double winrate=(double) win/TA*100;
            System.out.printf("your winrate is %.2f%%\n",winrate);
            System.out.println("Do you want to play again (y / n)");
            String PA = ob.next();
            if(!PA.equalsIgnoreCase("y")){
                ob.close();
                System.exit(0);
            }
            ob.nextLine();
        }
    }
}