public class AppConfig {
    private String theme;
    private String language;

    public AppConfig() {
        // Load default settings
        this.theme = "Light";
        this.language = "EN";
        System.out.println("New AppConfig instance created!");
    }

    public String getTheme() { return theme; }
    public void setTheme(String theme) { this.theme = theme; }

    public String getLanguage() { return language; }
    public void setLanguage(String language) { this.language = language; }

    public void printConfig() {
        System.out.println("Theme: " + theme + ", Language: " + language);
    }
}