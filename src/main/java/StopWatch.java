
import java.util.Date;

public class StopWatch {
    private double startTime, endTime;

    public double getStartTime() {
        return this.startTime;
    }

    public double getEndTime() {
        return this.endTime;
    }

    StopWatch() {

    }

    void start() {
        this.startTime = new Date().getTime();
    }

    void stop() {
        this.endTime = new Date().getTime();
    }

    double getElapsedTime() {
        return this.endTime - this.startTime;
    }
}
