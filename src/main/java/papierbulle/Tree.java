package papierbulle;

import com.opencsv.bean.CsvBindByName;

public class Tree {

    @CsvBindByName(column = "Tree_ID")
    private String treeID;
    @CsvBindByName(column = "Address")
    private String address;
    @CsvBindByName(column = "Town")
    private String town;
    @CsvBindByName(column = "Tree_Species")
    private String treeSpecies;
    @CsvBindByName(column = "Species_Desc")
    private String speciesDesc;
    @CsvBindByName(column = "Common_Name")
    private String commonName;
    @CsvBindByName(column = "Age_Desc")
    private String ageDesc;
    @CsvBindByName(column = "Height")
    private String height;
    @CsvBindByName(column = "Spread")
    private String spread;
    @CsvBindByName(column = "Trunk")
    private String trunk;
    @CsvBindByName(column = "Actual_Trunk")
    private String actualTrunk;
    @CsvBindByName(column = "Condition")
    private String condition;
    @CsvBindByName(column = "Lat")
    private String lattitude;
    @CsvBindByName(column = "Long")
    private String longitude;

    public String getTreeID() {
        return treeID;
    }

    public void setTreeID(String treeID) {
        this.treeID = treeID;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getTreeSpecies() {
        return treeSpecies;
    }

    public void setTreeSpecies(String treeSpecies) {
        this.treeSpecies = treeSpecies;
    }

    public String getSpeciesDesc() {
        return speciesDesc;
    }

    public void setSpeciesDesc(String speciesDesc) {
        this.speciesDesc = speciesDesc;
    }

    public String getCommonName() {
        return commonName;
    }

    public void setCommonName(String commonName) {
        this.commonName = commonName;
    }

    public String getAgeDesc() {
        return ageDesc;
    }

    public void setAgeDesc(String ageDesc) {
        this.ageDesc = ageDesc;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getSpread() {
        return spread;
    }

    public void setSpread(String spread) {
        this.spread = spread;
    }

    public String getTrunk() {
        return trunk;
    }

    public void setTrunk(String trunk) {
        this.trunk = trunk;
    }

    public String getActualTrunk() {
        return actualTrunk;
    }

    public void setActualTrunk(String actualTrunk) {
        this.actualTrunk = actualTrunk;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getLattitude() {
        return lattitude;
    }

    public void setLattitude(String lattitude) {
        this.lattitude = lattitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }
}
