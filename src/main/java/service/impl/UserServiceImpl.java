package service.impl;

import model.User;
import repository.UserRepository;
import repository.impl.UserRepositoryImpl;
import service.UserService;

/**
 * Author: khamza@nightwell-logistics.com
 * Date: 1/8/2022
 * Time: 6:56 PM
 */
public class UserServiceImpl implements UserService {
    public static UserRepository userRepository = new UserRepositoryImpl();

    @Override
    public Long save(User user) {
        return userRepository.save(user);
    }

    @Override
    public boolean existsByChatId(Long chatId) {
        return userRepository.existsByChatId(chatId);
    }

    @Override
    public User findByChatId(Long chatId) {
        return userRepository.findByChatId(chatId);
    }

    @Override
    public void update(User user) {
        userRepository.update(user);
    }
}
