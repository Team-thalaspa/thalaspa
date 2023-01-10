package fr.eni.bo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "table_cure")
public class Cure {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long idCure;
private String cureName;
private int cureDuration;
private double curePrice;
private String cureImage;
private Type cureType;

public Cure() {
	super();
}

public Cure(String cureName, int cureDuration, double curePrice, String cureImage, Type cureType) {
	super();
	this.cureName = cureName;
	this.cureDuration = cureDuration;
	this.curePrice = curePrice;
	this.cureImage = cureImage;
	this.cureType = cureType;
}

public Cure(long idCure, String cureName, int cureDuration, double curePrice, String cureImage, Type cureType) {
	super();
	this.idCure = idCure;
	this.cureName = cureName;
	this.cureDuration = cureDuration;
	this.curePrice = curePrice;
	this.cureImage = cureImage;
	this.cureType = cureType;
}

@Override
public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append("Cure [idCure=");
	builder.append(idCure);
	builder.append(", cureName=");
	builder.append(cureName);
	builder.append(", cureDuration=");
	builder.append(cureDuration);
	builder.append(", curePrice=");
	builder.append(curePrice);
	builder.append(", cureImage=");
	builder.append(cureImage);
	builder.append(", cureType=");
	builder.append(cureType);
	builder.append("]");
	return builder.toString();
}



	
}
