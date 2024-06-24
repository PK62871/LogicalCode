public class RemoveSpaceFromString{

public static void main(String [] args){

String str = " j a v  a  c o d e ";
String val = str.replaceAll("\\s","");
System.out.println(val);
}
}