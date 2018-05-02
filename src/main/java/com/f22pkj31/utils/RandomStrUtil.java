package com.f22pkj31.utils;

import java.util.Random;

public class RandomStrUtil {
	/**
     * 随机产生字符串
     * 
     * @param length 字符串长度
     * 
     * @param type 类型 (0: 仅数字; 2:仅字符; 别的数字:数字和字符)
     * @return
     */
    public static String getRandomStr(int length)
    {
        String str = "";
        int beginChar = 'a';
        int endChar = 'z';
        beginChar = 'z' + 1;
        endChar = 'z' + 10;
        Random random = new Random();
        for (int i = 0; i < length; i++)
        {
            int tmp = (beginChar + random.nextInt(endChar - beginChar));
            // 大于'z'的是数字
            if (tmp > 'z')
            {
                tmp = '0' + (tmp - 'z');
            }
            str += (char) tmp;
        }
 
        return str;
    }
}
