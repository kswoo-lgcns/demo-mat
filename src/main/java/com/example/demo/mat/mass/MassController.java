package com.example.demo.mat.mass;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.mat.mass.service.MassService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/mass")
@AllArgsConstructor
public class MassController {

	private MassService massService;
	
	@GetMapping("/work1")
	public ResponseEntity<String> createMassData() {
		massService.createMassData();
		return ResponseEntity.ok("OK");
	}
}
