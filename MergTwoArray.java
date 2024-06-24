public class MergTwoArray{

public static void main(String [] args){

int [] a = {1,2,3};
int [] b = {4,5,6};

int [] c = new int [a.length + b.length];

for(int i = 0; i<a.length; i++){
 c[i] = a[i];
}

for(int i = 0; i<b.length; i++){
 c[i+ a.length] = b[i];
}

System.out.println("Final Array C");
for(int i =0; i<=c.length-1;i++){
System.out.println(c[i]);
}
}
}