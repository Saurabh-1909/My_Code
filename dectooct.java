import java.util.Scanner;



class Main {
  public static void main(String[] args) {

int dec_num, i=1, j;
  
int oct_num[]= new int[100];
  
Scanner in = new Scanner(System.in);
  
System.out.print("Decimal number: ");
  
dec_num= in.nextInt();
  
while(dec_num> 0){
    
oct_num[i]= dec_num%8;
    
dec_num= dec_num/8;
    
i++;
  }
  
System.out.print("Octal number: ");

 
for(j=i-1;j>0;j--)
 {
   
System.out.print(oct_num[j]);
 }
 
System.out.print("\n");

}

}