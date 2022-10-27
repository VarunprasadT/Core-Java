class EcommerceTester{
public static void main(String []args){
Ecommerce.setProductId(45);
Ecommerce.setProductName("Trimmer");
Ecommerce.setProductWeight("1.2Kg");
Ecommerce.setProductPrice(3456.00);
System.out.println("The Product ID is : "+Ecommerce.getProductId());
System.out.println("The Product Name is : "+Ecommerce.getProductName());
System.out.println("The Product Weight is : "+Ecommerce.getProductWeight());
System.out.println("The Product Price is : "+Ecommerce.getProductPrice());
}
}