{
  "filepath": "/tmp/Collections-27b/src/main/java/org/apache/commons/collections4/bag/CollectionSortedBag.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CollectionSortedBag",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.bag.AbstractSortedBagDecorator\u003cE\u003e"
      ],
      "begin_line": 33,
      "end_line": 168,
      "comment": "\n * Decorates another {@link SortedBag} to comply with the Collection contract.\n *\n * @since 4.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": " Serialization version "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.CollectionSortedBag.collectionSortedBag(org.apache.commons.collections4.SortedBag\u003cE\u003e)",
      "begin_line": 46,
      "end_line": 48,
      "comment": "\n     * Factory method to create a sorted bag that complies to the Collection contract.\n     *\n     * @param \u003cE\u003e the type of the elements in the bag\n     * @param bag  the sorted bag to decorate, must not be null\n     * @return a SortedBag that complies to the Collection contract\n     * @throws NullPointerException if bag is null\n     ",
      "child_ranges": [
        "(line 47,col 9)-(line 47,col 47)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.bag.CollectionSortedBag.CollectionSortedBag(org.apache.commons.collections4.SortedBag\u003cE\u003e)",
      "begin_line": 57,
      "end_line": 59,
      "comment": "\n     * Constructor that wraps (not copies).\n     *\n     * @param bag  the sorted bag to decorate, must not be null\n     * @throws NullPointerException if bag is null\n     ",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.CollectionSortedBag.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 68,
      "end_line": 71,
      "comment": "\n     * Write the collection out using a custom routine.\n     *\n     * @param out  the output stream\n     * @throws IOException\n     ",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 33)",
        "(line 70,col 9)-(line 70,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.CollectionSortedBag.readObject(java.io.ObjectInputStream)",
      "begin_line": 81,
      "end_line": 85,
      "comment": "\n     * Read the collection in using a custom routine.\n     *\n     * @param in  the input stream\n     * @throws IOException\n     * @throws ClassNotFoundException\n     * @throws ClassCastException if deserialised object has wrong type\n     ",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 31)",
        "(line 84,col 9)-(line 84,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.CollectionSortedBag.containsAll(java.util.Collection\u003c?\u003e)",
      "begin_line": 91,
      "end_line": 100,
      "comment": "",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 46)",
        "(line 94,col 9)-(line 98,col 9)",
        "(line 99,col 9)-(line 99,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.CollectionSortedBag.add(E)",
      "begin_line": 102,
      "end_line": 105,
      "comment": "",
      "child_ranges": [
        "(line 104,col 9)-(line 104,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.CollectionSortedBag.addAll(java.util.Collection\u003c? extends E\u003e)",
      "begin_line": 107,
      "end_line": 116,
      "comment": "",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 32)",
        "(line 110,col 9)-(line 110,col 56)",
        "(line 111,col 9)-(line 114,col 9)",
        "(line 115,col 9)-(line 115,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.CollectionSortedBag.remove(java.lang.Object)",
      "begin_line": 118,
      "end_line": 121,
      "comment": "",
      "child_ranges": [
        "(line 120,col 9)-(line 120,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.CollectionSortedBag.removeAll(java.util.Collection\u003c?\u003e)",
      "begin_line": 123,
      "end_line": 138,
      "comment": "",
      "child_ranges": [
        "(line 125,col 9)-(line 137,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.CollectionSortedBag.retainAll(java.util.Collection\u003c?\u003e)",
      "begin_line": 140,
      "end_line": 156,
      "comment": "",
      "child_ranges": [
        "(line 142,col 9)-(line 155,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.CollectionSortedBag.add(E, int)",
      "begin_line": 162,
      "end_line": 166,
      "comment": "",
      "child_ranges": [
        "(line 164,col 9)-(line 164,col 39)",
        "(line 165,col 9)-(line 165,col 20)"
      ]
    }
  ]
}