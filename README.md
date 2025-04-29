🏋️‍♂️ FitnessBuddyApp

**FitnessBuddyApp** is a simple and effective Android app to help users check their health status based on BMI (Body Mass Index). It provides dynamic health suggestions with a beautiful UI using animations, RecyclerView, and custom logic.

---

## 🚀 Features

- 🔥 **Splash screen with Lottie animation**
- 🧮 **BMI Calculator**:
  - Input fields for **Name**, **Height (ft)**, and **Height (inches)**
  - Button to calculate BMI
  - **TextView displays result** (Underweight, Healthy, Overweight)
  - **Background color changes** based on BMI result
- 📋 **Tips Section**:
  - Button to view **health tips** based on BMI result
  - Tips displayed in **RecyclerView** with icons
- 🎯 Clean and minimal design using **Fragments**, **Custom Toast**, and **Custom Drawable**
- 💡 Built with **Java** and **XML** in Android Studio

---

## 🛠 Technologies Used

- **Language**: Java
- **UI**: XML
- **Animation**: Lottie
- **Navigation**: Intents and Fragments
- **Dynamic UI**: RecyclerView, Color change logic
- **Platform**: Android Studio

---






---

## 📄 Project Structure

```plaintext
├── MainActivity.java
├── SplashActivity.java
├── BMICalculatorActivity.java
├── TipsActivity.java
├── Adapter/
│   └── TipsAdapter.java
├── Model/
│   └── Tip.java
├── res/
│   ├── layout/
│   ├── drawable/
│   ├── values/
│   └── raw/ (Lottie files)
