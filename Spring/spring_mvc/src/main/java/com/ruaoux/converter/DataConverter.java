package com.ruaoux.converter;


import org.springframework.core.convert.converter.Converter;
import java.text.SimpleDateFormat;
import java.util.Date;


public class DataConverter implements Converter<String,Date> {
    public Date convert(String dataStr) {
        // 将日期字符串转换成真正的日期对象
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date date = null;
        try {
            date = format.parse(dataStr);
        } catch (Exception e) {
            System.out.println(e);
        }

        return date;
    }


}
