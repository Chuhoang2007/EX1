import java.util.Scanner;
public class EX1 {

    public static void main(String[] args) {
        String name="Hoang dep try";
        System.out.println("Toi ten la "+name);
        Scanner sc =  new Scanner(System.in);
        int a= sc.nextInt();
        if(a%2==0){
            System.out.println(a+" la so chan");
        }
        else{
            System.out.println(a+" la so le");
        }
        long b=sc.nextLong();
        if((b%400==0) || ((b%4==0) && (b%100!=0))){
            System.out.println(b+" la nam nhuan");
        }
        else{
            System.out.println(b+" khong phai nam nhuan");
        }
        float c= sc.nextFloat();
        float GPA;
        if(c>=9.0){
            GPA = 4.0F;
        }
        else if(c<9.0 && c>=8.5) {
            GPA = 3.7F;
        }
        else if(c>=8.0 && c<8.5){
            GPA = 3.5F;
        }
        else if(c>=7.5 && c<8.0){
            GPA = 3.0F;
        }
        else{
            GPA=2.5F;
        }
        System.out.println("GPA cua "+name+" la: "+GPA);
    }
}
