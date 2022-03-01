package net.javaguides.sms.apply.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.javaguides.sms.apply.entity.Apply;



public interface ApplyRepository extends JpaRepository<Apply, Long> {

}
