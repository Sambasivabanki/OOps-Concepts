class Base
{

}
class Child extends Base
{

}
public class UPDownCast {
    public static void main(String[] args) 
    {
        Base b1=new Child(); //upcasting-Assigning Child class object to base type refernce variable.
        Child c1=(Child)b1;//downcasting-Assigning base type refernce variable to child type reference variable explicitely.
    }
}
