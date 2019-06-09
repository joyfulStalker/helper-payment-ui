package lsl.mint.common;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @Author liuSongLin
 * @Description 统一返回值
 * @Date 21:29 2019/6/9
 * @Param
 * @return
 **/
@Data
@AllArgsConstructor
public class ResponseBean<T> extends BaseResponse {
    private T data;
}
