public class Task1 {
	public static void main(String[] args) {
		LogLevel ll = LogLevel.DEBUG;
		LogLevel.logMessage(ll, "a debug process is running");
	}
}

enum LogLevel {
	DEBUG,
	INFO,
	WARNING,
	ERROR;

	public static void logMessage(LogLevel level, String message) {
		System.out.printf("[%s]: %s%n", level.name(), message);
	}
}
