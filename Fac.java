class Fac{ 
 public static int fact(int num){ 
 int i,fact=1;  
  for(i=1;i<=num;i++){    
      fact=fact*i;   
  } 
 return fact; 
 }
}

//npr = n! / (n!-r!).
//nCr = n! / (n! - r!)*r!.