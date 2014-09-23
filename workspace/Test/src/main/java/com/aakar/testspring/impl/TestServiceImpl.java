package com.aakar.testspring.impl;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Component
@RestController
@RequestMapping("/greeting")
public class TestServiceImpl {

	@RequestMapping(method = RequestMethod.GET)
	public String getGreeting(@RequestParam("name") String name) {
		return "Hello " + name + ". How are you doing today?";
	}

	/*@RequestMapping(value = "/card", method = RequestMethod.GET)
	public ModelAndView getGreetingCard(ModelAndView modelAndView,
			@RequestParam("name") String name,@RequestParam("greeting") String message) {

		Greeting greeting = new Greeting(message, name);

		List<Greeting> data = new ArrayList<>();
		data.add(greeting);

		JRDataSource datasource = new JRBeanArrayDataSource(data.toArray());

		// In order to use Spring's built-in Jasper support,
		// We are required to pass our datasource as a map parameter
		// parameterMap is the Model of our application
		Map<String, Object> parameterMap = new HashMap<String, Object>();
		parameterMap.put("datasource", datasource);

		// pdfReport is the View of our application
		// This is declared inside the /WEB-INF/jasper-views.xml
		modelAndView = new ModelAndView("pdfReport", parameterMap);

		// Return the View and the Model combined
		return modelAndView;
	}*/

}
