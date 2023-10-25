package Data;

import java.util.HashMap;

public enum StateAndCityPracticeForm {

    STATE_NCR("NCR", new String[]{ "Delhi", "Gurgaon", "Noida" }),
    STATE_UTTAR_PRADESH("Uttar Pradesh", new String[]{ "Lucknow", "Merrut", "Agra" }),
    STATE_HARYANA("Haryana", new String[]{ "Karnal", "Panipat" }),
    STATE_RAJASTHAN("Rajasthan", new String[]{ "Jaipur", "Jaiselmer" });

    private final String state;
    private final String[] city;

    StateAndCityPracticeForm(String state, String[] city) {
        this.state = state;
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public String[] getCity() {
        return city;
    }

    public static final HashMap<String, String[]> statesAndCities = new HashMap<>();

    static {
        for (StateAndCityPracticeForm state : StateAndCityPracticeForm.values()) {
            statesAndCities.put(state.getState(), state.getCity());
        }
    }

}