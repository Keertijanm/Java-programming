interface A_Interface{
    void Mb1();
}
interface B_Interface{
    void Mb2();
}
public class inthree_multiple implements A_Interface,B_Interface{
    public void Mb1(){
        System.out.println(" this print by  Interface_A method  : hello ");
    }
    public void Mb2(){
        System.out.println(" this print by  Interface_B method: hi  ");
    }
    public static void main(String[] args) {
        A_Interface x=new inthree_multiple();
        B_Interface y =new inthree_multiple();
        x.Mb1();
        y.Mb2();
    }       
}