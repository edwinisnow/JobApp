package com.telusko.JobApp.service;

import com.telusko.JobApp.model.JobPost;
import com.telusko.JobApp.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {
    @Autowired
    public JobRepo repo;


    // method to add a jobPost
    public JobPost addJob(JobPost jobPost) {
        return repo.addJob(jobPost);

    }


    //method to return all JobPosts
    public List<JobPost> getAllJobs() {
        return repo.getAllJobs();

    }


    public JobPost getJob(int postId) {
        return  repo.getJob(postId);
    }

    public void updateJob(JobPost jobPost) {
         repo.updateJob(jobPost);
    }

    public void  deleteJob(int postId){
        repo.deleteJob(postId);
    }
}
