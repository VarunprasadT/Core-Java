//The return value must and should have the same datatypes as in return type.

class Swiggy{
static String item;
public static String takeOrder(){
item="pizza";
if(item=="pizza"){
System.out.println("Thankyou for ordering "+item);
}
if(item=="burger"){
System.out.println("Thankyou for ordering "+item);
}
if(item=="cake"){
System.out.println("Thankyou for ordering "+item);
}
if(item=="curdRice"){
System.out.println("Thankyou for ordering "+item);
}
if(item=="sandwitch"){
System.out.println("Thankyou for ordering "+item);
}
return item;
}
}