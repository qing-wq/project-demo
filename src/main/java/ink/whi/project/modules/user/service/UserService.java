package ink.whi.project.modules.user.service;

import ink.whi.project.common.vo.dto.BaseUserDTO;

/**
 * @author: qing
 * @Date: 2023/4/26
 */
public interface UserService {
    BaseUserDTO queryBasicUserInfo(Long userId);

    BaseUserDTO passwordLogin(String username, String password);
}
