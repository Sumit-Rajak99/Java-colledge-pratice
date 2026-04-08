import java.util.Scanner;

class Question{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // System.out.println("enter any number");

        // int n= sc.nextInt();


        // even odd 
        // for(int i=1;i<=50;i++){
        //     if(i%2==0){
        //         System.out.println("even"+" "+i);
        //     } 
        //     else{
        //         System.out.println("odd"+" "+i);
        //     }
            
        // }

        // factorial number 
        // System.out.println("enter any number");
        // int n= sc.nextInt();

        // int ans=1;
        // for(int i=1;i<=n;i++){
        //     ans=ans*i;
        // }
        // System.out.println(ans);


        // reverse digit

        // System.out.println("enter any number");
        // int n= sc.nextInt();

        //     while(n > 0){
        //     int r = n % 10;
        //     System.out.print(r);
        //     n = n / 10;
        // }


    //  sum of digit
        // System.out.println("enter any number");
        // int n= sc.nextInt();
        // int ans=0;

        // for(int i=1;i<=n;i++){
        //     ans=ans+i;
        // }
        // System.out.println(ans);


        // prinme number 
        // System.out.println("enter any number");
        // int n= sc.nextInt();

        // int count=0;
        // for(int i=1;i<=n;i++){
        //     if(n%i==0){
        //         count++;
        //     }

        // }
        // if(count==2){
        //     System.out.println("prime number");
        // }
        // else{
        //     System.out.println("not");
        // }

// palindrom
System.out.println("enter any number");
        int n= sc.nextInt();

int temp = n, rev = 0;
while(n > 0){
    int r = n % 10;
    rev = rev * 10 + r;
    n = n / 10;
}
if(temp == rev)
    System.out.println("Palindrome");
else
    System.out.println("Not Palindrome");


    }
}