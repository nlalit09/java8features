public class Project {
    private String code;
    private String name;
    private String client;
    private String buLeadName;
    public Project(String code, String name, String client, String buLeadName) {
        this.code = code;
        this.name = name;
        this.client = client;
        this.buLeadName = buLeadName;
    }
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public String getBuLeadName() {
        return buLeadName;
    }

    public void setBuLeadName(String buLeadName) {
        this.buLeadName = buLeadName;
    }
}
