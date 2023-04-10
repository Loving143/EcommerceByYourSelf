package com.smart.entity;

import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Image {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String name;
	private String type;
	@Column(length=50000000)
	private byte [] picByte;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public byte[] getPicByte() {
		return picByte;
	}
	public void setPicByte(byte[] picByte) {
		this.picByte = picByte;
	}
	public Image(String name, String type, byte[] picByte) {
	
		
		this.name = name;
		this.type = type;
		this.picByte = picByte;
	}
	@Override
	public String toString() {
		return "Image [id=" + id + ", name=" + name + ", type=" + type + ", picByte=" + Arrays.toString(picByte) + "]";
	}
	
	
	
	
	
	
	
	

}
