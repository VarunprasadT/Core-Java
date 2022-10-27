class BankNameTester{
public static void main (String []args){
	
Bank.addBankNames("SBI");
Bank.addBankNames("Canara");
Bank.addBankNames("BOB");
Bank.addBankNames("Karnataka Bank");
Bank.addBankNames("Andara Bank");
Bank.addBankNames("Axis Bank");
Bank.getBankNames(true);
Bank.updateBankName("Vijaya Bank" , "BOB");
Bank.getBankNames(true);
}
}