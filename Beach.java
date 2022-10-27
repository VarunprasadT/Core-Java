class Beach{
static String beachNames[] = {null,null,null,null,null};
static int index;
static int crowd;
public static boolean addBeachName(String beachName){
System.out.println("Inside Method addBeachNames ");
if(crowd<100){
beachNames[index] = beachName;
index++;
System.out.println("Outside Method addBeachNames ");
return true;
}
else {
System.out.println("The Beach Is Full");
return false;
}
break;
}
public static void getBeachNames(){
for (int index = 0; index<beachNames.length;index++){
System.out.println("The Beach Name is : "+beachNames[index]);
}
}
}