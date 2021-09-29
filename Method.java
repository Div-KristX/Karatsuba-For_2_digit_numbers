package Pegasus;
import java.util.Scanner;
public class Method {
    Scanner n = new Scanner(System.in);
    int[] Fnumber = new int[2];
    int[] Snumber = new int[2];
    int[] Divide_ac = new int[2];
    int[] Divide_bd = new int[2];
    int[] Divide_sum = new int[3];
    int sum = 0;
    int i=1;
    int k=1;
    int j=2;
    boolean negative =false;
    public void getNumbers() {
        System.out.print("First number - ");
        int number_1 = n.nextInt();
        System.out.print("Second number - ");
        int number_2 = n.nextInt();
        if (number_1<0||number_2<0){
            negative=true;
        }
        if(negative==true){

            number_1=Math.abs(number_1);
            number_2=Math.abs(number_2);
        }

        while (number_1!=0){
            Fnumber[i]=number_1%10;
            i--;
            number_1/=10;
            if (number_1==0){
                break;
            }

        }
        while (number_2!=0){
            Snumber[k]=number_2%10;
            k--;
            number_2/=10;
            if (number_2==0){
                break;
            }
        }
        k=i=1;
        int ac=Fnumber[0]*Snumber[0];
        int bd=Fnumber[1]*Snumber[1];
        int ad=Fnumber[0]*Snumber[1];
        int bc=Fnumber[1]*Snumber[0];

        while ( ac!=0){
            Divide_ac[i]= ac%10;
            i--;
            ac/=10;
            if ( ac==0){
                break;
            }

        }
        while (bd!=0){
            Divide_bd[k]=bd%10;
            k--;
            bd/=10;
            if (bd==0){
                break;
            }
        }

        sum = ad+bc+Divide_bd[0]+Divide_ac[1]*10;
        while ( sum!=0){
            Divide_sum[j]= sum%10;
            j--;
            sum/=10;
            if ( sum==0){
                break;
            }

        }
        if(negative==true){
         System.out.print("-");
        }


        if (Divide_ac[0]+Divide_sum[0]==0 && Divide_sum[1]==0&&Divide_sum[2]==0){
            System.out.print(Divide_bd[1]);

        } else if(Divide_ac[0]+Divide_sum[0]==0 && Divide_sum[1]==0){
                System.out.print(Divide_sum[2]+""+Divide_bd[1]);

            }else if(Divide_ac[0]+Divide_sum[0]==0){
            System.out.print(Divide_sum[1]+""+Divide_sum[2]+""+Divide_bd[1]);
        }
        else if(Divide_ac[0]+Divide_sum[0]!=0 && Divide_sum[1]!=0&&Divide_sum[2]!=0){
            System.out.print(Divide_ac[0]+Divide_sum[0]+""+Divide_sum[1]+""+Divide_sum[2]+""+Divide_bd[1]);
        }
    }}

