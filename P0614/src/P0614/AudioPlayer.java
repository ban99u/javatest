package P0614;

public abstract class AudioPlayer extends player{

	@Override
	void play(int point) {
		System.out.println("음성코덱 읽어오기 -> 음성코덱해독 -> 음성파일 우퍼전달 -> 오디오좌우스피커 출력 ");
		
	}

	@Override
	void stop() {
		
		
	}

	
}
