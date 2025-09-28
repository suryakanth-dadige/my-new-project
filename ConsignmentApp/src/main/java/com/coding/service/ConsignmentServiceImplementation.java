package com.coding.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coding.entity.Consignment;
import com.coding.repository.ConsignmentRepository;

@Service
public class ConsignmentServiceImplementation implements ConsignmentService
{
	@Autowired
	
    public ConsignmentRepository consignmentRepository;

	@Override
	public List<Consignment> getAllConsignments()
	{
		return consignmentRepository.findAll();
	}

	@Override
	public Consignment saveConsignment(Consignment consignment)
	{
		return consignmentRepository.save(consignment);
	}

	@Override
	public Consignment updateConsignment(Integer id, Consignment consignment) 
	{
        Consignment existing=consignmentRepository.findById(id).orElseThrow(()-> new RuntimeException("Consignment Not Found  "+id));
		
        existing.setConsignmentStatus(consignment.getConsignmentStatus()!=null?consignment.getConsignmentStatus():existing.getConsignmentStatus());
        existing.setConsignmentCatogery(consignment.getConsignmentCatogery()!=null?consignment.getConsignmentCatogery():existing.getConsignmentCatogery());
        existing.setDeliveryPartner(consignment.getDeliveryPartner()!=null?consignment.getDeliveryPartner():existing.getDeliveryPartner());
        consignmentRepository.save(existing);
		return existing;
	}

	@Override
	public Consignment getConsignmentById(Integer id) 
	{
		return consignmentRepository.findById(id).orElseThrow(()-> new RuntimeException("Consignment Not Found  "+id));
	}

	@Override
	public String deleteConsignmentById(Integer id) 
	{
		consignmentRepository.deleteById(id);
		 return "";
		
	}

	
	
}
