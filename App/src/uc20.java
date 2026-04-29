public class uc20 {
    public static void main(String[] args) {

        String[] bogieIds = {"BG101", "BG205", "BG309"};
        String searchKey = "BG205";

        if (bogieIds == null || bogieIds.length == 0) {
            throw new IllegalStateException("No bogies available for search");
        }

        boolean found = false;

        for (String id : bogieIds) {
            if (id.equals(searchKey)) {
                found = true;
                break;
            }
        }

        System.out.println(found);
    }
}