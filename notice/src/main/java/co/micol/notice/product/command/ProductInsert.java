package co.micol.notice.product.command;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import co.micol.notice.common.Command;
import co.micol.notice.product.service.ProductService;
import co.micol.notice.product.service.ProductVO;
import co.micol.notice.product.serviceImpl.ProductServiceImpl;

public class ProductInsert implements Command {

	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		ProductService ps = new ProductServiceImpl();
		ProductVO vo = new ProductVO();

		// 제품 등록 처리 및 파일 업로드
		String saveDir = "c:/temp/";
		int maxSize = 100 * 1024 * 1024;
		
		try {
			MultipartRequest multi = new MultipartRequest(request, saveDir,
									 maxSize, "utf-8", new DefaultFileRenamePolicy());
			String pfile = multi.getFilesystemName("pfile");
			pfile = saveDir + pfile;
			String ofile = multi.getOriginalFileName("pfile");
			
			vo.setProductId(multi.getParameter("productId"));
			vo.setProductName(multi.getParameter("productName"));
			if (ofile != null) {
				vo.setProductImage(ofile);
				vo.setProductDir(pfile);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		int n = ps.productInsert(vo);
		if (n != 0) {
			request.setAttribute("message", "제품 등록에 성공 했습니다.");
		} else {
			request.setAttribute("message", "제품 등록에 실패 했습니다.");
		}
		return "product/productMessage";
	}

}
