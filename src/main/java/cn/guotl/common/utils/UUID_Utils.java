package cn.guotl.common.utils;

import java.util.UUID;

/**
 * Created by guotianlin on 2018/4/3.
 */
public class UUID_Utils {

    public static String create(){
        return UUID.randomUUID().toString().replace("-", "");
    }
}
