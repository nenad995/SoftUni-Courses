package barracksWars.core.commands;

import barracksWars.interfaces.CommandInterpreter;
import barracksWars.interfaces.Executable;
import barracksWars.interfaces.Repository;
import barracksWars.interfaces.UnitFactory;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class CommandInterpreterImpl implements CommandInterpreter {

    private static final String COMMANDS_PACKAGE_NAME =
            "barracksWars.core.commands.";
    private Repository repository;
    private UnitFactory unitFactory;

    public CommandInterpreterImpl(Repository repository, UnitFactory unitFactory) {
        this.repository = repository;
        this.unitFactory = unitFactory;
    }

    @Override
    public Executable interpretCommand(String[] data, String commandName) {
        String className = parseCommandToClassName(commandName);
        Executable command = null;

        try {
            Class aClass = Class.forName(className);
            Constructor<Command> constructor = aClass.getDeclaredConstructor(String[].class, Repository.class, UnitFactory.class);
            command = constructor.newInstance(data, repository, unitFactory);
        } catch (ClassNotFoundException | NoSuchMethodException | InstantiationException | IllegalAccessException |
                 InvocationTargetException e) {
            throw new RuntimeException(e);
        }

        return  command;
    }

    private String parseCommandToClassName(String commandName){
        String firstLetterUpperCase = commandName.substring(0,1).toUpperCase();
        String restOfTheCommand = commandName.substring(1) + "Command";
        return COMMANDS_PACKAGE_NAME + firstLetterUpperCase + restOfTheCommand;
    }
}
