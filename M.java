class Mobile{
static String brand;
static String color;
static double price;
static boolean isConnected;
static int minVolume;
static int maximumVolume=10;
static int currentVolume;
public static boolean onOrOff(){
if (isConnected==false){
     isConnected=true;
	 System.out.println("The Mobile is On..");
	 }
	 else if (isConnected==true) {
	 isConnected=false;
	 System.out.println("The Mobile is OFF..");
	 }
	 return isConnected;
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
			System.out.println("Please Turn On The Mobile");
		}
}
public static void decreaseVolume(){
	if(isConnected==true){
		if(currentVolume>minVolume){
			currentVolume= currentVolume-1;
			System.out.println("The currentVolume is " +currentVolume);
		}
		else {
			System.out.println("The Volume is Mobile");
		}
	}
		else {
			System.out.println("Please Turn On The Speaker");
		}
}