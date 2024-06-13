package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.CourseEvaluation;



@Repository
public interface CourseEvaluationRepository extends JpaRepository<CourseEvaluation, Integer>{

}
