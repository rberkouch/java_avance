package fr.intiformation.mapstructdemopro.mapper;


import fr.intiformation.mapstructdemopro.dto.ProductDto;
import fr.intiformation.mapstructdemopro.entity.Product;
import fr.intiformation.mapstructdemopro.validator.ProductValidationException;
import fr.intiformation.mapstructdemopro.validator.ProductValidator;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;
import java.util.UUID;

@Mapper(uses = {ProductValidator.class},componentModel ="spring", imports = UUID.class)
public interface ProductMapper {

    ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);

    @Mapping(source = "product.descrip", target = "description", defaultValue = "description")
    @Mapping(target = "itemId", expression = "java(UUID.randomUUID().toString())")
    @Mapping(source = "product.items" , target = "itemList")
    ProductDto modelToDto(Product product) throws ProductValidationException;


    List<ProductDto> modelsToDtos(List<Product> products) throws ProductValidationException;

   @Mapping(source = "productDto.description", target = "descrip", defaultValue = "description")
   //@InheritInverseConfiguration
    Product dtoToModel(ProductDto productDto) throws ProductValidationException;
}
