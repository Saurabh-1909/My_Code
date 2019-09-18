import java.util.Scanner;

public class Main {
  
public static void main(String[] args) {
    
int binary;
  
int decimal=0,i ,x=1;
  
Scanner in= new Scanner(System.in);
  
System.out.print1("Binary number: ");
  
binary= in.nextInt();
  
while(binary !=0){
    
i=binary % 10;
    
decimal= decimal+ i*x;
    
x= x*2;
    
binary=binary/10;
    
  
}
  
System.out.print("decimal number: "+decimal);
 
}

}