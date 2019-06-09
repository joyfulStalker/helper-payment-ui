package lsl.mint.common;

import lombok.Data;

/**
 * @Author liuSongLin
 * @Description 统一返回格式
 * @Date 21:38 2019/6/9
 * @Param
 * @return
 **/
@Data
public class BaseResponse {

    public BaseResponse() {

    }

    public BaseResponse(Integer resultCode, String errMsg) {
        this.resultCode = resultCode;
        this.errMsg = errMsg;
    }

    protected Integer resultCode;

    protected String errMsg;

    protected long takesMilliseconds;

}
