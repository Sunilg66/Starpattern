import java.util.*;

class Diamondopposite{

public static void main(String []a ){

Scanner sc= new Scanner(System.in);

System.out.println("enter the number of row");

byte row= sc.nextByte();

for (byte i=1; i<=row; i++){

for (byte j=1; j<=row; j++){

if(i+j<=row+1 && i>=j || i+j>=row+1 && i<=j)

System.out.print("* ");

else

System.out.print("  ");

}
System.out.println();
}
}
}
