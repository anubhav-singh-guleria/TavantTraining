package self;

public class AndroidPhone {

    private AndroidCharger charger;

    public void plugAndroidCharger(AndroidCharger charger) {
        this.charger = charger;
    }

    public void charge() {
        this.charger.charge();
    }
}