public class DecimalToHexadecimal
{
  public static void main(String[] args)
  {
    int num = 26, tmp;
    tmp = num;
    int numberSystem = 16;
    String hexa = "";
    while(num >= 16)
    {
      hexa = getHexa(num%16) + hexa;
      num = num /16;
    }
    hexa = getHexa(num) + hexa ;
    System.out.println("Hexadecimal of " + tmp + " is " + hexa);
  }
  static String getHexa(int n)
  {
    String[] nums = {"0", "1","2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C","D", "E", "F"};
    return nums[n];
  }
}
