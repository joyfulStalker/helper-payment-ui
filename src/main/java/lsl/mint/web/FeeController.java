package lsl.mint.web;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lsl.mint.common.BaseQuery;
import lsl.mint.common.BizException;
import lsl.mint.common.ResponseBean;
import lsl.mint.entity.Fee;
import lsl.mint.service.IFeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 * 费用项  前端控制器
 * </p>
 *
 * @author liuSongLin
 * @since 2019-05-29
 */
@RestController
@RequestMapping("/fee")
@Api(tags = {"费用API"})
public class FeeController {

    @Autowired
    private IFeeService feeService;

    @GetMapping("/{id}")
    @ApiOperation(value = "根据用户编号获取用户姓名", notes = "test: 仅1和2有正确返回", response = Fee.class)
    public ResponseBean<Fee> getFee(@PathVariable("id") @ApiParam(name = "id", value = "主键id", defaultValue = "1", required = true) Long id) {
        return new ResponseBean<>(feeService.getById(id));
    }


    @PostMapping("/list")
    @ApiOperation(value = "分页查询", notes = "当前页 和条数", response = Fee.class)
    public Fee getFee(@RequestBody BaseQuery query) {
        int i = 1 / 0;
        throw BizException.BIZ_TEST_EXCEPTION;
    }
    
}
