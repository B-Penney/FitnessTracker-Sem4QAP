import java.util.ArrayList;
import java.util.List;

public class FitnessTracker {
    private final List<String> workoutLog;
    private int totalWorkouts;
    private int goal; // Numeric goal

    public FitnessTracker() {
        this.workoutLog = new ArrayList<>();
        this.totalWorkouts = 0;
        this.goal = 0;
    }

    public void logWorkout(String workout) {
        if (workout == null || workout.trim().isEmpty()) {
            throw new IllegalArgumentException("Please add a workout goal.");
        }
        workoutLog.add(workout);
        totalWorkouts++;
    }

    public int getTotalWorkouts() {
        return totalWorkouts;
    }

    public void setGoal(int goal) {
        if (goal <= 0) {
            throw new IllegalArgumentException("Please enter a goal using a positive number.");
        }
        this.goal = goal;
    }

    public int getGoal() {
        return goal;
    }

    public boolean isGoalMet() {
        return totalWorkouts >= goal;
    }

    public List<String> getWorkoutLog() {
        return new ArrayList<>(workoutLog);
    }
}


