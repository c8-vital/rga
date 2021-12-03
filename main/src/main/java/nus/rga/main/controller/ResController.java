package nus.rga.main.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import nus.rga.main.entity.ResEntity;
import nus.rga.main.service.ResService;
import nus.rga.common.utils.PageUtils;
import nus.rga.common.utils.R;



/**
 * 
 *
 * @author cai
 * @email 347212213@qq.com
 * @date 2021-12-03 18:06:12
 */
@RestController
@RequestMapping("main/res")
public class ResController {
    @Autowired
    private ResService resService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("main:res:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = resService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{resId}")
    //@RequiresPermissions("main:res:info")
    public R info(@PathVariable("resId") Integer resId){
		ResEntity res = resService.getById(resId);

        return R.ok().put("res", res);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("main:res:save")
    public R save(@RequestBody ResEntity res){
		resService.save(res);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("main:res:update")
    public R update(@RequestBody ResEntity res){
		resService.updateById(res);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("main:res:delete")
    public R delete(@RequestBody Integer[] resIds){
		resService.removeByIds(Arrays.asList(resIds));

        return R.ok();
    }

}
