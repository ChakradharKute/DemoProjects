package com.demoproject;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	@Autowired
	public DemoService demoService;
	
	@RequestMapping("/hello")
	
		public String Hello()
		{
			return "Welcome";
			
		}
	
	@GetMapping("/hello")
	public String sayHello()
	{
		return "Hello World";
	}
	
	@PostMapping("/demo")
	public DemoEntity saveDemo(@RequestBody DemoEntity demoEntity)
	{
		return demoService.saveDemo(demoEntity);
		
	}
	
	@GetMapping("/demo")
	public List<DemoEntity> getDemo()
	{
		return demoService.getDemo();
		
	}
	
	@DeleteMapping("/demo/{id}")
	public String deleteDemoById(@PathVariable ("id") int id)
	{
		return demoService.deleteDemoById(id);
		
	}
	
	@GetMapping("/demo/{id}")
	public DemoEntity getDemoById(@PathVariable ("id") int id)
	{
		return demoService.getDemoById(id);
		
	}
	
	@PutMapping("/demo/{id}")
	public DemoEntity updateById(@PathVariable ("id") int id , @RequestBody DemoEntity entity)
	{
		return demoService.updateById(id, entity);
	}
	
	

}
