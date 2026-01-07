{
  "filepath": "/tmp/Collections-28b/src/main/java/org/apache/commons/collections4/bag/TreeBag.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TreeBag",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.bag.AbstractMapBag\u003cE\u003e",
        "org.apache.commons.collections4.SortedBag\u003cE\u003e",
        "java.io.Serializable"
      ],
      "begin_line": 44,
      "end_line": 140,
      "comment": "\n * Implements {@link SortedBag}, using a {@link TreeMap} to provide the data storage.\n * This is the standard implementation of a sorted bag.\n * \u003cp\u003e\n * Order will be maintained among the bag members and can be viewed through the iterator.\n * \u003cp\u003e\n * A {@link org.apache.commons.collections4.Bag Bag} stores each object in the collection\n * together with a count of occurrences. Extra methods on the interface allow multiple\n * copies of an object to be added or removed at once. It is important to read the interface\n * javadoc carefully as several methods violate the {@link Collection} interface specification.\n *\n * @since 3.0 (previously in main package v2.0)\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " Serial version lock "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.bag.TreeBag.TreeBag()",
      "begin_line": 52,
      "end_line": 54,
      "comment": "\n     * Constructs an empty {@link TreeBag}.\n     ",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 48)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.bag.TreeBag.TreeBag(java.util.Comparator\u003c? super E\u003e)",
      "begin_line": 62,
      "end_line": 64,
      "comment": "\n     * Constructs an empty bag that maintains order on its unique representative\n     * members according to the given {@link Comparator}.\n     *\n     * @param comparator the comparator to use\n     ",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 58)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.bag.TreeBag.TreeBag(java.util.Collection\u003c? extends E\u003e)",
      "begin_line": 72,
      "end_line": 75,
      "comment": "\n     * Constructs a {@link TreeBag} containing all the members of the\n     * specified collection.\n     *\n     * @param coll the collection to copy into the bag\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 15)",
        "(line 74,col 9)-(line 74,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.TreeBag.add(E)",
      "begin_line": 86,
      "end_line": 96,
      "comment": "\n     * {@inheritDoc}\n     *\n     * @throws IllegalArgumentException if the object to be added does not implement\n     * {@link Comparable} and the {@link TreeBag} is using natural ordering\n     * @throws NullPointerException if the specified key is null and this bag uses\n     * natural ordering, or its comparator does not permit null keys\n     ",
      "child_ranges": [
        "(line 88,col 9)-(line 94,col 9)",
        "(line 95,col 9)-(line 95,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.TreeBag.first()",
      "begin_line": 100,
      "end_line": 103,
      "comment": "",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.TreeBag.last()",
      "begin_line": 105,
      "end_line": 108,
      "comment": "",
      "child_ranges": [
        "(line 107,col 9)-(line 107,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.TreeBag.comparator()",
      "begin_line": 110,
      "end_line": 113,
      "comment": "",
      "child_ranges": [
        "(line 112,col 9)-(line 112,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.TreeBag.getMap()",
      "begin_line": 115,
      "end_line": 118,
      "comment": "",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.TreeBag.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 124,
      "end_line": 128,
      "comment": "\n     * Write the bag out using a custom routine.\n     ",
      "child_ranges": [
        "(line 125,col 9)-(line 125,col 33)",
        "(line 126,col 9)-(line 126,col 38)",
        "(line 127,col 9)-(line 127,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.TreeBag.readObject(java.io.ObjectInputStream)",
      "begin_line": 133,
      "end_line": 138,
      "comment": "\n     * Read the bag in using a custom routine.\n     ",
      "child_ranges": [
        "(line 134,col 9)-(line 134,col 31)",
        "(line 135,col 9)-(line 136,col 83)",
        "(line 137,col 9)-(line 137,col 69)"
      ]
    }
  ]
}