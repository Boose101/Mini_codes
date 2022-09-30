import java.util.Scanner;
public class ip_addy {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean works = true;
        int[] octs = {0, 0, 0, 0};
        System.out.println("Please enter first octet:");
        System.out.print(">");
        octs[0] = scan.nextInt();
        System.out.println("Please enter second octet:");
        System.out.print(">");
        octs[1] = scan.nextInt();
        System.out.println("Please enter third octet:");
        System.out.print(">");
        octs[2] = scan.nextInt();
        System.out.println("Please enter fourth octet:");
        System.out.print(">");
        octs[3] = scan.nextInt();

        for(int x = 0; x < 3; x++){
            if(octs[x] >= 0 && octs[x] <=255 ){
            }else{
                works = false;
                System.out.println("Octet " + (x+1) + " is incorrect");

            }
        }
        if(works){
            System.out.println(octs[0] + "." + octs[1] + "." + octs[2] + "." + octs[3]);

        }
    }
}
