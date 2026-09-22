package Section15_RestSpringBoot.L238_RestControllerCORS;

import Section15_RestSpringBoot.L238_RestControllerCORS.service.JobService;
import Section15_RestSpringBoot.L238_RestControllerCORS.model.JobPost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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

//  If @Controller is used in place of @RestController
//    @GetMapping("/jobPosts")
//    @ResponseBody
//    public List<JobPost> viewJobs() {
//        return jobService.getAllJobs();
//    }
}
