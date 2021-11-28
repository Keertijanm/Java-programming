class grandfather_A{
    int a,b;
public  void Mb1(){
System.out.println(" inside  class  grandfather_A values  a : "+a+" , b " +b);
}
}
class parent_B extends grandfather_A{
    int c;
public void mb2(){
System.out.println("Inside class parent_B values a :"+a+" ,b "+b+" ,c "+c);
}
}
class child_c extends parent_B{
    int d;
public void mb3(){
System.out.println("Inside class c_child values a :"+a+" ,b "+b+" ,c "+c+" ,d "+d);
}
}
public class infour_multilevel{
public static void main(String[] args){
// here make object of subclass and this obj of
// subclass inherit method of superclass .
child_c obj =new child_c();
obj.a =10;
obj.b=20;
obj.c =30;
obj.d=40;
obj.Mb1();// print superclass1 method
obj.mb2();//print superclass2 method 
obj.mb3();//print subclass method 
}
}