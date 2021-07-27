package cn.yswu.modules.pms.service.impl;

import cn.yswu.pms.entity.Product;
import cn.yswu.pms.mapper.ProductMapper;
import cn.yswu.pms.service.ProductImplService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品信息 服务实现类
 * </p>
 *
 * @author yswu
 * @since 2021-07-27
 */
@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements ProductImplService {

}
