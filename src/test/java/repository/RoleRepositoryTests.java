package repository;

import com.example.shopme.ShopmeApplication;
import com.example.shopme.entity.Role;
import com.example.shopme.repository.RoleRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = ShopmeApplication.class)
@AutoConfigureMockMvc
class RoleRepositoryTests {

	@Autowired
	private RoleRepository repo;

	@Test
	void testCreateFirstRole(){
		Role roleAdmin = new Role("role", "manage everything");
		Role savedRole = repo.save(roleAdmin);

		Assertions.assertTrue(savedRole.getId() > 0);
	}
}
