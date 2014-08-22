package kr.co.nurier.util;

import java.math.*;
import java.text.*;
import java.util.*;

/*import com.sds.ori.services.CommonServices;
import com.nacf.exception.CommonUtilException;
import com.sds.ori.services.holiday.HolidayService;
import com.sds.ori.services.service.NongService;*/

/**<pre>
 * 특정 형식의 날짜 스트링을 다른 날짜 형식 스트링으로 변환하는 클래스.
 * 
 *@since 2002/08/31
 *</pre>
 */

public class DateUtil
{           
    public static final int KOREA = 1;
    public static final int USA = 2;    

  /**

  현재의 날짜를 기준으로 YYYYMMDDHHMMSS 형태로 변환
  @return YYYYMMDD
  */
   public static String getDate()
   {
       java.text.SimpleDateFormat formatter = new java.text.SimpleDateFormat("yyyyMMddHHmmss");
       java.util.Date   currentdate =  new java.util.Date();
     return formatter.format(currentdate) ;
   }

  /**<pre>
   * 해당시간("hhmm")에 따라 "오전" 또는 "오후"를 리턴한다.
   *
   * @return java.lang.String
   * @param str 날짜(yyyymmdd)
   */
  public static String getNoon(String str)
  {
    if(str==null)       return str;
    if(str.length()!=4)   return str;

    int noon = Integer.parseInt(str);
    if(noon<1200)   return "오전";

    return "오후";
  }

  /**<pre>
   * 년월일 사이에 구분자 sep를 첨가한다. 구분자가 "/"인 경우 "yyyymmdd" -> "yyyy/mm/dd"가 된다.
   *
   * @return java.lang.String
   * @param str 날짜(yyyymmdd)
   */
  public static String date(String str, String sep)
  {
    String temp = null;
        if (str == null) return "";
    int len = str.length();

    if (len != 8)
      return str;
    if ((str.equals("00000000"))||(str.equals("       0"))||(str.equals("        ")))
            return "";
    temp = str.substring(0,4) + sep + str.substring(4,6) + sep + str.substring(6,8);

      return  temp;
  }

  /**<pre>
   * 년월일(년도는 2자리 형식) 사이에 구분자 sep를 첨가한다. 구분자가 "/"인 경우 "yymmdd" -> "yy/mm/dd"가 된다.
   *
   * @return java.lang.String
   * @param str 날짜(yyyymmdd)
   */
  public static String date2(String str, String sep)
  {
    String temp = null;
        if (str == null) return "";
    int len = str.length();

    if (len != 6)
      return str;
    if ((str.equals("000000"))||(str.equals("     0")))
       return "";
    temp = str.substring(0,2) + sep + str.substring(2,4) + sep + str.substring(4,6);

      return  temp;
  }

  /**
   * 년월일 사이에 '.'를 첨가한다. "yyyymmdd" -> "yyyy.mm.dd"
   * @return java.lang.String
   * @param str 날짜(yyyymmdd)
   */
  public static String dotDate(String str)
  {
    String temp = null;
        if (str == null) return "";
    int len = str.length();

    if (len != 8)
      return str;
    if ((str.equals("00000000"))||(str.equals("       0")))
       return "";
    temp = str.substring(0,4) + "." + str.substring(4,6)
      + "." + str.substring(6,8);

        return  temp;
  }

  /**
   * 월일 사이에 '.'를 첨가한다. "mmdd" -> "mm.dd"
   * @return java.lang.String
   * @param str 날짜(mmdd)
   */
  public static String dotMM(String str)
  {
    String temp = null;
        if (str == null) return "";
    int len = str.length();

    if (len != 4)
      return str;
    if ((str.equals("0000"))||(str.equals("   0")))
       return "";
    temp = str.substring(0,2) + "." + str.substring(2,4);
        return  temp;
  }

  /**
   * 년월일 사이에 '.'와 ':'를 첨가한다. "yyyymmddhhmmss" -> "yyyy.mm.dd hh:mm:ss"
   * @return java.lang.String
   * @param str 날짜(yyyymmddhhmmss)
   */
  public static String dotDateTime(String str) {

    String temp = null;
        if (str == null) return "";
    int len = str.length();

    if (len != 14)
      return str;
    if ((str.equals("00000000"))||(str.equals("       0")))
       return "";
    temp = str.substring(0,4) + "." + str.substring(4,6)
      + "." + str.substring(6,8) + " " + str.substring(8,10) + ":" + str.substring(10,12) + ":" + str.substring(12,14);

        return  temp;
  }

  /**
     * 년월 사이에 '.'를 첨가한다. "yyyymm" -> "yyyy.mm"
     * @return java.lang.String 
     * @param str 날짜(yyyymm)
     */
    public static String dotYM(String str) {

        String temp = null;
        if (str == null) return "";
        int len = str.length();

        if (len != 6)
            return str;
        if ((str.equals("000000"))||(str.equals("     0")))
             return "";
        temp = str.substring(0,4) + "." + str.substring(4,6);

        return  temp;
    }

    /**  
   * 년월일 사이에 '-'를 첨가한다. "yyyymmdd" -> "yyyy-mm-dd"
   * @return java.lang.String
   * @param str 날짜(yyyymmdd)
   */
  public static String dashDate(String str) {

    String temp = null;
    if(str == null) str="";

    int len = str.length();

    if (len != 8 || str.equals("        "))
      return str;
    if ((str.equals("00000000"))||(str.equals("       0")))
       return "";
    temp = str.substring(0,4) + "-" + str.substring(4,6)
      + "-" + str.substring(6,8);

        return  temp;
  }

    /**  
   * 년월 사이에 '-'를 첨가한다. "yyyymm" -> "yyyy-mm"
   * @return java.lang.String
   * @param str 날짜(yyyymmdd)
   */
    public static String dashYM(String str) {

        String temp = null;
        if (str == null) return "";
        int len = str.length();

        if (len != 6)
            return str;
        if ((str.equals("000000"))||(str.equals("     0")))
             return "";
        temp = str.substring(0,4) + "-" + str.substring(4,6);

        return  temp;
    }

  /**
   * 년월일을 한글로 표시한다 "yyyymmdd" -> "yyyy년 mm월 dd일"
   * @return java.lang.String
   * @param str 날짜(yyyymmdd)
   */
  public static String hanDate(String str) {

    String temp = null;
        if (str == null) return "";
    int len = str.length();

    if (len != 8)
      return str;
    if ((str.equals("00000000"))||(str.equals("       0")))
       return "";
    temp = str.substring(0,4) + "년 " + Integer.parseInt (str.substring(4,6))
      + "월 " + Integer.parseInt (str.substring(6,8)) + "일";

      return  temp;
  }

  /**
   * 년월일을 한글로 표시한다 "yymmdd" -> "yy년 mm월 dd일"(년도는 2자리로 표기한다.)
   * @return java.lang.String
   * @param str 날짜(yymmdd)
   */
  public static String hanDate2(String str) {

    String temp = null;
        if (str == null) return "";
    int len = str.length();

    if (len != 6)
      return str;
    if ((str.equals("000000"))||(str.equals("     0")))
       return "";
    temp = str.substring(0,2) + "년 " + Integer.parseInt (str.substring(2,4))
      + "월 " + Integer.parseInt (str.substring(4,6)) + "일";

      return  temp;
  }

  /**
   * 년월을 한글로 표시한다 "yyyymm" -> "yyyy년 mm월"
   * @return java.lang.String
   * @param str 날짜(yyyymm)
   */
  public static String hanYM(String str) {

    String temp = null;
        if (str == null) return "";
    int len = str.length();

    if (len != 6)
      return str;
    if ((str.equals("000000"))||(str.equals("     0")))
       return "";
    temp = str.substring(0,4) + "년 " + Integer.parseInt (str.substring(4,6)) + "월";

      return  temp;
  }

  /**
   * 시분초 사이에 ':'를 첨가한다. HHMMSS -> HH:MM:SS
   * @return java.lang.String
   * @param str 시간(HHMMSS)
   */
  public static String dotTime(String str) {

    String temp=null;
    // Hjun edit.. 2000.11.1
    if (str==null)
      return "";
    int len = str.length();

    if (len != 6)
      return str;

    temp = str.substring(0,2) + ":" + str.substring(2,4)
      + ":" + str.substring(4,6);

        return  temp;
  }

  /**
   * 시분초 사이에 '시','분','초'를 첨가한다. HHMMSS -> HH시 MM분 SS초
   * @return String
   * @param  str 시간(HHMMSS)
   */
  public static String hanTime(String str) {

    String temp=null;

    if (str==null)
      return "";
    int len = str.length();

    if (len != 6)
      return str;

    temp = str.substring(0,2) + "시 " + str.substring(2,4)
      + "분 " + str.substring(4,6)+"초";

        return  temp;
  }

  /**
   * 시분 사이에 ':'를 첨가한다. HHMM -> HH:MM
   * @return java.lang.String
   * @param str 시간
   */
  public static String dotHM(String str) {

    String temp=null;
        if (str==null)
        return "";
    int len = str.length();

    if (len < 4)
      return str;

    temp = str.substring(0,2) + ":" + str.substring(2,4);

        return  temp;
  }
    
    /**  
     * 시분시분 사이에 ':'와 "~" 를 첨가한다. HHMMHHMM -> HH:MM ~ HH:MM
     * @return java.lang.String
     * @param str 시간
     */
    public static String dotHMHM(String str) {

        String temp=null;
        if (str==null)
              return "";        
        int len = str.length();

        if (len < 8)
            return str;
        
        
        if (str.startsWith("00000000")) {
            temp = "24시간";
        }else if(str.startsWith("9999")) {
            temp = "거래불가";
        }else {
            temp = str.substring(0,2) + ":" + str.substring(2,4) + " ~ " + str.substring(4,6) + ":" + str.substring(6,8);
        }
        
        return temp;
        
    }

  /**
   * 시분 한글로 표시한다 HHMM -> HH시 MM분
   * @return java.lang.String
   * @param str 시간
   */
  public static String hanHM(String str) {

    String temp=null;

        if (str==null) return "";
        int len = str.length();
    if (len  != 4 )
      return str;

    temp = Integer.parseInt (str.substring(0,2)) + "시 " +
           Integer.parseInt (str.substring(2,4)) + "분";

      return  temp;
  }

  /**
   * 파라미터로 받은값을 8자리의 년도 형태로 반환
   * @return java.lang.String 20011201
   * @param int y :년도 , int m : 월, int d : 일
   */
  public static String fixDate(int y, int m, int d)
  {

    String mm=null;
    String dd=null;

    mm=""+m;
    dd=""+d;

    if( m<10 ) mm="0"+mm;
    if( d<10 ) dd="0"+dd;

    return y+mm+dd;


  }

  /**로케일에 따라 지정된 날짜포맷으로 변환 예) 20010414 --> 2001-04-14
   * @param 날짜문자열     String
   * @return 포맷된 날짜 문자열
   */
  public static String date(String date) throws CommonUtilException
  {
    return date(date, KOREA);
  }

  /** 지정된 로케일에 해당되는 날짜포맷으로 변환 예) 20010414 --> 2001-04-14
   * @param 날짜문자열     String
   * @return 포맷된 날짜 문자열
   */
  public static String date(String date, int lang) throws CommonUtilException
  {
    try
    {
      String language = null;
      String country = null;
      String result = null;
      Locale locale = null;
      DateFormat f = null;
      SimpleDateFormat sdf = null;

      if (date == null)
        {
          return "";
        }

        date = date.trim();

      if (date.equals(""))
        {
          return "";
        }

      if (date.length() != 8)
        {
          throw new CommonUtilException("[DateUtil.date] 날짜(" + date +")가 8자리가 아닙니다");
        }

      switch (lang)
      {
          case KOREA:
              language = "ko";
              country = "KR";
              break;
          case USA:
              language = "en";
              country = "US";
      }
      sdf = new SimpleDateFormat("yyyyMMdd");
      locale = new Locale(language, country);
      f = DateFormat.getDateInstance(DateFormat.DEFAULT, locale);
      result = f.format(new java.util.Date(sdf.parse(date).getTime()));

      return result;
    }
    catch(Exception e)
    {
      throw new CommonUtilException("[DateUtil.date] 날짜포맷으로 변환하는중 에러가 발생하였습니다. "+e.toString());
    }
  }

  /**
   * Date를 String으로 변환하여 return한다.
   * @return String
   * @param d Date date정보
   */
  public static String date(Date d) {
    Calendar cal = Calendar.getInstance();
    cal.setTime(d);
    int yy = cal.get(Calendar.YEAR);
    int mo = cal.get(Calendar.MONTH)+1;
    int dd = cal.get(Calendar.DAY_OF_MONTH);

    String yyy = null;
    String mmo = null;
    String ddd = null;

    yyy = "" + yy;
    if(mo < 10) mmo = "0" + mo;
    else mmo = "" + mo;
    if(dd < 10) ddd = "0" + dd;
    else ddd = "" + dd;

    String addDate = "" + yyy + mmo + ddd;
    return addDate;
  }

  /** 지정된 날짜포맷으로 변환 예) 20010414 --> 04-14-2001
   * @param 날짜문자열     String
   * @return 포맷된 날짜 문자열
   */
  public static String dateForSQL(String date) throws CommonUtilException
  {
        if (date == null) return "";
    if (date.length() != 8) return "";
    String tempDate = "";
    tempDate = date.substring(4, 6) + "-" + date.substring(6, 8) + "-" + date.substring(0, 4);
    return tempDate;
  }

  /** 지정된 시간포맷으로 변환
   * @param 시간문자열     String
   * @return 포맷된 시간 문자열
   */
  public static String time(String time) throws CommonUtilException
  {
    return time(time, KOREA);
  }

  /** 지정된 로케일에 따라 시간포맷으로 변환
   * @param 시간문자열     String
   * @return 포맷된 시간 문자열
   */
  public static String time(String time, int lang) throws CommonUtilException
  {
    try
    {
      String language = null;
      String country = null;
      String result = null;
      Locale locale = null;
      DateFormat f = null;
      SimpleDateFormat sdf = null;
            if (time == null) return "";
      if (time.length() != 6)
        {
          throw new CommonUtilException("[DateUtil.time] 시간(" + time +")이 6자리가 아닙니다");
        }

      switch (lang)
      {
          case KOREA:
              language = "ko";
              country = "KR";
              break;
          case USA:
              language = "en";
              country = "US";
      }
      sdf = new SimpleDateFormat("hhmmss");
      locale = new Locale(language, country);
      f = DateFormat.getTimeInstance(DateFormat.DEFAULT, locale);
      result = f.format(new java.util.Date(sdf.parse(time).getTime()));

      return result;
    }
    catch(Exception e)
    {
      throw new CommonUtilException("[DateUtil.time] 시간포맷으로 변환하는중 에러가 발생하였습니다. "+e.toString());
    }
  }

  /** 날짜문자열을 java.sql.Date 클래스로 캐스팅
   * @param 날짜문자열     String
   * @return java.sql.Date 클래스
   */
  public static java.sql.Date convertDateType(String date) throws CommonUtilException
  {
    java.sql.Date convertedDate = null;
    SimpleDateFormat sdf = null;
    if (date == null || date.length() != 8)
    {
      throw new CommonUtilException("[DateUtil.convertDateType] 날짜문자열(" + date +")이 8자리가 아닙니다 ");
    }

    sdf = new SimpleDateFormat("yyyyMMdd");
    try
    {
      convertedDate = new java.sql.Date(sdf.parse(date).getTime());
    }
    catch(ParseException pe)
    {
      throw new CommonUtilException("[DateUtil.convertDateType] 날짜포맷으로 변환중 에러가 발생하였습니다 "+pe.toString());
    }

    return convertedDate;
  }

  /** 날짜문자열을 Calendar 클래스로 캐스팅
   * @param 날짜문자열     String
   * @return Calendar 클래스
   */
  public static Calendar convertCalendarType(String date) throws CommonUtilException
  {
    Calendar convertedDate = null;
    SimpleDateFormat sdf = null;
    if (date == null || date.length() != 8)
    {
      throw new CommonUtilException("[DateUtil.convertCalendarType] 날짜문자열(" + date +")이 8자리가 아닙니다 ");
    }

    sdf = new SimpleDateFormat("yyyyMMdd");

    try
    {
      convertedDate = Calendar.getInstance();
      convertedDate.setTime(sdf.parse(date));
    }
    catch(ParseException pe)
    {
      throw new CommonUtilException("[DateUtil.convertCalendarType] 날짜포맷으로 변환중 에러가 발생하였습니다 "+pe.toString());
    }

    return convertedDate;
  }

  /**
   * 날자 문자열에 해당 일수를 더하여 리턴한다.
   * @param String date string
   * @param int 더할 일수
   * @return String "yyyyMMdd" foramt의 날자 문자열
   */
    public static String addDays(String s, int day) throws java.text.ParseException {
        return addDays(s, day, "yyyyMMdd");
    }

  /**
   * return add day to date strings with user defined format.
   * @param String date string
   * @param int 더할 일수
   * @param format string representation of the date format. For example, "yyyy-MM-dd".
   * @return String 날짜 형식이 맞고, 존재하는 날짜일 때 일수 더하기
   *           형식이 잘못 되었거나 존재하지 않는 날짜: java.text.ParseException 발생
   */
    public static String addDays(String s, int day, String format) throws java.text.ParseException{
     java.text.SimpleDateFormat formatter =
        new java.text.SimpleDateFormat (format, java.util.Locale.KOREA);
    java.util.Date date = check(s, format);

        date.setTime(date.getTime() + ((long)day * 1000 * 60 * 60 * 24));
        return formatter.format(date);
    }
    
    
    /**
   * return add months to date strings with user defined format.
   * @param s date string
   * @param month 더할 월수
   * @param format string representation of the date format. For example, "yyyy-MM-dd".
   * @return String 지정된 format의 날자 문자열
   */
    public static String addMonths(String s, int month, String format) throws java.text.ParseException{
     java.text.SimpleDateFormat formatter =
        new java.text.SimpleDateFormat (format, java.util.Locale.KOREA);
    java.text.SimpleDateFormat format8  =
        new java.text.SimpleDateFormat ("yyyyMMdd", java.util.Locale.KOREA);

    java.util.Date date = check(s, format);

    String strYYYYMMDD = format8.format(date);
    int yr  = Integer.parseInt(strYYYYMMDD.substring(0,4));
    int mn  = Integer.parseInt(strYYYYMMDD.substring(4,6));
    int dd  = Integer.parseInt(strYYYYMMDD.substring(6,8));

    int gbn = 1;
    if(month<0) gbn = -1;
    int addedYr = (int)Math.floor(gbn*month/12)*gbn;
    int addedMn = (month - addedYr*12);
    if(addedMn<0){
      addedMn = addedMn+12;
            addedYr = addedYr-1;
        }
        
        yr = yr + addedYr;
        mn = mn + addedMn + 1; //더하고자 하는 월수의 다음 월 첫 일자를 계산하여 하루를 뺀다.
        
        if(mn>=12){
          yr = yr + 1;
          mn = mn - 12;
        }
        
        Calendar baseDate = Calendar.getInstance();
        baseDate.clear();
        baseDate.set(yr,mn-1,1); // january=>0 so, number of month - 1
        
        String calYYYYMMDD = format8.format(baseDate.getTime());
        calYYYYMMDD = addDays(calYYYYMMDD,-1);
        
        if(dd < Integer.parseInt(calYYYYMMDD.substring(6,8))){
          calYYYYMMDD = calYYYYMMDD.substring(0,6) + strYYYYMMDD.substring(6,8);
        }
        
        java.util.Date targetDate = check(calYYYYMMDD,"yyyyMMdd");
        
        return formatter.format(targetDate);
    }
    
    /**
   * return add months to date strings with user defined format.
   * @param s "yyyyMMdd" format의 날자 문자열
   * @param month 더할 월수
   * @return String "yyyyMMdd" format의 날자 문자열
   */
    public static String addMonths(String s, int month) throws java.text.ParseException{
        return addMonths(s,month,"yyyyMMdd");
    }
    
    /**
   * 인수로 주어진 일이 속한 월의 마지막 일자를 반환한다.
   * @param s  date string
   * @param format string representation of the date format. For example, "yyyy-MM-dd" or "yyyyMMdd".
   * @return String 인수로 주어진 format의 날자 문자열
   */
    public static String lastDay(String s, String format) throws java.text.ParseException{
        java.text.SimpleDateFormat formatter =
        new java.text.SimpleDateFormat (format, java.util.Locale.KOREA);
    java.text.SimpleDateFormat format8  =
        new java.text.SimpleDateFormat ("yyyyMMdd", java.util.Locale.KOREA);

    java.util.Date date = check(s, format);

    String strYYYYMMDD = format8.format(date);
        String firstDay = strYYYYMMDD.substring(0,6)+"01";
        
        java.util.Date targetDate = check(addDays(addMonths(firstDay,1),-1),"yyyyMMdd");
        return formatter.format(targetDate);
    }
    
    /**
   * 인수로 주어진 일이 속한 월의 마지막 일자를 반환한다.
   * @param s "yyyyMMdd" format의 날자 문자열
   * @return String "yyyyMMdd" format의 날자 문자열
   */
    public static String lastDay(String s) throws java.text.ParseException{
        return lastDay(s,"yyyyMMdd");
    }
    
    
    


    /**
     * 두 날짜 사이의 일수를 계산하여 반환한다.
     * @param startDay 일수 계산 시작 일자
     * @param endDay   일수 계산 끝 일자
     * @param flag     한편 계산인지 양편 계산인지 여부(1: 한편넣기, 2: 양편넣기)
     * @param format   입력 파라메터로 주는 날짜의 String format. ex) "yyyy-MM-dd" 또는 "yyyyMMdd"
     * @return int     시작 일자와 끝 일자 사이의 일수. Exception 이 발생하거나 음수일 경우에는 -1 반환     
     */
    public static int getDaysBetween (String startDay, String endDay, String format, int flag)    
    {
       int daysBetween = 0;
       try{
         java.text.SimpleDateFormat formatter =
             new java.text.SimpleDateFormat (format, java.util.Locale.KOREA);

        java.util.Date sdate = formatter.parse(startDay);
        java.util.Date edate = formatter.parse(endDay);

        daysBetween = (int)((edate.getTime()-sdate.getTime())/(1000 * 60 * 60 * 24));
              if(daysBetween < 0) {
                  daysBetween = -1;
              }
              else{
                  if(flag == 2)  daysBetween = daysBetween +1;
              }
        }
        catch(Exception e){
            daysBetween = -1;
        }

        return daysBetween;
    }

    /**
     * 두 날짜 사이의 일수를 계산하여 반환한다.
     * @param startDay 일수 계산 시작 일자(yyyyMMdd)
     * @param endDay   일수 계산 끝 일자  (yyyyMMdd)
     * @param flag     한편 계산인지 양편 계산인지 여부(1: 한편넣기, 2: 양편넣기)     
     * @return int     시작 일자와 끝 일자 사이의 일수. Exception 이 발생하거나 음수일 경우에는 -1 반환     
     */
    public static int getDaysBetween (String startDay, String endDay, int flag)    
    {
   return getDaysBetween(startDay, endDay,"yyyyMMdd",flag);
    }
    
    
  /**
   * check date string validation with the default format "yyyyMMdd".
   * @param s date string you want to check with default format "yyyyMMdd".
         * @return date java.util.Date
   */
  public static java.util.Date check(String s) throws java.text.ParseException {
    return check(s, "yyyyMMdd");
  }

  /**
   * check date string validation with an user defined format.
   * @param s date string you want to check.
   * @param format string representation of the date format. For example, "yyyy-MM-dd".
         * @return date java.util.Date
   */
  public static java.util.Date check(String s, String format) throws java.text.ParseException {
    if ( s == null )
      throw new java.text.ParseException("date string to check is null", 0);
    if ( format == null )
      throw new java.text.ParseException("format string to check date is null", 0);

    java.text.SimpleDateFormat formatter =
            new java.text.SimpleDateFormat (format, java.util.Locale.KOREA);
    java.util.Date date = null;
    try {
      date = formatter.parse(s);
    }
    catch(java.text.ParseException e) {
            /*
      throw new java.text.ParseException(
        e.getMessage() + " with format \"" + format + "\"",
        e.getErrorOffset()
      );
            */
            throw new java.text.ParseException(" wrong date:\"" + s +
            "\" with format \"" + format + "\"", 0);
    }

    if ( ! formatter.format(date).equals(s) )
      throw new java.text.ParseException(
        "Out of bound date:\"" + s + "\" with format \"" + format + "\"",
        0
      );
        return date;
  }

  /**#############################      #####################################*/

  /**
   * 입력값의 일요일, 공휴일 여부 판단..
   * @return boolean <br>true:공휴일이이 아님.<br>false:공휴일
   * @param str java.lang.String 일자(yyyymmdd)
   @ @deprecated
   */
/*         public static boolean isServiceDate(String yyyymmdd) 
        {
          int dayofweek = getDayOfWeek(yyyymmdd);
          if(dayofweek == Calendar.SUNDAY)        return false;

          CommonServices services = (CommonServices)CommonServices.getInstance();
          HolidayService hs       = (HolidayService)services.getService(HolidayService.SERVICE_NAME);

          return hs.isServiceDate(yyyymmdd);
        }*/
     /**##########################################################################*/
     
    
    /**
     * 입력값의 토요일, 일요일, 공휴일  여부 판단.
     * @return boolean <br>true:토요일, 일요일, 공휴일이이 아님.<br>false:토요일, 일요일, 공휴일
     * @param str java.lang.String 일자(yyyymmdd)
     */
/*    public static boolean isDate(String yyyymmdd) {
        
        int dayofweek = getDayOfWeek(yyyymmdd);
        if(dayofweek == Calendar.SATURDAY)      return false;
        if(dayofweek == Calendar.SUNDAY)        return false;
        CommonServices services = (CommonServices)CommonServices.getInstance();
        HolidayService hs       = (HolidayService)services.getService(HolidayService.SERVICE_NAME);
        return hs.isServiceDate(yyyymmdd);
    }*/
     
    /** Calendar.DAY_OF_WEEK를 리턴한다.
   *
   * @param String datestr 날자문자열 8자리
   * @return boolean
   */
  public static int getDayOfWeek(String datestr)
  {
    int yyyy = Integer.parseInt(datestr.substring(0, 4));
    int mm = Integer.parseInt(datestr.substring(4, 6)) - 1;
    int dd = Integer.parseInt(datestr.substring(6, 8));

    Calendar cal = Calendar.getInstance();
    cal.set(yyyy, mm, dd);

    return cal.get(Calendar.DAY_OF_WEEK);
    }

}
