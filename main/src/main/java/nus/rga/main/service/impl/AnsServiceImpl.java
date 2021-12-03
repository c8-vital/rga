package nus.rga.main.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import nus.rga.common.utils.PageUtils;
import nus.rga.common.utils.Query;

import nus.rga.main.dao.AnsDao;
import nus.rga.main.entity.AnsEntity;
import nus.rga.main.service.AnsService;


@Service("ansService")
public class AnsServiceImpl extends ServiceImpl<AnsDao, AnsEntity> implements AnsService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<AnsEntity> page = this.page(
                new Query<AnsEntity>().getPage(params),
                new QueryWrapper<AnsEntity>()
        );

        return new PageUtils(page);
    }

}