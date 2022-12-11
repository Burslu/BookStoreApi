package trendyolAPI.pojo.LaststeapProduct;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class ResponseMain {


    @JsonProperty("status")
    public String status;
    @JsonProperty("code")
    public int code;
    @JsonProperty("total")
    public int total;
    @JsonProperty("data")
    public ArrayList<DataProduct> data;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public ArrayList<DataProduct> getData() {
        return data;
    }

    public void setData(ArrayList<DataProduct> data) {
        this.data = data;
    }
}
