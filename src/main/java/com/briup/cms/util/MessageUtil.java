package com.briup.cms.util;

import java.util.Date;

public class MessageUtil {
    /**
     * 成功并返回数据实体类
     */

    public static <E> Message<E> success(E o){
        return new Message<>("success",200,o,new Date().getTime());
    }

    public static <E> Message<E> success(){
        return new Message<>("success",200,null,new Date().getTime());
    }


    public static <E> Message<E> error(Integer code, String msg){
        return new Message<>(msg,code,null,new Date().getTime());
    }
}
