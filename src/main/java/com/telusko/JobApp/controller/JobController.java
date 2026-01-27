package com.telusko.JobApp.controller;

import com.telusko.JobApp.model.JobPost;
import com.telusko.JobApp.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class JobController {

    @Autowired
    private JobService service;


//    @GetMapping({"/", "home"})
//    public String home() {
//        return "home";
//    }
//
//
//    @GetMapping("addjob")
//    public String addJob() {
//        return "addjob";
//    }
//
//
//    @PostMapping("handleForm")
//    public String handleForm(JobPost jobPost) {
//        service.addJob(jobPost);
//        return "success";
//
//    }

    @GetMapping("jobPosts")
    public List<JobPost> getAllJobs() {
        return service.getAllJobs();
    }
    @GetMapping("jobPost/{postId}")
    public JobPost getJob(@PathVariable("postId") int postId) {
        return service.getJob(postId);
    }

}
