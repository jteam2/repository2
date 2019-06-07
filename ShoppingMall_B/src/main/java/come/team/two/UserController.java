package come.team.two;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import come.team.domain.UserVO;
import come.team.service.UserService;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/*")
@Log4j
@AllArgsConstructor
public class UserController {
	
	private UserService service;
	
	@GetMapping("/index")
	public void index() {
		
	}
	
	@GetMapping("/join")
	public void join() {
		
	}
	
	@PostMapping("/join") //�쉶�썝媛��엯�븯怨� 濡쒓렇�씤�뤌�쑝濡� �씠�룞
	public String join(UserVO vo) {
		service.join(vo);
		
		log.info("UserVO: " + vo);
		
		return "redirect:/product/list";
		
	}

	@GetMapping("/About_us")
	public void About_us() {
		
	}
	
	@GetMapping("/guide")
	public void guide() {
		
	}
}
