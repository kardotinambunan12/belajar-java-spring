package belajar_restful.model;

import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class WebResponse <T> {

    private String errors;

    private T data;


    private PagingResponse paging;




}