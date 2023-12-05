package ink.whi.project.modules.user.converter;

import ink.whi.project.modules.user.repo.entity.UserDO;
import ink.whi.project.common.vo.dto.BaseUserDTO;
import org.springframework.beans.BeanUtils;

/**
 * 实体转换
 * @author: qing
 * @Date: 2023/4/26
 */
public class UserConverter {

    public static BaseUserDTO toDTO(UserDO user) {
        if (user == null) {
            return null;
        }

        BaseUserDTO dto = new BaseUserDTO();
        BeanUtils.copyProperties(user, user);
        return dto;
    }
}
