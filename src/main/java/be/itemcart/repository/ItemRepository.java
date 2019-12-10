package be.itemcart.repository;

import java.util.List;

import org.springframework.data.jpa.repository.*;

import be.itemcart.model.Item;

public interface ItemRepository extends JpaRepository<Item, Integer> {

  @Query("SELECT i FROM Item i WHERE i.checked=true")
  List<Item> findChecked();
}
