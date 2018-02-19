package main.java;

public final class Item {
        private int key;
        //constructor
        public Item(int keyValue) { 
                setKey(keyValue);
        }
        // further components and methods
		public int getKey() {
			return key;
		}
		public void setKey(int key) {
			this.key = key;
		}
}