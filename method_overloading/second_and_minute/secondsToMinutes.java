package method_overloading.second_and_minute;

public class secondsToMinutes {     //this method converts seconds to the minutes and hours.

    public String scToMin(int sec){

        if(sec<0){
            return "invalid value";
        }

        int residualSeconds = sec %60;
        int minute = sec/60;
        int residualMinute = minute%60;
        int hour = minute/60;

        return sec + " seconds equal to : " + hour + "h " + residualMinute + "m " + residualSeconds + "s ";
    }

    public String scToMin(int sec, int min){

        if(sec<0 || min<0){
            return "invalid value";
        }

        return scToMin(sec + min*60);
    }
}
