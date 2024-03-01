package com.example.SpringDataJPA;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String>
{
	//User findByMailID(String mailID);
}
