import java.util.ArrayList;
import java.util.List;
class StudentOrganization {
    private String organizationName;
    private String organizationHead;
    private List<Student> organizationMembers;

    public StudentOrganization(String organizationName, String organizationHead) {
        this.organizationName = organizationName;
        this.organizationHead = organizationHead;
        this.organizationMembers = new ArrayList<>();
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public String getOrganizationHead() {
        return organizationHead;
    }

    public void setOrganizationHead(String organizationHead) {
        this.organizationHead = organizationHead;
    }

    public List<Student> getOrganizationMembers() {
        return organizationMembers;
    }

    public void addOrganizationMember(Student student) {
        if (!organizationMembers.contains(student)) {
            organizationMembers.add(student);
        }
    }

    public void removeOrganizationMember(Student student) {
        organizationMembers.remove(student);
    }
}