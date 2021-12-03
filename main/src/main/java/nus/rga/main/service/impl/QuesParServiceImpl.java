package nus.rga.main.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import nus.rga.common.utils.PageUtils;
import nus.rga.common.utils.Query;

import nus.rga.main.dao.QuesParDao;
import nus.rga.main.entity.QuesParEntity;
import nus.rga.main.service.QuesParService;


@Service("quesParService")
public class QuesParServiceImpl extends ServiceImpl<QuesParDao, QuesParEntity> implements QuesParService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<QuesParEntity> page = this.page(
                new Query<QuesParEntity>().getPage(params),
                new QueryWrapper<QuesParEntity>()
        );

        return new PageUtils(page);
    }

}