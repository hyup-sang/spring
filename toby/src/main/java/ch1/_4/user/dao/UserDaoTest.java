package ch1._4.user.dao;

import ch1._4.user.domain.User;

import java.sql.SQLException;

public class UserDaoTest {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // Factory를 사용하여 Dao를 생성함
        // Factory에 의해 수동적으로 생성되었으므로 IoC가 적용 되었다고 볼 수 있음
        UserDao dao = new UserDaoFactory().userDao();

        User user = new User();
        user.setId("id");
        user.setName("hong");
        user.setPassword("qlalfqjsgh");

        dao.add(user);

        System.out.println(user.getId() + " 등록 성공");

        User user2 = dao.get(user.getId());
        System.out.println(user2.getName());
        System.out.println(user2.getPassword());

        System.out.println(user2.getId() + " 조회 성공");
    }
}
