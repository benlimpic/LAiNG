import { defineConfig } from 'vite'
import react from '@vitejs/plugin-react'

// Patch: ensure globalThis.crypto is available (Node 20+)
if (!globalThis.crypto?.subtle) {
  globalThis.crypto = require('crypto').webcrypto
}

// https://vite.dev/config/
export default defineConfig({
  plugins: [react()],
})