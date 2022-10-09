CREATE TABLE PAYMENTS (
    paymentHash VARCHAR(100) PRIMARY KEY,
    userHash VARCHAR(100),
    productHash VARCHAR(100),
    cardNumber VARCHAR(16),
    totalValue DOUBLE
);