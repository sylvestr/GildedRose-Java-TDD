package fr.iutvalence.info.dut.m3105.gildedroseinn.refactoring;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class GildedRoseTest
{

	@Test
	public void updateOnEachEndOfDay()
	{
		List<Item> items = new ArrayList<>();
		items.add(new Item("A",10,10));
		items.add(new Item("B",10,10));
		items.add(new Item("C",10,10));
		items.add(new Item("D",10,10));
		
		GildedRose.updateItems(items);
		
		for (Item item : items) {
			Assert.assertEquals(9, item.getQuality());
			Assert.assertEquals(9, item.getSellIn());
			
		}
		
		

	}
}