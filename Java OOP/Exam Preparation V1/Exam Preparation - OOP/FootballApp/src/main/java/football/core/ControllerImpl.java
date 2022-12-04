package football.core;


import football.entities.field.ArtificialTurf;
import football.entities.field.Field;

import football.entities.field.NaturalGrass;
import football.entities.player.Men;
import football.entities.player.Player;
import football.entities.player.Women;
import football.entities.supplement.Liquid;
import football.entities.supplement.Powdered;
import football.entities.supplement.Supplement;
import football.repositories.SupplementRepository;
import football.repositories.SupplementRepositoryImpl;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static football.common.ConstantMessages.*;
import static football.common.ExceptionMessages.*;

public class ControllerImpl implements Controller {

    private SupplementRepository supplement;
    private Map<String ,Field> fields;

    public ControllerImpl() {
        this.supplement = new SupplementRepositoryImpl();
        this.fields = new LinkedHashMap<>();
    }

    @Override
    public String addField(String fieldType, String fieldName) {

        Field field;

        if (fieldType.equals("ArtificialTurf")) {
            field = new ArtificialTurf(fieldName);
        } else if (fieldType.equals("NaturalGrass")){
            field = new NaturalGrass(fieldName);
        } else {
            throw new NullPointerException(INVALID_FIELD_TYPE);
        }

        fields.put(fieldName ,field);

        return String.format(SUCCESSFULLY_ADDED_FIELD_TYPE, fieldType);
    }

    @Override
    public String deliverySupplement(String type) {

        Supplement supplement1;

        if (type.equals("Powdered")){
            supplement1 = new Powdered();
        } else if (type.equals("Liquid")) {
            supplement1 = new Liquid();
        } else {
            throw new IllegalArgumentException(INVALID_SUPPLEMENT_TYPE);
        }

        supplement.add(supplement1);

        return String.format(SUCCESSFULLY_ADDED_SUPPLEMENT_TYPE, type);
    }

    @Override
    public String supplementForField(String fieldName, String supplementType) {

        Supplement desiredSupplement = supplement.findByType(supplementType);

        if (desiredSupplement == null){
            throw new IllegalArgumentException(String.format(NO_SUPPLEMENT_FOUND, supplementType));
        }

        fields.get(fieldName).addSupplement(desiredSupplement);
        //supplement.remove(desiredSupplement);

        return String.format(SUCCESSFULLY_ADDED_SUPPLEMENT_IN_FIELD, supplementType, fieldName);
    }

    @Override
    public String addPlayer(String fieldName, String playerType, String playerName, String nationality, int strength) {

        Player desiredPlayer;

        if (playerType.equals("Women")){
            desiredPlayer = new Women(playerName, nationality, strength);
        } else if (playerType.equals("Men")) {
            desiredPlayer = new Men(playerName, nationality, strength);
        } else {
            throw new IllegalArgumentException(INVALID_PLAYER_TYPE);
        }

        String output;

        if (!playerCanPlay(fields.get(fieldName), playerType)) {
            output = FIELD_NOT_SUITABLE;
        } else {
            fields.get(fieldName).addPlayer(desiredPlayer);
            output = String.format(SUCCESSFULLY_ADDED_PLAYER_IN_FIELD, playerType, fieldName);
        }

        return output;
    }

    private boolean playerCanPlay(Field field, String playerType){
        boolean canPlay = field.getClass().getSimpleName().equals("ArtificialTurf") && playerType.equals("Women");

        if (!canPlay){
            canPlay = field.getClass().getSimpleName().equals("NaturalGrass") && playerType.equals("Men");
        }

        return canPlay;
    }

    @Override
    public String dragPlayer(String fieldName) {

        Field field = fields.get(fieldName);

        field.drag();

        return String.format(PLAYER_DRAG, field.getPlayers().size());
    }

    @Override
    public String calculateStrength(String fieldName) {

        Field field = fields.get(fieldName);
        int strength = field.getPlayers().stream().mapToInt(Player::getStrength).sum();

        return String.format(STRENGTH_FIELD, fieldName, strength);
    }

    @Override
    public String getStatistics() {
        return fields.values().stream().map(Field::getInfo).collect(Collectors.joining(System.lineSeparator()));
    }
}
