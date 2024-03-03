package Lab05Hibernate.main;

import Lab05Hibernate01.dao.ProductDAOImpl;
import Lab05Hibernate01.entity.Product;

public class Product_Update {
	public static void main(String[] args) {
		Product p = new ProductDAOImpl().getProductById("P0006");
		p.setMaSP("P0006");
		p.setTenSanPham("Kệ để trung bay Huy ");
		p.setAnhSanPham("P0006.jpg");
		p.setSoLuong(150);
		p.setDonGia(2990000d);
		
		boolean flag = new ProductDAOImpl().updateProduct(p);
		if(flag == true) {
			System.out.printf("Sửa đổi dữ liệu thành công !!!");
		}else {
			System.out.printf("Xảy ra lỗi khi sửa sản phẩm :))");
		}
		
	}
}
