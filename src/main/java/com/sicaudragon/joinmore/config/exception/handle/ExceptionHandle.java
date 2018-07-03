package com.sicaudragon.joinmore.config.exception.handle;

import com.sicaudragon.joinmore.config.exception.CommonException;
import com.sicaudragon.joinmore.contants.ResultEnum;
import com.sicaudragon.joinmore.pojo.VO.ResultVO;
import com.sicaudragon.joinmore.util.web.ResultVOUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Controller的统一异常处理
 * @author BeFondOfTaro
 * Created at 23:00 2018/3/15
 */
@ControllerAdvice
@Slf4j
public class ExceptionHandle {

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public ResultVO handle(Exception e){
        //如果是我们自定义的异常
        if (e instanceof CommonException){
            CommonException commonException = (CommonException) e;
            return ResultVOUtil.error(commonException.getCode(),commonException.getMessage());
        }
        //如果不是我们自定义的异常
        else {
            log.error("【系统异常】{}",e);
            return ResultVOUtil.error(
                    ResultEnum.UNKNOWN_ERROR.getCode(),
                    e.getMessage());
        }
    }
}
