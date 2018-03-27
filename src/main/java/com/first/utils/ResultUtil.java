package com.first.utils;

import com.first.Result;

/**
 * Created by Hoperun on 2018/3/16.
 */
public class ResultUtil {
    public static Result success (Object obj) {
        Result r = new Result();
        r.setCode(0);
        String 成功 = "成功";
        r.setMessage(成功);
        r.setData(obj);
        test();
        return r;
    }

    private static void test() {
        System.out.println("aaaaaaaaaaaaaaaaaaaaaaa");
    }

    public static Result success () {
        return success(null);
    }

    public static Result fail (Integer code, String msg) {
        Result r = new Result();
        r.setCode(code);
        r.setMessage(msg);
        return r;
    }
}
