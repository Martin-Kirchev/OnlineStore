package product;

import product.price.ProductPrice;
import product.price.ProductPriceRepository;
import product.review.ProductReview;
import product.review.ProductReviewRepository;
import product.variant.attribute.ProductVariantAttribute;
import product.variant.attribute.ProductVariantAttributeRepository;
import product.variant.ProductVariant;
import product.variant.ProductVariantRepository;
import product.variant.value.ProductVariantValue;
import product.variant.value.ProductVariantValueRepository;

public class ProductManager {

    ProductRepository productRepo;
    ProductVariantRepository variantRepo;
    ProductVariantAttributeRepository attributeRepo;
    ProductVariantValueRepository valueRepo;
    ProductPriceRepository priceRepo;
    ProductReviewRepository reviewRepo;

    ProductManager() {

        this.productRepo = new ProductRepository();
        this.variantRepo = new ProductVariantRepository();
        this.attributeRepo = new ProductVariantAttributeRepository();
        this.valueRepo = new ProductVariantValueRepository();
        this.priceRepo = new ProductPriceRepository();
        this.reviewRepo = new ProductReviewRepository();
    }

    public void addProduct(Product product){

        ProductValidator.validateFields(product);

        //ProductValidator.validateUniqeField(name);

        if(!productRepo.add(product))
            throw new RuntimeException("Product wasn't added to the repository!");
    }

    public void removeProduct(int productId){

        if(!productRepo.remove(productId))
            throw new IllegalArgumentException("Product wasn't found!");
    }

    public void addPrice(ProductPrice productPrice) {

        ProductValidator.validateFields(productPrice);

        //ProductValidator.validateUniqueFields(productId, timestamp);

//        if(productRepo.findById(productPrice.getProductId()) == null)
//            throw new IllegalArgumentException("Price points to not existing product!");

        if(!priceRepo.add(productPrice))
            throw new RuntimeException("Product price wasn't added to the repository!");
    }

    public void removePrice(int priceId) {

        if(!priceRepo.remove(priceId))
            throw new IllegalArgumentException("Product price wasn't found!");
    }

    public void addVariant(ProductVariant variant){

        ProductValidator.validateFields(variant);

        //ProductValidator.validateUniqueFields(productId, attributeId, variantId);

        if(productRepo.findById(variant.getProductId()) == null)
            throw new IllegalArgumentException("Product variant points to not existing product!");

        if(attributeRepo.findById(variant.getAttributeId()) == null)
            throw new IllegalArgumentException("Product variant points to not existing product attribute!");

        if(valueRepo.findById(variant.getValueId()) == null)
            throw new IllegalArgumentException("Product variant points to not existing product value!");

        if(!variantRepo.add(variant))
            throw new RuntimeException("Product variant wasn't added to the repository!");
    }

    public void removeVariant(int variantId) {

        if(!variantRepo.remove(variantId))
            throw new IllegalArgumentException("Product variant wasn't found!");
    }

    public void addVariantAttribute(ProductVariantAttribute attribute) {

        ProductValidator.validateFields(attribute);

        //ProductValidator.validateUniqeField(name);

        if(!attributeRepo.add(attribute))
            throw new RuntimeException("Product variant attribute wasn't added to the repository!");
    }

    public void removeVariantAttribute(int attributeId) {

        if(!attributeRepo.remove(attributeId))
            throw new IllegalArgumentException("Product variant attribute wasn't found!");
    }

    public void addVariantValue(ProductVariantValue value) {

        ProductValidator.validateFields(value);

        //ProductValidator.validateUniqeField(name)

        if(!valueRepo.add(value))
            throw new RuntimeException("Product variant value wasn't added to the repository!");
    }

    public void removeVariantValue(int valueId) {

        if(!valueRepo.remove(valueId))
            throw new IllegalArgumentException("Product variant value wasn't found!");
    }

    public void addReview(ProductReview review) {

        ProductValidator.validateFields(review);

        //ProductValidator.validateUniqeField(userId, productId);

        // UserManager.findUser

        if(productRepo.findById(review.getProductId()) == null)
            throw new IllegalArgumentException("Product review points to not existing product!");

        if(!reviewRepo.add(review))
            throw new RuntimeException("Product review wasn't added to the repository!");
    }

    public void removeReview(int reviewId) {

        if(!reviewRepo.remove(reviewId))
            throw new IllegalArgumentException("Product review wasn't found!");
    }

}
