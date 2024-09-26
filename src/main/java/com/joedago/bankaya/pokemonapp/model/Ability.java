package com.joedago.bankaya.pokemonapp.model;

public class Ability {

    private Item ability;
    private Boolean isHidden;
    private Integer slot;

    public Item getAbility() {
        return ability;
    }

    public void setAbility(Item ability) {
        this.ability = ability;
    }

    public Boolean getHidden() {
        return isHidden;
    }

    public void setHidden(Boolean hidden) {
        isHidden = hidden;
    }

    public Integer getSlot() {
        return slot;
    }

    public void setSlot(Integer slot) {
        this.slot = slot;
    }
}
