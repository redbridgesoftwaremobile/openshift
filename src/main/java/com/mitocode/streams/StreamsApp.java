package com.mitocode.streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsApp {

	private List<String> lista;
	private List<String> numeros;
	
	public StreamsApp(){
		lista = new ArrayList<>();
		lista.add("Mito");
		lista.add("Code");
		lista.add("Huracan");
		lista.add("MitoCode");
        lista.add("Redbridge");
        lista.add("Tornado");
        lista.add("Temblor");
        lista.add("Sunami");
        lista.add("Tifon");
        lista.add("Maremoto");
		
		numeros = new ArrayList<>();
		numeros.add("1");
		numeros.add("2");
	}
	
	public void filtrar(){
		lista.stream().filter(x -> x.startsWith("M")).forEach(System.out::println);
	}
	
	public void ordenar(){
		//lista.stream().sorted().forEach(System.out::println);
		lista.stream().sorted((x,y)-> y.compareTo(x)).forEach(System.out::println);
	}
	
	public void transformar(){
		//lista.stream().map(String::toUpperCase).forEach(System.out::println);
		/*for(String x : numeros){
			int num = Integer.parseInt(x) + 1;
			System.out.println(num);
		}*/
		numeros.stream().map(x -> Integer.parseInt(x) + 1).forEach(System.out::println);
	}
	
	public void limitar(){
		lista.stream().limit(2).forEach(System.out::println);
	}
	
	public void contar(){
		long x = lista.stream().count();
		System.out.println(x);
	}

	public void collectar(){

		String result = lista.stream().map(x->x.toUpperCase()).collect(Collectors.joining(","));
		System.out.println(result);
	}

    public void agregarTexto(){
        StringBuilder sb = new StringBuilder();
		lista.stream().limit(5).forEach(x->sb.append(x).append("--"));
		System.out.println(sb);
	}
		
	public static void main(String[] args) {
		StreamsApp app = new StreamsApp();
		//app.filtrar();
		//app.ordenar();
		//app.transformar();
		//app.limitar();
		//app.contar();
		//app.collectar();
        app.agregarTexto();
		
	}
}
