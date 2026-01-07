{
  "filepath": "/tmp/Collections-26b/src/main/java/org/apache/commons/collections4/multiset/HashMultiSet.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "HashMultiSet",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.multiset.AbstractMapMultiSet\u003cE\u003e",
        "java.io.Serializable"
      ],
      "begin_line": 37,
      "end_line": 76,
      "comment": "\n * Implements {@code MultiSet}, using a {@link HashMap} to provide the\n * data storage. This is the standard implementation of a multiset.\n * \u003cp\u003e\n * A {@code MultiSet} stores each object in the collection together with a\n * count of occurrences. Extra methods on the interface allow multiple copies\n * of an object to be added or removed at once.\n *\n * @since 4.1\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " Serial version lock "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.multiset.HashMultiSet.HashMultiSet()",
      "begin_line": 45,
      "end_line": 47,
      "comment": "\n     * Constructs an empty {@link HashMultiSet}.\n     ",
      "child_ranges": [
        "(line 46,col 9)-(line 46,col 48)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.multiset.HashMultiSet.HashMultiSet(java.util.Collection\u003c? extends E\u003e)",
      "begin_line": 54,
      "end_line": 57,
      "comment": "\n     * Constructs a bag containing all the members of the given collection.\n     *\n     * @param coll  a collection to copy into this bag\n     ",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 15)",
        "(line 56,col 9)-(line 56,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.HashMultiSet.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 63,
      "end_line": 66,
      "comment": "\n     * Write the bag out using a custom routine.\n     ",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 33)",
        "(line 65,col 9)-(line 65,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.HashMultiSet.readObject(java.io.ObjectInputStream)",
      "begin_line": 71,
      "end_line": 74,
      "comment": "\n     * Read the bag in using a custom routine.\n     ",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 31)",
        "(line 73,col 9)-(line 73,col 65)"
      ]
    }
  ]
}