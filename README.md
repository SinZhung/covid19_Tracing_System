# Contact Tracing System for COVID-19

## Overview
This project is a simplified contact tracing system for managing and tracking potential COVID-19 exposures. The system involves three main entities: Customer, Shop, and CustomerHistory. Customers can register, check-in at shops, and view their visit history. Shops can be flagged based on customer status, and administrators have access to customer details, shop information, and the master visit history.

## Files

1. **Customer.java**
   - Defines the basic attributes and methods for a customer.
     
2. **CustomerDetail.java**
   - Extends `Customer` to include additional details like phone, password, and status.

3. **CustomerHistory.java**
   - Represents the visit history of a customer.

4. **Shop.java**
   - Represents a shop with attributes such as name, phone, manager, and status.

5. **Main.java**
   - Entry point for the program, containing the main functionality and interactions.

## Additional Features

- **CSV Files**
  - **Customer.csv:** Stores customer data.
  - **CustomerHistory.csv:** Stores customer visit history.
  - **Shop.csv:** Stores shop data.
