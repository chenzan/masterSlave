package com.cz.demo.config;

/**
 * @author chenzan
 * @version V1.0
 * @description TODO
 * @create-date 2018/7/11
 * @modifier
 * @modifier-data
 */

import java.lang.annotation.*;

/**
 * 该注解注释在service方法上，标注为链接slaves库  * Created by Jason on 2017/3/6.
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface ReadOnly {
}
