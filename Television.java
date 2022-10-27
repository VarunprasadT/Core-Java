class Television{
static String brand;
static String color;
static double price;
static boolean isConnected;
static int maxChannelNumber=10;
static int minChannelNumber;
static int currentChannelNumber;

public static boolean onOrOff() {
System.out.println("Inside onOrOff");
if (isConnected  == false){
isConnected= true   ;
System.out.println("The Television is truned on..");
}
else if (isConnected == true){
isConnected=false  ;
System.out.println("The Television is Turned Off...");
}
System .out.println("End of onOrOff");
return isConnected  ;
}
public static void increaseChannelNumber(){
	if(isConnected==true){
	if(currentChannelNumber<maxChannelNumber){
		currentChannelNumber=currentChannelNumber+1;
		System.out.println("The Current Channel Number is Channel= "+currentChannelNumber);
	}
	else{
		System.out.println("This is the last Channel");
	}
	}
	else{
		System.out.println("Please Switch On The Television");
	}
}
public static void decreaseChannelNumber(){
	if(isConnected==true){
	if(currentChannelNumber>minChannelNumber){
		currentChannelNumber=currentChannelNumber-1;
		System.out.println("The Current Channel Number is Channel= "+currentChannelNumber);
	}
	else{
		System.out.println("This is the least Channel");
	}
	}
	else{
		System.out.println("Please Switch On The Television");
	}
}
}