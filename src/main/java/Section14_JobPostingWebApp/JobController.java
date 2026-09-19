package Section14_JobPostingWebApp;

import Section14_JobPostingWebApp.model.JobPost;
import Section14_JobPostingWebApp.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class JobController {

    @Autowired
    private JobService jobService;

    @GetMapping({"/", "/home"})
    public String homepage() {
        return "home";
    }

    @GetMapping("/addjob")
    public String addJob() {
        return "addjob";
    }

    @RequestMapping(value = "/handleForm", method = RequestMethod.POST)
    public String handleForm(JobPost jobPost) {
        jobService.addJob(jobPost);
        System.out.println(jobService.getAllJobs());
        return "success";
    }
    //    @PostMapping(value = "/handleForm")
    //    public String handleForm(JobPost jobPost) {
    //        jobService.addJob(jobPost);
    //        System.out.println(jobService.getAllJobs());
    //        return "success";
    //    }

    @GetMapping("/viewalljobs")
    public ModelAndView viewAllJobs(ModelAndView modelView) {
        List<JobPost> jobs = jobService.getAllJobs();
        modelView.addObject("jobPosts", jobs);
        modelView.setViewName("viewalljobs");
        return modelView;
    }
    //    @GetMapping("/viewalljobs")
    //    public String viewJobs(Model model) {
    //        List<JobPost> jobs = jobService.getAllJobs();
    //        model.addAttribute("jobPosts", jobs);
    //        return "viewalljobs";
    //    }
}
