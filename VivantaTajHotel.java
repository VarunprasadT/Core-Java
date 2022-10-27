class VivantaTajHotel{
public static void main(String a[])
{
String type = "5 Star Hotel";
String adress="Rajajinagar";
String[] managerNames = {"Akshata","Lakshmi","sangeeta","sumanth"};
int noOfManagers = 5;
String foodMenu[] = {"idle","dosa","pallav","leamonrice","curdrice","geerice","zerarice","sweetrice","dhalrice","whiterice","gobirice","dhaltadka","panerrice","palakpanner"};
System.out.println("Welcome to VivantaTaj Hotel");
System.out.println("Destination:" + adress);
System.out.println("Number of Managers" + " "+ noOfManagers );
System.out.println("Name of avilable Managers");
for(int i=0;i<managerNames.length;i++){
System.out.println(" "+ managerNames[i]);}
System.out.println("Food Menu includes");
for(int v=0;v<foodMenu.length;v++){
System.out.println(" "+ foodMenu[v]);}
}
}