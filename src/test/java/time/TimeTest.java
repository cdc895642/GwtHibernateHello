package time;

import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;
/**
 * Created by cdc89 on 12.12.2016.
 */
public class TimeTest {
    @Test
    public void getTimeTest(){
        String miliS="1481540858849";
        Long convertLong=Long.parseLong(miliS);
        assertEquals(miliS,convertLong.toString());
        Date date=new Date(convertLong);
        System.out.println(date);
    }
}