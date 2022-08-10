import java.util.*;

public class Institute {
  long unitId;
  String institutionName;
  String city;
  String stateAbreviation;
  String zip;
  String accredagency;
  String institutionURL;
  double latitude;
  double longitude;
  String ccUndergradProfile; // cc stands for carnegie classification

  // A constructor setting all instance variables
  public Institute(long unitId, String institutionName, String city,
                   String stateAbreviation, String zip, String accredagency, String institutionURL,
                   double latitude, double longitude, String ccUndergradProfile) {

    this.unitId = unitId;
    this.institutionName = institutionName;
    this.city = city;
    this.stateAbreviation = stateAbreviation;
    this.zip = zip;
    this.accredagency = accredagency;
    this.institutionURL = institutionURL;
    this.latitude = latitude;
    this.longitude = longitude;
    this.ccUndergradProfile = ccUndergradProfile;

  }

  // CREATE Getters and Setters for each instance variable HERE
  public long getUnitId() {
    return unitId;
  }

  public String getInstitutionName() {
    return institutionName;
  }

  public String getCity() {
    return city;
  }

  public String getStateAbreviation() {
    return stateAbreviation;
  }

  public String getZip() {
    return zip;
  }

  public String getAccredagency() {
    return accredagency;
  }

  public String getInstitutionURL() {
    return institutionURL;
  }

  public double getLatitude() {
    return latitude;
  }

  public double getLongitude() {
    return longitude;
  }

  public String getCcUndergradProfile() {
    return ccUndergradProfile;
  }

  public void setUnitId() {
    this.unitId = unitId;
  }

  public void setInstitutionName() {
    this.institutionName = institutionName;
  }

  public void setCity() {
    this.city = city;
  }

  public void setStateAbreviation() {
    this.stateAbreviation = stateAbreviation;
  }

  public void setZip() {
    this.zip = zip;
  }

  public void setAccredagency() {
    this.accredagency = accredagency;
  }

  public void setInstitutionURL() {
    this.institutionURL = institutionURL;
  }

  public void setLatitude() {
    this.latitude = latitude;
  }

  public void setLongitude() {
    this.longitude = longitude;
  }

  public void setCcUndergradProfile() {
    this.ccUndergradProfile = ccUndergradProfile;
  }

  // Create the compareTo method which compares record based first on the institution name and then the unitId
  public int compareTo(Institute institute2) {
    if (this.getInstitutionName() == institute2.getInstitutionName()) {
      if (this.getUnitId() < institute2.getUnitId()) {
        return -1;
      }
      else if (this.getUnitId() > institute2.getUnitId())
        return 1;
    }
    return 0;
  }
}


