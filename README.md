# IceTask_1

IceTask_1 is an Android application demonstrating the use of **Retrofit** for network operations, **Fragments**, and **JSON data handling** in Kotlin.

## Features

- Fetches post data from [JSONPlaceholder API](https://jsonplaceholder.typicode.com/) using Retrofit.
- Displays post details (`userId`, `id`, `title`, `body`) in `PostFragment3`.
- Generates a JSON string from displayed post data.
- Passes the JSON string to a separate activity (`JsonDisplayActivity`) for readable display.
- Uses **ViewBinding** for UI component binding and **Coroutines** for asynchronous network calls.

## Technologies Used

- Kotlin
- Android SDK
- Retrofit 2
- Gson
- Coroutines
- ViewBinding

## Usage

1. Clone the repository.
2. Open the project in Android Studio.
3. Run the app on an Android device or emulator.
4. The app fetches a post from the API and displays it.
5. Click **Generate JSON** to see the JSON representation of the post in a new screen.

## API Endpoint

- `https://jsonplaceholder.typicode.com/posts?userId=1&id=5`

## License

This project is open-source and free to use.
