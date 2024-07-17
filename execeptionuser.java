import java.util.*;
class mbbsException extends Exception{
String msg;
mbbsException(String msg){
//super(msg);
}
}
public class execeptionuser{
public static void main(String[] args){
Scanner obj = new Scanner(System.in);
int cgpa =  obj.nextInt();
try{
if(cgpa>=75){
System.out.println("YOU ARE ADMITTED TO SEOND YEAR");
}else{
throw new mbbs("complete your first year");
mbbs cs = new mbbs("complete your first year");
throw cs;
}
}
catch(mbbs e){
System.out.println("e.getMessage");
}
}
}