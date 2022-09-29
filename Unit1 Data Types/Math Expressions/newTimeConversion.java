import java.util.Scanner;
class newTimeConversion {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a number of seconds: ");
    int totalSeconds = input.nextInt();
    int secondsCounter = totalSeconds;

    int hours = secondsCounter/3600;
    secondsCounter -= hours * 3600;
    int minutes = secondsCounter/60;
    secondsCounter -= minutes * 60;
    int seconds = secondsCounter;

    System.out.println(totalSeconds + " seconds is equivalant to " + hours + " hours, " + minutes + " minutes, and " + seconds + " seconds");
  }
}