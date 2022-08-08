package dev.ovidio.testeSpring.controller;

import java.util.List;

import dev.ovidio.testeSpring.model.HotelModel;

public class HoteisModel {

	public List<HotelModel> hoteis;
	public String nomeDracari = "Dracarys";
	
	public HoteisModel(List<HotelModel> hoteis) {
		this.hoteis = hoteis;
	}
	
}
