class Student{
	private String name;
	private int age;
	private int roll_no;

    //get method:
	public String getname(){
	    return name;
	}
	public int getage(){
	    return age;
	}
	public int getroll_no(){
	    return roll_no;
	}

    //set method:
	public void setname(String name){
	    this.name = name;
	}
	public void setage(int age){
	    this.age = age;
	}
	public void setroll_no(int roll_no){
	    this.roll_no = roll_no;
	}
  
}
public class Students{
   public static void main(String[] args){
	Student obj = new Student();

	obj.setname("Swami");
	obj.setage(21);
	obj.setroll_no(50);

	System.out.println(obj.getname());
	System.out.println(obj.getage());
	System.out.println(obj.getroll_no());
}
}






