/*Another version of time.java file but for current time. Use of
  java.util.Calendar: get int values of day, date, month, etc. by invoking its class methods
  java.util.Date: gets all information related to the current date
  java.text.SimpleDateFormat: inputs the date information into a string pattern
  Text after the program contains pattern variables information.*/
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.Date;
class current_time{
  public static void main(String[] args) {
    /*Current time using SimpleDateFormat and Date:
      pattern is the way the time will be organized.
      HH: hours from 0 to 23, mm: minutes, ss: seconds. */
    System.out.println("Current time using Date(): ");
    String pattern = "HH:mm:ss";
    SimpleDateFormat sdf = new SimpleDateFormat(pattern);
    String date1 = sdf.format(new Date());
    System.out.println(date1);

    /*Current time using Calendar:
    format present time into the pattern and print */
    System.out.println("Current time using Calendar(): ");
    Calendar cal = Calendar.getInstance();
    SimpleDateFormat timeStamp = new SimpleDateFormat("HH:mm:ss"); //object w/ parameter of a string pattern
    String date2 = timeStamp.format(cal.getTime()); //format present time into pattern
    System.out.println(date2 + "\n");
    // "\n" adds a new line character. Works with any print function.

    /*Percentage of time passed:
      Get values of hour, minute, second from Calendar class methods. */
    System.out.println("How much of the day has passed: ");
    int hour = cal.get(Calendar.HOUR_OF_DAY);
    int minute = cal.get(Calendar.MINUTE);
    int second = cal.get(Calendar.SECOND);
    int totsec = 24 * 60 * 60;  //Total seconds in a day
    int time_passed = hour*60*60 + minute*60 + second;  //Total seconds since midnight
    int percent = time_passed*100/totsec; //percentage of all seconds that have passed
    System.out.println(percent + "%\n"); //composition & concatenation

    /*Current date in European format:
      Day of the week, day, month, year.
      Formats specific values from Date() into the pattern*/
    System.out.println("Current date, European format: ");
    SimpleDateFormat eur = new SimpleDateFormat("E, dd MMM, yyyy");
    System.out.println(eur.format(new Date()));
    /*Current date in American format:
      Day of the week, month number/ day/ year (last 2 digits)*/
    System.out.println("Current date, American format: ");
    SimpleDateFormat amer = new SimpleDateFormat("E M/dd/yy");
    System.out.println(amer.format(new Date()));

    /*Current time in European format:
      hour:minutes on 0-24 hour scale.
      Fills necessary values into the string. */
    System.out.println("Current time in European format: ");
    SimpleDateFormat timeur = new SimpleDateFormat("kk:mm");
    System.out.println(timeur.format(new Date()));
    /*Current time in American format:
      hour:minute am/pm.
      Fills necessary values into the string. */
    System.out.println("Current time in American format: ");
    SimpleDateFormat timamr = new SimpleDateFormat("hh:mm aa \n");
    System.out.println(timamr.format(new Date()));

    /*Current time/date and timezone:
      hour(0-24 scale):minutes:seconds timezone. */
    System.out.println("Current time & zone: ");
    SimpleDateFormat timzone = new SimpleDateFormat("kk:mm:ss z \n");
    System.out.println(timzone.format(new Date()));

    /*Current year and era:
      yyyy: year, GG: BC/AC*/
    System.out.println("Current year:");
    SimpleDateFormat yr = new SimpleDateFormat("yyyy GG\n");
    System.out.println(yr.format(new Date()));

    /*Current week information using Calendar:
      Find values of day of the week, week of year,
      week of month using class methods of Calendar.*/
    System.out.println("Current week information: ");
    int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
    int weekOfYear = cal.get(Calendar.WEEK_OF_YEAR);
    int weekOfMonth = cal.get(Calendar.WEEK_OF_MONTH);
    System.out.println("Today is " + dayOfWeek +
    "th day of the week and \nthe " + weekOfMonth +
    "th week of the month \nand the " + weekOfYear +
    "th week of the year.");
  }
}


/*
G	Era designator (before christ, after christ)
y	Year (e.g. 12 or 2012). Use either yy or yyyy.
M	Month in year. Number of M's determine length of format (e.g. MM, MMM or MMMMM)
d	Day in month. Number of d's determine length of format (e.g. d or dd)
h	Hour of day, 1-12 (AM / PM) (normally hh)
H	Hour of day, 0-23 (normally HH)
m	Minute in hour, 0-59 (normally mm)
s	Second in minute, 0-59 (normally ss)
S	Millisecond in second, 0-999 (normally SSS)
E	Day in week (e.g Monday, Tuesday etc.)
D	Day in year (1-366)
F	Day of week in month (e.g. 1st Thursday of December)
w	Week in year (1-53)
W	Week in month (0-5)
a	AM / PM marker
k	Hour in day (1-24, unlike HH's 0-23)
K	Hour in day, AM / PM (0-11)
z	Time Zone
'	Escape for text delimiter
'	Single quote
*/
