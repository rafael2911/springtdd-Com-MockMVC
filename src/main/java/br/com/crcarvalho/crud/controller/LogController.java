package br.com.crcarvalho.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.crcarvalho.crud.entity.Log;
import br.com.crcarvalho.crud.service.LogService;

@RestController
@RequestMapping("logs")
public class LogController {
	
	private LogService logService;
	
	@Autowired
	public LogController(LogService logService) {
		this.logService = logService;
	}
	
	@GetMapping
	public List<Log> findAll(){
		return logService.findAll();
	}
	
}
