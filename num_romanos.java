package num_romanos;
import java.util.Scanner;

public class num
{
    public static void main(String[] args) 
    {
        Scanner read = new Scanner(System.in);
        
        System.out.print("Introduce un número: ");
        int num = read.nextInt();
        
        int m = num / 1000;
        int c = (num - m * 1000) / 100;
        int d = (num - c * 100 - m * 1000) / 10;
        int u = (num - d * 10 - c * 100 - m * 1000) / 1;

        if (num <= 3999)
        {
            switch (m)
            {
                case 1:
                    System.out.print("M");
                    break;
                case 2:
                    System.out.print("MM");
                    break;
                case 3:
                    System.out.print("MMM");
                    break;
                default:
                    break;
            }
            switch (c)
            {
                case 1:
                    System.out.print("C");
                    break;
                case 2:
                    System.out.print("CC");
                    break;
                case 3:
                    System.out.print("CCC");
                    break;
                case 4:
                    System.out.print("CD");
                    break;
                case 5:
                    System.out.print("D");
                    break;
                case 6:
                    System.out.print("DC");
                    break;
                case 7:
                    System.out.print("DCC");
                    break;
                case 8:
                    System.out.print("DCCC");
                    break;
                case 9:
                    System.out.print("CM");
                    break;
                default:
                    break;
            }
            switch (d)
            {
                case 1:
                    System.out.print("X");
                    break;
                case 2:
                    System.out.print("XX");
                    break;
                case 3:
                    System.out.print("XXX");
                    break;
                case 4:
                    System.out.print("XL");
                    break;
                case 5:
                    System.out.print("L");
                    break;
                case 6:
                    System.out.print("LX");
                    break;
                case 7:
                    System.out.print("LXX");
                    break;
                case 8:
                    System.out.print("LXXX");
                    break;
                case 9:
                    System.out.print("XC");
                    break;
                default:
                    break;
            }
            switch (u)
            {
                case 1:
                    System.out.print("I");
                    break;
                case 2:
                    System.out.print("II");
                    break;
                case 3:
                    System.out.print("III");
                    break;
                case 4:
                    System.out.print("IV");
                    break;
                case 5:
                    System.out.print("V");
                    break;
                case 6:
                    System.out.print("VI");
                    break;
                case 7:
                    System.out.print("VII");
                    break;
                case 8:
                    System.out.print("VIII");
                    break;
                case 9:
                    System.out.print("IX");
                    break;
                default:
                    break;
            }
        }
        else
        {
            System.out.println("Límite excedido");
        }
        read.close();
    }
}