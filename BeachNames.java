class BeachNames{
static String beachNames[] = {null,null,null,null,null,null};
static int index;
public static boolean addBeachName(String beachName)
{
System.out.println("Inside Method addBeachNames ");
if(beachNames.length<=6 && beachNames!=null)
{
beachNames[index] = beachName;
index++;
System.out.println("Outside Method addBeachNames ");
return true;
}
else if
{
	System.out.println("Can not add beach Names ");
}
System.out.println("End of Beach Names");
return false;
}
public static void getBeachNames(boolean value)
{
	if(value == true)
	{
for (int index = 0; index<beachNames.length;index++)
{
System.out.println("The Beach Name is : "+beachNames[index]);
}
}
else if (value == false)
{
		System.out.println("Cannot Enter Beach Names");
}
}
}