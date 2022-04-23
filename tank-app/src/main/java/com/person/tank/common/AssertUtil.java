package com.person.tank.common;

/**
 * @author crowOnThePlane
 * @version 1.0
 * @date 2022/4/23 14:57
 */
public class AssertUtil {
    public static void notNull(Object obj){
        if(obj==null){
            throw new NullPointerException();
        }
    }
}
