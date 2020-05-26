package model;

public class ClaimLines {

    private int claimLineId;
    private String description;

    public ClaimLines(int claimLineId, String description) {
        this.claimLineId = claimLineId;
        this.description = description;
    }

    public int getClaimLineId() {
        return claimLineId;
    }

  /*  public void setClaimLineId(int claimLineId) {
        this.claimLineId = claimLineId;
    }*/

    public String getDescription() {
        return description;
    }

    /*public void setDescription(String description) {
        this.description = description;
    }*/
}
