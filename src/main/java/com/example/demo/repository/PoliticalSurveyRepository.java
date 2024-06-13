package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.entity.PoliticalSurvey;

@Repository
public interface PoliticalSurveyRepository extends JpaRepository<PoliticalSurvey, Integer>{

	
}
