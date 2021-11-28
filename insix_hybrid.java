/* Program: This example is just to demonstrate the hybrid inheritance in Java. Although this example is meaningless, you would be able to see that how we have implemented two types of inheritance(single and hierarchical) together to form hybrid inheritance.
Class A and B extends class C → Hierarchical inheritance
Class D extends class A → Single inheritance
*/
class C
{
   public void disp()
   {
	System.out.println("C");
   }
}

class A extends C
{
   public void disp()
   {
	System.out.println("A");
   }
}

class B extends C
{
   public void disp()
   {
	System.out.println("B");
   }
	
}

class D extends A
{
   public void disp()
   {
	System.out.println("D");
   }
   public static void main(String args[]){

	D obj = new D();
	obj.disp();
   }
}