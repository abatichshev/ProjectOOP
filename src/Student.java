import java.util.*;

public class Student {
    private  String studentID;
    private StudentType studentType;
    private List<Course> enrolledCourses;
    private double gpa;
    private Schedule schedule;
    private String faculty;
    private List<StudentOrganization> enrolledOrganization;
    private Mark marks;
    private Transcript transcript;
    private int attendance;

    public Student(String studentID, StudentType studentType, String faculty) {
        this.studentID = studentID;
        this.studentType = studentType;
        this.faculty = faculty;
        this.enrolledCourses = new ArrayList<>();
        this.enrolledOrganization = new ArrayList<>();
        this.transcript = new Transcript();  
    }

    public void registerCourse(Course course) {
        if (!enrolledCourses.contains(course)) {
            enrolledCourses.add(course);
        }
    }

    public double getGpa() {
        return gpa;
    }

    public List<Course> viewCourses() {
        return enrolledCourses;
    }

    public Schedule viewSchedule() {
        return schedule;
    }

    public void dropCourse(Course course) {
        enrolledCourses.remove(course);
    }

    public void rateTeacher(Teacher teacher, double rating) {
        if (rating < 0 || rating > 10) {
            throw new IllegalArgumentException("Rating must be between 0 and 10");
        }
        teacher.addRating(rating);
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public List<Book> getBorrowedBooks() {
        return transcript.getBorrowedBooks();
            }
        
            public List<StudentOrganization> getEnrolledOrganization() {
                return enrolledOrganization;
            }
        
            public Mark viewMarks() {
                return marks;
            }
        
            public Transcript viewTranscript() {
                return transcript;
            }
        
            public int getAttendance() {
                return attendance;
            }
        
            public void conductResearch() {
            }
        
            public ResearchField getResearchField() {
                return null;
            }
        
            public void publishResearchPaper(ResearchPaper paper) {
            }
        
            public void assignSupervisor(Researcher supervisor) throws InvalidIndexException {
            }
        
 @Override
            public String toString() {
                return "Student{" +
                        "studentID='" + studentID + '\'' +
                        ", studentType=" + studentType +
                        ", faculty='" + faculty + '\'' +
                        '}';
            }
        
@Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
             Student that = (Student) o;
            return Objects.equals(studentID, that.studentID);
}

@Override
       public int hashCode() {
            return Objects.hash(studentID);
}
        class Teacher {
            public void addRating(double rating) {
    }
}

        }
        class Book {}
        class ResearchField {}
        class ResearchPaper {}
        class Researcher {}
        class InvalidIndexException extends Exception {}
        class Course {}
        class Schedule {}
        class Mark {}
        class Transcript {
        
            public List<Book> getBorrowedBooks() {

                throw new UnsupportedOperationException("Unimplemented method 'getBorrowedBooks'");
            }}