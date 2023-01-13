import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Main main = new Main();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Write the text you need to correct: ");
        String scan = scanner.nextLine();
        System.out.println(main.example(scan));
    }

    public String example(String sentenses){

        String[] result = sentenses.split(" ");

        String res = result[0].replace(result[0].charAt(0), result[0].toUpperCase().charAt(0));

        result[0] = res;

        String all = "";

        for (int i = 0; i < result.length; i++) {
            if(result[i].contains(".") && !(result[i].equals(result[result.length - 1]))){
                String res1 = result[i + 1].replace(result[i + 1].charAt(0), result[i + 1].toUpperCase().charAt(0));
                result[i + 1] = res1;
            }
            all += result[i] + " ";
        }

        return all;
    }
}