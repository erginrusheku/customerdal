package com.customer.customerdal;

import com.customer.customerdal.entities.Customer;
import com.customer.customerdal.repository.CustomerRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CustomerdalApplicationTests {

	@Autowired
	private CustomerRepository customerRepository;

	@Test
	void testCreateCustomer() {
		Customer customer = new Customer();
		customer.setName("Ergin");
		customer.setEmail("rushekuergin@gmail.com");
		customerRepository.save(customer);
	}

	@Test
	void testFindCustomerById(){
		customerRepository.findById(1L);
	}

	@Test
	void testUpdateCustomerById(){

		Customer customer = customerRepository.findById(1L).get();
		customer.setName("Igli");
		customer.setEmail("qarr.igli@gmail.com");
		customerRepository.save(customer);
	}

	@Test
	void testDeleteCustomerById(){
		customerRepository.deleteById(1L);
	}

}
