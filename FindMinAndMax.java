public class FindMinAndMax{

public static void main(String[] args){

int [] x = {3,-2,5,6,7,8,9};

int len = x.length;
int min = x[0], max = x[0];

for(int i = 0; i<len; i++){

if(x[i]<min){
min = x[i];
}

if(x[i]>max){
max = x[i];
}
} 

System.out.println(min + " " + max);
}


}