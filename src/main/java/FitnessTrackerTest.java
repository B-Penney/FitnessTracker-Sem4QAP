import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

public class FitnessTrackerTest {
    private FitnessTracker tracker;

    @BeforeEach
    void setUp() {
        tracker = new FitnessTracker();
    }

    @Test
    void testLogWorkoutIncreasesTotalWorkouts() {
        tracker.logWorkout("Walk 15 000 steps");
        tracker.logWorkout("Swimming 30 minutes");
        tracker.logWorkout("Meditation 30 minutes aka zone out and stare at the wall for a little while");
        tracker.logWorkout("Hiking 2 hours");
        tracker.logWorkout("Roller Skating 1 hour");

        assertEquals(5, tracker.getTotalWorkouts(), "After logging each workout, Total workouts should now be 5.");
    }

    @Test
    void testSetGoalAndCheckGoalMet() {
        tracker.setGoal(10);
        tracker.logWorkout("Squats");
        tracker.logWorkout("Planks");
        tracker.logWorkout("Sit-Ups");
        tracker.logWorkout("Jumping Jacks");
        tracker.logWorkout("Shoulder Press");
        tracker.logWorkout("Push-ups");
        tracker.logWorkout("Forward Lunge");
        tracker.logWorkout("Backward Lunge");
        tracker.logWorkout("Bicycle");
        tracker.logWorkout("Wall Sit");

        assertTrue(tracker.isGoalMet(), "Goal has been met!");
    }

    @Test
    void testWorkoutLogReturnsCorrectEntries() {
        tracker.logWorkout("Swimming");
        tracker.logWorkout("Yoga");
        tracker.logWorkout("Hiking");

        List<String> log = tracker.getWorkoutLog();
        assertEquals(3, log.size(), "Workout log contains 3 workouts.");
        assertEquals("Swimming", log.get(0), "First workout should be 'Swimming'.");
        assertEquals("Yoga", log.get(1), "Second workout should be 'Yoga'.");
        assertEquals("Hiking", log.get(2), "Third workout should be 'Hiking'.");
    }
}