package com.returntrip.entity;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class WeatherDO {
	private String location;
	private String fine_dust;
	private String ultra_fine_dust;
	private String ultraviolet_ray;
	private String sunset_time;
	public WeatherDO() {
	
	}
	public WeatherDO(String location, String fine_dust, String ultra_fine_dust, String ultraviolet_ray, String sunset_time) {
		super();
		this.location = location;
		this.fine_dust = fine_dust;
		this.ultra_fine_dust = ultra_fine_dust;
		this.ultraviolet_ray = ultraviolet_ray;
		this.sunset_time = sunset_time;
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
	public String getSunset_time() {
		return sunset_time;
	}
	public void setSunset_time(String sunset_time) {
		this.sunset_time = sunset_time;
	}
	
	@Override
	public String toString() {
		return "WeatherDO [fine_dust=" + fine_dust + ", ultra_fine_dust=" + ultra_fine_dust + ", ultraviolet_ray="
				+ ultraviolet_ray + ", sunset_time=" + sunset_time + "]";
	}
	
	
}
