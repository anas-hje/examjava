package entities;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString(onlyExplicitlyIncluded = true)
public class Rue {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="code_rue")
	@ToString.Include
	private int code_rue;
	
	@Column(name = "description", nullable = false, length = 40)
	@ToString.Include
	private String nom_rue;

	public int getCode_rue() {
		return code_rue;
	}

	public void setCode_rue(int code_rue) {
		this.code_rue = code_rue;
	}

	public String getNom_rue() {
		return nom_rue;
	}

	public void setNom_rue(String nom_rue) {
		this.nom_rue = nom_rue;
	}

	public Rue(int code_rue, String nom_rue) {
		super();
		this.code_rue = code_rue;
		this.nom_rue = nom_rue;
	}
	
	public Rue () {}

}