class ShowRoom{
public static void getCars(String []c){
System.out.println("Numbers of Cars Avilable in the Showroom : "+c.length);
for(int i=0;i<c.length;i++){
System.out.println("The List Of cars are : ");
System.out.println(c[i]);
}
}
public static void getBikes(String []bikes){
System.out.println("Numbers of Bikes Avilable in the Showroom : "+bikes.length);
for(int z=0;z<bikes.length;z++){
System.out.println("The List Of Bikes are : ");
System.out.println(bikes[z]);
}
}
}