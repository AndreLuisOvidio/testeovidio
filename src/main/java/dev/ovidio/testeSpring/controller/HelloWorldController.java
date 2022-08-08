package dev.ovidio.testeSpring.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.ovidio.testeSpring.model.HotelModel;

@RestController
public class HelloWorldController {

	@GetMapping("hoteis")
	public HoteisModel hoteis() {
		return new HoteisModel(HotelModel.recuperaListaHoteis());
	}
	
}
