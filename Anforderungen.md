# Übungsprojekt: "Connected Angler Ecosystem"

## Ziel
Entwickle eine innovative Plattform für Angler, die smarte Ausrüstung, Echtzeitdaten und eine soziale Community kombiniert. Nutze Spring Boot für das Backend, PostgreSQL als relationale Datenbank, React mit TypeScript für das Frontend sowie die weiteren genannten Tools, um die Anforderungen umzusetzen. Die Plattform soll Hobby- und Profiangler ansprechen, indem sie einzigartige Features bietet, die das Angelerlebnis verbessern und nachhaltiges Verhalten fördern.

## Hintergrund
Die Angelbranche umfasst weltweit etwa 220 Millionen Menschen, die von traditionellen Methoden bis hin zu moderner Technologie alles nutzen. Deine Plattform soll sich durch smarte Geräteintegration, KI-gestützte Analysen und eine Community abheben, um ein breites Publikum zu erreichen.

## HookHub
- **Beschreibung**: "Hook" (Haken) und "Hub" (Zentrum) – ein Treffpunkt für Angler.
- **Domain-Vorschlag**: `hookhub.com`
- **Verfügbarkeits-Hinweis**: "Hub" ist beliebt, aber die Kombination könnte verfügbar sein.

## Anforderungen

### Features
1. **Smarte Ausrüstungsintegration**
   - Nutzer können ihre Angelgeräte (z. B. Ruten, Rollen) mit IoT-Sensoren verbinden, die Daten wie Wurfweite oder Wassertemperatur liefern.
2. **KI-gestützte Fangempfehlungen**
   - Basierend auf Sensor-Daten, Wetter und Fanghistorie schlägt die KI optimale Köder oder Techniken vor.
3. **Fanghistorie und Statistiken**
   - Nutzer können ihre Fänge (Art, Gewicht, Ort) speichern und analysieren.
4. **Community-Interaktion**
   - Teile Fänge in einem Feed, kommentiere Beiträge und nimm an Ranglisten teil.
5. **Marktplatz für gebrauchte Ausrüstung**
   - Nutzer können ihre Ausrüstung verkaufen oder kaufen, mit Fokus auf Nachhaltigkeit.
6. **Gamification**
   - Punkte für Fänge, nachhaltige Praktiken (z. B. Catch-and-Release) oder Community-Aktivität, die im Marktplatz eingelöst werden können.

### Backend (Spring Boot + PostgreSQL)
#### 1. Entitäten
- **`User`**: `id` (PK), `username`, `email`, `location`, `skillLevel` (z. B. "BEGINNER", "PRO"), `points`
- **`Gear`**: `id` (PK), `userId` (FK), `type` (z. B. "ROD", "REEL"), `sensorId`, `status` (z. B. "ACTIVE", "FOR_SALE")
- **`Catch`**: `id` (PK), `userId` (FK), `species`, `weight`, `length`, `location` (Koordinaten), `timestamp`, `gearId` (FK)
- **`SensorData`**: `id` (PK), `gearId` (FK), `type` (z. B. "CAST_DISTANCE", "WATER_TEMP"), `value`, `timestamp`
- **`Post`**: `id` (PK), `userId` (FK), `content`, `catchId` (optional), `createdAt`
- **`MarketplaceItem`**: `id` (PK), `userId` (FK), `gearId` (FK), `price`, `condition`, `status` (z. B. "AVAILABLE", "SOLD")
- **Beziehungen**:
  - `User` : `Gear` (1:n)
  - `User` : `Catch` (1:n)
  - `Gear` : `SensorData` (1:n)

#### 2. REST-Endpunkte
- `GET /api/users`: Liste aller Nutzer
- `GET /api/gear`: Ausrüstung eines Nutzers
- `POST /api/catches`: Neuen Fang speichern
- `GET /api/sensor-data`: Sensor-Daten abrufen
- `POST /api/posts`: Beitrag erstellen
- `GET /api/marketplace`: Marktplatz-Items abrufen
- `PUT /api/users/{id}/points`: Punkte aktualisieren

#### 3. Technologien
- **Spring Boot**: REST-API mit JPA/Hibernate für Datenbankzugriff
- **PostgreSQL**: Speichere relationale Daten (z. B. Nutzer, Fänge, Ausrüstung)

### Frontend (React + TypeScript)
#### 1. Seiten (React Router)
- `/`: Dashboard (Wetter, persönliche Statistiken, Top-Posts)
- `/gear`: Ausrüstungsübersicht mit Sensor-Daten
- `/catches`: Fanghistorie mit Filtern (Art, Gewicht)
- `/community`: Feed mit Posts und Kommentaren
- `/marketplace`: Marktplatz für Ausrüstung
- `/insights`: KI-Analysen (z. B. Erfolgsstatistiken)

#### 2. State-Management (Zustand)
- **Speichere**:
  - `currentUser` (inkl. Punkte)
  - `selectedGear`
  - `filterSettings` (z. B. für Fanghistorie)
- **Beispiel**:
  ```tsx
  interface AppState {
    currentUser: { id: number; points: number } | null;
    selectedGearId: number | null;
    filterSettings: { species?: string; date?: string };
    setCurrentUser: (user: any) => void;
    setSelectedGearId: (id: number | null) => void;
    setFilterSettings: (filters: { species?: string; date?: string }) => void;
  }