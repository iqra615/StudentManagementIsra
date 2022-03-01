package net.javaguides.sms.apply.service;

import java.util.List;

import net.javaguides.sms.apply.entity.Apply;

public interface ApplyService {

   List<Apply> getAllApply();
	
	
	Apply saveApply(Apply apply);
	
	Apply getApplyById(Long id);
	Apply updateApply(Apply apply);
	
	// for delete service
	void deleteApplyById(Long id);





	

}
