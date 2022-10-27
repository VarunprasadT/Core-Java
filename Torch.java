class Torch{
static String brand;
static String color;
static double price;
static boolean isConnected;
static int maxBrightness=10;
static int minBrightness;
static int currentBrightness;
public static boolean onOrOff(){
if (isConnected==false){
     isConnected=true;
	 System.out.println("The Torch is On..");
	 }
	 else if (isConnected==true) {
	 isConnected=false;
	 System.out.println("The Torch is OFF..");
	 }
	 return isConnected;
	 }
	 public static void increaseBrightness(){
		 if(isConnected==true){
			 if(currentBrightness<maxBrightness){
				 currentBrightness=currentBrightness+1;
				 System.out.println("The Current Brightness Level is "+currentBrightness);
			 }
			 else{
				 System.out.println("Maximum Brightness");
			 }
		 }
			 else{
				 System.out.println("Turn on the Torch");
			 }
			 
	 }
 public static void decreaseBrightness(){
		 if(isConnected==true){
			 if(currentBrightness>minBrightness){
				 currentBrightness=currentBrightness-1;
				 System.out.println("The Current Brightness Level is "+currentBrightness);
			 }
			 else{
				 System.out.println("Maximum Brightness");
			 }
		 }
			 else{
				 System.out.println("Turn on the Torch");
			 }
			 
	 }
}