package lsl.mint.common;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @Author liuSongLin
 * @Description 分页统一格式
 * @Date 21:37 2019/6/9
 * @Param
 * @return
 **/
@Data
@AllArgsConstructor
public class ResponsePage extends BaseResponse {

    private Long total;

    private Object data;

}
