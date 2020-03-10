import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Application {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer year = Integer.parseInt(br.readLine());
        String[] calendar = new String[366];


        int index = 0;

        for (int i = 1; i <= 31; i++) {
            calendar[index] = year + "-" + 1 + "-" + i;
            index++;
        }

        if (year % 4 == 0) {
            for (int i = 1; i <= 29; i++) {
                calendar[index] = year + "-" + 2 + "-" + i;
                index++;
            }
        } else if (year % 4 != 0) {
            for (int i = 1; i <= 28; i++) {
                calendar[index] = year + "-" + 2 + "-" + i;
                index++;
            }

        }
        for (int i = 1; i <= 31; i++) {
            calendar[index] = year + "-" + 3 + "-" + i;
            index++;
        }
        for (int i = 1; i <= 30; i++) {
            calendar[index] = year + "-" + 4 + "-" + i;
            index++;
        }
        for (int i = 1; i <= 31; i++) {
            calendar[index] = year + "-" + 5 + "-" + i;
            index++;
        }
        for (int i = 1; i <= 30; i++) {
            calendar[index] = year + "-" + 6 + "-" + i;
            index++;
        }
        for (int i = 1; i <= 31; i++) {
            calendar[index] = year + "-" + 7 + "-" + i;
            index++;
        }
        for (int i = 1; i <= 31; i++) {
            calendar[index] = year + "-" + 8 + "-" + i;
            index++;
        }
        for (int i = 1; i <= 30; i++) {
            calendar[index] = year + "-" + 9 + "-" + i;
            index++;
        }
        for (int i = 1; i <= 31; i++) {
            calendar[index] = year + "-" + 10 + "-" + i;
            index++;
        }
        for (int i = 1; i <= 30; i++) {
            calendar[index] = year + "-" + 11 + "-" + i;
            index++;
        }
        for (int i = 1; i <= 31; i++) {
            calendar[index] = year + "-" + 12 + "-" + i;
            index++;
        }
        for (int i = 0; i < calendar.length; i++) {
            System.out.println(calendar[i]);
        }
    }
}







