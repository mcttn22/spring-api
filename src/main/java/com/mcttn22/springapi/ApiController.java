package com.mcttn22.springapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.ResponseBody;

@RestController
public class ApiController {
	@Autowired
	private DataRepository dataRepository;

	@GetMapping("/")
	public @ResponseBody Iterable<DataTable> getData() {
		return dataRepository.findAll();
	}

	@PostMapping("/")
	public @ResponseBody String postData(@RequestParam String data) {
		DataTable dataTable = new DataTable();
		dataTable.setData(data);
		dataRepository.save(dataTable);
		return "Saved " + data;
	}
}

