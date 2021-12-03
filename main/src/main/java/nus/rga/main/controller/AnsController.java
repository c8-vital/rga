package nus.rga.main.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import nus.rga.main.entity.AnsEntity;
import nus.rga.main.service.AnsService;
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
@RequestMapping("main/ans")
public class AnsController {
    @Autowired
    private AnsService ansService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("main:ans:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = ansService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{ansId}")
    //@RequiresPermissions("main:ans:info")
    public R info(@PathVariable("ansId") Integer ansId){
		AnsEntity ans = ansService.getById(ansId);

        return R.ok().put("ans", ans);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("main:ans:save")
    public R save(@RequestBody AnsEntity ans){
		ansService.save(ans);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("main:ans:update")
    public R update(@RequestBody AnsEntity ans){
		ansService.updateById(ans);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("main:ans:delete")
    public R delete(@RequestBody Integer[] ansIds){
		ansService.removeByIds(Arrays.asList(ansIds));

        return R.ok();
    }

}
