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

    }
}
