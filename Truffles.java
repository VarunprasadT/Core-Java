class Truffles{
public static void main(String a[])
{
String type = "Restaurant";
String adress="22, St Mark's Rd, Shanthala Nagar, Ashok Nagar, Bengaluru, Karnataka 560001.";
String[] managerNames = {"akash","deepthi","gretha","suma","vasavi"};
int noOfManagers = 5;
String Menu[] = {"Cold Coffee","Frappe","Special Italian Sodas","Ice Tea","Hot Tea","Fresh Lime Water","Slush","Mojito","Margarita","Aerated Beverages"};
System.out.println("Welcome to Truffles");
System.out.println("Destination:" + adress);
System.out.println("Number of Managers :" + " "+ noOfManagers );
System.out.println("Names of the avilable Managers");
for(int i=0;i<managerNames.length;i++){
System.out.println(" "+ managerNames[i]);}
System.out.println("            ");
System.out.println("Menu includes");
for(int v=0;v<Menu.length;v++){
System.out.println(" "+ Menu[v]);}
}
} 