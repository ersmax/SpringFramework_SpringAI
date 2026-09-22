package Section15_RestSpringBoot.L241_SendingData.service;

import Section15_RestSpringBoot.L241_SendingData.model.JobPost;
import Section15_RestSpringBoot.L241_SendingData.repo.JobRepo;
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

    public JobPost getJob(int postId) {
        return jobRepo.getJob(postId);
    }
}
