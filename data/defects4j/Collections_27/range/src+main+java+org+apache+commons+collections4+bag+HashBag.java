{
  "filepath": "/tmp/Collections-27b/src/main/java/org/apache/commons/collections4/bag/HashBag.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "HashBag",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.bag.AbstractMapBag\u003cE\u003e",
        "java.io.Serializable"
      ],
      "begin_line": 39,
      "end_line": 78,
      "comment": "\n * Implements {@code Bag}, using a {@link HashMap} to provide the\n * data storage. This is the standard implementation of a bag.\n * \u003cp\u003e\n * A {@code Bag} stores each object in the collection together with a\n * count of occurrences. Extra methods on the interface allow multiple copies\n * of an object to be added or removed at once. It is important to read the\n * interface javadoc carefully as several methods violate the\n * {@link Collection} interface specification.\n *\n * @since 3.0 (previously in main package v2.0)\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " Serial version lock "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.bag.HashBag.HashBag()",
      "begin_line": 47,
      "end_line": 49,
      "comment": "\n     * Constructs an empty {@link HashBag}.\n     ",
      "child_ranges": [
        "(line 48,col 9)-(line 48,col 48)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.bag.HashBag.HashBag(java.util.Collection\u003c? extends E\u003e)",
      "begin_line": 56,
      "end_line": 59,
      "comment": "\n     * Constructs a bag containing all the members of the given collection.\n     *\n     * @param coll  a collection to copy into this bag\n     ",
      "child_ranges": [
        "(line 57,col 9)-(line 57,col 15)",
        "(line 58,col 9)-(line 58,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.HashBag.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 65,
      "end_line": 68,
      "comment": "\n     * Write the bag out using a custom routine.\n     ",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 33)",
        "(line 67,col 9)-(line 67,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.HashBag.readObject(java.io.ObjectInputStream)",
      "begin_line": 73,
      "end_line": 76,
      "comment": "\n     * Read the bag in using a custom routine.\n     ",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 31)",
        "(line 75,col 9)-(line 75,col 65)"
      ]
    }
  ]
}