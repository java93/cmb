package kg.mcom17.CBM.service;

public interface SecurityService {

    String findLoggedInUsername();

    void autologin(String username, String password);
}
