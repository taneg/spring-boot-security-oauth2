package top.kalpana.springboot.oauth2.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import top.kalpana.springboot.oauth2.entity.Permission;

import java.util.List;

/**
 * <p>
 * 权限表 Mapper 接口
 * </p>
 *
 * @author tanxs
 * @since 2021-07-04
 */
public interface PermissionMapper extends BaseMapper<Permission> {
    List<Permission> getPermissionListByUserId(@Param("userId") Long userId);
}
