package mode.instance.structuuralmodel.adapterpattern.filierpattern;

import java.util.List;

public interface Criteria {
    public List<Person> meetCriteria(List<Person> persons);
}
