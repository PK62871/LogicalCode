import java.util.stream.Stream;

public class RetrieveArrayData{

public static void main (String [] args){

String [] arr = {"AB","CD","EF","GH"};

// Approach-1.

for(int i = 0; i<arr.length; i++){
   System.out.println("" );
	 System.out.println(arr[i]);
} 


// Approach-2.

for(String name: arr){
System.out.println("" );
System.out.println(name);
}


// Approach-3.
System.out.println("" );
Stream.of(arr).forEach(name->System.out.print(name));
}
}