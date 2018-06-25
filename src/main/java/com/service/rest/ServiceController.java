package com.service.rest;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.process.helper.AnnuityProcessBuilder;
import com.process.helper.ExchangeProcessBuilder;
import com.process.helper.ProcessBuilderService;
import com.process.pojo.AnnuityHelper;

import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class ServiceController {

	@GetMapping(value = "/hello")
	public String hello() {
		return "helloworld";
	}

	@PostMapping(value = "/data", produces = { "application/xml", "application/json" }, consumes = { "application/xml",
			"application/json" })
	public AnnuityHelper parserMethod(@RequestBody AnnuityHelper a) {
		System.out.println(a.getMydata().get());
		return a;
	}
	@GetMapping(value = "/startProcess")
	public String startProcess(@PathParam("processType") String processType) {
		// if()
		ProcessBuilderService pbs=null;
		if (processType.equalsIgnoreCase("annuity")) {
			pbs = new AnnuityProcessBuilder("arjun");
			((AnnuityProcessBuilder) pbs).setFinancialRepresentativeId("123");
			((AnnuityProcessBuilder) pbs).setProcessKey("annuity");
			System.out.println(((AnnuityProcessBuilder) pbs).getFinancialRepresentativeId());
			System.out.println(((AnnuityProcessBuilder) pbs).getFinancialRepresentativeName());
			System.out.println(((AnnuityProcessBuilder) pbs).getProcessKey());
		} 
		if (processType.equalsIgnoreCase("exchange")) {
			pbs = new ExchangeProcessBuilder();
			((ExchangeProcessBuilder) pbs).setProcessKey("exchange");
			((ExchangeProcessBuilder) pbs).setServiceRequestNumber("8973894797");
			System.out.println(((ExchangeProcessBuilder) pbs).getServiceRequestNumber());
			System.out.println(((ExchangeProcessBuilder) pbs).getProcessKey());
		} else {
			//return new JMSService();
			return "invalid process type";
		}
		System.out.println( pbs.getProcessKey());
		return "helloworld";
	}
}
