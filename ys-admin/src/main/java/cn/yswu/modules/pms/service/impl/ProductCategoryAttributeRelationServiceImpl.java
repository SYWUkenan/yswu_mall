package cn.yswu.modules.pms.service.impl;

import cn.yswu.pms.entity.ProductCategoryAttributeRelation;
import cn.yswu.pms.mapper.ProductCategoryAttributeRelationMapper;
import cn.yswu.pms.service.ProductCategoryAttributeRelationImplService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 产品的分类和属性的关系表，用于设置分类筛选条件（只支持一级分类） 服务实现类
 * </p>
 *
 * @author yswu
 * @since 2021-07-27
 */
@Service
public class ProductCategoryAttributeRelationServiceImpl extends ServiceImpl<ProductCategoryAttributeRelationMapper, ProductCategoryAttributeRelation> implements ProductCategoryAttributeRelationImplService {

}
