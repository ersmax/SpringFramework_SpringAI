package Section15_RestSpringBoot.L242_PutDeleteMapping;

import Section15_RestSpringBoot.L242_PutDeleteMapping.model.JobPost;
import Section15_RestSpringBoot.L242_PutDeleteMapping.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class JobRestController {

    @Autowired
    private JobService jobService;

    @GetMapping("/jobPosts")
    public List<JobPost> viewJobs() {
        return jobService.getAllJobs();
    }

//    @GetMapping("/jobPosts")
//    @ResponseBody
//    public List<JobPost> viewJobs() {
//        return jobService.getAllJobs();
//    }

    @GetMapping("/jobPost/{postId}")
    public JobPost getJob(@PathVariable("postId") int id) {
        return jobService.getJob(id);
    }

    @PostMapping("/jobPost")
    public JobPost addJob(@RequestBody JobPost jobPost) {
        jobService.addJob(jobPost);
        return jobService.getJob(jobPost.getPostId());
    }

    @PutMapping("/jobPost")
    public JobPost updateJob(@RequestBody JobPost jobPost) {
        jobService.updateJob(jobPost);
        return jobService.getJob(jobPost.getPostId());
    }

    @DeleteMapping("jobPost/{postId}")
    public String deleteJob(@PathVariable("postId") int id) {
        jobService.delete(id);
        return "Deleted";
    }
}
