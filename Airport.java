class Airport{
static String airportNames[] = {null,null,null,null,null,null};
static int index;
public static boolean addAirportName(String airportName){
System.out.println("Inside Method addAirportNames ");
if(airportNames.length <= 6 && airportName != null ){
airportNames[index] = airportName;
index++;
System.out.println("Outside Method addAirportNames ");
return true;
}
else {
System.out.println("Cannot add Airport names");
}
System.out.println("end of Airport Names");
return false;
}
public static void getAirportNames(boolean value){
	if(value == true){
for (int index = 0; index<airportNames.length;index++){
System.out.println("The Airport Name is : "+airportNames[index]);
}
}
else if (value==false){
	System.out.println("No Data Avilable");
}
}
}