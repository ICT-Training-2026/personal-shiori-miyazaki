package store;

/**
 * 特価商品クラス
 * @author M.Takahashi
 */
public class SpecialProduct extends AbsProduct implements Deliverable{
	/******** フィールド ******************************************/
	/**
	 * 定価
	 */
	private int orgPrice;
	
	public SpecialProduct(String name,int price,int orgPrice) {
		super(name,price);
		this.orgPrice = orgPrice;
	}

	@Override
	public void display() {
		System.out.println(getNameAndPrice() + "円(定価：" +orgPrice + "円)" );
	}
	
	@Override
	public void displayDeliv() {
		System.out.println("【*通常配送料300円*】" + getNameAndPrice());
	}
}
