package com.example.lab08;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CustomListTest {
    private CustomList mockCityList() {
        CustomList cityList = new CustomList();
        cityList.addCity(mockCity());
        return cityList;
    }

    private City mockCity() {
        return new City("Edmonton", "Alberta");
    }

    @Test
    void testAdd() {
        CustomList cityList = mockCityList();
        assertEquals(1, cityList.getCities().size());
        City city = new City("Regina", "Saskatchewan");
        cityList.addCity(city);
        assertEquals(2, cityList.getCities().size());
        assertTrue(cityList.getCities().contains(city));
    }

    @Test
    public void testHasCity() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        list.addCity(calgary);
        // This will fail initially because hasCity() doesn't exist
        assertTrue(list.hasCity(calgary));
    }

    @Test
    void testDelete() {
        CustomList cityList = mockCityList();
        assertEquals(1, cityList.getCities().size());
        City city = new City("Regina", "Saskatchewan");
        cityList.addCity(city);
        assertEquals(2, cityList.getCities().size());
        cityList.deleteCity(city);
        assertEquals(1, cityList.getCities().size());
        assertFalse(cityList.getCities().contains(city));
    }

    @Test
    void testDeleteException(){
        CustomList cityList = mockCityList();
        City city = new City("Yellowknife", "Northwest Territories");
        assertThrows(IllegalArgumentException.class, () -> {
            cityList.deleteCity(city);
        });
    }

}