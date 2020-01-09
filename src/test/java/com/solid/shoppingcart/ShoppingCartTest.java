package com.solid.shoppingcart;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;

public class ShoppingCartTest {
  private static final String DOVE_SOAP_PRODUCT_NAME = "Dove Soap";
  private static final String AXE_DEO_PRODUCT_NAME = "Axe Deo";
  private static final BigDecimal DOVE_SOAP_UNIT_PRICE = BigDecimal.valueOf(39.99);
  private static final BigDecimal AXE_DEO_UNIT_PRICE = BigDecimal.valueOf(99.99);
  private static final BigDecimal TAX_RATE = BigDecimal.valueOf(12.5);
  private static final int COMPARISON_RESULT_EQUAL = 0;
  private Cart cart;

  @BeforeEach
  public void setUp() {
    cart = new Cart();
  }

  @Test
  public void shouldHaveATotalOfZeroForEmptyCart() {
    BigDecimal expectedTotal = BigDecimal.ZERO;

    BigDecimal actualTotal = cart.getTotal();

    assertThat(actualTotal, is(expectedTotal));
  }
  

//  @Test
//  public void shouldCalculateTheTotalPriceOfTheCartWhenFiveDoveSoapProductsAreAddedToTheCart() {
//    Product doveSoap = new Product(DOVE_SOAP_PRODUCT_NAME, new Price(DOVE_SOAP_UNIT_PRICE));
//
//    BigDecimal noOfProductToAddToTheCart = BigDecimal.valueOf(5D);
//    this.cart.addProduct(doveSoap, noOfProductToAddToTheCart);
//
//    CartItem doveSoapCartItem = this.cart.getCartItemFor(doveSoap);
//    assertThat(doveSoapCartItem.getQuantity().compareTo(noOfProductToAddToTheCart), equalTo(COMPARISON_RESULT_EQUAL));
//
//    BigDecimal unitPrice = doveSoapCartItem.getProduct().getPrice().getUnitPrice();
//    assertThat(unitPrice.compareTo(DOVE_SOAP_UNIT_PRICE), equalTo(COMPARISON_RESULT_EQUAL));
//
//    BigDecimal totalPrice = this.cart.getTotalPrice();
//    assertThat(totalPrice.compareTo(new BigDecimal("199.95")), equalTo(COMPARISON_RESULT_EQUAL));
//  }
}
