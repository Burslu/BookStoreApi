package AfadApiTest;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public class AfadResponsePojo {

    @JsonProperty("rms")
    public String rms;
    @JsonProperty("eventID")
    public String eventID;
    @JsonProperty("location")
    public String location;
    @JsonProperty("latitude")
    public String latitude;
    @JsonProperty("longitude")
    public String longitude;
    @JsonProperty("depth")
    public String depth;
    @JsonProperty("type")
    public String type;
    @JsonProperty("magnitude")
    public String magnitude;
    @JsonProperty("country")
    public String country;
    @JsonProperty("province")
    public String province;
    @JsonProperty("district")
    public String district;
    @JsonProperty("neighborhood")
    public Object neighborhood;
    @JsonProperty("date")
    public Date date;
    @JsonProperty("isEventUpdate")
    public boolean isEventUpdate;
    @JsonProperty("lastUpdateDate")
    public Object lastUpdateDate;

    public String getRms() {
        return rms;
    }

    public void setRms(String rms) {
        this.rms = rms;
    }

    public String getEventID() {
        return eventID;
    }

    public void setEventID(String eventID) {
        this.eventID = eventID;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getDepth() {
        return depth;
    }

    public void setDepth(String depth) {
        this.depth = depth;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMagnitude() {
        return magnitude;
    }

    public void setMagnitude(String magnitude) {
        this.magnitude = magnitude;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public Object getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(Object neighborhood) {
        this.neighborhood = neighborhood;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public boolean isEventUpdate() {
        return isEventUpdate;
    }

    public void setEventUpdate(boolean eventUpdate) {
        isEventUpdate = eventUpdate;
    }

    public Object getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(Object lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    @Override
    public String toString() {
        return "AfadResponsePojo{" +
                "rms='" + rms + '\'' +
                ", eventID='" + eventID + '\'' +
                ", location='" + location + '\'' +
                ", latitude='" + latitude + '\'' +
                ", longitude='" + longitude + '\'' +
                ", depth='" + depth + '\'' +
                ", type='" + type + '\'' +
                ", magnitude='" + magnitude + '\'' +
                ", country='" + country + '\'' +
                ", province='" + province + '\'' +
                ", district='" + district + '\'' +
                ", neighborhood=" + neighborhood +
                ", date=" + date +
                ", isEventUpdate=" + isEventUpdate +
                ", lastUpdateDate=" + lastUpdateDate +
                '}';
    }
}
