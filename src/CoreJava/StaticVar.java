package CoreJava;

public class StaticVar {
	//Que- Why I'm calling these as "Instance Variables"?
	// ans- because these are tied up to the  "Object/Instance" i.e "obj"
	// If you create one more "Object/Instance" then these values will change.
	// so as these variables are tied up with the "Object/Instance" so these are called "Instance Variables"
	
	String name;
	String address;
	//when you treat any variable as static then that variable copy is shared by all the Object
	// when you declare any variable as static then that variable is part of the class but not the part of the Object
	static String city = "Delhi"; // class variables
	//as "i" variable is "static" so as all the Objects are using the same copy so every time increment is done in the previous "i" value
	// but if we remove "static" then the result will be 1 ,1 ,1 instead of 1,2,3 
	static int i=0;
	
	// everytime when an Object/Instance is created then this "Constructor" is executed.
	StaticVar(String name, String address)
	{
		// the variables defined with constructor (as in the parameter of this constructor) are called ->"Local Variables"
		// this -> operator here refers to the instance variables.
		this.name= name;
		this.address = address;
		i++;
		System.out.println(i);
		
		
	}
	
	public void getAddress()
	{
		System.out.println(address+" "+city);
		
	}
	// static method will only accept static variables.
	public static void getCity() //class method
	{
		System.out.println(city);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//for giving values as the parameter of the object, you need to have a " Parameterized Constructor" having the same data types
   //1st candidate details as parameter of Object
// just suppose that you have 100's of candidate and all are from "Delhi" then 
//why to mention this in parameter every time on object creation of every candidate Object,as everytime memmory is allocated
	StaticVar obj = new StaticVar("Bob","GaneshNagar");
	//2nd candidate details as parameter of Object
    StaticVar obj1 = new StaticVar("Ram","Ashok Nagar");
    StaticVar obj2 = new StaticVar("Ram","Ashok Nagar");
    
    obj.getAddress(); // this will give -"GaneshNagar"
    obj1.getAddress(); // this will give - "Ashok Nagar"
    
    // for calling static methods you don't need to create Objects 
    //as static keyword is independent of Objects and they belong to the class
    //so you can call static method as-> className.methodName
    StaticVar.getCity();
    StaticVar.i =4;
    obj.address ="XYZ";
    
	}

}
