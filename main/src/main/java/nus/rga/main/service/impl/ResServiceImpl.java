package nus.rga.main.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import nus.rga.common.utils.PageUtils;
import nus.rga.common.utils.Query;

import nus.rga.main.dao.ResDao;
import nus.rga.main.entity.ResEntity;
import nus.rga.main.service.ResService;


@Service("resService")
public class ResServiceImpl extends ServiceImpl<ResDao, ResEntity> implements ResService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<ResEntity> page = this.page(
                new Query<ResEntity>().getPage(params),
                new QueryWrapper<ResEntity>()
        );

        return new PageUtils(page);
    }

}