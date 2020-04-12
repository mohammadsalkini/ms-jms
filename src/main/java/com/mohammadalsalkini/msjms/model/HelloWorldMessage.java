package com.mohammadalsalkini.msjms.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.UUID;

/**
 * @author Mohammad Alsalkini
 * @project ms-jms
 * @created 12.04.2020 - 07:01
 */

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class HelloWorldMessage implements Serializable {


    static final long serialVersionUID = 5276298225274790835L;

    private UUID id;
    private String message;

}
