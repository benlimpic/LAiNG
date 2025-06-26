<h1 align="center">🧪 Java + React Vite Template</h1>

<p align="center">
  <img src="https://img.shields.io/badge/Java-21-blue?logo=java&logoColor=white" />
  <img src="https://img.shields.io/badge/React-18-61DAFB?logo=react&logoColor=black" />
  <img src="https://img.shields.io/badge/Vite-7-purple?logo=vite&logoColor=yellow" />
  <img src="https://img.shields.io/badge/TailwindCSS-3.4.1-38B2AC?logo=tailwindcss&logoColor=white" />
  <img src="https://img.shields.io/badge/PostgreSQL-15-blue?logo=postgresql&logoColor=white" />
</p>

---

## 🚀 Overview

This is a modern full-stack template with:

- ⚙️ **Spring Boot (Java 21)** backend
- ⚛️ **React + Vite** frontend
- 🎨 **Tailwind CSS** for styling
- 🐘 **PostgreSQL** database
- ✅ `.env` driven configuration
- 🖥️ **Mac terminal launcher** that spins up **two terminals** (frontend + backend)

---

## 🧱 Project Structure

```plaintext
Java_React_Template/
├── backend/           # Spring Boot app
├── frontend/          # React + Vite app
├── start.sh           # Mac-only script to open backend + frontend in separate terminals
├── .env               # Secrets for backend (like DB and API keys)
└── README.md          # You're here
```

---

## 🛠️ How It Works

### 1. `start.sh` Script

This Mac-only script opens **two new Terminal windows** and starts:

- Spring Boot backend with `dev` profile
- Vite-powered React frontend

#### 🔧 Script Breakdown

```bash
#!/bin/bash

# macOS only - Opens backend and frontend in new terminals
osascript -e 'tell app "Terminal"
    do script "cd $(pwd)/backend && npm run dev"
end tell'

osascript -e 'tell app "Terminal"
    do script "cd $(pwd)/frontend && npm run dev"
end tell'
```

🔁 This allows **parallel monitoring and debugging** of both services side by side.

---

## 💅 Tailwind CSS Setup

In `frontend/`:

```bash
npm install -D tailwindcss postcss autoprefixer
npx tailwindcss init -p
```

Update `tailwind.config.js`:

```js
content: ["./index.html", "./src/**/*.{js,ts,jsx,tsx}"]
```

Update `src/index.css`:

```css
@tailwind base;
@tailwind components;
@tailwind utilities;
```

Use classes like `bg-zinc-900 text-white` to instantly apply clean UI.

---

## 🧪 Development

### 🔧 Backend

Make sure PostgreSQL is running and `.env` has:

```
SPRING_DATASOURCE_URL=jdbc:postgresql://localhost:5432/your_db
SPRING_DATASOURCE_USERNAME=your_username
SPRING_DATASOURCE_PASSWORD=your_password
SPRING_AI_OPENAI_API_KEY=your_openai_key
```

Run backend:

```bash
npm run dev --prefix backend
```

### ⚛️ Frontend

Run frontend:

```bash
npm run dev --prefix frontend
```

---

## 💡 Tips

- If you see `OpenAI API key must be set` — you forgot to configure `.env` 🧠
- `npm run dev` at the root runs the Mac launch script (opens 2 terminals)
- Want to add Docker later? Easy with this base.

---

## ✌️ Stay sharp, Ben.

_You built this to be fast, clean, and expandable._

---
