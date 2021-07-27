package cn.yswu.modules.pms.service.impl;

import cn.yswu.pms.entity.ProductFullReduction;
import cn.yswu.pms.mapper.ProductFullReductionMapper;
import cn.yswu.pms.service.ProductFullReductionImplService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 产品满减表(只针对同商品) 服务实现类
 * </p>
 *
 * @author yswu
 * @since 2021-07-27
 */
@Service
public class ProductFullReductionServiceImpl extends ServiceImpl<ProductFullReductionMapper, ProductFullReduction> implements ProductFullReductionImplService {

}
