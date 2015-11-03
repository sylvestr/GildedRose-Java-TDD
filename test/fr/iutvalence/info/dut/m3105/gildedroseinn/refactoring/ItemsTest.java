package fr.iutvalence.info.dut.m3105.gildedroseinn.refactoring;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ItemsTest {
	
	
	@Test
	public void testItemName()
	{
		Item item = new Item("+5 Dexterity Vest", 10, 20);
		assertEquals(item.getName(),"+5 Dexterity Vest");
	}

	@Test
	public void testItemSellIn()
	{
		Item item = new Item("+5 Dexterity Vest", 10, 20);
		assertEquals(item.getSellIn(),10);
	}
	
	@Test
	public void testItemQuality()
	{
		Item item = new Item("+5 Dexterity Vest", 10, 20);
		assertEquals(item.getQuality(),20);
			
	}
	
	@Test
	public void testItemSetName()
	{  
		Item item = new Item("Aged Brie", 2, 0);
		item.setName("nouveau nom");
		assertEquals(item.getName(),"nouveau nom");
	}
	
	@Test
	public void testItemSetSellIn()
	{  
		Item item = new Item("Aged Brie", 2, 0); 
		item.setSellIn(11);
		assertEquals(item.getSellIn(),11);
	}
	
	@Test
	public void testItemSetQuality()
	{  
		Item item = new Item("Aged Brie", 2, 0); 
		item.setQuality(15);
		assertEquals(item.getQuality(),15);
	}
	

	
}
