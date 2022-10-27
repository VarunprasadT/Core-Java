class AirportTester{
public static void main (String []args){
Airport.addAirportName("Kempegowdha Airport");
Airport.addAirportName("Agatti Island Airport");
Airport.addAirportName("Ahmedabad Airport Ahmedabad");
Airport.addAirportName("Aizawl Airport");
Airport.addAirportName("Akola Airport Akola");
boolean value = Airport.addAirportName(null);
Airport.getAirportNames(value);
}
}