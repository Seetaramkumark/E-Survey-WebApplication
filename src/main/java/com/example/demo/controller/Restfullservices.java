package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entity.CourseEvaluation;
import com.example.demo.entity.CustomerSatisfaction;
import com.example.demo.entity.EmplyeeEngagement;
import com.example.demo.entity.HealthCare;
import com.example.demo.entity.Login;
import com.example.demo.entity.MarketResearch;
import com.example.demo.entity.PoliticalSurvey;
import com.example.demo.entity.UserLogin;
import com.example.demo.model.usermanager;
import com.example.demo.repository.CourseEvaluationRepository;
import com.example.demo.repository.CustomerSatisfactionRepository;
import com.example.demo.repository.EmplyeeEngagementRepository;
import com.example.demo.repository.HealthCareRepository;
import com.example.demo.repository.LoginRepository;
import com.example.demo.repository.MarketResearchRepository;
import com.example.demo.repository.PoliticalSurveyRepository;

import ch.qos.logback.core.model.Model;
import jakarta.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("api")
public class Restfullservices {
	
	
	@Autowired
	usermanager um;
	
	@Autowired
	CustomerSatisfactionRepository customerSatisfactionRepository;
	
	@Autowired
	EmplyeeEngagementRepository emplyeeEngagementRepository;
	
	@Autowired
	CourseEvaluationRepository courseEvaluationRepository;
	
	@Autowired
	LoginRepository loginRepository;
	
	@Autowired
	HealthCareRepository healthCareRepository;
	
	@Autowired
	PoliticalSurveyRepository politicalSurveyRepository;
	
	@Autowired
	MarketResearchRepository marketResearchRepository;
	
	@PostMapping("/register")
	public String register(@RequestBody UserLogin u) {
		String p = um.register(u);
		if(p==null)
			return "succefull";
		else
			return p;
		
	}
	@GetMapping("/cst")
	public String demo()
	{
		
		return "blog-details";
	}

	
	@PostMapping("/insertLogin")
	public ModelAndView insertLogin(HttpServletRequest request)
	{
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		Login lo = new Login();
		lo.setUsername(username);
		lo.setPassword(password);
		System.out.println(lo);
		loginRepository.save(lo);
		ModelAndView lo1 = new ModelAndView();
		lo1.setViewName("redirect:/index.html");
		return lo1;
		
	}
	
	@PostMapping("/insertCustomerSatisfaction")
	public ModelAndView insertCustomerSatisfaction(HttpServletRequest request)
	{
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String satisfaction = request.getParameter("satisfaction");
		String comment = request.getParameter("comment");
		CustomerSatisfaction cs = new CustomerSatisfaction();
		cs.setName(name);
		cs.setEmail(email);
		cs.setSatisfaction(satisfaction);
		cs.setComment(comment);
		System.out.println(cs);
		customerSatisfactionRepository.save(cs);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("redirect:/services-details.html");
		return mv;
		
	}
	@PostMapping("/insertEmplyeeEngagement")
	public ModelAndView insertEmployeeEngagement(HttpServletRequest request)
	{
		String name = request.getParameter("name");
		String department = request.getParameter("department");
		String role = request.getParameter("role");
		String oppurtunity = request.getParameter("oppurtunity");
		String feedback = request.getParameter("feedback");
		String worklife = request.getParameter("worklife");
		String motivation = request.getParameter("motivation");
		String satisfied = request.getParameter("satisfied");
		String recognized = request.getParameter("recognized");
		String comfortable = request.getParameter("comfortable");
		String resourses = request.getParameter("resourses");
		String overalljob = request.getParameter("overalljob");
		System.out.println(department);
		EmplyeeEngagement ee = new EmplyeeEngagement();
		ee.setName(name);
		ee.setDepartment(department);
		ee.setRole(role);
		ee.setOpportunity(oppurtunity);
		ee.setFeedback(feedback);
		ee.setWorklife(worklife);
		ee.setMotivation(motivation);
		ee.setSatisfied(satisfied);
		ee.setRecognized(recognized);
		ee.setComfortable(comfortable);
		ee.setResourses(resourses);
		ee.setOveralljob(overalljob);
		System.out.println(ee);
		emplyeeEngagementRepository.save(ee);
		ModelAndView ee1 = new ModelAndView();
		ee1.setViewName("redirect:/emplyee survey.html");
		return ee1;
		
	}
	@PostMapping("/insertCourseEvaluation")
	public ModelAndView insertCourseEvaluation(HttpServletRequest request)
	{
		String name = request.getParameter("name");
		String course = request.getParameter("course");
		String instructor = request.getParameter("instructor");
		String coursecontent = request.getParameter("coursecontent");
		String effective = request.getParameter("effective");
		String expectations = request.getParameter("expectations");
		String material = request.getParameter("material");
		String assignments = request.getParameter("assignments");
		String challenging = request.getParameter("challenging");
		String recommend = request.getParameter("recommend");
		String discussion = request.getParameter("discussion");
		String enhance = request.getParameter("enhance");
		String comments = request.getParameter("comments");
		System.out.println(course);
		CourseEvaluation ce = new CourseEvaluation();
		ce.setName(name);
		ce.setCourse(course);
		ce.setInstructor(instructor);
		ce.setCoursecontent(coursecontent);
		ce.setEffective(effective);
		ce.setExpectations(expectations);
		ce.setMaterial(material);
		ce.setAssignments(assignments);
		ce.setChallenging(challenging);
		ce.setRecommend(recommend);
		ce.setDiscussion(discussion);
		ce.setEnhance(enhance);
		ce.setComments(comments);
		System.out.println(ce);
		courseEvaluationRepository.save(ce);
		ModelAndView ce1 = new ModelAndView();
		ce1.setViewName("redirect:/course survey.html");
		return ce1;	
	}
	
	
	@PostMapping("/insertHealthCare")
	public ModelAndView insertHealthCare(HttpServletRequest request, Object respect)
	{

		String name = request.getParameter("name");
		String age = request.getParameter("age");
		String gender = request.getParameter("gender");
		String experience = request.getParameter("experience");
		String respect1 = request.getParameter("respect1");
		String provider = request.getParameter("provider");
		String clear = request.getParameter("clear");
		String satisfied = request.getParameter("satisfied");
		String difficulty = request.getParameter("difficulty");
		String recommend = request.getParameter("recommend");
		String involved = request.getParameter("involved");
		String comments = request.getParameter("comments");
		String improve = request.getParameter("improve");
		HealthCare hc = new HealthCare();
		hc.setName(name);
		hc.setAge(age);
		hc.setGender(gender);
		hc.setExperience(experience);
		hc.setRespect(respect1);
		hc.setProvider(provider);
		hc.setClear(clear);
		hc.setSatisfied(satisfied);
		hc.setDifficulty(difficulty);
		hc.setRecommend(recommend);
		hc.setInvolved(involved);
		hc.setComments(comments);
		hc.setImprove(improve);
		System.out.println(hc);
		healthCareRepository.save(hc);
		ModelAndView hc1 = new ModelAndView();
		hc1.setViewName("redirect:/patient survey.html");
		return hc1;
		
	}
	
	@PostMapping("/insertPoliticalSurvey")
	public ModelAndView insertPoliticalSurvey(HttpServletRequest request, Object respect)
	{
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		String gender = request.getParameter("gender");
		String vote = request.getParameter("vote");
		String news = request.getParameter("news");
		String party = request.getParameter("party");
		String satisfied = request.getParameter("satisfied");
		String believe = request.getParameter("believe");
		String social = request.getParameter("social");
		String info = request.getParameter("info");
		String active = request.getParameter("active");
		String changes = request.getParameter("changes");
		String suggestions = request.getParameter("suggestions");
		PoliticalSurvey ps = new PoliticalSurvey();
		ps.setName(name);
		ps.setAge(age);
		ps.setGender(gender);
		ps.setVote(vote);
		ps.setNews(news);
		ps.setParty(party);
		ps.setSatisfied(satisfied);
		ps.setBelieve(believe);
		ps.setSocial(social);
		ps.setInfo(info);
		ps.setActive(active);
		ps.setChanges(changes);
		ps.setSuggestions(suggestions);
		System.out.println(ps);
		politicalSurveyRepository.save(ps);
		ModelAndView ps1 = new ModelAndView();
		ps1.setViewName("redirect:/social survey.html");
		return ps1;
		
	}
	@PostMapping("/insertMarketResearch")
	public ModelAndView insertMarketResearch(HttpServletRequest request, Object respect)
	{
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		String gender = request.getParameter("gender");
		String q1 = request.getParameter("q1");
		String q2 = request.getParameter("q2");
		String q3 = request.getParameter("q3");
		String q4 = request.getParameter("q4");
		String q5 = request.getParameter("q5");
		String q6 = request.getParameter("q6");
		String q7 = request.getParameter("q7");
		String q8 = request.getParameter("q8");
		String q9 = request.getParameter("q9");
		String q10 = request.getParameter("q10");
		MarketResearch mr = new MarketResearch();
		mr.setName(name);
		mr.setAge(age);
		mr.setGender(gender);
		mr.setQ1(q1);
		mr.setQ2(q2);
		mr.setQ3(q3);
		mr.setQ4(q4);
		mr.setQ5(q5);
		mr.setQ6(q6);
		mr.setQ7(q7);
		mr.setQ8(q8);
		mr.setQ9(q9);
		mr.setQ10(q10);
		System.out.println(mr);
		marketResearchRepository.save(mr);
		ModelAndView mr1 = new ModelAndView();
		mr1.setViewName("redirect:/market survey.html");
		return mr1;
		
	}

}
