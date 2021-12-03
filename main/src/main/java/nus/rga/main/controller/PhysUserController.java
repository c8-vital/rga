package nus.rga.main.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import nus.rga.main.entity.PhysUserEntity;
import nus.rga.main.service.PhysUserService;
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
@RequestMapping("main/physuser")
public class PhysUserController {
    @Autowired
    private PhysUserService physUserService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("main:physuser:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = physUserService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{physId}")
    //@RequiresPermissions("main:physuser:info")
    public R info(@PathVariable("physId") Long physId){
		PhysUserEntity physUser = physUserService.getById(physId);

        return R.ok().put("physUser", physUser);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("main:physuser:save")
    public R save(@RequestBody PhysUserEntity physUser){
		physUserService.save(physUser);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("main:physuser:update")
    public R update(@RequestBody PhysUserEntity physUser){
		physUserService.updateById(physUser);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("main:physuser:delete")
    public R delete(@RequestBody Long[] physIds){
		physUserService.removeByIds(Arrays.asList(physIds));

        return R.ok();
    }

}
