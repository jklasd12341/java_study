package day03;
/*
	문제 6]
		게시물을 게시판에 붙이는데 
		하나의 게시판에는 게시물을 15개를 붙일 수 있다.
		게시물의 갯수를 랜덤하게 입력한 후(Scanner 이용)
		몇개의 게시판이 필요한지 계산해서 출력하는 
		프로그램을 작성하세요.
		
		게시물 0개 게시판 1
		게시물 15개 게시판 1
		게시물 30개 게시판 2
		게시물 31개 게시판 3
		
 */
public class Ex06 {
	public static void main(String[] args) {
		// 랜덤하게 게시글 숫자를 발생시켜서 필요한 게시판 수를 계산
		
		int content = (int)(Math.random()*1000); // (0~0.999999 * 1000)
		int page = (content % 15 != 0) // content가 15로 나눈 나머지가 0과 같지 않은 경우 
						? (content / 15 + 1) // content를 15로 나누고 1을 더하여
								:
									(
											(content == 0) ? 1 : content / 15
									);
		System.out.printf("랜덤하게 발생된 게시물 수 %3d개 는 %2d개의 게시판이 필요합니다.",
				content, page);
		
		
							
	}
}
