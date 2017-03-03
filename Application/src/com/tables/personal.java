package com.tables;

import javax.jdo.annotations.Extension;
import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

@SuppressWarnings("unused")
@PersistenceCapable
public class personal {
	
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	/*@Extension(vendorName="datanucleus", key="gae.pk-name", value="true")*/
	Long id;	

	@Persistent
	String firstName;
	
	@Persistent
	String middleName;
	
	@Persistent
	String lastName;
	
	@Persistent
	String day;
	
	@Persistent
	String month;
	
	@Persistent
	String year;
	
	@Persistent
	String age;
	
	@Persistent
	String gender;
	
	@Persistent
	String fatherName;
	
	@Persistent
	String fatherOccupation;
	
	@Persistent
	String motherName;
	
	@Persistent
	String annualIncome;
	
	@Persistent
	String religion;
	
	@Persistent
	String caste;
	
	@Persistent
	String exserviceman;
	
	@Persistent
	String bloogGroup;
	
	@Persistent
	String stp;
	
	@Persistent
	String permanentAddress;
	
	@Persistent
	String permanentDistrict;
	
	@Persistent
	String permanentTaluk;
	
	@Persistent
	String residentalAddress;
	
	@Persistent
	String residentalDistrict;
	
	@Persistent
	String residentalTaluk;
	
	@Persistent
	String mobileNumber1;
	
	@Persistent
	String mobileNumber2;
	
	
	@Persistent
	String email;
	
	@Persistent
	String sslcName;
	
	@Persistent
	String hscName;
	
	@Persistent
	String sslcMark;
	
	@Persistent
	String hscMark;
	
	@Persistent
	String group;
	
	
	@Persistent
	String activity;
	
	@Persistent
	String sports;
	
	@Persistent
	String dance;
	
	@Persistent
	String singing;
	
	@Persistent
	String drawing;
	
	@Persistent
	String readbook;
	
	@Persistent
	String name1;
	
	@Persistent
	String gender1;
	
	@Persistent
	String qualification1;
	
	@Persistent
	String age1;
	
	@Persistent
	String job1;
	
	@Persistent
	String name2;
	
	@Persistent
	String gender2;
	
	@Persistent
	String qualification2;
	
	@Persistent
	String age2;
	
	@Persistent
	String job2;
	
	@Persistent
	String name3;
	
	@Persistent
	String gender3;
	
	@Persistent
	String qualification3;
	
	@Persistent
	String age3;
	
	@Persistent
	String job3;
	
	@Persistent
	String graduate;
	
	@Persistent
	String division;
	
	@Persistent
	String course;
	
	
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getFatherOccupation() {
		return fatherOccupation;
	}

	public void setFatherOccupation(String fatherOccupation) {
		this.fatherOccupation = fatherOccupation;
	}

	public String getMotherName() {
		return motherName;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	public String getAnnualIncome() {
		return annualIncome;
	}

	public void setAnnualIncome(String annualIncome) {
		this.annualIncome = annualIncome;
	}

	public String getReligion() {
		return religion;
	}

	public void setReligion(String religion) {
		this.religion = religion;
	}

	public String getCaste() {
		return caste;
	}

	public void setCaste(String caste) {
		this.caste = caste;
	}

	public String getExserviceman() {
		return exserviceman;
	}

	public void setExserviceman(String exserviceman) {
		this.exserviceman = exserviceman;
	}

	public String getBloogGroup() {
		return bloogGroup;
	}

	public void setBloogGroup(String bloogGroup) {
		this.bloogGroup = bloogGroup;
	}

	public String getStp() {
		return stp;
	}

	public void setStp(String stp) {
		this.stp = stp;
	}

	public String getPermanentAddress() {
		return permanentAddress;
	}

	public void setPermanentAddress(String permanentAddress) {
		this.permanentAddress = permanentAddress;
	}

	public String getPermanentDistrict() {
		return permanentDistrict;
	}

	public void setPermanentDistrict(String permanentDistrict) {
		this.permanentDistrict = permanentDistrict;
	}

	public String getPermanentTaluk() {
		return permanentTaluk;
	}

	public void setPermanentTaluk(String permanentTaluk) {
		this.permanentTaluk = permanentTaluk;
	}

	public String getResidentalAddress() {
		return residentalAddress;
	}

	public void setResidentalAddress(String residentalAddress) {
		this.residentalAddress = residentalAddress;
	}

	public String getResidentalDistrict() {
		return residentalDistrict;
	}

	public void setResidentalDistrict(String residentalDistrict) {
		this.residentalDistrict = residentalDistrict;
	}

	public String getResidentalTaluk() {
		return residentalTaluk;
	}

	public void setResidentalTaluk(String residentalTaluk) {
		this.residentalTaluk = residentalTaluk;
	}

	public String getMobileNumber1() {
		return mobileNumber1;
	}

	public void setMobileNumber1(String mobileNumber1) {
		this.mobileNumber1 = mobileNumber1;
	}

	public String getMobileNumber2() {
		return mobileNumber2;
	}

	public void setMobileNumber2(String mobileNumber2) {
		this.mobileNumber2 = mobileNumber2;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSslcName() {
		return sslcName;
	}

	public void setSslcName(String sslcName) {
		this.sslcName = sslcName;
	}

	public String getHscName() {
		return hscName;
	}

	public void setHscName(String hscName) {
		this.hscName = hscName;
	}

	public String getSslcMark() {
		return sslcMark;
	}

	public void setSslcMark(String sslcMark) {
		this.sslcMark = sslcMark;
	}

	public String getHscMark() {
		return hscMark;
	}

	public void setHscMark(String hscMark) {
		this.hscMark = hscMark;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public String getActivity() {
		return activity;
	}

	public void setActivity(String activity) {
		this.activity = activity;
	}

	public String getSports() {
		return sports;
	}

	public void setSports(String sports) {
		this.sports = sports;
	}

	public String getDance() {
		return dance;
	}

	public void setDance(String dance) {
		this.dance = dance;
	}

	public String getSinging() {
		return singing;
	}

	public void setSinging(String singing) {
		this.singing = singing;
	}

	public String getDrawing() {
		return drawing;
	}

	public void setDrawing(String drawing) {
		this.drawing = drawing;
	}

	public String getReadbook() {
		return readbook;
	}

	public void setReadbook(String readbook) {
		this.readbook = readbook;
	}

	public String getName1() {
		return name1;
	}

	public void setName1(String name1) {
		this.name1 = name1;
	}

	public String getGender1() {
		return gender1;
	}

	public void setGender1(String gender1) {
		this.gender1 = gender1;
	}

	public String getQualification1() {
		return qualification1;
	}

	public void setQualification1(String qualification1) {
		this.qualification1 = qualification1;
	}

	public String getAge1() {
		return age1;
	}

	public void setAge1(String age1) {
		this.age1 = age1;
	}

	public String getJob1() {
		return job1;
	}

	public void setJob1(String job1) {
		this.job1 = job1;
	}

	public String getName2() {
		return name2;
	}

	public void setName2(String name2) {
		this.name2 = name2;
	}

	public String getGender2() {
		return gender2;
	}

	public void setGender2(String gender2) {
		this.gender2 = gender2;
	}

	public String getQualification2() {
		return qualification2;
	}

	public void setQualification2(String qualification2) {
		this.qualification2 = qualification2;
	}

	public String getAge2() {
		return age2;
	}

	public void setAge2(String age2) {
		this.age2 = age2;
	}

	public String getJob2() {
		return job2;
	}

	public void setJob2(String job2) {
		this.job2 = job2;
	}

	public String getName3() {
		return name3;
	}

	public void setName3(String name3) {
		this.name3 = name3;
	}

	public String getGender3() {
		return gender3;
	}

	public void setGender3(String gender3) {
		this.gender3 = gender3;
	}

	public String getQualification3() {
		return qualification3;
	}

	public void setQualification3(String qualification3) {
		this.qualification3 = qualification3;
	}

	public String getAge3() {
		return age3;
	}

	public void setAge3(String age3) {
		this.age3 = age3;
	}

	public String getJob3() {
		return job3;
	}

	public void setJob3(String job3) {
		this.job3 = job3;
	}

	public String getGraduate() {
		return graduate;
	}

	public void setGraduate(String graduate) {
		this.graduate = graduate;
	}

	public String getDivision() {
		return division;
	}

	public void setDivision(String division) {
		this.division = division;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}
	
}
