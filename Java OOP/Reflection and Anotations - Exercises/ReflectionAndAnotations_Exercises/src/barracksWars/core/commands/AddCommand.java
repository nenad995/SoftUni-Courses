package barracksWars.core.commands;

import barracksWars.interfaces.Repository;
import barracksWars.interfaces.Unit;
import barracksWars.interfaces.UnitFactory;
import jdk.jshell.spi.ExecutionControl;

import java.lang.reflect.InvocationTargetException;

public class AddCommand extends Command{

    public AddCommand(String[] data, Repository repository, UnitFactory unitFactory) {
        super(data, repository, unitFactory);
    }

    @Override
    public String execute() throws ExecutionControl.NotImplementedException, ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        String unitType = getData()[1];
        Unit unitToAdd = getUnitFactory().createUnit(unitType);
        getRepository().addUnit(unitToAdd);
        String output = unitType + " added!";
        return output;
    }
}
