package com.first.Handle;

import com.first.Result;
import com.first.exception.GirlException;
import com.first.utils.ResultUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Hoperun on 2018/3/16.
 */
@ControllerAdvice
public class ExceptionHandle {
    private final static Logger logger = LoggerFactory.getLogger(ExceptionHandle.class);

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Result handle(Exception e){
        if (e instanceof GirlException) {
            GirlException girlException = (GirlException) e;
            return ResultUtil.fail(girlException.getCode(),girlException.getMessage());
        }
        logger.error("【系统异常】{}", e);
        return ResultUtil.fail(-1,"未知错误");
    }
}
