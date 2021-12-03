package nus.rga.main.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import nus.rga.common.utils.PageUtils;
import nus.rga.common.utils.Query;

import nus.rga.main.dao.PhysiciansDao;
import nus.rga.main.entity.PhysiciansEntity;
import nus.rga.main.service.PhysiciansService;


@Service("physiciansService")
public class PhysiciansServiceImpl extends ServiceImpl<PhysiciansDao, PhysiciansEntity> implements PhysiciansService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<PhysiciansEntity> page = this.page(
                new Query<PhysiciansEntity>().getPage(params),
                new QueryWrapper<PhysiciansEntity>()
        );

        return new PageUtils(page);
    }

}