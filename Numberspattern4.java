import java.util.*;

class Numberspattern4{

public static void main(String []a ){

Scanner sc= new Scanner(System.in);

System.out.println("enter the number of Row");

byte row= sc.nextByte();

for (int i=1; i<=row; i++){

for (int j=1; j<=row; j++){

if(i<=j)

System.out.print(" "+i);

}
System.out.println();
}
}
}