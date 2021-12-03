package nus.rga.main.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import nus.rga.main.entity.PhysiciansEntity;
import nus.rga.main.service.PhysiciansService;
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
@RequestMapping("main/physicians")
public class PhysiciansController {
    @Autowired
    private PhysiciansService physiciansService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("main:physicians:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = physiciansService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{phyId}")
    //@RequiresPermissions("main:physicians:info")
    public R info(@PathVariable("phyId") Long phyId){
		PhysiciansEntity physicians = physiciansService.getById(phyId);

        return R.ok().put("physicians", physicians);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("main:physicians:save")
    public R save(@RequestBody PhysiciansEntity physicians){
		physiciansService.save(physicians);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("main:physicians:update")
    public R update(@RequestBody PhysiciansEntity physicians){
		physiciansService.updateById(physicians);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("main:physicians:delete")
    public R delete(@RequestBody Long[] phyIds){
		physiciansService.removeByIds(Arrays.asList(phyIds));

        return R.ok();
    }

}
