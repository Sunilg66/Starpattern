class Matrixdiagonals{

public static void main(String[] a){

System.out.println("Started main () ");

int n=4;

for (int i=1; i<= n; i++){

for (int j=1; j<=n; j++){
 
if(i==j || i+ j== n +1)

System.out.print(i + "" + j + " ");

else
System.out.print( " " );

}

System.out.println();
}
}
}

