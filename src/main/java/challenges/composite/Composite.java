package challenges.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {
    private List<Component> components =  new ArrayList<>();

    public void add(Component component) {
        components.add(component);
    }

    public void remove(Component component) {
        components.remove(component);
    }

    public List<Component> getChildren() {
        return components;
    }

    public void execute() {
        components.forEach(Component::execute);
    }
}
