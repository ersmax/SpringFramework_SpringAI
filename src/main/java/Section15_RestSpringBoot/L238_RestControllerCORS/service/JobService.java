package Section15_RestSpringBoot.L238_RestControllerCORS.service;

import Section15_RestSpringBoot.L238_RestControllerCORS.model.JobPost;
import Section15_RestSpringBoot.L238_RestControllerCORS.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {

    @Autowired
    private JobRepo jobRepo;

    public void addJob(JobPost jobPost) {
        jobRepo.addJob(jobPost);
    }

    public List<JobPost> getAllJobs() {
        return jobRepo.getJobs();
    }
}
