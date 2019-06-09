package lsl.mint.common;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @Desc 业务异常
 * @Author liuSongLin
 * @Date 2019/6/9 21:14
 * @Version 1.0v
 **/
@Data
@AllArgsConstructor
public class BizException extends RuntimeException {

    private Integer code;
    private String msg;

    public static final BizException BIZ_SYSTEM_EXCEPTION = new BizException(10011001, "系统异常");
    public static final BizException BIZ_TEST_EXCEPTION = new BizException(10011002, "测试异常");


}
