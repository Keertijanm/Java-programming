class super_class{
public  void M1(){
System.out.println(" this is super class method ");
}
}
class sub_class extends super_class{
public void m2(){
System.out.println("this is sub class method");
}
}
class inone_test{
public static void main(String[] args){
// here make object of subclass and this obj of
// subclass inherit method of superclass .
sub_class obj =new sub_class();
obj.M1();// print superclass method
obj.m2();//print subclass method 
}
}