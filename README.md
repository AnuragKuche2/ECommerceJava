### **EShops Java back-end project :**
This project is a **Java-based backend for a shopping cart system**, utilizing **Spring Boot**, **Spring Security**, and **JWT** for secure authentication and authorization. The project offers REST APIs for managing products, categories, users, carts, and orders. It also handles media (images) and integrates role-based access control to differentiate between **admin** and **user** functionalities.

### **Key Features:**

1. **Authentication & Authorization:**
    - **JWT Tokens**: Used for secure authentication across the APIs.
    - **Role-Based Access**: The application differentiates between two roles:
        - **Admin**: Has higher privileges, such as managing products, categories, and users.
        - **User**: Can browse products, manage carts, and place orders.
2. **Services and APIs:**
    - **Product Service**: Allows management of products, including creation, updating, deletion, and retrieval based on different criteria (e.g., by ID, brand, or category).
    - **Category Service**: Handles creation, updating, and deletion of product categories.
    - **Image Service**: Facilitates uploading and downloading images for products or users.
    - **User Service**: Manages user data, including creating, updating, deleting, and retrieving user details.
    - **Cart Service**: Supports operations like adding/removing items, updating item quantities, clearing the cart, and calculating the total price.
    - **Order Service**: Allows users to place orders and retrieve order details by user ID and order ID.

### **API Breakdown:**

### **1. Product API:**
- **Add Product**: Admins can create new products.
- **Get All Products**: Retrieves a full list of products.
- **Get Product by ID**: Fetches details of a specific product.
- **Get Product by Brand**: Filters products based on the brand.
- **Get Product by Category**: Retrieves products under a particular category.
- **Update Product**: Allows admins to update product details.
- **Delete Product**: Admins can delete a product.

### **2. Category API:**
- **Add Category**: Admins can create new categories.
- **Get All Categories**: Retrieves all categories.
- **Get Category by ID**: Fetches category details by ID.
- **Update Category**: Admins can modify an existing category.
- **Delete Category**: Admins can delete a category.

### **3. Image API:**
- **Upload Image**: Allows image uploads (e.g., for products or users).
- **Download Image**: Serves images stored in the system.

### **4. User API:**
- **Add User**: Creates a new user account.
- **Delete User**: Deletes a user.
- **Update User**: Updates user information.
- **Get User Details**: Retrieves user information based on the user ID.

### **5. Cart API:**
- **Add Items to Cart**: Adds products to the cart.
- **Remove Items from Cart**: Removes specific items from the cart.
- **Update Cart Items**: Updates item quantities or selections in the cart.
- **Get Cart by ID**: Fetches the cart by its unique ID.
- **Clear Cart**: Empties the entire shopping cart.
- **Get Total Price**: Calculates and returns the total price of items in the cart.

### **6. Order API:**
- **Place Order**: Allows users to place orders based on their cart.
- **Get Order by User ID and Order ID**: Retrieves order details based on a combination of user ID and order ID.

### **Technologies Used:**

1. **Spring Boot**: Provides the framework for building and managing the backend REST APIs.
2. **Spring Security**: Handles authentication and role-based authorization.
3. **JWT (JSON Web Tokens)**: Used for secure token-based authentication.
4. **Spring Data JPA**: Likely used to interact with the database, making it easier to perform CRUD operations on entities like Product, Category, User, Cart, etc.
5. **MySQL/PostgreSQL**: Possible database options for storing the system's data (products, users, orders).
6. **Maven/Gradle**: Used for dependency management and project builds.
7. **IntelliJ IDEA**: Likely the development environment used for coding and managing the project.

### **Security and User Roles:**

- **JWT Authentication**: Ensures that users need to log in and receive a token to access certain API endpoints.
- **Admin Role**: Has access to create, update, and delete products, categories, and user details.
- **User Role**: Can perform operations like browsing products, adding items to the cart, and placing orders.

### **Project Flow:**

1. **User Registration/Login**: New users register or existing users log in to receive a JWT token.
2. **Product Browsing**: Users can view available products by various filters (all products, by category, or by brand).
3. **Cart Management**: Users can add items to their cart, update quantities, remove items, or clear the cart.
4. **Order Placement**: Once a user is satisfied with their cart, they can place an order and retrieve the order's details.
5. **Admin Operations**: Admins can manage products, categories, and users, ensuring that the catalog is updated and user data is secure.

### **Project Objectives:**

- To create a backend that manages a shopping cart system with proper authentication and role-based authorization.
- To provide REST APIs for handling all core services like product management, order processing, and cart operations.
- To ensure secure access using JWT tokens for authentication and Spring Security for authorization.
