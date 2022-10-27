class Bank{
static String[] bankNames = {null,null,null,null,null,null};
static int index;
public static boolean addBankNames(String bankName){
	if(bankNames.length<=6 && bankNames!=null){
		bankNames[index] = bankName;
		index++;
		return true;
	}
	else 
		{
		System.out.println("Can not add Bank Names");
		return false;
	}
}
public static void getBankNames(boolean value){
	if (value == true){
		for(index = 0; index<bankNames.length;index++){
		System.out.println("The Bank name Is : "+bankNames[index]);
		}
	}
	else if (value == false)
	{
		System.out.println("No Data Avialable");
	}
}
public static boolean updateBankName(String newBankName, String oldBankName){
	if (newBankName!=null && oldBankName != null){
		for (index;index<bankNames.length;index++){
			if(oldBankName==bankNames[index]){
				System.out.println("The Bank Name Before Updating Is "+bankNames[index]);
			bankNames[index]=newBankName;
System.out.println("The Bank Name After Updating Is "+bankNames[index]);
		return true;	
}
		}
	}
	return false;
}
}