package net.javaguides.sms.apply.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import net.javaguides.sms.apply.entity.Apply;
import net.javaguides.sms.apply.service.ApplyService;


@Controller
public class ApplyController {
	
	
	private ApplyService applyService;

	public ApplyController(ApplyService applyService) {
		super();
		this.applyService = applyService;
	}
	
	
	
	
	
	
	//handler method to handle list students and return mode and view
	@GetMapping("/apply")
	public String listApply(Model model) {
		model.addAttribute("apply",applyService.getAllApply());
		return "apply";
		
	}
	
	
	
	@GetMapping("/apply/new")
	public String createApplyForm(Model model) {
		Apply apply = new Apply();
		model.addAttribute("apply", apply);
		return "create_apply";
			
	}
	
	
	
	
	@PostMapping("/apply")
	public String saveApply(@ModelAttribute("apply") Apply apply) {
		
		applyService.saveApply(apply);
		return "redirect:/apply";
			
	}
	
	
	
	
	
	
	
	@GetMapping("/apply/edit/{id}")
	public String editApplyForm(@PathVariable Long id, Model model) {
		model.addAttribute("apply",applyService.getApplyById(id));
		return "edit_apply";
	}
	
	@PostMapping("/apply/{id}")
	public String updateApply(@PathVariable Long id, @ModelAttribute("apply") Apply apply,
			Model model) {
		
		//get apply Fields from database id
		Apply existingApply = applyService.getApplyById(id);
		existingApply.setId(id);
		existingApply.setName(apply.getName());
		existingApply.setF_Name(apply.getF_Name());
		existingApply.setSurname(apply.getSurname());
		existingApply.setDateOfBirth(apply.getDateOfBirth());
		existingApply.setPlaceOfBirth(apply.getPlaceOfBirth());
		existingApply.setGender(apply.getGender());
		existingApply.setNationality(apply.getNationality());
		existingApply.setTelephone(apply.getTelephone());
		existingApply.setMobile(apply.getMobile());
		existingApply.setDomicile(apply.getDomicile());
		existingApply.setEmail(apply.getEmail());
		existingApply.setPresentAddress(apply.getPresentAddress());
		existingApply.setParmanentAddress(apply.getParmanentAddress());
		existingApply.setAppliedFor(apply.getAppliedFor());
		
		
		
		//save update Apply object
		applyService.updateApply(existingApply);
		return "redirect:/apply";
		
	}
	
	// handler method to handle delete apply request
	
	@GetMapping("/apply/{id}")
	public String deleteApply(@PathVariable Long id) {
		applyService.deleteApplyById(id);
		return "redirect:/apply";
	}
	
	

}
