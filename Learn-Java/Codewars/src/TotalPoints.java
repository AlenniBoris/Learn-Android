public class TotalPoints {
    public static int points(String[] games) {
        if (games.length == 10) {
            int points = 0;
            for (String match : games){
                String[] goals = match.split(":");
                if ((0 <= Integer.parseInt(goals[0]) &&  Integer.parseInt(goals[0])<= 4) && (0 <= Integer.parseInt(goals[1]) && Integer.parseInt(goals[1])<= 4)){
                    if (Integer.parseInt(goals[0]) > Integer.parseInt(goals[1]))
                        points += 3;
                    else if (Integer.parseInt(goals[0]) < Integer.parseInt(goals[1]))
                        points += 0;
                    else points += 1;
                }
            }
            return points;
        }
        return 0;
    }
}