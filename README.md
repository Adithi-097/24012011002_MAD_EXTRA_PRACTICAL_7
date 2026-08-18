# Android MP3 Player Using Service

## Practical: MP3 Player Application Using Service and MediaPlayer

### Aim

To create an Android MP3 Player application using an Android **Service** and **MediaPlayer** for playing an MP3 audio file.

---

## Study

The following concepts are studied in this practical:

* Service
* Types of Service
* Drawable Icons
* MediaPlayer
* Creating a `raw` resource folder
* Adding an MP3 song to the `raw` folder
* Starting and stopping a Service
* Playing audio using MediaPlayer

---

## What is a Service?

A **Service** is an Android application component that can perform operations in the background without providing a user interface.

In this application, a Service is used to manage the `MediaPlayer` and play the MP3 song.

---

## Types of Service

Android Services can mainly be classified into the following types:

### 1. Foreground Service

A Foreground Service performs a task that the user is actively aware of and usually displays a notification.

**Example:** Music player, GPS navigation, fitness tracking.

### 2. Background Service

A Background Service performs a task without direct interaction with the user.

Modern Android versions place restrictions on background services.

### 3. Bound Service

A Bound Service allows other application components, such as an Activity, to connect to the Service and communicate with it.

---

## MediaPlayer

`MediaPlayer` is an Android class used to play audio and video files.

In this application, `MediaPlayer` is used inside `MusicService` to play an MP3 file stored in the `res/raw` folder.

Example:

```kotlin
mediaPlayer = MediaPlayer.create(this, R.raw.song)
mediaPlayer.start()
```

---

## Application Features

* MP3 Player user interface
* Album/song image
* Play button
* Stop button
* Shuffle button
* Previous button
* Next button
* Material CardView
* Floating Action Buttons
* Music playback using `MediaPlayer`
* Music playback managed through an Android Service

---

## Project Structure

```text
app
└── src
    └── main
        ├── java/com/example/myapplication_07
        │   ├── MainActivity.kt
        │   └── MusicService.kt
        │
        ├── res
        │   ├── drawable
        │   │   ├── song
        │   │   ├── shuffle_24
        │   │   ├── skip_previous_24
        │   │   ├── baseline_play_arrow_24
        │   │   ├── baseline_skip_next_24
        │   │   └── baseline_stop_24
        │   │
        │   ├── layout
        │   │   └── activity_main.xml
        │   │
        │   └── raw
        │       └── song.mp3
        │
        └── AndroidManifest.xml
```

---

## Main Components

### MainActivity

`MainActivity.kt` is responsible for:

* Displaying the MP3 player interface
* Handling the Play button
* Handling the Stop button
* Starting the `MusicService`
* Stopping the `MusicService`

### MusicService

`MusicService.kt` is responsible for:

* Creating the `MediaPlayer` object
* Loading the MP3 file
* Starting the song
* Pausing the song
* Stopping the MediaPlayer when the Service is destroyed

---

## Adding the Raw Folder

To add the `raw` folder:

1. Right-click on the `res` folder.
2. Select **New → Android Resource Directory**.
3. Select `raw` as the Resource Type.
4. Click **OK**.
5. Add the MP3 file inside the `raw` folder.

Example:

```text
res/raw/song.mp3
```

The MP3 file can then be accessed in Kotlin using:

```kotlin
R.raw.song
```

---

## Application Flow

```text
User
  │
  ▼
MainActivity
  │
  │ Play Button
  ▼
MusicService
  │
  ▼
MediaPlayer
  │
  ▼
song.mp3
  │
  ▼
Music Playback
```

When the **Stop** button is pressed:

```text
MainActivity
     │
     ▼
stopService()
     │
     ▼
MusicService.onDestroy()
     │
     ▼
MediaPlayer.stop()
```

---

## Technologies Used

* **Language:** Kotlin
* **IDE:** Android Studio
* **UI:** XML
* **Layout:** ConstraintLayout
* **Audio:** MediaPlayer
* **Android Component:** Service
* **UI Components:** MaterialCardView and FloatingActionButton

---

## Learning Outcomes

After completing this practical, we understand:

1. What an Android Service is.
2. Different types of Android Services.
3. How to create a Service class.
4. How to use `MediaPlayer`.
5. How to add drawable icons to an Android project.
6. How to create a `raw` resource folder.
7. How to add and access an MP3 file from `res/raw`.
8. How to start and stop a Service from an Activity.
9. How to implement basic audio playback in an Android application.

---

## Conclusion

An Android MP3 Player application was successfully created using **Kotlin, Service, and MediaPlayer**. The application demonstrates how an Android Service can be used to manage audio playback while the Activity handles the user interface and playback controls.
