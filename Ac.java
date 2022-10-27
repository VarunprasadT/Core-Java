class Ac{
static String brand;
static String color;
static double price;
static boolean isConnected;
static int maxTemperature=33;
static int minTemperature=16;
static int currentTemperature=24;
public static boolean onOrOff(){
if (isConnected==false){
     isConnected=true;
	 System.out.println("The Ac is On..");
	 }
	 else if (isConnected==true) {
	 isConnected=false;
	 System.out.println("The Ac is OFF..");
	 }
	 return isConnected;
	 }
public static void increaseTemperature(){
	if(isConnected==true){
		if(currentTemperature<maxTemperature){
			currentTemperature=currentTemperature+1;
			System.out.println("The Current Temperature is = "+currentTemperature);
		}
		else {
		System.out.println("The Temperature has Reached Maximum");
		}
	}
	else {
		System.out.println("Switch on the Ac");
	 }
}
public static void decreaseTemperature(){
	if(isConnected==true){
		if(currentTemperature>minTemperature){
			currentTemperature=currentTemperature-1;
			System.out.println("The Current Temperature is = "+currentTemperature);
		}
		else {
		System.out.println("The Temperature has Reached Minimum");
		}
	}
	else {
		System.out.println("Switch on the Ac");
	 }
}
}