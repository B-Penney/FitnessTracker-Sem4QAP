public class Main {
    public static void main(String[] args) {
        FitnessTracker tracker = new FitnessTracker();
        tracker.setGoal(5);
        tracker.logWorkout("Walk 15 000 steps");
        tracker.logWorkout("Yoga - 45 minutes");
        tracker.logWorkout("Swimming 30 minutes");
        tracker.logWorkout("Dodge-ball 30 minutes");
        tracker.logWorkout("Hiking 2 hours");

        System.out.println("Workout Log: " + tracker.getWorkoutLog());
        System.out.println("Total Workouts: " + tracker.getTotalWorkouts());
        System.out.println("Have you met your goal? " + tracker.isGoalMet());
    }
}
