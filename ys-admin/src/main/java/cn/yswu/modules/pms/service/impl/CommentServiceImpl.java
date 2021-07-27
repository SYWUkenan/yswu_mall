package cn.yswu.modules.pms.service.impl;

import cn.yswu.pms.entity.Comment;
import cn.yswu.pms.mapper.CommentMapper;
import cn.yswu.pms.service.CommentImplService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品评价表 服务实现类
 * </p>
 *
 * @author yswu
 * @since 2021-07-27
 */
@Service
public class CommentServiceImpl extends ServiceImpl<CommentMapper, Comment> implements CommentImplService {

}
