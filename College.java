import java.util.ArrayList;
import java.util.List;

public class College implements OrganizationalComponent {
    private String name;
    private List<OrganizationalComponent> components;

    public College(String name) {
        this.name = name;
        this.components = new ArrayList<>();
    }

    public void addComponent(OrganizationalComponent component) {
        components.add(component);
    }

    public void removeComponent(OrganizationalComponent component) {
        components.remove(component);
    }

    @Override
    public int getNumberOfStudents() {
        return components.stream().mapToInt(OrganizationalComponent::getNumberOfStudents).sum();
    }

    @Override
    public void displayDetails() {
        System.out.println("College: " + name);
        for (OrganizationalComponent component : components) {
            component.displayDetails();
        }
    }

    @Override
    public double getBudget() {
        return components.stream().mapToDouble(OrganizationalComponent::getBudget).sum();
    }
}