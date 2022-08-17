package com.org.Swagger;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Optional;

@RestController
public class TEmployeeController {
	
	@Autowired
	private TEmployeeRepository eRepo;
	
	@PostMapping("/employee")
	public TEmployee save(@RequestBody TEmployee employee)
	{
		return eRepo.save(employee);
	}
	
	@GetMapping("/employees")
	public List<TEmployee> get()
	{
		return eRepo.findAll();
	}
	
	@GetMapping("/employees/{id}")
    public TEmployee get(@PathVariable Long id) {
        java.util.Optional<TEmployee> employee = eRepo.findById(id);
        if(employee.isPresent()) {
            return employee.get();
        }
        throw new RuntimeException(" Not found for the id "+id);
    }
    @PutMapping("/employees/{id}")
    public TEmployee update(@PathVariable Long id , @RequestBody TEmployee employee) {

        return eRepo.save(employee);
    }
    @DeleteMapping("/employees/{id}")
    public ResponseEntity<HttpStatus> delete(@PathVariable  Long id){
        eRepo.deleteById(id);
        return new ResponseEntity<HttpStatus>(HttpStatus.NO_CONTENT);
    }
	

}
