package com.example.demo.ChandraRepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.ChandraModel.ChandraStudent;
@Repository
public interface ChandraStudentRepository extends JpaRepository<ChandraStudent,Integer>{
  
    @Query(value="select s.* from student s inner join student_detail st on s.id=st.student_id",nativeQuery = true)
    List<ChandraStudent>getStudentInner();

    @Query(value="select s.* from student s left outer join student_detail st on s.id=st.student_id",nativeQuery = true)
    List<ChandraStudent> getStudentsLeftOuter();

    

    
}
