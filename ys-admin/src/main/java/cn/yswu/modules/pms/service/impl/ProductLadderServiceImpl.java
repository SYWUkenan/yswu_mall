package cn.yswu.modules.pms.service.impl;

import cn.yswu.pms.entity.ProductLadder;
import cn.yswu.pms.mapper.ProductLadderMapper;
import cn.yswu.pms.service.ProductLadderImplService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 产品阶梯价格表(只针对同商品) 服务实现类
 * </p>
 *
 * @author yswu
 * @since 2021-07-27
 */
@Service
public class ProductLadderServiceImpl extends ServiceImpl<ProductLadderMapper, ProductLadder> implements ProductLadderImplService {

}
