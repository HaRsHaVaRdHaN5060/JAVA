import java.util.Scanner;
public class CompositeNumber
{
 public static void main(String[] args)
 {
  int num = 12;
  int i;
  int count = 0;
System.out.println("Enter num : ");
   Scanner sc=new Scanner (System.in);
   num= sc.nextInt();

  for(i=1; i<=num; i++)
  {
   if(num % i == 0)
    count++;
  }
  
  if(count > 2)
   System.out.format("%d is a composite number", num);  
  else
   System.out.format("%d is not a composite number", num);
 }
}
