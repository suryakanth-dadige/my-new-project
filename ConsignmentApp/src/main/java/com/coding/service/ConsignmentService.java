package com.coding.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.coding.entity.Consignment;

@Service
public interface ConsignmentService
{

	public List<Consignment> getAllConsignments();

	public Consignment saveConsignment(Consignment consignment);

	public Consignment updateConsignment(Integer id, Consignment consignment);

	public Consignment getConsignmentById(Integer id);

	public  String deleteConsignmentById(Integer id);

   
}
