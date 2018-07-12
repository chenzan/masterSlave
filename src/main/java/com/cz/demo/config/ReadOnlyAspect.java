package com.cz.demo.config;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

/**
 * @author chenzan
 * @version V1.0
 * @description TODO
 * @create-date 2018/7/11
 * @modifier
 * @modifier-data
 */
@Aspect
@Component
public class ReadOnlyAspect implements Ordered {
    @Around("@annotation(com.cz.demo.config.ReadOnly)")
    public Object proceed(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        try {
            DbContextHolder.setDbType(DbContextHolder.DbType.SLAVE);
            Object result = proceedingJoinPoint.proceed();
            return result;
        } finally {
            DbContextHolder.clearDbType();
        }
    }

    @Override
    public int getOrder() {
        return 0;
    }
}
