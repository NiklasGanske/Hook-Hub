#!/bin/bash

# Projektname eingeben
read -p "Gib den Projektnamen ein: " PROJECT_NAME

# Neues React-Projekt mit Vite erstellen
echo "Erstelle React-Projekt mit Vite..."
npx create-vite@$latest_version "$PROJECT_NAME" --template react-ts

# In das Projektverzeichnis wechseln
cd "$PROJECT_NAME" || exit

echo "Projektverzeichnis gewechselt zu $(pwd)"

# Abhängigkeiten installieren
echo "Installiere npm-Abhängigkeiten..."
npm install

# Tailwind CSS, PostCSS und Autoprefixer installieren
echo "Installiere Tailwind CSS..."
npm install tailwindcss @tailwindcss/vite

# Vite-Config anpassen
cat > vite.config.ts <<EOL
import { defineConfig } from 'vite'
import tailwindcss from '@tailwindcss/vite'
import react from '@vitejs/plugin-react'
export default defineConfig({
  plugins: [
    tailwindcss(),
    react(),
  ],
})
EOL

# Tailwind in CSS-Datei einfügen
echo "Füge Tailwind-Direktiven in index.css hinzu..."
echo  "@import 'tailwindcss';" > src/index.css

# CSS in Hauptdatei importieren
echo "Importiere CSS in main.tsx..."
sed -i "1i import './index.css';" src/main.tsx

#Ordnerstruktur erstellen
mkdir -p src/{components,pages,types,hooks,ui,assets,services,store}

#Zustand installieren
echo "React Zustand installieren..."
npm install zustand

#ZOD installieren
echo "Zod installieren...."
npm install zod

#App.tsx überschreiben
cat > ./src/App.tsx <<EOL
function App() {
  return <>
  <div className="flex flex-col bg-gray-900 h-screen w-full bg-cover items-center justify-center ">
    <img src= "https://media1.tenor.com/m/918EwUygx1IAAAAd/mission-impossible-we-got-this.gif" />
    <h1 className= "text-4xl text-white">Now you're good to go Champ!</h1>
    </div>
  </>;
}
 
export default App;
EOL

#react-icons installieren
echo "React-Icons installieren..."
npm install react-icons --save


#React Query installieren
echo "reactQuery installieren...."
npm i @tanstack/react-query@4 --legacy-peer-deps

echo "Projektsetup abgeschlossen! Wechsel in das Projektverzeichnis und starte es mit 'npm run dev'."

exit 0