package com.work.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
/**
 * <pre>
 *  공통으로 사용하기 위한 유틸 클래스 - Utility
 *  
 * 	getCurrentDate() : 기본 4자리 숫자형식의 문자열을 반환하는 메서드
 *	getSecureCode(length) : 전달받은 길이의 임의의 보안문자 반환
 *	getCurrentDate() : 현재 날짜를 입력받은 pattern 형식으로 반환 
 *	getCurrentDate(pattern) : 현재 날짜를 입력받은 pattern 형식으로 반환
 *  getCurrentHour() : 현재 시각의 시간만 반환
 *
 * @since 2015-11-02
 * @author 이동규
 * @version 1.0
 * </pre>
 * 
 */

public class Utility {
   
   /**
    * 기본 4자리 숫자형식의 문자열을 반환하는 메서드
    * @see java.lang.Math#random()
    * @see java.util.Random#nextInt()
    * @see java.lang.System.currentTimeMillis()
    * @see java.lang.StringBuilder
    * 
    * @return String : 4자리 숫자형식의 문자열
    */
   public static String getSecureCode() {
      return getSecureCode(4);
   }
   
   /** 
    * 전달받은 길이의 임의의 보안문자 반환
    * @param length
    * @return String : 전달받은 length 길이의 임의의 보안문자
    */
   public static String getSecureCode(int length) {
      Random random = new Random((long)(System.currentTimeMillis()*Math.random()));
      StringBuilder code = new StringBuilder();
      for(int i = 0; i < 4; i++){
         code.append(random.nextInt(10));
      }
      return code.toString();
   }
   
   /**
    * 현재 날짜를 년도4자리/월2자리/일2자리 형식으로 반환
    * @see java.util.Date
    * @see java.text.SimpleDateFormat#format(java.util.Date)
    * @return String : yyyy/MM/dd 형식의 현재 날짜
    */
   public static String getCurrentDate() {
      return getCurrentDate("yyyy/MM/dd");
   }
   
   /**
    * 현재 날짜를 입력받은 pattern 형식으로 반환
    * @param pattern
    * @return String : 입력받은 pattern 형식의 현재 날짜
    */
   public static String getCurrentDate(String pattern) {
      Date date = new Date();
      SimpleDateFormat sdf  = new SimpleDateFormat(pattern);
      return sdf.format(date);
   }
   
	
	/**
	 * 현재 시간의 시간만 반환
	 * @return : int : 현재 시각의 시간
	 */
	public static int getCurrentHour(){
		long time = System.currentTimeMillis();
		SimpleDateFormat dayTime = new SimpleDateFormat("H");
		
		return Integer.parseInt(dayTime.format(new Date(time)));
	}
}