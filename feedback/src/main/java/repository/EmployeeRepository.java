package repository;

import model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    //EmployeeRepository extends from JpaRepository and it accepts two arigmetns entity adn type of
    //primary key

}
