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
public class Etage {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="num_etage")
	private int num_etage;
	
	@Column(name = "nb_appartements_tot")
	private int nb_appartements_tot;
	
	@OneToMany(mappedBy = "Immeuble", fetch = FetchType.EAGER)
	private List<Immeuble> Immeuble;

	public int getNum_etage() {
		return num_etage;
	}

	public void setNum_etage(int num_etage) {
		this.num_etage = num_etage;
	}

	public int getNb_appartements_tot() {
		return nb_appartements_tot;
	}

	public void setNb_appartements_tot(int nb_appartements_tot) {
		this.nb_appartements_tot = nb_appartements_tot;
	}

	public List<Immeuble> getImmeuble() {
		return Immeuble;
	}

	public void setImmeuble(List<Immeuble> immeuble) {
		Immeuble = immeuble;
	}

	public Etage(int num_etage, int nb_appartements_tot, List<entities.Immeuble> immeuble) {
		super();
		this.num_etage = num_etage;
		this.nb_appartements_tot = nb_appartements_tot;
		Immeuble = immeuble;
	}
	public Etage () {}
}
