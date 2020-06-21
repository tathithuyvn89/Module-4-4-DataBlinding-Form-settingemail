package myapp.model;

public class EmailSetting {
    private String language;
    private int page;
    private boolean filterSpam;
    private String signature;

    public EmailSetting(String language, int page, String signature) {
        this.language = language;
        this.page = page;
        this.signature = signature;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public boolean isFilterSpam() {
        return filterSpam;
    }

    public void setFilterSpam(boolean filterSpam) {
        this.filterSpam = filterSpam;
    }

    public String getSignature() {
        return signature;
    }

    public EmailSetting() {
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }
}
