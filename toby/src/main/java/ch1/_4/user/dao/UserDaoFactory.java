package ch1._4.user.dao;

public class UserDaoFactory {
    public UserDao userDao() {
        UserDao dao = new UserDao(connectionMaker());
        return dao;
    }

    public ConnectionMaker connectionMaker() {
        ConnectionMaker connectionMaker = new DConnectionMaker();
        return connectionMaker;
    }
}
