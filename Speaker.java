class Speaker{
static String brand;
static String color;
static double price;
static boolean isConnected;
static int minVolume;
static int maximumVolume=8;
static int currentVolume;

public static boolean onOrOff() {
System.out.println("Inside onOrOff");
if (isConnected  == false){
isConnected= true   ;
System.out.println("The Speaker is truned on..");
}
else if (isConnected == true){
isConnected=false  ;
System.out.println("The Speaker is Turned Off...");
}
System .out.println("End of onOrOff");
return isConnected  ;
}
public static void increaseVolume(){
	if(isConnected==true){
		if(currentVolume<maximumVolume){
			currentVolume= currentVolume+1;
			System.out.println("The currentVolume is " +currentVolume);
		}
		else {
			System.out.println("The Volume is Maximum");
		}
	}
		else {
			System.out.println("Please Turn On The Speaker");
		}
}
public static void decreaseVolume(){
	if(isConnected==true){
		if(currentVolume>minVolume){
			currentVolume= currentVolume-1;
			System.out.println("The currentVolume is " +currentVolume);
		}
		else {
			System.out.println("The Volume is Minimum");
		}
	}
		else {
			System.out.println("Please Turn On The Speaker");
		}
}
}
