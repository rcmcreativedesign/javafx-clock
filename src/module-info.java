module javafx_clock {
	requires javafx.controls;
	requires javafx.graphics;
	
	opens com.rcmcreativedesign.javafx_clock to javafx.graphics, javafx.fxml;
}
