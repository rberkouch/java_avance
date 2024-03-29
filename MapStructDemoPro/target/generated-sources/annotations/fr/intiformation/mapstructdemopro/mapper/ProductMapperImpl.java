package fr.intiformation.mapstructdemopro.mapper;

import fr.intiformation.mapstructdemopro.dto.ProductDto;
import fr.intiformation.mapstructdemopro.entity.Item;
import fr.intiformation.mapstructdemopro.entity.Product;
import fr.intiformation.mapstructdemopro.validator.ProductValidationException;
import fr.intiformation.mapstructdemopro.validator.ProductValidator;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import javax.annotation.processing.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-03-29T05:57:25+0100",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.10 (OpenLogic)"
)
@Component
public class ProductMapperImpl implements ProductMapper {

    @Autowired
    private ProductValidator productValidator;

    @Override
    public ProductDto modelToDto(Product product) throws ProductValidationException {
        if ( product == null ) {
            return null;
        }

        ProductDto productDto = new ProductDto();

        if ( product.getDescrip() != null ) {
            productDto.setDescription( product.getDescrip() );
        }
        else {
            productDto.setDescription( "description" );
        }
        List<Item> list = product.getItems();
        if ( list != null ) {
            productDto.setItemList( new ArrayList<Item>( list ) );
        }
        productDto.setId( productValidator.validate( product.getId() ) );
        productDto.setName( product.getName() );
        productDto.setQuantity( productValidator.validate( product.getQuantity() ) );
        productDto.setPrice( product.getPrice() );

        productDto.setItemId( UUID.randomUUID().toString() );

        return productDto;
    }

    @Override
    public List<ProductDto> modelsToDtos(List<Product> products) throws ProductValidationException {
        if ( products == null ) {
            return null;
        }

        List<ProductDto> list = new ArrayList<ProductDto>( products.size() );
        for ( Product product : products ) {
            list.add( modelToDto( product ) );
        }

        return list;
    }

    @Override
    public Product dtoToModel(ProductDto productDto) throws ProductValidationException {
        if ( productDto == null ) {
            return null;
        }

        Product product = new Product();

        if ( productDto.getDescription() != null ) {
            product.setDescrip( productDto.getDescription() );
        }
        else {
            product.setDescrip( "description" );
        }
        product.setId( productValidator.validate( productDto.getId() ) );
        product.setName( productDto.getName() );
        product.setQuantity( productValidator.validate( productDto.getQuantity() ) );
        product.setPrice( productDto.getPrice() );
        product.setItemId( productDto.getItemId() );

        return product;
    }
}
