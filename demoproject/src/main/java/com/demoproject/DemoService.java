package com.demoproject;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface DemoService {

	DemoEntity saveDemo(DemoEntity demoEntity);

	List<DemoEntity> getDemo();

	String deleteDemoById(int id);

	DemoEntity getDemoById(int id);

	DemoEntity updateById(int id, DemoEntity entity);

	

}
