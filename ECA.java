import java.util.List;

public class ECA {
    /**
     * Count the total number of configurations possible such that all
     * students are assigned to one extra-curricular activity (ECA)
     * and ECAs have the required number of students. If there is no
     * possible configuration, returns 0.
     *
     * Inputs:
     *  numStudents:  the number of students
     *  activitySizes: the number of students that must participate in each activity
     *
     * Returns: total number of configurations possible or 0 if not all students
     */
    public static int countConfigurations(int numStudents, int[] activitySizes) {
        // TODO: complete this functipn
//        int count = 0;
//        int studentCount = numStudents;
//        while (studentCount>0){
//
//        }
//        return -1;
        return countConfigs(numStudents, activitySizes, 0);
    }

    public static int countConfigs(int numStudents, int[] activitySizes, int currentPos) {
        if (numStudents == 0){
            return 1;
        }
        if (currentPos >= activitySizes.length) {
            return 0;
        }
        return countConfigs(numStudents - activitySizes[currentPos], activitySizes, currentPos+1) +
                countConfigs(numStudents, activitySizes, currentPos+1);
    }
}