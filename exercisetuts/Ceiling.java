package compchallange;

public class Ceiling {

	private int height;
	private String paintedColor;

	public Ceiling(int height, String paintedColor) {
		this.height = height;
		this.paintedColor = paintedColor;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public String getPaintedColor() {
		return paintedColor;
	}

	public void setPaintedColor(String paintedColor) {
		this.paintedColor = paintedColor;
	}
}
