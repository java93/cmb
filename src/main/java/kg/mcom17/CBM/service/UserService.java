package kg.mcom17.CBM.service;

import kg.mcom17.CBM.entity.User;

public interface UserService {
    void save(User user);

User findByUsername(String username);
}
