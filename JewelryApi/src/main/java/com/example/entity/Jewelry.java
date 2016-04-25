package com.example.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
//@Table(name = "JEWELRY")
public class Jewelry extends AbstractEntity {
	@Column(name="jewelry_name")
	private String jewelryName;
	@Column(name="weight_in_tola")
	private int weightInTola;
	@Column(name="weight_in_aana")
	private int weightInAana;
	@Column(name="weight_in_lal")
    private int weightInLal;
	@Column(name="weight_in_gram")
	private double weightInGram;
	@Column(name="total_price")
	private double totalPrice;
	private String description;
	@Column(name="jarti_weight_in_gram")
	private double jartiWeightInGram;
	@Column(name="jarti_weight_in_tola")
	private int jartiWeightInTola;
	@Column(name="jarti_weight_in_aana")
	private int jartiWeightInAana;
	@Column(name="jarti_weight_in_lal")
	private int jartiWeightInLal;
	private JewelryCategory jewelryCategory;
	private Material jewelryMaterial;
	private Stone jewelryStone;
	private Caret jewelryCaret;
	public String getJewelryName() {
		return jewelryName;
	}
	public void setJewelryName(String jewelryName) {
		this.jewelryName = jewelryName;
	}
	public int getWeightInTola() {
		return weightInTola;
	}
	public void setWeightInTola(int weightInTola) {
		this.weightInTola = weightInTola;
	}
	public int getWeightInAana() {
		return weightInAana;
	}
	public void setWeightInAana(int weightInAana) {
		this.weightInAana = weightInAana;
	}
	public int getWeightInLal() {
		return weightInLal;
	}
	public void setWeightInLal(int weightInLal) {
		this.weightInLal = weightInLal;
	}
	public double getWeightInGram() {
		return weightInGram;
	}
	public void setWeightInGram(double weightInGram) {
		this.weightInGram = weightInGram;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getJartiWeightInGram() {
		return jartiWeightInGram;
	}
	public void setJartiWeightInGram(double jartiWeightInGram) {
		this.jartiWeightInGram = jartiWeightInGram;
	}
	public int getJartiWeightInTola() {
		return jartiWeightInTola;
	}
	public void setJartiWeightInTola(int jartiWeightInTola) {
		this.jartiWeightInTola = jartiWeightInTola;
	}
	public int getJartiWeightInAana() {
		return jartiWeightInAana;
	}
	public void setJartiWeightInAana(int jartiWeightInAana) {
		this.jartiWeightInAana = jartiWeightInAana;
	}
	public int getJartiWeightInLal() {
		return jartiWeightInLal;
	}
	public void setJartiWeightInLal(int jartiWeightInLal) {
		this.jartiWeightInLal = jartiWeightInLal;
	}
	@ManyToOne(cascade = CascadeType.ALL)
	public JewelryCategory getJewelryCategory() {
		return jewelryCategory;
	}
	public void setJewelryCategory(JewelryCategory jewelryCategory) {
		this.jewelryCategory = jewelryCategory;
	}
	@ManyToOne(cascade = CascadeType.ALL)
	public Material getJewelryMaterial() {
		return jewelryMaterial;
	}
	public void setJewelryMaterial(Material jewelryMaterial) {
		this.jewelryMaterial = jewelryMaterial;
	}
	@ManyToOne(cascade = CascadeType.ALL)
	public Stone getJewelryStone() {
		return jewelryStone;
	}
	public void setJewelryStone(Stone jewelryStone) {
		this.jewelryStone = jewelryStone;
	}
	@ManyToOne(cascade = CascadeType.ALL)
	public Caret getJewelryCaret() {
		return jewelryCaret;
	}
	public void setJewelryCaret(Caret jewelryCaret) {
		this.jewelryCaret = jewelryCaret;
	}

}
