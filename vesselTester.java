class VesselTester{
public static void main (String []args){
Vessel.setVesselId(56);
Vessel.setVesselName("EVER GREEN");
Vessel.setVesselLength("Longests");
Vessel.setVesselPrice(455667000.00);
System.out.println("The Vessel ID is : "+Vessel.getVesselId());
System.out.println("The Vessel Name is : "+Vessel.getVesselName());
System.out.println("The Vessel Lenght is : "+Vessel.getVesselLength());
System.out.println("The Vessel Price is : "+Vessel.getVesselPrice());
}
}
