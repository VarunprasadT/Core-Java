class WashingMachine{
static String brand;
static String color;
static double price;
static boolean isConnected;
static int maxSpeed=9;
static int minSpeed;
static int currentSpeed;
public static boolean onOrOff(){
if (isConnected==false){
     isConnected=true;
	 System.out.println("The WashingMachine is On..");
	 }
	 else if (isConnected==true) {
	 isConnected=false;
	 System.out.println("The WashingMachine is OFF..");
	 }
	 return isConnected;
	 }
	 public static void increaseSpeed()
	 {
	 if(isConnected=true){
		 if(currentSpeed<maxSpeed){
		 currentSpeed=currentSpeed+1;
			 System.out.println("The Current Speed is = "+currentSpeed
			 );		
	 }
			else {
				System.out.println("The Maximum Speed has been Reached.");
			}
	 }
	 else {
		 System.out.println("Switch On The Machine");
	 }
	 }
	 	 public static void decreaseSpeed()
	 {
	 if(isConnected=true){
		 if(currentSpeed>minSpeedSpeed){
		 currentSpeed=currentSpeed-1;
			 System.out.println("The Current Speed is = "+currentSpeed
			 );		
	 }
			else {
				System.out.println("The minimum Speed has been Reached.");
			}
	 }
	 else {
		 System.out.println("Switch On The Machine");
	 }
	 }
}
			