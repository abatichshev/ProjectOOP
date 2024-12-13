import java.util.HashMap;
import java.util.Map;

class Transcript {
    private Map<Course, Mark> transcript;

    public Transcript() {
        this.transcript = new HashMap<>();
    }

    public Map<Course, Mark> getTranscript() {
        return transcript;
    }

    public void addMark(Course course, Mark mark) {
        transcript.put(course, mark);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Transcript:\n");
        for (Map.Entry<Course, Mark> entry : transcript.entrySet()) {
            sb.append("Course: ").append(entry.getKey().toString())
              .append(", Mark: ").append(entry.getValue().toString()).append("\n");
        }
        return sb.toString();
    }
}
