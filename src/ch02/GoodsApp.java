package ch02;

public class GoodsApp {

	public static void main(String[] args) {
		Goods camera = new Goods();
//		camera.name = "nikon";
		camera.setName("nikon");
//		camera.price = 400000;
		camera.setPrice(50000);
//		camera.countStock = 30;
		camera.setCountStock(10);
//		camera.countSold = 5;
		camera.setCountSold(50);
		
		System.out.println(Goods.countOfGoods);
		
		System.out.println(camera.getName());

		camera.showInfo();
		System.out.println(camera.toString());
		System.out.println(camera);
		
		int discountPrice = camera.calcDiscountPrice(50);
		System.out.println(discountPrice);

	}

}
