package model;

public class ProviderInfo {

    private String providerName;
    private String npi;

    public ProviderInfo(String providerName, String npi) {
        this.providerName = providerName;
        this.npi = npi;
    }

    public String getProviderName() {
        return providerName;
    }

   /* public void setProviderName(String providerName) {
        this.providerName = providerName;
    }*/

    public String getNpi() {
        return npi;
    }

  /*  public void setNpi(String npi) {
        this.npi = npi;
    }*/
}
