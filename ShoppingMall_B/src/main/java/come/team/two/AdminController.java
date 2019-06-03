package come.team.two;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import come.team.domain.ProductVO;
import come.team.service.ProductService;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Controller
@Log4j
@RequestMapping("/product")
@AllArgsConstructor
public class AdminController {
	
	private ProductService service;
	
	@GetMapping("/index")
	public void index() {
		
	}
	
	@GetMapping("/register")
	public void register() {
		
	}
	
	
	@PostMapping("/register") //관리자가 제품 등록하는
	public String register(ProductVO vo) {
		service.register(vo);
		
		log.info("productVO: " + vo);
		
		return "redirect:/product/list";
	}
}
