class PGTester{
public static void main (String []args){
Pg.setPgId(34);
Pg.setPgName("Om Pg");
Pg.setPgAddress("Rajajinagar");
Pg.setPgContactNo(8976568789L);
System.out.println("The PG ID is : "+Pg.getPgId());
System.out.println("The PG Name is : "+Pg.getPgName());
System.out.println("The PG Address is : "+Pg.getPgAddress());
System.out.println("The PG Contact Number is : "+Pg.getPgContactNo());
}
}