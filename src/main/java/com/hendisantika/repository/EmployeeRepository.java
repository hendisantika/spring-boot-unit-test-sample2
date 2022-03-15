package com.hendisantika.repository;

import com.hendisantika.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-unit-test-sample2
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 16/03/22
 * Time: 06.38
 */
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
