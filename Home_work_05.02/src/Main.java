import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String dayOfWeek = scanner.nextLine();

        switch (dayOfWeek) {
            case "monday": {
                System.out.println("Workout");
                break;

            }
            case "tuesday": {
                System.out.println("Study");
                break;

            }
            case "wednesday": {
                System.out.println("Creativity");
                break;

            }
            case "thursday": {
                System.out.println("Meetings");
                break;

            }
            case "friday": {
                System.out.println("Entertainment");
                break;

            }

            case "saturday": {
                System.out.println("Relaxation");
                break;
            }

            case "sunday": {
                System.out.println("Family");
                break;

            }
            default: {
                System.out.println("Вы ввели неправильный день недели. Повторите снова!");
            }
        }

        String dayOfWeeks2;
        String monday = "monday";
        String tuesday = "tuesday";
        String wednesday = "wednesday";
        String thursday = "thursday";
        String friday = "friday";
        String saturday = "saturday";
        String sunday = "sunday";


        dayOfWeeks2 = scanner.next();


        if (dayOfWeeks2.equals(monday)) {
            System.out.println("Workout");

        } else if (dayOfWeeks2.equals(tuesday)) {
            System.out.println("Study");

        } else if (dayOfWeeks2.equals(wednesday)){
            System.out.println("Creativity");

        } else if (dayOfWeeks2.equals(thursday)) {
            System.out.println("Meetings");

        } else if (dayOfWeeks2.equals(friday)) {
            System.out.println("Entertainment");

        } else if (dayOfWeeks2.equals(saturday)) {
            System.out.println("Relaxation");

        }else if (dayOfWeeks2.equals(sunday)) {
            System.out.println("Family");

        }else {
            System.out.println("Вы ввели неправильный день недели. Повторите снова!");
        }

        }
    }

