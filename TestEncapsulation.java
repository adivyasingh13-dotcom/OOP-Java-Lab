class Encapsulate{

	private String svkmName;
	private int svkmRoll;
	private int svkmAge;

  // get method
	public int getAge(){
	   return svkmAge;
	}
	public String getName(){
	   return svkmName;
	}
	public int getRoll(){
	   return svkmRoll;
	}

  // set method
	public void setAge(int svkmAge){
	   this.svkmAge = svkmAge;
	}
	public void setName(String svkmName)
	  {
	      this.svkmName = svkmName;
	  }
	public void setRoll(int svkmRoll)
	  {
	     this.svkmRoll = svkmRoll;
	  }
}

public class TestEncapsulation{
    public static void main(String[] args)
	{
	    Encapsulate o = new Encapsulate();

	o.setName("Harsh");
	o.setAge(19);
	o.setRoll(51);

	System.out.println("Svkm’s name: "+ o.getName());
	System.out.println("Svkm’s age: "+ o.getAge());
	System.out.println("Svkm’s roll: "+ o.getRoll());
}
}
