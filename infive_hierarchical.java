class super_C{
    String p ="MS";
 public void Mp(){
System.out.println(" inside  class super_C, parent name is  : "+p);
}
}
class sub_c1 extends super_C{
    String c1;
public void mc1(){
System.out.println("Inside class sub_c1,parent name is : " +p+" child1 name is "+c1);
}
}
class sub_c2 extends super_C{
    String c2;
public void mc2(){
System.out.println("Inside class sub_c2,parent name is : " +p+" child2 name is "+c2);
}
}
class sub_c3 extends super_C{
    String c3;
public void mc3(){
System.out.println("Inside class sub_c3,parent name is : " +p+" child3 name is "+c3);
}
}
class infive_hierarchical{
public static void main(String[] args){
// here make object of subclass and this obj of
// subclass inherit method of superclass .
sub_c1 obj1 =new sub_c1();
obj1.c1 ="Pari";
sub_c2 obj2 =new sub_c2();
obj2.c2 ="Chutki";
sub_c3 obj3 =new sub_c3();
obj3.c3 ="Kanha";
obj1.mc1();//print subclass 1 method 
obj2.mc2();
obj3.mc3();
}
}