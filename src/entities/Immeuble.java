package entities;

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
@ToString(onlyExplicitlyIncluded = true)
public class Immeuble {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="num_immeuble")
	@ToString.Include
	private int num_immeuble; 
	
	@Column(name = "nb_etage_total")
	@ToString.Include
	private int nb_etage_total;
	
	@OneToMany(mappedBy = "domaine")
	private List<Rue> Rue;

	public int getNum_immeuble() {
		return num_immeuble;
	}

	public void setNum_immeuble(int num_immeuble) {
		this.num_immeuble = num_immeuble;
	}

	public int getNb_etage_total() {
		return nb_etage_total;
	}

	public void setNb_etage_total(int nb_etage_total) {
		this.nb_etage_total = nb_etage_total;
	}

	public List<Rue> getRue() {
		return Rue;
	}

	public void setRue(List<Rue> rue) {
		Rue = rue;
	}

	public Immeuble(int num_immeuble, int nb_etage_total, List<entities.Rue> rue) {
		super();
		this.num_immeuble = num_immeuble;
		this.nb_etage_total = nb_etage_total;
		Rue = rue;
	} 
	
	public Immeuble () {}
}
