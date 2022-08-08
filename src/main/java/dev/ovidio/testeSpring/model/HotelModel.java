package dev.ovidio.testeSpring.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class HotelModel {

	public String nome;	
	public String cidade;
	public Float estrelas;
	public BigDecimal diarias;
	
	public HotelModel(String nome, String cidade, Float estrelas, BigDecimal diarias) {
		this.nome = nome;
		this.cidade = cidade;
		this.estrelas = estrelas;
		this.diarias = diarias;
	}

	public static List<HotelModel> recuperaListaHoteis() {
		return new ArrayList<HotelModel>(List.of(
				new HotelModel("Hotel 1", "Sao Paulo", 3.5f, new BigDecimal("300.35")),
				new HotelModel("Hotel 2", "Rio Janeiro", 4.5f, new BigDecimal("315.35"))
				)
				);
	}
	
}
