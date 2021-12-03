package nus.rga.main.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import nus.rga.common.utils.PageUtils;
import nus.rga.common.utils.Query;

import nus.rga.main.dao.QuesDao;
import nus.rga.main.entity.QuesEntity;
import nus.rga.main.service.QuesService;


@Service("quesService")
public class QuesServiceImpl extends ServiceImpl<QuesDao, QuesEntity> implements QuesService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<QuesEntity> page = this.page(
                new Query<QuesEntity>().getPage(params),
                new QueryWrapper<QuesEntity>()
        );

        return new PageUtils(page);
    }

}