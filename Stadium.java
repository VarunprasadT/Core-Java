class Stadium{
static String stadiumNames[] = {null,null,null,null,null,null};
static int index;
public static boolean addStadiumNames(String stadiumName){
	if(stadiumNames.length<=6 && stadiumNames!=null){
		stadiumNames[index] = stadiumName;
		index++;
		return true;
	}
	else
	{
		System.out.println("Can't Add The Stadium Names");
	return false;
	}
}
public static void getStadiumNames(){
	System.out.println("\nThe Names of The Stadium's Are : \n");
for(index=0;index<stadiumNames.length;index++){
	System.out.println(stadiumNames[index]);
}
}
public static boolean updateStadiumName(String newStadiumName, String oldStadiumName){
	if(newStadiumName!=null && oldStadiumName != null){
		for (index = 0; index<stadiumNames.length;index++){
			if(oldStadiumName==stadiumNames[index]){
				System.out.println("The Old Stadium Name is : "+stadiumNames[index]);
				stadiumNames[index]=newStadiumName;
				System.out.println("The New Stadium Name is : "+stadiumNames[index]);
				return true;
}
		}
	}
	return false;
}
public static boolean updateStadiumName(String newStadiumName, int existingIndex){
	if(newStadiumName!=null && existingIndex > -1){
		for(index=0 ;index<stadiumNames.length;index++){
			if(index == existingIndex){
			System.out.println("The Old Stadium Name Is "+stadiumNames[index]);
			stadiumNames[index]=newStadiumName;
			System.out.println("The New Stadium Name is : "+stadiumNames[index]);
				return true;
}
		}
		}
	return false;
}
			
}