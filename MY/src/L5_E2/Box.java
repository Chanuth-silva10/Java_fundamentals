package L5_E2;

public class Box implements ICompute {
	
		 private int length, width, height;
		 private int volume;
		public int getLength() {
			return length;
		}
		public void setLength(int length) {
			this.length = length;
		}
		public int getWidth() {
			return width;
		}
		public void setWidth(int width) {
			this.width = width;
		}
		public int getHeight() {
			return height;
		}
		public void setHeight(int height) {
			this.height = height;
		}
		public int getVolume() {
			return volume;
		}
		public void setVolume(int volume) {
			this.volume = volume;
		}
		
		public Box(int length, int width, int height) {
			this.length = length;
			this.width = width;
			this.height = height;
		}
		@Override
		public int calculate() {
			volume = width * height * length;
			System.out.println("Calculate :"+volume);
			return 0;
		}
		@Override
		public void display() {
			System.out.println("Interface so display must be implement");
			
		}
		
}
