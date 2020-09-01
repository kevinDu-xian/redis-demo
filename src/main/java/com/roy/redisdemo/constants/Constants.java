package com.roy.redisdemo.constants;

/***
 * 系统中保存的一些常量
 */
public class Constants {
    //通用常量
    public static class Common{
        //否
        public final static Integer NOT = 0;
        //是
        public final static Integer YES = 1;
        //女
        public final static Integer SEX_WOMEN = 0;
        //男
        public final static Integer SEX_MAN = 1;
        //数据精度
        public final static Integer DECIMAL_DIGITS = 2;
    }
    //访问来源
    public static class SourceType{
        //访问来源-APP
        public final static Integer APP = 0;
        //访问来源-PC
        public final static Integer PC = 1;
    }
    //连接符
    public static class Connnector{
        //逗号
        public final static String COMMA_ = ",";
        //下划线
        public final static String UNDERLINE = "_";
        //冒号
        public final static String COLON=":";
    }
    //时长
    public static class Duration{
        //一秒
        public final static Integer SECOND_INT = 1;
        //一分钟
        public final static Integer MINUTE_INT = SECOND_INT * 60;
        //半小时
        public final static Integer HALF_HOUR_INT = MINUTE_INT * 30;
    }
    //正则的一些常量
    public static class RegConstant{
        //手机号正则
        public static String PHONE_REGSTR = "^[1][0-9]{10}$";
        //密码正则
        public static String PASSWORD_REGSTR = "^([A-Z]|[a-z]|[0-9]|[_]){6,10}$";
    }
    //SMS相关常量
    public static class Sms{
        public static class CodeType{
            public static Integer LOGIN_OR_REGISTER=0;
            public static Integer PASS_UPDATE=1;
            public static Integer ORDER_NOTICE=2;
        }
    }
    //RedisKey相关的常量
    public static class RedisKey{
        public static String PROJECT_PRIFIX="roypro";
        public static String SMS_PRIFIX="sms";
        public static String TOKEN_PRIFIX="token";
    }

}
