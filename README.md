
# 🛍️ GoShopora – ECommerce Android App

GoShopora is a modern, scalable eCommerce Android application built using Kotlin and Jetpack Compose, designed with clean architecture principles and real-time data handling. It delivers a smooth shopping experience with both online and offline capabilities.


## 🚀 Key Features
- 🧭 Modern UI with Jetpack Compose
- 🔐 User Authentication using Firebase Authentication
- ☁️ Real-time Data Sync with Firebase Firestore
- 🛒 Offline Cart System using Room Database
- 🔎 Search Functionality for products
- 📂 Category-based Product Filtering
- 🔄 Seamless Navigation across 8+ screens
- ⚡ Asynchronous Operations using Kotlin Coroutines
- 🖼️ Optimized Image Loading with Coil


## 🏗️ Architecture

The app follows MVVM (Model-View-ViewModel) architecture for better separation of concerns and maintainability.

- View → Jetpack Compose UI
- ViewModel → Handles UI logic and state
- Model → Data layer (Firebase + Room)
## 🛠️ Tech Stack
- Language: Kotlin
- UI: Jetpack Compose
- Architecture: MVVM
- Dependency Injection: Hilt
- Database (Offline): Room
- Backend Services: Firebase Authentication & Firestore
- Async Handling: Kotlin Coroutines
- Image Loading: Coil
- Navigation: Jetpack Navigation Component

## Screens
- Home Screen
- Product Listing
- Product Details
- Cart (Offline)
- Search Screen
- Category Filtering
- Login / Signup
- Profile
## 📦 Key Implementations
#### 🔐 Authentication
- Firebase Authentication for secure login/signup
#### ☁️ Real-time Database
- Firestore used for fetching and syncing product data
#### 🛒 Offline Cart
- Room Database ensures cart functionality without internet
#### 🔄 State Management
- Managed using ViewModel + Compose state APIs
#### ⚡ Performance Optimization
- Coroutines for non-blocking operations
- Coil for fast image rendering
## 📈 Future Enhancements
- Payment Gateway Integration 💳
- Order Tracking 📦
- Push Notifications 🔔
- Admin Panel
## Contributing

Contributions are always welcome!

Feel free to fork the project and submit pull requests!


## Authors

- [@letsgoaditya](https://github.com/letsgoaditya)


## Feedback

If you have any feedback, please reach out to me at adityarana65@gmail.com

<p align="center">
  Made with ❤️ by Aditya Rana
</p>


## 📸 Screenshots

### 🔐 Authentication
<p align="center">
  <img src="photos/LoginScreen1.png" width="250"/>
  <img src="photos/SignUpScreen2.png" width="250"/>
  <img src="photos/SignUpScreen3.png" width="250"/>
</p>

### 🏠 Home & Categories
<p align="center">
  <img src="photos/HomeScreen5.png" width="250"/>
  <img src="photos/HomeScreen15.png" width="250"/>
  <img src="photos/CategoryScreen13.png" width="250"/>
</p>

### 📦 Products
<p align="center">
  <img src="photos/ProductCategory10.png" width="250"/>
  <img src="photos/ProductCategory11.png" width="250"/>
</p>

<p align="center">
  <img src="photos/ProductDetails12.png" width="250"/>
  <img src="photos/ProductDetails14.png" width="250"/>
</p>

### 🔍 Search
<p align="center">
  <img src="photos/SearchScreen16.png" width="250"/>
  <img src="photos/SearchScreen17.png" width="250"/>
</p>

### 🛒 Cart
<p align="center">
  <img src="photos/CartScreen7.png" width="250"/>
  <img src="photos/CartScreen8.png" width="250"/>
  <img src="photos/CartScreen9.png" width="250"/>
</p>

### 👤 Profile
<p align="center">
  <img src="photos/ProfileScreen6.png" width="250"/>
</p>

### 🔥 Firebase / Backend
<p align="center">
  <img src="photos/FirebaseScreen18.png" width="250"/>
  <img src="photos/FirebaseScreen19.png" width="250"/>
  <img src="photos/FirebaseScreen20.png" width="250"/>
</p>

<br>

# ⚠️ Setup Notes

> Please complete the following steps before running the project:

---

### 🔑 Firebase Configuration

- Set up your project in the **Firebase Console**
- Download the `google-services.json` file
- Place it inside the project directory:app/google-services.json


- Ensure the file name is exactly **`google-services.json`** (do not rename)

---

### ☁️ Firestore Database Setup

- Configure **Firebase Firestore** according to the project structure
- Refer to the screenshots provided in this repository for guidance

---

### 🔐 Authentication Setup

- Enable **Email/Password Authentication** in the Firebase Console
- Required for login and signup functionality

---

## 💡 Important Note

- The `google-services.json` file is **not included** in this repository for security reasons so it is added to my `.gitignore` file to prevent accidental exposure
