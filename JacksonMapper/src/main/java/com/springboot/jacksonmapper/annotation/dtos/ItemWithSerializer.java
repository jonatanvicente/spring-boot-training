package com.springboot.jacksonmapper.annotation.dtos;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.springboot.jacksonmapper.annotation.deserialization.ItemDeserializerOnClass;
import com.springboot.jacksonmapper.annotation.serialization.ItemSerializerOnClass;

@JsonSerialize(using = ItemSerializerOnClass.class)
@JsonDeserialize(using = ItemDeserializerOnClass.class)
public class ItemWithSerializer {
    public final int id;
    public final String itemName;
    public final User owner;

    public ItemWithSerializer(final int id, final String itemName, final User owner) {
        this.id = id;
        this.itemName = itemName;
        this.owner = owner;
    }

    // API

    public int getId() {
        return id;
    }

    public String getItemName() {
        return itemName;
    }

    public User getOwner() {
        return owner;
    }

}