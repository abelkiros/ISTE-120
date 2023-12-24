class ContactList{
    String textFile = "";
    String[] lastname;
    String[] firstname;
    String[] phone;
    int index;
    int ctr;
    ContactList(){


    }

    //we set a constructor here which takes the
    //name of the address book and set it using the 
    //setTextFile method
    ContactList(String addbook){
        setTextFile(addbook);
    }
    //we set the value textfile here
    public void setTextFile(String addbook){
        this.textFile = addbook;
    }

    //we can get the value of the text file using this method
    public String getTextFile(){
        return this.textFile;
    }

    //the readContactList method is used to read from the file
    //it is also used to get the number of records in the text file
    //we use the split method to split contents of the text file
    //using a comma and putting it an array
    public void readContactList(){
        try{
            this.ctr = 0;
            this.index  = 0;
            FileReader reader1 = new FileReader(getTextFile());
            Scanner read1 = new Scanner(reader1);
            //number of records
            while(read1.hasNextLine()){
                read1.nextLine();
                this.index++;
            }
            read1.close();
            //it also corresponds to the number of elements
            //of our array
            this.lastname = new String[this.index];
            this.firstname = new String[this.index];
            this.phone = new String[this.index];

            FileReader reader2 = new FileReader(getTextFile());
            Scanner read2 = new Scanner(reader2);
            //we put the first name, last name and phone from the content
            while(read2.hasNextLine()){
                String line = read2.nextLine();
                String[] word = line.split(",");
                this.lastname[ctr] = word[0];
                this.firstname[ctr] = word[1];
                this.phone[ctr] = word[2];
                this.ctr++;
            }

            read2.close();

        }catch(IOException e){
            System.out.println("No such file");
        }

    }

    //we call readContactList method here
    //then we take a string parameter and compare it with the values in our lastname array
    //if there is a match we print
    public void search(String crit){
        readContactList();
        int flag = 0;
        System.out.println();
        try{
            for(int i = 0; i<this.lastname.length; i++){
                if(this.lastname[i].equals(crit)){
                    System.out.println(this.lastname[i] + "," +this.firstname[i]+ "," +this.phone[i]);
                    flag = 1;
                }
            }
            if(flag==0){
                System.out.println("Search has no result");
            }
            System.out.println();
        }catch(NullPointerException e){
            System.out.println("Text file does not have a content");
        }

    }
    //display all method here
    public void displayAll(){
        readContactList();
        System.out.println();
        System.out.println("This file has " +this.index+ " records: ");
        try{
            for(int i = 0; i<this.lastname.length; i++){
                System.out.println(this.lastname[i] + "," +this.firstname[i]+ "," +this.phone[i]);
            }
            System.out.println();
        }catch(NullPointerException e){
            System.out.println("Text file does not have a content.");
        }

    }
    //we create an object for the fireWriter class here
    //we use true as a paramater to to append values instead of overwrite
    public void addNewRecord(String rec){
        try{
            FileWriter writer = new FileWriter(getTextFile(), true);
            //write our first name to the file
            writer.write(rec);
            writer.write("\r\n");
            writer.close();
            readContactList();
            displayAll();
        }catch(IOException e){
            System.out.println("No such file");
        }

    }
}