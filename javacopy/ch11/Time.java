class Time{
   int hour, minute;
   double second;

   public Time(){
     this.hour = 0;
     this.minute = 0;
     this.second = 0.0;
   }
   public Time(int hour, int min, double sec){
     this.hour = hour;
     this.minute = min;
     this.second = sec;
   }
   public static void printTime(Time t){
     System.out.println(t.hour + ":" + t.minute + ":" + t.second);
   }
   //Pure functions:
   public static boolean isAfter(Time time1, Time time2){
     if(time1.hour > time2.hour) return true;
     if(time1.hour < time2.hour) return false;

     if(time1.minute > time2.minute) return true; //if the hour for both is the same
     if(time1.minute < time2.minute) return false;

     if(time1.second > time2.second) return true; //if each hr and min of two times is the smae
     return false; // if the time is the same
   }
   public static Time addTime(Time t1, Time t2){
     Time sum = new Time();
     sum.second = t1.second + t2.second;
     if(sum.second >= 60.0){
       do{
         sum.second -= 60;
         sum.minute += 1;
       }while(sum.second >= 60);
     }
     sum.minute = t1.minute + t2.minute;
     if(sum.minute >= 60){
       do{
         sum.minute -= 60;
         sum.hour += 1;
       }while(sum.minute >= 60);
     }
     sum.hour = t1.hour + t2.hour;
     if(sum.hour >= 24){
       do{
         sum.hour -=24;
       }while(sum.hour >= 24);
     }
     return sum;
   }
   //Modifier functions:
   public static void increment(Time time, double secs){
     time.second += secs;
     if(time.second >= 60.0){
       do{
         time.second -= 60.0;
         time.minute += 1;
       }while(time.second >=60.0);
     }
     if(time.minute >= 60){
       do{
         time.minute -= 60;
         time.hour += 1;
       }while(time.minute >= 60);
     }
     while(time.hour >=24){
       time.hour -= 24;
     }

   }
   public static void incrementWithoutIteration(Time time, double secs){
     double sumS = time.second + secs; //let sumS = 127.13
     int s = (int) sumS; //s = 127
     double tail = sumS - s; //tail = .13
     int remainder = s%60; //remainder = 7
     int quotient = s/60; //quotient = 2
     sumS = remainder + tail; //sumS = 7.13
     time.minute += quotient;


   }
   //fill-in functions:
   public static void AddTimeFill(Time t1, Time t2, Time sum){
     sum.hour = t1.hour + t2.hour;
     sum.minute = t1.minute + t2.minute;
     sum.second = t1.second + t2.second;

     if (sum.second >= 60.0) {
            sum.second -= 60.0;
            sum.minute += 1;
        }
        if (sum.minute >= 60) {
            sum.minute -= 60;
            sum.hour += 1;
        }
   }
   public static void main(String[] args) {
     Time t1 = new Time();
     t1.hour = 11;
     t1.minute = 8;
     t1.second = 3.14159;
    //  System.out.println(t1);

     Time t2 = new Time(11,8,3.14159);

    //  System.out.println(t2); //prints gibberish
    //  printTime(t2); //prints time
     Time sum = addTime(t1,t2); //add time
    //  printTime(sum);
    //  printTime(addTime(sum,t2));
     Time t3 = new Time(6, 25, 13);
     printTime(t3);
     increment(t3, 150.0);
     printTime(t3);
     incrementWithoutIteration(t3, 150.0);
     printTime(t3);

   }
}
