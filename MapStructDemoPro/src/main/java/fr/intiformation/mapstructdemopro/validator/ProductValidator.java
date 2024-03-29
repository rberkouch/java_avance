package fr.intiformation.mapstructdemopro.validator;

import org.springframework.stereotype.Component;

@Component
public class ProductValidator {

    public int validate(int id){
        if(id==-1){
            throw new ProductValidationException("Invalid id value");
        }
        return id;
    }
}
