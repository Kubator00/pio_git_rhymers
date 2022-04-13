package edu.kis.vh.nursery;
//skrót klawiszowy alt+strzałka przesuwa nas pomiędzy aktualnie otwartymi plikami
//wiersze źle sformatowane: 5,12,14,15
public class HanoiRhymer extends DefaultCountingOutRhymer {

    int totalRejected = 0;

    public int reportRejected() {
        return totalRejected;
    }

    public void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }
}
