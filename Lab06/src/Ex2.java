//Brian Sarsfield (COM1-C)

public class Ex2 {

	public static void main(String[] args) {
		// Stock calculator
		
		final double COMISSION;
		final double PURCHASEPRICE;
		final double SALEPRICE;
		double totalPurchase;
		double totalSale;
		double fullPurchasePrice;
		double fullSalePrice;
		double purchaseComission;
		double saleComission;
		double profit;
		
		COMISSION = .02;
		PURCHASEPRICE = 32.87;
		SALEPRICE = 33.92;
		
		
		totalPurchase = PURCHASEPRICE * 1000;
		System.out.println("The cost buying the shares is " + totalPurchase);
		
		purchaseComission = totalPurchase * COMISSION;
		System.out.println("The comission cost of buying the shares is " + purchaseComission);
		
		fullPurchasePrice = totalPurchase + purchaseComission;
		
		totalSale = SALEPRICE * 1000;
		System.out.println("The money made selling the shares is " + totalSale);
		
		saleComission = totalSale * COMISSION;
		System.out.println("The comission cost of selling the shares is " + saleComission);
		
		fullSalePrice = totalSale + saleComission;
		
		profit = fullPurchasePrice - fullSalePrice;
		System.out.println("The profit/loss of the sale is: " + profit);


	}

}
