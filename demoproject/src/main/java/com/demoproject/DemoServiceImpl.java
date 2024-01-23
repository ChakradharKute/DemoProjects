package com.demoproject;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DemoServiceImpl implements DemoService {

	@Autowired
	public DemoRepository demoRepository;

	@Override
	public DemoEntity saveDemo(DemoEntity demoEntity) {
		// TODO Auto-generated method stub
		return demoRepository.save(demoEntity);
	}

	@Override
	public List<DemoEntity> getDemo() {
		// TODO Auto-generated method stub
		return demoRepository.findAll();
	}

	@Override
	public String deleteDemoById(int id) {
		// TODO Auto-generated method stub
		return "Deleted Succesfully";
	}

	@Override
	public DemoEntity getDemoById(int id) {
		// TODO Auto-generated method stub
		Optional<DemoEntity> a = demoRepository.findById(id);
		if (a.isPresent()) {
			return a.get();
		} else {
			return null;

		}

	}

	@Override
	public DemoEntity updateById(int id, DemoEntity entity) {
		// TODO Auto-generated method stub
		return null;
	}
}
