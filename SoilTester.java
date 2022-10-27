class SoilTester{
public static void main (String []args){
Soil.setSoilTexture("Course");
Soil.setSoilStructure("Grains");
Soil.setSoilDensity("Low");
Soil.setSoilColor("Black");
System.out.println("The Texture of the Soil is : "+Soil.getSoilTexture());
System.out.println("The Structure of the soil is : "+Soil.getSoilStructure());
System.out.println("The Density of the Soil is : "+Soil.getSoilDensity());
System.out.println("The Color of the soil is : "+Soil.getSoilColor());
}
}
