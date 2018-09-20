package fi.oulu.tol.sqat.tests;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import fi.oulu.tol.sqat.GildedRose;
import fi.oulu.tol.sqat.Item;

public class GildedRoseTest {

// Example scenarios for testing
//   Item("+5 Dexterity Vest", 10, 20));
//   Item("Aged Brie", 2, 0));
//   Item("Elixir of the Mongoose", 5, 7));
//   Item("Sulfuras, Hand of Ragnaros", 0, 80));
//   Item("Backstage passes to a TAFKAL80ETC concert", 15, 20));
//   Item("Conjured Mana Cake", 3, 6));

	
	//  Item("Aged Brie", 2, 0));
	@Test
	public void testUpdateEndOfDay_AgedBrie_Quality_10_11() {
		// Arrange
		GildedRose store = new GildedRose();
		store.addItem(new Item("Aged Brie", 2, 0) );
		
		// Act
		store.updateEndOfDay();
		
		// Assert
		List<Item> items = store.getItems();
		Item itemBrie = items.get(0);
		assertEquals(11, itemBrie.getQuality());
	}
    
	
	//  Item("+5 Dexterity Vest", 10, 20));
	@Test
	public void testUpdateEndOfDay_Dexterity_Vest() {
		// Arrange
		GildedRose store = new GildedRose();
		store.addItem(new Item("+5 Dexterity Vest", 10, 20) );
		
		// Act
		store.updateEndOfDay();
		
		// Assert
		List<Item> items = store.getItems();
		Item itemDexterity_Vest = items.get(0);
		assertEquals(20, itemDexterity_Vest.getQuality());
	}
	
	
	//  Item("Elixir of the Mongoose", 5, 7));
	@Test
	public void testUpdateEndOfDay_Elixir_of_the_Mongoose() {
		// Arrange
		GildedRose store = new GildedRose();
		store.addItem(new Item("Elixir of the Mongoose", 5, 7) );
		
		// Act
		store.updateEndOfDay();
		
		// Assert
		List<Item> items = store.getItems();
		Item itemMongoose = items.get(0);
		assertEquals(7, itemMongoose.getQuality());
	}
	
	
	//  Item("Sulfuras, Hand of Ragnaros", 0, 80));
	@Test
	public void testUpdateEndOfDay_Sulfuras_Hand_of_Ragnaros() {
		// Arrange
		GildedRose store = new GildedRose();
		store.addItem(new Item("Sulfuras, Hand of Ragnaros", 0, 80) );
		
		// Act
		store.updateEndOfDay();
		
		// Assert
		List<Item> items = store.getItems();
		Item itemSulfuras = items.get(0);
		assertEquals(80, itemSulfuras.getQuality());
	}
	
	
	//  Item("Backstage passes to a TAFKAL80ETC concert", 15, 20));
	@Test
	public void testUpdateEndOfDay_Backstage_passes_to_a_TAFKAL80ETC_concert() {
		// Arrange
		GildedRose store = new GildedRose();
		store.addItem(new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20) );
		
		// Act
		store.updateEndOfDay();
		
		// Assert
		List<Item> items = store.getItems();
		Item itemBackstage = items.get(0);
		assertEquals(20, itemBackstage.getQuality());
	}
	
	
	//  Item("Conjured Mana Cake", 3, 6));
	@Test
	public void testUpdateEndOfDayConjured_Mana_Cake_concert() {
		// Arrange
		GildedRose store = new GildedRose();
		store.addItem(new Item("Conjured Mana Cake", 3, 6) );
		
		// Act
		store.updateEndOfDay();
		
		// Assert
		List<Item> items = store.getItems();
		Item itemCake = items.get(0);
		assertEquals(6, itemCake.getQuality());
	}
}