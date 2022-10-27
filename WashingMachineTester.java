class WashingMachineTester{
public static void main(String []args){
	WashingMachine.brand="Samsung";
	WashingMachine.color="Navy Blue";
	WashingMachine.price=80000;
System.out.println("WashingMachine Brand : "+WashingMachine.brand+"\n"+"WashingMachine Color : "+WashingMachine.color+"\n"+"WashingMachine Price : "+WashingMachine.price);
WashingMachine.onOrOff();
WashingMachine.increaseSpeed();
WashingMachine.increaseSpeed();
WashingMachine.increaseSpeed();
WashingMachine.increaseSpeed();
WashingMachine.increaseSpeed();
WashingMachine.increaseSpeed();
WashingMachine.increaseSpeed();
WashingMachine.decreaseSpeed();
}
}