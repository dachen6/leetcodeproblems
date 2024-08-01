package leetcode;

public class NumberofDaysBetweenTwoDates {
    public int daysBetweenDates(String date1, String date2) {
        int ans = 0;
        ans+=( date1.charAt(0) - date2.charAt(0)) * 365000;
        ans+=( date1.charAt(1) - date2.charAt(1)) * 36500;
        ans+=( date1.charAt(2) - date2.charAt(2)) * 3650;
        ans+=( date1.charAt(3) - date2.charAt(3)) * 365;
        ans+=( date1.charAt(5) - date2.charAt(5)) * 365000;
    }
}
