package com.soap.demo;

import com.cdyne.ws.weatherws.Weather;
import com.cdyne.ws.weatherws.WeatherSoap;

public class SoapDemo { 

	public static void main(String[] args) {
		if (args.length != 1) {
			System.out.println("Please pass a Zip Code");
		} else {
			String zipCode = args[0];

			Weather weather = new Weather();
			WeatherSoap weatherSoap = weather.getWeatherSoap();
			weatherSoap.getCityWeatherByZIP(zipCode);
		}

	}
}
