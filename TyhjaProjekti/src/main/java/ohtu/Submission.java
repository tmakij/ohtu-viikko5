package ohtu;

public final class Submission {

    /*
     [{"id":88,"student_number":"014257658","last_name":"","first_name":"","week":1,"points":null,"identifier":"","hours":4,"comments":"","email":"",
     "a1":true,"a2":true,"a3":true,"a4":true,"a5":true,"a6":true,"a7":true,"a8":true,"a9":true,"a10":true,"a11":true,
     "a12":null,"a13":null,"a14":null,"a15":null,"a16":null,"a17":null,"a18":null,"a19":null,"a20":null,"a21":null,
     "created_at":"2015-03-15T21:51:59.194Z","updated_at":"2015-03-15T21:51:59.194Z","course_id":1,"github":"","student_id":null},
     */
    private int student_number, week, hours, tehdyt = -1;
    private boolean a1, a2, a3, a4, a5, a6, a7, a8, a9, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20, a21;

    public int getHours() {
        return hours;
    }

    public int getTehdyt() {
        return tehdyt;
    }

    public void setStudent_number(int student_number) {
        this.student_number = student_number;
    }

    public void setWeek(int week) {
        this.week = week;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    private int countTehdyt(StringBuilder sb, boolean... tehtavat) {
        int tehtyja = 0;
        for (int i = 0; i < tehtavat.length; i++) {
            if (tehtavat[i]) {
                tehtyja++;
                sb.append(" ").append(i + 1);
            }
        }
        if (tehdyt == -1) {
            tehdyt = tehtyja;
        }
        return tehtyja;
    }

    /*private String stringifyTehdyt(boolean... tehtavat) {
     String tehdyt = "";
     for (int i = 0; i < tehtavat.length; i++) {
     if (tehtavat[i]) {
     tehdyt += (i + 1);
     }
     }
     return tehdyt;
     }*/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        int tehdyt = countTehdyt(sb, a1, a2, a3, a4, a5, a6, a7, a8, a9, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20, a21);
        String tehdytString = sb.toString();
        return "Viiko " + week + ": tehtyjä tehtäviä yhteensä: " + tehdyt + ", aikaa kului " + hours + " tuntia, tehdyt tehtavat:" + tehdytString;
        //viikko 1: tehtyjä tehtäviä yhteensä: 9, aikaa kului 3 tuntia, tehdyt tehtävät: 1 2 3 4 5 6 7 9 11
    }

    public void setA1(boolean a1) {
        this.a1 = a1;
    }

    public void setA2(boolean a2) {
        this.a2 = a2;
    }

    public void setA3(boolean a3) {
        this.a3 = a3;
    }

    public void setA4(boolean a4) {
        this.a4 = a4;
    }

    public void setA5(boolean a5) {
        this.a5 = a5;
    }

    public void setA6(boolean a6) {
        this.a6 = a6;
    }

    public void setA7(boolean a7) {
        this.a7 = a7;
    }

    public void setA8(boolean a8) {
        this.a8 = a8;
    }

    public void setA9(boolean a9) {
        this.a9 = a9;
    }

    public void setA11(boolean a11) {
        this.a11 = a11;
    }

    public void setA12(boolean a12) {
        this.a12 = a12;
    }

    public void setA13(boolean a13) {
        this.a13 = a13;
    }

    public void setA14(boolean a14) {
        this.a14 = a14;
    }

    public void setA15(boolean a15) {
        this.a15 = a15;
    }

    public void setA16(boolean a16) {
        this.a16 = a16;
    }

    public void setA17(boolean a17) {
        this.a17 = a17;
    }

    public void setA18(boolean a18) {
        this.a18 = a18;
    }

    public void setA19(boolean a19) {
        this.a19 = a19;
    }

    public void setA20(boolean a20) {
        this.a20 = a20;
    }

    public void setA21(boolean a21) {
        this.a21 = a21;
    }

}
