package net.javaguides.sms.apply.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="apply")
public class Apply {
	
	
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "f_Name")
	private String f_Name;
	
	@Column(name= "surname")
	private String surname;
	
	@Column(name = "DateOfBirth")
	private String DateOfBirth;
	
	@Column(name = "PlaceOfBirth")
	private String PlaceOfBirth;
	
	@Column(name= "gender")
	private String gender;
	
	@Column(name="nationality")
	private String nationality;
	
	@Column(name= "telephone")
	private String telephone;
	
	@Column(name= "mobile")
	private String mobile;
	
	@Column(name= "domicile")
	private String domicile;
	
	@Column(name= "email")
	private String email;
	
	@Column(name= "presentAddress")
	private String presentAddress;
	
	@Column(name = "parmanentAddress")
	private String parmanentAddress;
	
	@Column(name= "appliedFor")
	private String appliedFor;
	
	
	//private String group;
	//private String passingYear;
	//private String seatNo;
	
	
	
	
	
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getF_Name() {
		return f_Name;
	}
	public void setF_Name(String f_Name) {
		this.f_Name = f_Name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getDateOfBirth() {
		return DateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		DateOfBirth = dateOfBirth;
	}
	public String getPlaceOfBirth() {
		return PlaceOfBirth;
	}
	public void setPlaceOfBirth(String placeOfBirth) {
		PlaceOfBirth = placeOfBirth;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getDomicile() {
		return domicile;
	}
	public void setDomicile(String domicile) {
		this.domicile = domicile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPresentAddress() {
		return presentAddress;
	}
	public void setPresentAddress(String presentAddress) {
		this.presentAddress = presentAddress;
	}
	public String getParmanentAddress() {
		return parmanentAddress;
	}
	public void setParmanentAddress(String parmanentAddress) {
		this.parmanentAddress = parmanentAddress;
	}
	public String getAppliedFor() {
		return appliedFor;
	}
	public void setAppliedFor(String appliedFor) {
		this.appliedFor = appliedFor;
	}


	public Apply(long id, String name, String f_Name, String surname, String dateOfBirth, String placeOfBirth,
			String gender, String nationality, String telephone, String mobile, String domicile, String email,
			String presentAddress, String parmanentAddress, String appliedFor) {
		super();
		this.id = id;
		this.name = name;
		this.f_Name = f_Name;
		this.surname = surname;
		DateOfBirth = dateOfBirth;
		PlaceOfBirth = placeOfBirth;
		this.gender = gender;
		this.nationality = nationality;
		this.telephone = telephone;
		this.mobile = mobile;
		this.domicile = domicile;
		this.email = email;
		this.presentAddress = presentAddress;
		this.parmanentAddress = parmanentAddress;
		this.appliedFor = appliedFor;
	}
	

	
	
	public Apply() {
		
	}
	
	
	
	
	
	
	
}
