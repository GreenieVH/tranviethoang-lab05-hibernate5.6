package Lab05Hibernate.main;

import Lab05Hibernate01.dao.ProductDAOImpl;
import Lab05Hibernate01.entity.Product;

public class Product_Insert {
	public static void main(String[] args) {
		Product p = new Product();
		p.setMaSP("P0009");
		p.setTenSanPham("Kệ để nhaf");
		p.setAnhSanPham("P0005.jpg");
		p.setSoLuong(150);
		p.setDonGia(1990000d);
		
		
		boolean flag = new ProductDAOImpl().insertProduct(p);
		if(flag == true) {
			System.out.printf("Thêm mới thành công !!!");
		}else {
			System.out.printf("Xảy ra lỗi khi thêm mới sản phẩm :))");
		}
	}
}
