package nus.rga.main.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import nus.rga.common.utils.PageUtils;
import nus.rga.common.utils.Query;

import nus.rga.main.dao.PhysUserDao;
import nus.rga.main.entity.PhysUserEntity;
import nus.rga.main.service.PhysUserService;


@Service("physUserService")
public class PhysUserServiceImpl extends ServiceImpl<PhysUserDao, PhysUserEntity> implements PhysUserService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<PhysUserEntity> page = this.page(
                new Query<PhysUserEntity>().getPage(params),
                new QueryWrapper<PhysUserEntity>()
        );

        return new PageUtils(page);
    }

}