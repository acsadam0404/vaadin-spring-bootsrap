package hu.acsadam.vaadinbootstrap.user

import org.springframework.data.jpa.repository.JpaRepository

interface UserRepo extends JpaRepository<User, Long>{
	User findByUsername(String username)
}
