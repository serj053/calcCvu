package nppnha.calccvu.windows;

public class NewTaskTable {
    private int position;
    private String numberQL;
    private String nameEquipment;
    private int amount;
    private int pipeD;
    private int DN;
    private int PN;
    private int Kvy;
    private String positioner;

    public NewTaskTable(int position, String number, String number1, int amount, int pipeD, int dn, String positioner) {
        this.position = position;
        this.numberQL = number;
        this.nameEquipment = number1;
        this.amount = amount;
        this.pipeD = pipeD;
        this.DN = dn;
        this.PN = 0;
        this.Kvy = 0;
        this.positioner = positioner;
    }

    public int getPosition() {
        return position;
    }

    public String getNumberQL() {
        return numberQL;
    }

    public String getNameEquipment() {
        return nameEquipment;
    }

    public int getAmount() {
        return amount;
    }

    public int getPipeD() {
        return pipeD;
    }

    public int getDN() {
        return DN;
    }

    public int getPN() {
        return PN;
    }

    public int getKvy() {
        return Kvy;
    }
    public String getPositioner() {
        return positioner;
    }
}
