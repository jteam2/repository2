package come.team.two;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import come.team.domain.Criteria;
import come.team.domain.PageDTO;
import come.team.service.InquiryService;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Controller
@Log4j
@AllArgsConstructor
@RequestMapping("/inquiry")
public class UserInquiryController {
	
	private InquiryService inquiryService;
	
	@GetMapping("/list")
	public void getInquiryList(Criteria criteria, Model model) {
		
		criteria.setAmount(10);
		model.addAttribute("list", inquiryService.getInquiryList(criteria));
		
		int total = inquiryService.getInquiryNum();
		model.addAttribute("pageMaker", new PageDTO(criteria, total));
		
	}
	
	@GetMapping("/view")
	public void getInquiryView(int inquiryNo, Model model) {
		
		model.addAttribute("inquiry", inquiryService.getInquiryView(inquiryNo));
		
	}
	
	@PostMapping("/register")
	public void registerInquiry() {
		
	}
	
	@DeleteMapping("/delete")
	public void deleteInquiry() {
		
	}

}
