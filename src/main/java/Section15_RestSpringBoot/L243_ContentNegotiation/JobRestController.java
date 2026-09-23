package Section15_RestSpringBoot.L243_ContentNegotiation;

import Section15_RestSpringBoot.L243_ContentNegotiation.model.JobPost;
import Section15_RestSpringBoot.L243_ContentNegotiation.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class JobRestController {


    @Autowired
    private JobService jobService;

    @GetMapping(path = "/jobPosts", produces = {"application/xml"})
    public List<JobPost> viewJobs() {
        return jobService.getAllJobs();
    }

    @GetMapping(path = "/jobPost/{postId}", produces = {"application/xml"})
    public JobPost getJob(@PathVariable("postId") int id) {
        return jobService.getJob(id);
    }

    @PostMapping(path = "/jobPost", consumes = {"application/xml"})
    public JobPost addJob(@RequestBody JobPost jobPost) {
        jobService.addJob(jobPost);
        return jobService.getJob(jobPost.getPostId());
    }

    @PutMapping("/jobPost")
    public JobPost updateJob(@RequestBody JobPost jobPost) {
        jobService.updateJob(jobPost);
        return jobService.getJob(jobPost.getPostId());
    }

    @DeleteMapping("/jobPost/{postId}")
    public String deleteJob(@PathVariable("postId") int id) {
        jobService.deleteJob(id);
        return "Deleted";
    }
}
