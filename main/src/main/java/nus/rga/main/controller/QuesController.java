package nus.rga.main.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import nus.rga.main.entity.QuesEntity;
import nus.rga.main.service.QuesService;
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
@RequestMapping("main/ques")
public class QuesController {
    @Autowired
    private QuesService quesService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("main:ques:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = quesService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{quesId}")
    //@RequiresPermissions("main:ques:info")
    public R info(@PathVariable("quesId") Integer quesId){
		QuesEntity ques = quesService.getById(quesId);

        return R.ok().put("ques", ques);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("main:ques:save")
    public R save(@RequestBody QuesEntity ques){
		quesService.save(ques);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("main:ques:update")
    public R update(@RequestBody QuesEntity ques){
		quesService.updateById(ques);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("main:ques:delete")
    public R delete(@RequestBody Integer[] quesIds){
		quesService.removeByIds(Arrays.asList(quesIds));

        return R.ok();
    }

}
