package com.coding.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coding.entity.Consignment;
import com.coding.repository.ConsignmentRepository;
import com.coding.service.ConsignmentService;

@RestController
@CrossOrigin(origins="*",allowedHeaders="*")
public class ConsignmentController
{
	@Autowired
     public ConsignmentService consignmentService;
	@Autowired
	public ConsignmentRepository consignmentRepository;
	@GetMapping("/consignments")
	public List<Consignment> getAllConsignments()
	{
		return consignmentService.getAllConsignments();
	}
	@PostMapping("/consignment")
	public Consignment saveConsignment(@RequestBody Consignment consignment)
	{
		return consignmentService.saveConsignment(consignment);
	}
	@PutMapping("/consignment/{id}")
	public Consignment updateConsignment(@PathVariable Integer id,@RequestBody Consignment consignment)
	{
//		Consignment existing=consignmentRepository.findById(id).orElseThrow(()-> new RuntimeException("Consignment Not Found  "+id));
//		
//		existing.setConsignmentStatus(consignment.getConsignmentStatus()!=null?consignment.getConsignmentStatus():existing.getConsignmentStatus());
//		existing.setConsignmentCatogery(consignment.getConsignmentCatogery()!=null?consignment.getConsignmentCatogery():existing.getConsignmentCatogery());
//		existing.setDeliveryPartner(consignment.getDeliveryPartner()!=null?consignment.getDeliveryPartner():existing.getDeliveryPartner());
//		

		
		 return consignmentService.updateConsignment(id,consignment);
		
	}
	
	@GetMapping("/consignment/{id}")
	
	public Consignment getConsignmentById(@PathVariable Integer id)
	{
		 return consignmentService.getConsignmentById(id);
	}
	@DeleteMapping("/consignment/{id}")
	public String deleteConsignmentById(@PathVariable Integer id)
	{
		consignmentService.deleteConsignmentById(id);
		return "Consignment Deleted "+id;
	}
	
	
	
}

