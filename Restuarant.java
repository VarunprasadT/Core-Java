class Restuarant{
public static void getFoodmenu(String [] foodMenu){
System.out.println("The Number of Food Avialable are " +foodMenu.length);
for(int i=0; i<foodMenu.length; i++){
System.out.println("The list of Food : ");
System.out.println(foodMenu[i]);
}
}
}