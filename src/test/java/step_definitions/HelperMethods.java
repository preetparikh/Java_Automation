package step_definitions;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class HelperMethods {
    public static String getDayName(String inputDate){
        Date date = null;
        try {
            date = new SimpleDateFormat("yyyy-M-dd").parse(inputDate);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new SimpleDateFormat("EEEE", Locale.ENGLISH).format(date);
    }


}
