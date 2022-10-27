package dashboard_back.repository;


import dashboard_back.DTO.CountType;
import dashboard_back.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TaskRepository extends JpaRepository<Task,Integer> {



   @Query(value = " select new dashboard.DTO.CountType(SELECT count(*) from Task  ")
   List<CountType> getPercentageGroupByType();

}
