package fr.iutvalence.info.dut.m3105.gildedroseinn.refactoring;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GildedRoseTest
{
	
	
	@Test
	public void aSimpleBeginningTest()
	{
		Item item = new Item("Elixir of the Mongoose", 5, 7);
		GildedRose.updateItem(item);
		assertEquals(item.getSellIn() , 4);
		assertEquals(item.getQuality() , 6);
		
	}
	
	@Test
	public void sellInInfZero()
	{
		Item item = new Item("Conjured Mana Cake", -1, 6);
		GildedRose.updateItem(item);
		assertEquals(item.getSellIn(),-2);
		assertEquals(item.getQuality(),4);				
	}
	
	@Test
	public void qualityAlwaysSupZero()
	{
		Item item = new Item("Conjured Mana Cake", 5, 0);
		GildedRose.updateItem(item);
		assertEquals(item.getSellIn(),4);
		assertEquals(item.getQuality(),0);				
	}
	
	@Test
	public void AgedBrie()
	{
		Item item = new Item("Aged Brie", 5, 10);
		GildedRose.updateItem(item);
		assertEquals(item.getSellIn(),4);
		assertEquals(item.getQuality(),11);				
	}
	
	@Test
	public void QualityNeverMoreThanFifty()
	{
		Item item = new Item("Aged Brie", 5, 50);
		GildedRose.updateItem(item);
		assertEquals(item.getSellIn(),4);
		assertEquals(item.getQuality(),50);				
	}
	
	@Test
	public void Sulfuras()
	{
		Item item = new Item("Sulfuras", 5, 50);
		GildedRose.updateItem(item);
		assertEquals(item.getSellIn(),5);
		assertEquals(item.getQuality(),50);				
	}
}