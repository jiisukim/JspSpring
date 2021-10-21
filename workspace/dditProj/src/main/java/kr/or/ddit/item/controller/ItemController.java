package kr.or.ddit.item.controller;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import kr.or.ddit.controller.BookController;
import kr.or.ddit.item.service.ItemService;
import kr.or.ddit.item.vo.Item;
import kr.or.ddit.item.vo.ItemVO;

@RequestMapping("/item")
@Controller
public class ItemController {
	private static final Logger logger = LoggerFactory.getLogger(BookController.class);
	// 서비스 호출을 위해 ItemService를 의존성 주입함
	@Autowired
	ItemService itemService;

	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String register() {
		// forwarding
		return "item/register";
	}

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String registerPost(MultipartFile picture, @ModelAttribute Item item, Model model) {
		// 상품명
		String itemName = item.getItemName();
		// 가격
		int price = item.getPrice();
		// 파일
		MultipartFile file = item.getPicture();
		// 개요
		String description = item.getDescription();

//      logger.info("item : " + item.toString());
//      logger.info("fileName : " + file.getOriginalFilename());

//      System.out.println(picture.getOriginalFilename());
//      System.out.println(picture.getSize());
//      logger.info(item.toString());

		// 파일 업로드 시작-----------------------------------
		String[] pictureUrl = uploadFile(file);
		item.setPictureUrl(pictureUrl[0]);
		logger.info("최종item VO : " + item);
		// 파일 업로드 끝

		// item : Http 파라미터 + 업로드된 이미지 명
		int itemId = this.itemService.create(item);

		logger.info("insert된 itemId : " + itemId);

		// 최종 결과 item VO를 model에 담음
		model.addAttribute("item", item);

		// forwarding
		return "item/success";
	}

	// [공통]파일업로드 메소드. 파일객체를 파라미터로 보내면, 해당 파일객체의 중복되지 않는 파일명을 리턴받음
	public String[] uploadFile(MultipartFile picture) {
		String uploadFolder = "D:\\A_TeachingMaterial\\6.JspSpring\\workspace\\dditProj\\src\\main\\webapp\\resources\\images";
		// getFolder() : 연 월 일 폴더로 처리
		File uploadPath = new File(uploadFolder, getFolder());

		if (uploadPath.exists() == false) {
			uploadPath.mkdirs();
		}

		String uploadFileName = picture.getOriginalFilename();
		int pictureSize = (int) picture.getSize();
		// IE 를 위해 처리(파일명만 가져옴)
		uploadFileName = uploadFileName.substring(uploadFileName.lastIndexOf("\\") + 1);

		// 파일 이름 중복 방지
		UUID uuid = UUID.randomUUID();
		uploadFileName = uuid.toString() + "_" + uploadFileName;

		File saveFile = new File(uploadPath, uploadFileName);

		try {
			// 원본.복사(대상)
			picture.transferTo(saveFile);
			// getFolder().toString() : 2021/07/30
			String[] result = new String[2];
			result[0] = getFolder().replace("\\", "/") + "/" + uploadFileName;
			result[1] = pictureSize + "";
			// 배열에 담아서 리턴.
			return result;
		} catch (Exception e) {
			logger.error(e.getMessage());
			return null;
		} // end catch
	}

	// 오늘 날짜를 2021-07-29 형식으로 문자열에 넣음. 그런후
	// 2021\07\29으로 연도 월 일을 분리해냄
	private String getFolder() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		Date date = new Date();

		String str = sdf.format(date);

		return str.replace("-", File.separator);
	}

	@RequestMapping(value = "/uploadFormAction", method = RequestMethod.GET)
	public String uploadFormAction() {
		// forwarding
		return "item/uploadForm";
	}

	@RequestMapping(value = "/uploadFormAction", method = RequestMethod.POST)
	public String uploadFormActionPost(@ModelAttribute ItemVO itemVo) {
		logger.info("itemVo : " + itemVo.toString());
		// itemVo.getPicture() : 업로드한 File 객체 배열
		// itemVo.getPicture().length : 업로드한 File 객체 배열의 길이
		String[][] picturesUrl = new String[itemVo.getPicture().length][2];
		int cnt = 0;

		// itemVo.getPicture() => MultipartFile[] multipartfile
		// 이미지 개수만큼 반복
		for (MultipartFile multipartFile : itemVo.getPicture()) {
			// [공통]파일업로드 메소드. 파일객체를 파라미터로 보내면, 해당 파일객체의 중복되지 않는 파일명을 리턴받음
			// cnt++ : 후위연산자. 사용 후 1 증가
			// 배열로 리턴([0] : 파일명, [1] : 사이즈)
			String[] result = uploadFile(multipartFile);
			// picturesUrl[0][0] = "자전거"
			picturesUrl[cnt++][0] = result[0];
			// picturesUrl[0][1] = "3024272"
			picturesUrl[cnt++][1] = result[1];

		} // end for

		for (int j = 0; j < picturesUrl.length; j++) {
			logger.info(j + "번째 이미지 업로드 최종경로 : " + picturesUrl[j][0]);
		}
		Item item = new Item();
		item.setItemName(itemVo.getItemName());
		item.setPrice(itemVo.getPrice());
		item.setDescription(itemVo.getDescription());
		// 파라미터는 ItemVO, return값 : 신규로 추가된 데이터의 itemNo값
		// item => ITEM 테이블용, pictureUrl => ITEM_ATCH테이블용(파일명, 사이즈)
		int itemNo = itemService.create(item, picturesUrl);

		return "item/success";
	}

}
