public class Gpa {

    public int calcPoints(char grade) {

        char gradeLetter = grade;
        int point;

        switch(gradeLetter){

            case 'A':
                point = 4;
                break;
            case 'a':
                point = 4;
                break;
            case 'B':
                point = 3;
                break;
            case 'b':
                point = 3;
                break;
            case 'C':
                point = 2;
                break;
            case 'c':
                point = 2;
                break;
            case 'D':
                point = 1;
                break;
            case 'd':
                point = 1;
                break;
            case 'F':
                point = 0;
                break;
            case 'f':
                point = 0;
                break;
            default:
                point = -1;
                break;
        }

        return point;
    }
}
