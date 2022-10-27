class FurnitureTester{
public static void main (String []args){
Furniture.setFurnitureId(34);
Furniture.setFurnitureName("Table");
Furniture.setFurnitureMaterial("Wood");
Furniture.setFurniturePrice(56787.00);
System.out.println("The Furniture ID is : "+Furniture.getFurnitureId());
System.out.println("\nThe Furniture Name is : "+Furniture.getFurnitureName());
System.out.println("\nThe Furniture Material is : "+Furniture.getFurnitureMaterial());
System.out.println("\nThe Furniture Price is : "+Furniture.getFurniturePrice());
}
}