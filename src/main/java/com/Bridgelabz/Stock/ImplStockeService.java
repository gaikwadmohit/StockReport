package com.Bridgelabz.Stock;

public class ImplStockeService {
	

	public interface IStockService {

		void addstocks(String stockName, int share, long sharePrice);
		void printReport();

	}
}
