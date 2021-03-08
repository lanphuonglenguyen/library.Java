package persistence_project;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.*;

@Entity
@Table (name = "Bank")
public class EBJ_Bank implements java.io.Serializable {

	@Id @GeneratedValue (strategy = GenerationType.AUTO)
	private int id;
	
	@Embeddable// An object "inlined" in bank's DB row
	public class Address {
		protected String StreetAddr1;
		protected String StreetAddr2;
		protected String city;
		protected String state;
		protected String zipeCode;
	}
	
	
	@Embedded
	private Address address;
	
	@OneToMany ( cascade = CascadeType.ALL, fetch = FetchType.EAGER, 
			mappedBy = "bank")
	private Collection<Account> accounts = new ArrayList<Account>();
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}	
	
	
	public Collection<Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(Collection<Account> accounts) {
		this.accounts = accounts;
	}


}
