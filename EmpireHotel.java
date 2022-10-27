class EmpireHotel{
public static void main(String a[])
{
String type = "5 Star Hotel";
String adress="Mahalakshmi puram, Nagapura, Bengaluru,Karnataka 560086.";
String[] managerNames = {"akshara","deepa","geeta","sumathi","vasumathi"};
int noOfManagers = 5;
String foodMenu[] = {"Tawa Chicken","Kadai Chicken","kadai Mutton","Kadai Prawns","Hyderabadi Chicken","Mutton Coconut Fry","Mutton Onion Roast","Kadai Fish","Chicken Mughlai","Mutton Coconut Fry Boneless","Mutton Onion Roast Boneless"};
System.out.println("Welcome to Empire Hotel");
System.out.println("Destination:" + adress);
System.out.println("Number of Managers :" + " "+ noOfManagers );
System.out.println("Names of the avilable Managers");
for(int i=0;i<managerNames.length;i++){
System.out.println(" "+ managerNames[i]);}
System.out.println("Food Menu includes");
for(int v=0;v<foodMenu.length;v++){
System.out.println(" "+ foodMenu[v]);}
}
}