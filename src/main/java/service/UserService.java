package service;

import model.User;

/**
 * Author: khamza@nightwell-logistics.com
 * Date: 1/8/2022
 * Time: 6:56 PM
 */
public interface UserService {
    Long save(User user);

    boolean existsByChatId(Long chatId);

    User findByChatId(Long chatId);

    void update(User user);
}
