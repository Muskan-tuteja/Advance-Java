package inher;

interface Camera{
	void takePhoto();
}
interface MusicPlayer{
	void playMusic();
}

 class mulpinher implements Camera,MusicPlayer {
	public void takePhoto() {
		System.out.println("Taking photo");
	}
	public void playMusic() {
		System.out.println("Playing Music");
	}
	public static void main(String[] args) {
		mulpinher v1 = new mulpinher();
		v1.takePhoto();
		v1.playMusic();
	}

}
 
