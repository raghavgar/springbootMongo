package model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.ArrayList;
import java.util.Collection;

@Document(collection = "claimsData22")
public class Claim {

    @Id
    private String claimId;

   /* public Claim(String claimId) {
        this.claimId = claimId;
    }

    protected Claim(){

    }
    public String getClaimId() {
        return claimId;
    }

    public void setClaimId(String claimId) {
        this.claimId = claimId;
    }*/

    private Collection<ClaimLines> claimLines = new ArrayList<>();
    @Field("provider_Information")
    private ProviderInfo providerInfo;

    protected Claim() {
    }

    public Claim(String claimId, Collection<ClaimLines> claimLines, ProviderInfo providerInfo) {
        this.claimId = claimId;
        this.claimLines = claimLines;
        this.providerInfo = providerInfo;
    }

    public String getClaimId() {
        return claimId;
    }

    /*public void setClaimId(String claimId) {
        this.claimId = claimId;
    }*/

    public Collection<ClaimLines> getClaimLines() {
        return claimLines;
    }

   /* public void setClaimLines(Collection<ClaimLines> claimLines) {
        this.claimLines = claimLines;
    }*/

    public ProviderInfo getProviderInfo() {
        return providerInfo;
    }

   /* public void setProviderInfo(ProviderInfo providerInfo) {
        this.providerInfo = providerInfo;
    }*/
}
