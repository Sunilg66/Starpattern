import java.util.*;

class Rightanglereverse{

public static void main(String []a ){

Scanner sc= new Scanner(System.in);

System.out.println("enter the number of row");

int row= sc.nextInt();

for (int i=1; i<=row; i++){

for (int j=1; j<=row; j++){

if(i<=j)

System.out.print("* ");

else

System.out.print("  ");

}

System.out.println();
}
}
}
