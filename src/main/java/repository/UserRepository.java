package repository;

import model.User;

/**
 * Author: khamza@nightwell-logistics.com
 * Date: 1/8/2022
 * Time: 6:49 PM
 */
public interface UserRepository {
    boolean existsByChatId(Long chatId);

    Long save(User user);

    User findByChatId(Long chatId);

    void update(User user);
}
