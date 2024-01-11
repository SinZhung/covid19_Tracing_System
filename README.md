# COVID-19 Contact Tracing System

## Overview
This project implements a simplified contact tracing system for COVID-19, featuring three main entities: Customer, Shop, and CustomerHistory. It allows customers to register, check-in at shops, and view their visit history. Shops can be flagged based on customer status, and administrators can view details of customers, shops, and the master visit history.

## Files
1. Customer.java
  Basic customer attributes.
  Methods: getCustomerName()

2. CustomerDetail.java
  Extends Customer with additional details.
  Methods: setCustomerStatus(), getCustomerPhone(), getCustomerStatus(), toCSVString()

3. CustomerHistory.java
  Represents customer visit history.
  Methods: getCustomerIndex(), getDateTime(), getShopName(), toCSVString()

4. Shop.java
  Represents shop attributes.
  Methods: setShopStatus(), getShopName(), getPhone(), getManagerName(), getShopStatus(), toCSVString()

5. Main.java
Entry point with main functionality and interactions.

##Additional Features
1. CSV Files
  Customer.csv: Stores customer data.
  CustomerHistory.csv: Stores visit history.
  Shop.csv: Stores shop data.

## Note
This implementation prioritizes simplicity and provides essential functionalities for contact tracing. Customize the code as needed.
