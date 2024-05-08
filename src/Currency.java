import java.util.Map;

public record Currency(String base_code, int time_last_update_unix, int time_next_update_unix, Map<String, Double> conversion_rates) {
}
