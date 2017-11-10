package dog.dao;

import java.util.List;

import dog.vo.Dog;

public interface DogMapper {
	List<Dog> selectAllDog();
}
