class Jack
{
    //attributes
    private String buildingCode;
    private String jackType;
    private int roomNumber;
    private int jackNumber;

    /** default constructor for Jack */
    public Jack()
    {
        buildingCode = "???";
        jackType = "";
        roomNumber = 0;
        jackNumber = 0;
    }

    /** parameterized constructor that accepts values to set buildingCode, roomNumber, and jackNumber
     * and also sets jackType to "ENET"
     */
    public Jack(String buildingCode, int roomNumber, int jackNumber)
    {
        this.buildingCode = buildingCode;
        this.roomNumber = roomNumber;
        this.jackNumber = jackNumber;
        this.jackType = "ENET";
    }

    /**Accessor buildingCode*/
    public String getBuildingCode(){return buildingCode;}

    /**Accessor jackType*/
    public String getJackType(){return jackType;}

    /**Accessor roomNumber */
    public int getRoomNumber(){return roomNumber;}

    /**Accessor jackNumber*/
    public int getJackNumber(){return jackNumber;}

    /**Mutator buildingCode*/
    public void setBuildingCode(String buildingCode) {
        this.buildingCode = buildingCode;
    }

    /**Mutator jackType*/
    public void setJackType(String jackType) {
        this.jackType = jackType;
    }

    /**Mutator roomNumber*/
    public void setRoomNumber(int roomNumber){
        this.roomNumber = roomNumber;
    }

    /**Mutator jackNumber*/
    public void setJackNumber(int jackNumber) {
        this.jackNumber = jackNumber;
    }
}