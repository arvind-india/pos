package com.refresh.pos.database;

import com.refresh.pos.domain.LineItem;
import com.refresh.pos.domain.Sale;

public interface SaleDao {

	Sale initiateSale(String startTime);

	void endSale(Sale sale, String endTime);

	int addLineItem(int saleId, LineItem lineItem);

}
