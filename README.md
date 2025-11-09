# Smart HUB75 LED Display Based on Android Mobile Control

[![Platform](https://img.shields.io/badge/Platform-Android%20%7C%20ESP32-blue.svg)]()
[![Language](https://img.shields.io/badge/Language-Kotlin%20%7C%20C++-brightgreen.svg)]()
[![License](https://img.shields.io/badge/License-MIT-green.svg)]()
[![Status](https://img.shields.io/badge/Version-1.0.0-orange.svg)]()

---

## 🧩 Overview

**Smart HUB75 LED Display Based on Android Mobile Control** is an integrated hardware–software system designed to control RGB LED matrix panels (HUB75 interface) using an Android device.  
The project enables users to wirelessly send text, animations, and custom images to a HUB75 LED display via Bluetooth.  
With a user-friendly Android interface and highly adaptable firmware on the ESP32 platform, this project provides a **portable, interactive, and flexible LED control solution** for creative visual display applications.

---

## 🏗️ System Architecture

Android App (Bluetooth Controller)
↓
Bluetooth SPP Connection
↓
ESP32 Microcontroller (HUB75 Driver)
↓
HUB75 RGB LED Panel (e.g., 64×32)

- **Android Device** — Sends display commands, text, and images via Bluetooth.  
- **ESP32 Controller** — Parses commands and drives the HUB75 LED matrix through optimized GPIO and DMA.  
- **HUB75 Panel** — Displays real-time visual output (text, animations, or custom drawings).

---

## ✨ Key Features

- 🧠 **Real-time LED control** from Android via Bluetooth.
- 📝 **Send static or scrolling text** directly from your phone.
- 🎨 **Adjust text style** — scrolling direction, speed, font color, and automatic text fitting.
- 🌈 **Change brightness and color settings** dynamically.
- 🖼️ **Upload and display GIF animations**.
- ✍️ **Draw custom dot-matrix graphics** manually in the app.
- ⚙️ **Fully compatible with HUB75 panels** of any size (width and height in multiples of 32).
- 💡 **Simple deployment** — only requires flashing ESP32 and installing the Android APK.

---

## 🧠 Technical Details

| Component           | Platform / Tool                | Description                                   |
| ------------------- | ------------------------------ | --------------------------------------------- |
| **MCU Platform**    | ESP32                          | Main controller driving the HUB75 LED panel   |
| **LED Panel**       | HUB75 RGB Matrix (e.g., 64×32) | Supports any HUB75-compatible panel           |
| **Communication**   | Bluetooth SPP                  | Wireless connection between Android and ESP32 |
| **Mobile Platform** | Android (API 35+)              | Control interface and configuration           |
| **IDE (MCU)**       | PlatformIO                     | Used to compile and upload ESP32 firmware     |
| **IDE (App)**       | Android Studio 2025            | Kotlin-based Android project                  |

---

## 🔌 Communication Protocol Overview

The Android app communicates with the ESP32 via **Bluetooth Serial (SPP)** using a structured command format.

### Basic Packet Structure
[Header: 0xAA 0x55][Command][Payload Length][Payload][Checksum]

### Example Commands
| Command      | Description                                | Example             |
| ------------ | ------------------------------------------ | ------------------- |
| `TEXT`       | Display static or scrolling text           | `TEXT Hello World!` |
| `BRIGHTNESS` | Adjust panel brightness (0–255)            | `BRIGHTNESS 180`    |
| `COLOR`      | Set RGB text color                         | `COLOR 255,0,0`     |
| `SPEED`      | Set scrolling speed                        | `SPEED 5`           |
| `GIF`        | Upload GIF data                            | Binary packet       |
| `DRAW`       | Draw custom bitmap (manual matrix drawing) | Binary packet       |

All commands are transmitted as plain text or binary frames depending on mode.  
The ESP32 firmware automatically updates the LED panel upon receiving valid packets.

---

## ⚙️ Installation and Setup

### 1️⃣ ESP32 Firmware Setup
1. Open the firmware project in **PlatformIO**.
2. Configure:
   - HUB75 pin mapping  
   - Panel size (e.g., 64×32)  
   - Optional Bluetooth device name  
3. Build and upload firmware to the ESP32 board.
4. Connect the HUB75 RGB panel according to the schematic.

### 2️⃣ Android Application
1. Install the provided **APK** on your Android device (API level ≥ 35).
2. Enable Bluetooth permissions.
3. Pair your Android phone with the ESP32 Bluetooth module.
4. Open the app and connect to the device.
5. Send text, images, or GIFs to display instantly on the panel.

---

## 🧰 Development Environment

| Platform  | Toolchain                                 |
| --------- | ----------------------------------------- |
| Android   | Android Studio 2025, Gradle Build System  |
| ESP32     | PlatformIO (ESP-IDF or Arduino Framework) |
| Languages | Kotlin (App) + C++ (Firmware)             |

---

## 📂 Repository Structure

Smart-HUB75-LED-Display-Based-on-Android-Mobile-Control/
│
├── /AndroidApp/ # Android source code
├── /ESP32_Firmware/ # ESP32 firmware (PlatformIO project)
├── /assets/ # Icons, images, sample GIFs
├── README.md # Documentation
└── LICENSE # MIT License

---

## 🚀 Future Improvements

- Wi-Fi (TCP/UDP) communication option  
- Multi-panel synchronization  
- Real-time preview from Android  
- Web-based configuration UI  
- Cloud message scheduling  

---

## 🧑‍💻 Author & Acknowledgement

Developed by **School of Electronic Information, Central South University (CSU)**.  
This project is open-sourced under the **MIT License**.

> “Simple, flexible, and powerful — bringing smart LED control to your fingertips.”

---

## 📜 License

This project is licensed under the [MIT License](LICENSE).  
You are free to use, modify, and distribute it with proper attribution.
