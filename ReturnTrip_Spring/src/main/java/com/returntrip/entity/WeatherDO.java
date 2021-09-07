package com.returntrip.entity;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class WeatherDO {
	private String location;
	private String weather;
	private String temperature;

	private String fine_dust;
	private String ultra_fine_dust;
	private String ultraviolet_ray;
	public WeatherDO() {
	
	}
	public WeatherDO(String location, String fine_dust, String ultra_fine_dust, String ultraviolet_ray) {
		super();
		this.location = location;
		this.fine_dust = fine_dust;
		this.ultra_fine_dust = ultra_fine_dust;
		this.ultraviolet_ray = ultraviolet_ray;
	}
	
	
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getWeather() {
		return weather;
	}
	public void setWeather(String weather) {
		this.weather = weather;
	}
	public String getTemperature() {
		return temperature;
	}
	public void setTemperature(String string) {
		this.temperature = string;
	}
	public String getFine_dust() {
		return fine_dust;
	}
	public void setFine_dust(String fine_dust) {
		this.fine_dust = fine_dust;
	}
	public String getUltra_fine_dust() {
		return ultra_fine_dust;
	}
	public void setUltra_fine_dust(String ultra_fine_dust) {
		this.ultra_fine_dust = ultra_fine_dust;
	}
	public String getUltraviolet_ray() {
		return ultraviolet_ray;
	}
	public void setUltraviolet_ray(String ultraviolet_ray) {
		this.ultraviolet_ray = ultraviolet_ray;
	}
	
	
	
	
}
