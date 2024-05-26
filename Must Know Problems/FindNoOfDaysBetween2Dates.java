//User function Template for Java
class Solution {
    static int noOfDays(int d1, int m1, int y1, int d2, int m2, int y2) {
        // code here
        int val1 = find(d1,m1,y1);
        int val2 = find(d2,m2,y2);
        
        return Math.abs(val1 - val2);
    }
        public static int find(int date,int month,int year){
            int days = date;
            for(int m=1;m<month;m++){
                days += getdays(m,year);
            }
            for(int i=1;i<year;i++){
                days+= leap(i)?366:365;
            }
            return days;
        }
        public static int getdays(int m,int year){
            if(m==1 || m==3 || m==5 || m==7 || m==8 || m==10 || m==12){
                return 31;
            }else if(m==2){
                if(leap(year)){
                    return 29;
                }else{
                    return 28;
                }
            }
            return 30;
        }
        public static boolean leap(int year){
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    return year % 400 == 0;
                }
            return true;
            }
            return false;
        } 
};
