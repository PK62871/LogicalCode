public class RemoveSpecialCharacter{

public static void main(String[] args){

String str = "j@#a$%v *&a";

String planString = str.replaceAll("[^a-zA-z0-9]","");
System.out.println(planString);
}
}