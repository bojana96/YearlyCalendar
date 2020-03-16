import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Application {


    public static int numberOfDays31(String[] array, int index, int year, int month) {
        for (int i = 1; i <= 31; i++) {
            array[index] = year + "-" + month + "-" + i;
            index++;
        }
        return index;
    }

    public static int numberOfDays30(String[] array, int index, int year, int month) {
        for (int i = 1; i <= 30; i++) {
            array[index] = year + "-" + month + "-" + i;
            index++;
        }
        return index;

    }


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer year = Integer.parseInt(br.readLine());
        String[] calendar;
        int index = 0;
        if (year % 4 == 0) {
            calendar = new String[366];
        } else {
            calendar = new String[365];
        }


        for (int month = 1; month <= 12; month++) {
            if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
                index = numberOfDays31(calendar, index, year, month);
            }

            if (month == 2) {
                if (year % 4 == 0) {
                    for (int i = 1; i <= 29; i++) {
                        calendar[index] = year + "-" + 2 + "-" + i;
                        index++;
                    }
                } else {
                    for (int i = 1; i <= 28; i++) {
                        calendar[index] = year + "-" + 2 + "-" + i;
                        index++;

                    }
                }

            }
            if (month == 4 || month == 6 || month == 9 || month == 11) {
                index = numberOfDays30(calendar, index, year, month);
            }
        }
        for (int i = 0; i < calendar.length; i++) {
            System.out.println(calendar[i]);
        }

    }
}







