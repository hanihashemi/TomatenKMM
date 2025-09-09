# Repository Guidelines

## Project Structure & Module Organization
- `composeApp/`: Main Kotlin Multiplatform module using Compose Multiplatform.
  - `src/commonMain/kotlin/`: Shared Kotlin code (`App.kt`, `Platform.kt`, etc.).
  - `src/androidMain/`: Android code (`MainActivity.kt`) and resources under `res/`.
  - `src/iosMain/`: iOS-specific code (UIKit entry via `MainViewController.kt`).
  - `src/commonMain/composeResources/`: Shared assets (e.g., `drawable/`).
- `iosApp/`: Xcode project and app entry (`iosApp.xcodeproj`, `iOSApp.swift`).
- Root Gradle files: `settings.gradle.kts`, `build.gradle.kts`, `gradle.properties`, `gradlew*`.

## Build, Test, and Development Commands
- Build all: `./gradlew build` — compiles all targets and runs checks.
- Android assemble: `./gradlew :composeApp:assembleDebug` — builds debug APK.
- Android install: `./gradlew :composeApp:installDebug` — installs on connected device/emulator.
- iOS run: Open `iosApp/iosApp.xcodeproj` in Xcode and run a simulator or device scheme.

## Coding Style & Naming Conventions
- Kotlin style, 4‑space indentation; use official IDE formatter.
- Packages: `io.github.hanihashemi.tomaten.*`.
- Classes/objects: `UpperCamelCase`; functions/vars: `lowerCamelCase`; constants: `UPPER_SNAKE_CASE`.
- Compose: keep UI stateless where possible; hoist state; preview composables under `commonMain` when feasible.

## Testing Guidelines
- Source sets: `commonTest`, `androidUnitTest`, `iosSimulatorArm64Test` (add as needed).
- Run checks: `./gradlew :composeApp:check`.
- Name tests `*Test.kt`; keep unit tests platform‑agnostic in `commonTest` when possible.

## Commit & Pull Request Guidelines
- Commits: imperative mood, concise scope. Example: `feat(timer): add pause/resume logic`.
- PRs: clear description, link issues (e.g., `Closes #123`), note affected platforms (Android/iOS/both), include screenshots or screen recordings for UI changes.
- Ensure PR builds: Android assemble succeeds and iOS target runs in Xcode.

## Security & Configuration Tips
- Do not commit `local.properties` or signing keys; Android SDK paths live in `local.properties`.
- iOS signing is managed in Xcode project settings; use personal/team profiles.
- Avoid secrets in source; prefer environment variables or secure storage.

