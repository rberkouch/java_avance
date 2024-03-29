package fr.intiformation.mapstructdemopro.controller;

import fr.intiformation.mapstructdemopro.dto.ProductDto;
import fr.intiformation.mapstructdemopro.entity.Product;
import fr.intiformation.mapstructdemopro.mapper.ProductMapper;
import fr.intiformation.mapstructdemopro.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class ProductController {

    //@Autowired
     ProductMapper productMapper;
    //@Autowired
     ProductRepository productRepository;

    @PostMapping("/products")
    public ResponseEntity<Product> save(@RequestBody ProductDto productDto){
        return new ResponseEntity<Product>(productRepository.save(productMapper.dtoToModel(productDto)), HttpStatus.CREATED) ;
    }

    @GetMapping("/products")
    public ResponseEntity<List<ProductDto>> findAll(){
        return new ResponseEntity<List<ProductDto>>(productMapper.modelsToDtos(productRepository.findAll()),HttpStatus.OK);
    }

    @GetMapping("/products/{id}")
    public ResponseEntity<ProductDto> findById(@PathVariable(value = "id") Integer id){
        ProductDto productDto = productMapper.modelToDto(productRepository.findById(id).get());
        return new ResponseEntity<ProductDto>(productDto,HttpStatus.OK);
    }

    @DeleteMapping("/products/{id}")
    public ResponseEntity<ProductDto> deleteById(@PathVariable(value = "id") Integer id){
        ProductDto productDto = productMapper.modelToDto(productRepository.findById(id).get());

        productRepository.deleteById(productDto.getId());
        return new ResponseEntity<ProductDto>(productDto,HttpStatus.NO_CONTENT);
    }

}
