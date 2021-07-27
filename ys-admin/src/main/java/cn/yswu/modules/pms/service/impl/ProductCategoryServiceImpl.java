package cn.yswu.modules.pms.service.impl;

import cn.yswu.pms.entity.ProductCategory;
import cn.yswu.pms.mapper.ProductCategoryMapper;
import cn.yswu.pms.service.ProductCategoryImplService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 产品分类 服务实现类
 * </p>
 *
 * @author yswu
 * @since 2021-07-27
 */
@Service
public class ProductCategoryServiceImpl extends ServiceImpl<ProductCategoryMapper, ProductCategory> implements ProductCategoryImplService {

}
