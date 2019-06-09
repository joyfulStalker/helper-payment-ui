package lsl.mint.common;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Desc 分页查询
 * @Author liuSongLin
 * @Date 2019/6/2 11:03
 * @Version 1.0v
 **/
@Data
@ApiModel("分页查询")
public class BaseQuery {

    @ApiModelProperty(value = "当前页", example = "1")
    private long current = 1L;

    @ApiModelProperty(value = "每页条数", example = "10")
    private long size = 10L;

    /**
     * @return com.baomidou.mybatisplus.extension.plugins.pagination.Page
     * @Author liuSongLin
     * @Description 分页
     * @Date 21:10 2019/6/9
     * @Param [baseQuery]
     **/
    public Page getPage(BaseQuery baseQuery) {
        return new Page(baseQuery.getCurrent(), baseQuery.getSize());
    }
}
