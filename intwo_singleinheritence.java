class super_A{
    int a;
 public void Ma1(){
System.out.println(" inside  class  A values  a : "+a+" , b " +b);
}
}
class sub_b extends super_A{
    int c;
public void ma2(){
System.out.println("Inside class B values a :"+a+" ,b "+b+" ,c "+c);
}
}
class intwo_singleinheritence{
public static void main(String[] args){
// here make object of subclass and this obj of
// subclass inherit method of superclass .
sub_b obj =new sub_b();
obj.a =10;
obj.b=20;
obj.c =30;
obj.Ma1();// print superclass method
obj.ma2();//print subclass method 
}
}