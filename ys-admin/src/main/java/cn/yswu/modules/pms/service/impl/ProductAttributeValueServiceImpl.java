package cn.yswu.modules.pms.service.impl;

import cn.yswu.pms.entity.ProductAttributeValue;
import cn.yswu.pms.mapper.ProductAttributeValueMapper;
import cn.yswu.pms.service.ProductAttributeValueImplService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 存储产品参数信息的表 服务实现类
 * </p>
 *
 * @author yswu
 * @since 2021-07-27
 */
@Service
public class ProductAttributeValueServiceImpl extends ServiceImpl<ProductAttributeValueMapper, ProductAttributeValue> implements ProductAttributeValueImplService {

}
