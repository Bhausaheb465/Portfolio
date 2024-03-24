package in.bhau.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import in.bhau.entity.Contact;
import in.bhau.service.ContactService;

@Controller
public class PortfolioController {
	
	@Autowired
	private ContactService contactSer;
	
	@GetMapping("/")
	public String get(@ModelAttribute("contact") Contact contact) {
		return "home";
	}
	
	@PostMapping("/contact")
	public ModelAndView saveContactInfo(@ModelAttribute("contact") Contact contact) {
		ModelAndView mav = new ModelAndView();
		boolean b = contactSer.saveData(contact);
		if(b) {
			mav.addObject("succMsg", "Massage Send Successfully.");
		} else {
			mav.addObject("errMsg", "Something went wrong.");
		}
		mav.setViewName("home");
		return mav;
	}

}
