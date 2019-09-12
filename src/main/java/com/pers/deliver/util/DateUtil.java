package com.pers.deliver.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @version 1.0 2017/3/1
 * @auther <a href="mailto:lly835@163.com">廖师兄</a>
 * @since 1.0
 */
public class DateUtil {

    /**
     * 将yyyy-mm-dd HH:mm:ss格式的日期转换为Date格式
     * @param dateString
     * @return
     * @throws Exception
     */
    public static Date toDate(String dateString) throws Exception{
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.parse(dateString);
    }

    /**
     * 返回当前时间的秒数
     *
     * @return
     */
    public static int unixTime() {
        return (int) (System.currentTimeMillis() / 1000);
    }

    /**
     * 把表转换为Date
     *
     * @param seconds
     * @return
     */
    public static Date fromUnixTime(Integer seconds) {
        return new Date(seconds * 1000L);
    }

    public static Date fromUnixTime(Long seconds) {
        return new Date(seconds * 1000L);
    }
}
