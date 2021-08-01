package io.cahlee.blog;

import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import io.cahlee.blog.domain.Post;
import io.cahlee.blog.persistence.PostRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PostRepositoryTest {
	@Autowired
	private PostRepository postRepository;
	
	@Test
	public void testInsertPost() {
		Post post = new Post();
		post.setTitle("2021-07-26 세팅 및 공부 내용");
		post.setContent("");
		post.setAuthor("cahlee");
		post.setCreateDate(new Date());
		post.setModifyDate(new Date());
		
		postRepository.save(post);
	}

	@Test
	public void testUpdatePost() {
		Post post = new Post();
		post.setContent("블로그 포스트 저장 구현");
		post.setAuthor("cahlee");
		post.setModifyDate(new Date());
		
		// 2021-07-26 블로그 포스트 저장 구현
		// 2021-07-27 드림코딩 유튜브 html, css 시청
		// 			  div에서 display를 inline으로 하면 span과 동일, span에서 display를 block으로하면 div와 동일
		//			  position : static(기본값) : html 정의 순서(top, left 등 안먹음)
		//						 relative는 원래 있던 자리 기준
		//						 absolute는 내 item과 가장 가까이에 있는 박스(부모) 기준, 근접한 부모에서 static 아닌 부몬의 기준
		//						 fixed 상자에서 벗어나서 윈도우 기준
		//						 stick는 원래 있던 자리 고정(스크롤해도) top, left 지정해야함
		//			  flexbox(css의 꽃) : https://css-tricks.com/snippets/css/a-guide-to-flexbox/
		//				container : display : flex(너 이제 flex box야)
		//							flex-direction : 방향(row, row-reverse, column, column-reverse)
		//							flex-wrap : nowrap : 꽉차면 작아짐, wrap : item이 한줄에 꽉차면 다음라인으로 넘어감, wrap-reverse
		//							flex-flow : direction + wrap
		//							justify-content : item을 어떻게 배치할건지 : flex-start, flex-end, center, space-around, space-evenly, space-between
		//							align-items : center(수직), baseline
		//							align-content : 수직 정렬
		//				item : order : 정렬순서 기본값(0)
		//						flex-grow : 기본 사이즈에서 칸이 커질때 사이즈가 늘어나는 비중? 기본값(0)
		//						flex-shrink : 기본 사이즈에서 칸이 작아질때 사이즈가 줄어드는 비중? 기본값(0)
		//						flex-basis : 차지 비중(퍼센트)
		//						flex : grow, shrink, basis
		//						align-self : item 하나만 배치
		//				중심축(main axis), 수직축(cross axis)
		//			  vh : viewport height(보이는 것의 퍼센트)
		//		      material.io : 컬러 툴
		//			  flexbox froggy
		//			   반응형 : 컨텐츠를 물과같이 만들어라(Media Queries로 구현) 1024-, 1024-768, 480-320 요샌 잘 안씀 
		//			  mdn에서 참조
		//			  visual studio 단축키
		//				- ctrl + enter : 바로 다음줄로 넘어감
		//				- alt + shift + 위아래 : 줄 복사
		//			  box-sizing : content-box(기본) : 컨텐트 사이즈 유지 
		//							border-box : 사이즈 내에 padding, border 포함
		//				https://developer.mozilla.org/en-US/docs/Web/CSS/box-sizing
		//			  수평 가운데 정렬
		//			 margin-auto
		//			 text-align(부모에 설정, 내부 영역이 inline이어야함)
		//			 transform: translate(50%, 50%) 수직 수평 중간
		//			 line-height: 부모 높이만큼 설정
		//			 background-image : 기본값 반복
		//			 background-repeat : no-repeat 반복 안함
		//			 background-siz : cover : 사이즈에 맞게 조정됨
		//			 CSS의 상수 : --로 시작 : 보통 :root에 넣어서 이용
		//                사용시 var() 함수 이용
		postRepository.save(post);
	}

	@Test
	public void testSelectPost() {
		List<Post> posts = postRepository.findAll();
		for(Post post : posts) {
			System.out.println(post.toString());
		}
	}
}
