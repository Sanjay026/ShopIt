package com.example.hp.shopit.Models;

import com.bignerdranch.expandablerecyclerview.Model.ParentObject;

import java.util.List;
import java.util.UUID;

/**
 * Created by HP on 6/9/2017.
 */
public class TitleParent implements ParentObject {
    private List<Object>mChildrenList;
    private UUID id;
    private String name;
    private String uri;
    public TitleParent() {

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;}

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    @Override
    public List<Object> getChildObjectList() {
        return mChildrenList;
    }

    @Override
    public void setChildObjectList(List<Object> list) {
        mChildrenList=list;

    }
}
