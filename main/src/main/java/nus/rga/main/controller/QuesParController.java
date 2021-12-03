package nus.rga.main.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import nus.rga.main.entity.QuesParEntity;
import nus.rga.main.service.QuesParService;
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
@RequestMapping("main/quespar")
public class QuesParController {
    @Autowired
    private QuesParService quesParService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("main:quespar:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = quesParService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{parId}")
    //@RequiresPermissions("main:quespar:info")
    public R info(@PathVariable("parId") Integer parId){
		QuesParEntity quesPar = quesParService.getById(parId);

        return R.ok().put("quesPar", quesPar);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("main:quespar:save")
    public R save(@RequestBody QuesParEntity quesPar){
		quesParService.save(quesPar);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("main:quespar:update")
    public R update(@RequestBody QuesParEntity quesPar){
		quesParService.updateById(quesPar);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("main:quespar:delete")
    public R delete(@RequestBody Integer[] parIds){
		quesParService.removeByIds(Arrays.asList(parIds));

        return R.ok();
    }

}
