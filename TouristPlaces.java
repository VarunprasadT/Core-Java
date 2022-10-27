class TouristPlaces{
	static String [] touristPlacesNames= {null,null,null,null,null,null};
	static int index;
	public static boolean addTouristPlacesNames(String touristPlacesName){
		if(touristPlacesNames.length<=6 && touristPlacesNames!=null){
			touristPlacesNames[index] = touristPlacesName;
			index++;
			return true;
		}
		else 
		{
			System.out.println("Cannot Enter the Tourist Places Names");
		return false;
		}
	}
	public static void getTouristPlacesNames(){
			System.out.println("The Names of The Tourist Places are : ");
			for(index = 0;index<touristPlacesNames.length;index++){
				System.out.println(touristPlacesNames[index]);
			}
		}
		
	public static boolean updateTouristPlaceName(String newTouristPlacesName, String oldTouristPlacesName){
		if(newTouristPlacesName!=null && oldTouristPlacesName!= null){
			for(index = 0;index<touristPlacesNames.length;index++){
				if(touristPlacesNames[index] == oldTouristPlacesName){
				System.out.println("The Place Name Before Updating "+touristPlacesNames[index]);
				touristPlacesNames[index]=newTouristPlacesName;
								System.out.println("The Place Name After Updating "+touristPlacesNames[index]);
			return true;
			}
	}
	
	}
	return false;
	}
	public static boolean updateTouristPlaceName(String newTouristPlacesName, int existingIndex){
		if(newTouristPlacesName!=null && existingIndex>-1){
			for(index = 0;index<touristPlacesNames.length;index++){
				if(index == existingIndex){
		System.out.println("The Place Name Before Updating "+touristPlacesNames[index]);
		touristPlacesNames[index]=newTouristPlacesName;
		System.out.println("The Place Name After Updating "+touristPlacesNames[index]);
		return true;
				}
			}
		}
		return false;
	}				
}
