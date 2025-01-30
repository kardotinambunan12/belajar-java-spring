package belajar_restful.model;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@Builder

public class WebResponse <T>{

    private T data;
    private String errors;

}