package web.service.client.main;

import java.net.MalformedURLException;
import java.net.URL;

import web.service.client.Calculator;
import web.service.client.CalculatorSoap;

public class Main {

	public static void main(String[] args) throws MalformedURLException {
		URL url = new URL("http://www.dneonline.com/calculator.asmx?WSDL");
		Calculator calculatorimpl = new Calculator(url);
		CalculatorSoap proxy = calculatorimpl.getCalculatorSoap();
		int a = 15, b = 10;
		System.out.println(proxy.multiply(a, b));

	}

}
