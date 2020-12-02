package hiber.dao;

import hiber.model.Car;
import hiber.model.User;

import javax.annotation.Resource;
import java.util.List;

public interface UserDao {
   void add(User user);
   List<User> listUsers();
   List<User> getUsersByCar(Car car);
}
