
public class Test {
public void m1(Student Stu)
{
	System.out.println(Stu.age);
	System.out.println(Stu.rollno);
	System.out.println(Stu.name);

}

public static void main (String []args)
{
	Test t=new Test();
	Student s=new Student (1,"ABC",24);
	t.m1(s);
}
}
