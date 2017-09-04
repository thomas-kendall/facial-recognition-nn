package server.nn.recognition.facial.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MachineLearningController {

	@RequestMapping("/api/test")
	public String test() {
		return "Success.";
	}
}
