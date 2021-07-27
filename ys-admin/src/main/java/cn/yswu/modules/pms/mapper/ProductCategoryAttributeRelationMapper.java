package cn.yswu.modules.pms.mapper;

import cn.yswu.pms.entity.ProductCategoryAttributeRelation;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 * 产品的分类和属性的关系表，用于设置分类筛选条件（只支持一级分类） Mapper 接口
 * </p>
 *
 * @author yswu
 * @since 2021-07-27
 */
public interface ProductCategoryAttributeRelationMapper extends BaseMapper<ProductCategoryAttributeRelation> {

}
