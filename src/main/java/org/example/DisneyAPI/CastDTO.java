package org.example.DisneyAPI;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class CastDTO {


    @JsonProperty("data")
    private List<Data> data;
    @JsonProperty("count")
    private int count;

    public List<Data> getData() {
        return data;
    }

    public void setData(List<Data> data) {
        this.data = data;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
