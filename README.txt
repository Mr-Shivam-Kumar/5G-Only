5G Settings Shortcut — Android source project

What it does:
- Installs as an app icon named "5G Settings Shortcut".
- Tap the app icon, then "Open Phone Information".
- If the hidden RadioInfo activity is accessible, choose NR Only manually.

Limitations:
- OxygenOS / carrier firmware may block RadioInfo or rename its component.
- This app does not force NR Only or change network settings automatically.
- An APK has not been compiled here; build this project in Android Studio.

Build:
1. Install Android Studio.
2. Open this project folder.
3. Let Gradle sync.
4. Build > Build APK(s).

Cloud build with GitHub Actions (no Android Studio):
1. Create a GitHub repository and upload all files/folders from this project.
2. Open the repository's Actions tab.
3. Select "Build 5G Settings Shortcut APK" and click Run workflow.
4. After it finishes, open the run and download artifact "5G-Settings-Shortcut-debug-apk".
5. Extract the artifact ZIP; install the APK on your phone (allow install from this source).

The workflow uses Gradle installed on the runner. If Gradle version compatibility is reported,
add a Gradle wrapper or adjust the runner Gradle version.
