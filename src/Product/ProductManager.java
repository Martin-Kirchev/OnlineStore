package Product;

import Product.Price.ProductPrice;
import Product.Price.ProductPriceRepository;
import Product.Review.ProductReview;
import Product.Review.ProductReviewRepository;
import Product.Variant.Attribute.ProductVariantAttribute;
import Product.Variant.Attribute.ProductVariantAttributeRepository;
import Product.Variant.ProductVariant;
import Product.Variant.ProductVariantRepository;
import Product.Variant.Value.ProductVariantValue;
import Product.Variant.Value.ProductVariantValueRepository;
import User.UserManager;

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

        if(!productRepo.addProduct(product))
            throw new RuntimeException("Product wasn't added to the repository!");
    }

    public void removeProduct(int productId){

        if(!productRepo.removeProduct(productId))
            throw new IllegalArgumentException("Product wasn't found!");
    }

    public void addPrice(ProductPrice productPrice) {

        ProductValidator.validateFields(productPrice);

        //ProductValidator.validateUniqueFields(productId, timestamp);

        if(productRepo.findProductById(productPrice.getProductId()) == null)
            throw new IllegalArgumentException("Price points to not existing product!");

        if(!priceRepo.addProductPrice(productPrice))
            throw new RuntimeException("Product price wasn't added to the repository!");
    }

    public void removePrice(int priceId) {

        if(!priceRepo.removeProductPrice(priceId))
            throw new IllegalArgumentException("Product price wasn't found!");
    }

    public void addVariant(ProductVariant variant){

        ProductValidator.validateFields(variant);

        //ProductValidator.validateUniqueFields(productId, attributeId, variantId);

        if(productRepo.findProductById(variant.getProductId()) == null)
            throw new IllegalArgumentException("Product variant points to not existing product!");

        if(attributeRepo.findAttributeById(variant.getAttributeId()) == null)
            throw new IllegalArgumentException("Product variant points to not existing product attribute!");

        if(valueRepo.findValueById(variant.getValueId()) == null)
            throw new IllegalArgumentException("Product variant points to not existing product value!");

        if(!variantRepo.addProductVariant(variant))
            throw new RuntimeException("Product variant wasn't added to the repository!");
    }

    public void removeVariant(int variantId) {

        if(!variantRepo.removeProductVariant(variantId))
            throw new IllegalArgumentException("Product variant wasn't found!");
    }

    public void addVariantAttribute(ProductVariantAttribute attribute) {

        ProductValidator.validateFields(attribute);

        //ProductValidator.validateUniqeField(name);

        if(!attributeRepo.addProductVariantAttribute(attribute))
            throw new RuntimeException("Product variant attribute wasn't added to the repository!");
    }

    public void removeVariantAttribute(int attributeId) {

        if(!attributeRepo.removeProductVariantAttribute(attributeId))
            throw new IllegalArgumentException("Product variant attribute wasn't found!");
    }

    public void addVariantValue(ProductVariantValue value) {

        ProductValidator.validateFields(value);

        //ProductValidator.validateUniqeField(name)

        if(!valueRepo.addProductVariantValue(value))
            throw new RuntimeException("Product variant value wasn't added to the repository!");
    }

    public void removeVariantValue(int valueId) {

        if(!valueRepo.removeProductVariantValue(valueId))
            throw new IllegalArgumentException("Product variant value wasn't found!");
    }

    public void addReview(ProductReview review) {

        ProductValidator.validateFields(review);

        //ProductValidator.validateUniqeField(userId, productId);

        // UserManager.findUser

        if(productRepo.findProductById(review.getProductId()) == null)
            throw new IllegalArgumentException("Product review points to not existing product!");

        if(!reviewRepo.addProductReview(review))
            throw new RuntimeException("Product review wasn't added to the repository!");
    }

    public void removeReview(int reviewId) {

        if(!reviewRepo.removeProductReview(reviewId))
            throw new IllegalArgumentException("Product review wasn't found!");
    }

}
