// 7. WAP to convert seconds into days, hours, minutes and seconds.
import java.util.Scanner;

class ConvertSeconds {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value for seconds..");
        int n = sc.nextInt();
        convert(n);
    }
    static void convert(int n){
        int day = n / (24 * 3600);

        n = n % (24 * 3600);
        int hour = n / 3600;

        n %= 3600;
        int minutes = n / 60 ;

        n %= 60;
        int seconds = n;

        System.out.println( day + " " + "days " + hour + " " + "hours " + minutes + " " + "minutes " + seconds + " " + "seconds ");
    }
}
