package top.kalpana.springboot.oauth2.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import top.kalpana.springboot.oauth2.entity.User;
import top.kalpana.springboot.oauth2.mapper.UserMapper;
import top.kalpana.springboot.oauth2.service.IUserService;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author tanxs
 * @since 2021-07-04
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
