package mode.instance.structuuralmodel.adapterpattern.filierpattern;

import java.util.List;

public class AndCriteria implements Criteria{

    private Criteria criteria;
    private Criteria otherCritria;

    public AndCriteria(Criteria criteria,Criteria otherCritria){
        this.criteria = criteria;
        this.otherCritria = otherCritria;
    }
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> firstCriteriaPersons = criteria.meetCriteria(persons);
        return otherCritria.meetCriteria(firstCriteriaPersons);
    }
}
