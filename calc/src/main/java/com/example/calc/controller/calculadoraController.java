package com.example.calc.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculadora")
public class calculadoraController {
    
	@GetMapping("/soma")
	public String soma(@RequestParam(value="a", required=true) String a,@RequestParam(value="b", required=true) String b) {
		return String.valueOf(Double.parseDouble(a)+Double.parseDouble(b));
	}

	@GetMapping("/subtracao")
	public String subtracao(@RequestParam(value="a", required=true) String a,@RequestParam(value="b", required=true) String b) {
		return String.valueOf(Double.parseDouble(a)-Double.parseDouble(b));
	}

	@GetMapping("/multiplicacao")
	public String multiplicacao(@RequestParam(value="a", required=true) String a,@RequestParam(value="b", required=true) String b) {
		return String.valueOf(Double.parseDouble(a)*Double.parseDouble(b));
	}

	@GetMapping("/divisao")
	public String divisao(@RequestParam(value="a", required=true) String a,@RequestParam(value="b", required=true) String b) {
		return String.valueOf(Double.parseDouble(a)/Double.parseDouble(b));
	}

	@GetMapping("/potencia")
	public String potencia(@RequestParam(value="a", required=true) String a,@RequestParam(value="b", required=true) String b) {
		return String.valueOf(Math.pow(Double.parseDouble(a),
			Double.parseDouble(b)));
	}
    
}
