import java.util.*;

class Number_Guess{

    static void guess(){

        int num,n,count=0;

        int attempts,marks;

        Scanner s=new Scanner(System.in);

        Random r=new Random();
        num=r.nextInt(1,100);

        System.out.println("\nenter number of attempts:");
        attempts=s.nextInt();
        marks=attempts;

      if(count!=attempts){

        while(count!=attempts){

              System.out.println("\nenter guessed number:");
              n=s.nextInt();

              if(num==n){

                System.out.println("\ncongratulations, your guess is correct");
                System.out.println("your score: "+marks);
                break;
              }

             else{

              if(n<1 || n>100){

                System.out.println("\nInvalid input");
              }

              else if(n-num>10){

               System.out.println("\nnumber is too high");
               System.out.println("try again\n");
              }

              else if(n-num>1 && n-num<=10){
                System.out.println("\nnumber is high");
               System.out.println("try again\n");
              }

              else if(num-n>10){

               System.out.println("\nnumber is too low");
               System.out.println("try again\n");
              }

              else if(num-n>1 && num-n<=10){
                System.out.println("\nnumber is low");
               System.out.println("try again\n");
              }

              count++;
              marks--;

              if(count==attempts){
                System.out.println("\nSorry, you lost your attempts");
                System.out.println("Generated number is "+num);
              }
             }
        }
     }
    }
    public static void main(String[] args){
        guess();
    }

}