class GalaxyTester{
	public static void main(String[]args){
Galaxy.setPlanetId(3);
Galaxy.setPlanetWeight("5.972*10^24 Kg");
Galaxy.setPlanetName("Earth");
Galaxy.setPlanetHumanPopulation("7.8 Billion");
System.out.println("The Planet ID is : "+Galaxy.getPlanetId());
System.out.println("The Planet Weight is : "+Galaxy.getPlanetWeight());
System.out.println("The Planet Name is : "+Galaxy.getPlanetName());
System.out.println("The Planet Human Population is : "+Galaxy.getPlanetHumanPopulation());
}
}