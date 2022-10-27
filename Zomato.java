class Zomato{
static	String items[]={"pizza","Burger","Cake","Sandwitch"};
public static void takeOrder(String item){
for(int i=0; i<items.length;i++){
	if(items[i]==item){
System.out.println("Thank you for Ordering : "+item);
}
return;
}
}
}