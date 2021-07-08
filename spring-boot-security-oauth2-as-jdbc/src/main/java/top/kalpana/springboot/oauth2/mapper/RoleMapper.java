package top.kalpana.springboot.oauth2.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import top.kalpana.springboot.oauth2.entity.Role;

import java.util.List;

/**
 * <p>
 * 角色表 Mapper 接口
 * </p>
 *
 * @author tanxs
 * @since 2021-07-04
 */
public interface RoleMapper extends BaseMapper<Role> {
    List<Role> getRoleListByUserId(@Param("userId") Long userId);
}
