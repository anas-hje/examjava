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
import javax.persistence.OneToMany;
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
@ToString
public class Appartement {

	@Id
	@Column(name="lettre_appartement")
	private String lettre_appartement;
	
	@Column(name = "nb_pieces_total")
	private int nb_pieces_total;
	
	@OneToMany(mappedBy = "Etage", fetch = FetchType.EAGER)
	private List<Etage> Etage;

	public String getLettre_appartement() {
		return lettre_appartement;
	}

	public void setLettre_appartement(String lettre_appartement) {
		this.lettre_appartement = lettre_appartement;
	}

	public int getNb_pieces_total() {
		return nb_pieces_total;
	}

	public void setNb_pieces_total(int nb_pieces_total) {
		this.nb_pieces_total = nb_pieces_total;
	}

	public List<Etage> getEtage() {
		return Etage;
	}

	public void setEtage(List<Etage> etage) {
		Etage = etage;
	}
    public Appartement () {}
	public Appartement(String lettre_appartement, int nb_pieces_total) {
		super();
		this.lettre_appartement = lettre_appartement;
		this.nb_pieces_total = nb_pieces_total;
		
	}
	
}
