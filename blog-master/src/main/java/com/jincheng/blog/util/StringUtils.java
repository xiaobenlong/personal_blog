package com.jincheng.blog.util;


import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class StringUtils {

    public static String getQQ(String email) {

        String qq = "";
        Pattern compile = Pattern.compile("(.*?)(?=@)");
        Matcher matcher = compile.matcher(email);
        if (matcher.find()) {
            qq = matcher.group(1);
        }
        return qq;
    }

    public static void main(String[] args) {
        String url = "https://api.toubiec.cn/rand.qq?qq=1839938674";

    }

}
