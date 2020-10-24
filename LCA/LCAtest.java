import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LCAtest {

  @Test
  public void LCAtest(){
      LCA tree = new LCA(); 
      assertEquals(-1, tree.findLCA(4, 5));
      
      tree.root = new Node(1);  
      assertEquals(-1, tree.findLCA(2, 3));
      
      tree.root.left = new Node(2); 
      assertEquals(-1, tree.findLCA(2, 3));
      
      tree.root.right = new Node(3); 
      assertEquals(-1, tree.findLCA(4, 3));
      
      tree.root.left.left = new Node(4); 
      tree.root.left.right = new Node(5); 
      tree.root.right.left = new Node(6); 
      tree.root.right.right = new Node(7); 
      
      assertEquals(2, tree.findLCA(4, 5));

  }

}
