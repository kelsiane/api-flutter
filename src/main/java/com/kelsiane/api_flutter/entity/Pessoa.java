package com.kelsiane.api_flutter.entity;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "pessoa")
public class Pessoa {
	    @Id
	    private ObjectId id;
	    
	    private String nome;
	    private double peso;
	    private double altura;
	
	    
	   
		public Pessoa() {}
		
		
		 public Pessoa(ObjectId id, String nome, double peso, double altura) {
			super();
			this.id = id;
			this.nome = nome;
			this.peso = peso;
			this.altura = altura;
		}


		//getters and setters 
		 
		public String getId() {
			return id.toHexString();
		}
		public void setId(ObjectId id) {
			this.id = id;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public double getPeso() {
			return peso;
		}
		public void setPeso(double peso) {
			this.peso = peso;
		}
		public double getAltura() {
			return altura;
		}
		public void setAltura(double altura) {
			this.altura = altura;
		}

	

}

