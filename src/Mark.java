class Mark {
    private String letterMark;
    private Double percentageMark;
    private Double gpa;
    private Course course;
    private Mark firstAttestation;
    private Mark secondAttestation;
    private Mark finalMark;

    public Mark(String letterMark, Double percentageMark, Double gpa, Course course) {
        this.letterMark = letterMark;
        this.percentageMark = percentageMark;
        this.gpa = gpa;
        this.course = course;
    }

    public void setMark(Mark mark) {
        if (mark != null) {
            this.letterMark = mark.letterMark;
            this.percentageMark = mark.percentageMark;
            this.gpa = mark.gpa;
            this.course = mark.course;
        }
    }

    public Mark getMark() {
        return this;
    }

    public Double getGpa() {
        return gpa;
    }

    public void setGpa(Double gpa) {
        this.gpa = gpa;
    }

    public Mark getFirstAttestation() {
        return firstAttestation;
    }

    public void setFirstAttestation(Mark firstAttestation) {
        this.firstAttestation = firstAttestation;
    }

    public Mark getSecondAttestation() {
        return secondAttestation;
    }

    public void setSecondAttestation(Mark secondAttestation) {
        this.secondAttestation = secondAttestation;
    }

    public Mark getFinal() {
        return finalMark;
    }

    public void setFinal(Mark finalMark) {
        this.finalMark = finalMark;
    }

    public void assignFirstAttestation() {
        this.firstAttestation = new Mark("F", 0.0, 0.0, this.course);
    }

    public void assignSecondAttestation() {
        this.secondAttestation = new Mark("F", 0.0, 0.0, this.course);
    }

    public void assignFinal() {
        this.finalMark = new Mark("F", 0.0, 0.0, this.course);
    }

    @Override
    public String toString() {
        return "Mark{" +
                "letterMark='" + letterMark + '\'' +
                ", percentageMark=" + percentageMark +
                ", gpa=" + gpa +
                ", course=" + (course != null ? course.toString() : "No course") +
                ", firstAttestation=" + (firstAttestation != null ? firstAttestation.toString() : "Not assigned") +
                ", secondAttestation=" + (secondAttestation != null ? secondAttestation.toString() : "Not assigned") +
                ", finalMark=" + (finalMark != null ? finalMark.toString() : "Not assigned") +
                '}';
    }
}
