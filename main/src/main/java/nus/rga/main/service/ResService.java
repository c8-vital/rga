package nus.rga.main.service;

import com.baomidou.mybatisplus.extension.service.IService;
import nus.rga.common.utils.PageUtils;
import nus.rga.main.entity.ResEntity;

import java.util.Map;

/**
 * 
 *
 * @author cai
 * @email 347212213@qq.com
 * @date 2021-12-03 18:06:12
 */
public interface ResService extends IService<ResEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

