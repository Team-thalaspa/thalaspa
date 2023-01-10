package fr.eni.bo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="table_type")
public class Type {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long typeId;
	private String label;
	
	
	


	public Type() {
		super();
	}

	
	

	public Type(String label) {
		super();
		this.label = label;
	}


	


	public Type(long typeId, String label) {
		super();
		this.typeId = typeId;
		this.label = label;
	}




	public long getTypeId() {
		return typeId;
	}


	public void setTypeId(long typeId) {
		this.typeId = typeId;
	}


	public String getLabel() {
		return label;
	}


	public void setLabel(String label) {
		this.label = label;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cart [typeId=");
		builder.append(typeId);
		builder.append(", label=");
		builder.append(label);
		builder.append("]");
		return builder.toString();
	}
	
}
