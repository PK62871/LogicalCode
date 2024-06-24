public class FindMissingNumberFromArray{

public static void main(String[] args){
 
int [] arr = {10,9,8,5,6,7,1,2};

for(int key =1; key<=10; key++){
Boolean isPresent = check(arr,key);

if(isPresent==false){
System.out.println(key);
//break;
}
}

}

public static boolean check(int[] arr,int key){
  for(int i = 0; i<arr.length; i++){
	if(arr[i]==key){
	return true;
}
}
return false;
}


}