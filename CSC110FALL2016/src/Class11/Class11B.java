/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Class11;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import sun.util.BuddhistCalendar;

/**
 *
 * @author lkhan
 */
public class Class11B {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println(System.currentTimeMillis());
        long dong =  1457644970042L; 
        Date date = new Date(dong);
        
        System.out.println(date.toString());
        
        Calendar rightNow1 = Calendar.getInstance();
        Calendar rightNow2 = Calendar.getInstance();
        
        System.out.println(rightNow1.getTime());
        System.out.println(rightNow2.getTime());
        
        System.out.println(rightNow1.getTimeZone());
        System.out.println(rightNow2.getTimeZone());
        
        DateFormat df =  DateFormat.getDateInstance(DateFormat.LONG, Locale.FRANCE);
        
        System.out.println(df.getCalendar().toString());
        
        System.out.printf("Today's date is "+"%tB-%tY:%tl:%tM%n",System.currentTimeMillis(),System.currentTimeMillis(),System.currentTimeMillis(),System.currentTimeMillis(),System.currentTimeMillis());
        System.out.printf("Today's date is "+"%d.00",4);
        
    }
    
}
