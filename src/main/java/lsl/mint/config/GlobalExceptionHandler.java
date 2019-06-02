package lsl.mint.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.io.StringWriter;

/**
 * @Desc 全局异常处理
 * @Author liuSongLin
 * @Date 2019/6/2 11:33
 * @Version 1.0v
 **/
@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {


    /**
     * @return java.lang.String
     * @Author liuSongLin
     * @Description 全局异常
     * @Date 11:37 2019/6/2
     * @Param [response, ex]
     **/
    @ExceptionHandler(Exception.class)
    public String baseExceptionHandler(HttpServletResponse response, Exception ex) {
        log.info(getErrorMsg(ex));
        return ex.getMessage();
    }

    /**
     * @return java.lang.String
     * @Author liuSongLin
     * @Description 从异常中获取异常详细信息的字符串
     * @Date 11:37 2019/6/2
     * @Param [e]
     **/
    private String getErrorMsg(Exception e) {
        StringWriter sw = new StringWriter();
        e.printStackTrace(new PrintWriter(sw, false));
        return sw.toString();
    }
}