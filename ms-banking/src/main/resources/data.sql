CREATE TABLE BANKING_PAYMENTS (
    id INTEGER PRIMARY KEY AUTO_INCREMENT,
    paymentHash VARCHAR(100),
    userHash VARCHAR(100),
    productHash VARCHAR(100),
    cardNumber VARCHAR(16),
    totalValue DOUBLE
);