public class ReverseEachWordOfString{
public static void main(String[] args){

String input = "prabhakar kumar";

System.out.println("Original Word "+ input);

String  finalOutput = "";

String [] words = input.split(" ");

for(String word:words){

// reverse word.

String reversedWord = "";
for(int i = word.length()-1; i>=0; i--){

reversedWord = reversedWord+ word.charAt(i);

}

finalOutput = finalOutput+ reversedWord+ " ";

}

System.out.println(finalOutput);

}

}