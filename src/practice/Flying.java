package practice;

public interface Flying {
	void fly();

    // defaultメソッド
    default void powerOff() {
        System.out.println("飛んでいる場合は落下します。");
    }

}
