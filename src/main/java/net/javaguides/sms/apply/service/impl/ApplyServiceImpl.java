package net.javaguides.sms.apply.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import net.javaguides.sms.apply.entity.Apply;
import net.javaguides.sms.apply.repository.ApplyRepository;
import net.javaguides.sms.apply.service.ApplyService;

@Service
public class ApplyServiceImpl implements ApplyService {

private ApplyRepository applyRepository;
	
	public ApplyServiceImpl(ApplyRepository applyRepository) {
		super();
		this.applyRepository = applyRepository;
	}
	
	@Override
	public List<Apply> getAllApply() {
		return applyRepository.findAll();
	}

	@Override
	public Apply saveApply(Apply apply) {
	
		return applyRepository.save(apply);
	}

	@Override
	public Apply getApplyById(Long id) {
	
		return applyRepository.findById(id).get();
	}

	@Override
	public Apply updateApply(Apply apply) {
		
		return applyRepository.save(apply);
	}

	@Override
	public void deleteApplyById(Long id) {
		applyRepository.deleteById(id);
		
	}
	
	
	
	
	
}
