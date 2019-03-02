package com.starfall.ssm.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;

/**
 * 
 * @author StarFall
 *
 */
public class RandomUtil {

	private final static String EN_LOW = "abcdefghijklmnopqrstuvwxyz";
	private final static String EN_UP = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private final static String NUM = "0123456789";

	/**
	 * 生成指定长度的小写字母字符串
	 * 
	 * @param length
	 * @return
	 */
	public static String getRandomStringEnLow(int length) {
		return RandomStringUtils.random(length, EN_LOW);
	}

	/**
	 * 生成指定长度的大写字母字符串
	 * 
	 * @param length
	 * @return
	 */
	public static String getRandomStringEnUp(int length) {
		return RandomStringUtils.random(length, EN_UP);
	}

	/**
	 * 生成指定长度的字母字符串
	 * 
	 * @param length
	 * @return
	 */
	public static String getRandomStringEnUpAndLow(int length) {
		return RandomStringUtils.random(length, EN_LOW + EN_UP);
	}

	/**
	 * 生成指定长度的数字字符串
	 * 
	 * @param length
	 * @return
	 */
	public static String getRandomStringNum(int length) {
		return RandomStringUtils.random(length, NUM);
	}

	/**
	 * 生成一定范围内的随机整数
	 * 
	 * @param max
	 * @param min
	 * @return
	 */
	public static int getRandomNumRange(int min, int max) {
		Random random = new Random();
		return random.nextInt(max - min + 1) + min;
	}

	/**
	 * 根据指定的日期格式获取范围内的日期字符串
	 * 
	 * @param beginDate
	 *            开始日期
	 * @param endDate
	 *            结束日期
	 * @param pattern
	 *            日期格式
	 * @return
	 */
	public static String getRandomDateRange(String beginDate, String endDate, String pattern) {
		try {
			SimpleDateFormat format = new SimpleDateFormat(pattern);
			Date start = format.parse(beginDate);// 构造开始日期
			Date end = format.parse(endDate);// 构造结束日期
			if (start.getTime() >= end.getTime()) {
				return null;
			}
			long date = random(start.getTime(), end.getTime());
			return new SimpleDateFormat(pattern).format(new Date(date));
		} catch (Exception e) {
			return null;
		}
	}

	private static long random(long begin, long end) {
		long rtn = begin + (long) (Math.random() * (end - begin));
		// 如果返回的是开始时间和结束时间,则递归调用本函数查找随机值
		if (rtn == begin || rtn == end) {
			return random(begin, end);
		}
		return rtn;
	}

	/**
	 * 随机获取集合中的元素：示例
	 * 
	 * @param list
	 * @return
	 */
	public static Object getRandomItemList(List<Object> list) {
		int index = getRandomNumRange(0, list.size() - 1);
		return list.get(index);
	}
}
