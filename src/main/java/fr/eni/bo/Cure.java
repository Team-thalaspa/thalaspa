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
private String cureDescription;
private int cureDuration;
private double curePrice;
private String cureImage;
private String cureType;

public Cure() {
	super();
}





public Cure(String cureName, String cureDescription, int cureDuration, double curePrice, String cureImage,
		String cureType) {
	super();
	this.cureName = cureName;
	this.cureDescription = cureDescription;
	this.cureDuration = cureDuration;
	this.curePrice = curePrice;
	this.cureImage = cureImage;
	this.cureType = cureType;
}





public Cure(long idCure, String cureName, String cureDescription, int cureDuration, double curePrice, String cureImage,
		String cureType) {
	super();
	this.idCure = idCure;
	this.cureName = cureName;
	this.cureDescription = cureDescription;
	this.cureDuration = cureDuration;
	this.curePrice = curePrice;
	this.cureImage = cureImage;
	this.cureType = cureType;
}





public long getIdCure() {
	return idCure;
}

public void setIdCure(long idCure) {
	this.idCure = idCure;
}

public String getCureName() {
	return cureName;
}

public void setCureName(String cureName) {
	this.cureName = cureName;
}

public int getCureDuration() {
	return cureDuration;
}

public void setCureDuration(int cureDuration) {
	this.cureDuration = cureDuration;
}

public double getCurePrice() {
	return curePrice;
}

public void setCurePrice(double curePrice) {
	this.curePrice = curePrice;
}

public String getCureImage() {
	return cureImage;
}

public void setCureImage(String cureImage) {
	this.cureImage = cureImage;
}

public String getCureType() {
	return cureType;
}

public void setCureType(String cureType) {
	this.cureType = cureType;
}



public String getCureDescription() {
	return cureDescription;
}





public void setCureDescription(String cureDescription) {
	this.cureDescription = cureDescription;
}





@Override
public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append("Cure [idCure=");
	builder.append(idCure);
	builder.append(", cureName=");
	builder.append(cureName);
	builder.append(", CureDescription=");
	builder.append(cureDescription);
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
