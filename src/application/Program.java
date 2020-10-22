package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

import entities.Product;
import util.UpperCaseName;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv",900.00));
		list.add(new Product("Mouse",50.00));
		list.add(new Product("Tablet",350.50));
		list.add(new Product("HD Case",80.90));
		
		/*
		 * fun��o map aplica uma fun��o a cada elemento da stream
		 * gerando uma nova stream com os elementos transformados4
		 * A fun��o map s� funciona para stream, por isso foi necess�rio
		 * converser a lista para stream.
		 */
		List<String> names = list.stream().map(Product::nonStaticUpperCaseName).collect(Collectors.toList());
		
		names.forEach(System.out::println);
		
	}
}
