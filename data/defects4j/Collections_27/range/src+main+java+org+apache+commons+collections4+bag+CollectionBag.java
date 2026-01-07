{
  "filepath": "/tmp/Collections-27b/src/main/java/org/apache/commons/collections4/bag/CollectionBag.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CollectionBag",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.bag.AbstractBagDecorator\u003cE\u003e"
      ],
      "begin_line": 41,
      "end_line": 243,
      "comment": "\n * Decorates another {@link Bag} to comply with the Collection contract.\n * \u003cp\u003e\n * By decorating an existing {@link Bag} instance with a {@link CollectionBag},\n * it can be safely passed on to methods that require Collection types that\n * are fully compliant with the Collection contract.\n * \u003cp\u003e\n * The method javadoc highlights the differences compared to the original Bag interface.\n *\n * @see Bag\n * @param \u003cE\u003e the type held in the bag\n * @since 4.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " Serialization version "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.CollectionBag.collectionBag(org.apache.commons.collections4.Bag\u003cE\u003e)",
      "begin_line": 54,
      "end_line": 56,
      "comment": "\n     * Factory method to create a bag that complies to the Collection contract.\n     *\n     * @param \u003cE\u003e the type of the elements in the bag\n     * @param bag  the bag to decorate, must not be null\n     * @return a Bag that complies to the Collection contract\n     * @throws NullPointerException if bag is null\n     ",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 41)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.bag.CollectionBag.CollectionBag(org.apache.commons.collections4.Bag\u003cE\u003e)",
      "begin_line": 65,
      "end_line": 67,
      "comment": "\n     * Constructor that wraps (not copies).\n     *\n     * @param bag  the bag to decorate, must not be null\n     * @throws NullPointerException if bag is null\n     ",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.CollectionBag.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 76,
      "end_line": 79,
      "comment": "\n     * Write the collection out using a custom routine.\n     *\n     * @param out  the output stream\n     * @throws IOException\n     ",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 33)",
        "(line 78,col 9)-(line 78,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.CollectionBag.readObject(java.io.ObjectInputStream)",
      "begin_line": 89,
      "end_line": 93,
      "comment": "\n     * Read the collection in using a custom routine.\n     *\n     * @param in  the input stream\n     * @throws IOException\n     * @throws ClassNotFoundException\n     * @throws ClassCastException if deserialised object has wrong type\n     ",
      "child_ranges": [
        "(line 91,col 9)-(line 91,col 31)",
        "(line 92,col 9)-(line 92,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.CollectionBag.containsAll(java.util.Collection\u003c?\u003e)",
      "begin_line": 109,
      "end_line": 118,
      "comment": "\n     * \u003ci\u003e(Change)\u003c/i\u003e\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if the bag contains all elements in\n     * the given collection, \u003cb\u003enot\u003c/b\u003e respecting cardinality. That is,\n     * if the given collection \u003ccode\u003ecoll\u003c/code\u003e contains at least one of\n     * every object contained in this object.\n     *\n     * @param coll  the collection to check against\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the Bag contains at least one of every object in the collection\n     ",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 46)",
        "(line 112,col 9)-(line 116,col 9)",
        "(line 117,col 9)-(line 117,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.CollectionBag.add(E)",
      "begin_line": 130,
      "end_line": 133,
      "comment": "\n     * \u003ci\u003e(Change)\u003c/i\u003e\n     * Adds one copy of the specified object to the Bag.\n     * \u003cp\u003e\n     * Since this method always increases the size of the bag, it\n     * will always return \u003ccode\u003etrue\u003c/code\u003e.\n     *\n     * @param object  the object to add\n     * @return \u003ccode\u003etrue\u003c/code\u003e, always\n     ",
      "child_ranges": [
        "(line 132,col 9)-(line 132,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.CollectionBag.addAll(java.util.Collection\u003c? extends E\u003e)",
      "begin_line": 135,
      "end_line": 144,
      "comment": "",
      "child_ranges": [
        "(line 137,col 9)-(line 137,col 32)",
        "(line 138,col 9)-(line 138,col 56)",
        "(line 139,col 9)-(line 142,col 9)",
        "(line 143,col 9)-(line 143,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.CollectionBag.remove(java.lang.Object)",
      "begin_line": 156,
      "end_line": 159,
      "comment": "\n     * \u003ci\u003e(Change)\u003c/i\u003e\n     * Removes the first occurrence of the given object from the bag.\n     * \u003cp\u003e\n     * This will also remove the object from the {@link #uniqueSet()} if the\n     * bag contains no occurrence anymore of the object after this operation.\n     *\n     * @param object  the object to remove\n     * @return \u003ccode\u003etrue\u003c/code\u003e if this call changed the collection\n     ",
      "child_ranges": [
        "(line 158,col 9)-(line 158,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.CollectionBag.removeAll(java.util.Collection\u003c?\u003e)",
      "begin_line": 170,
      "end_line": 185,
      "comment": "\n     * \u003ci\u003e(Change)\u003c/i\u003e\n     * Remove all elements represented in the given collection,\n     * \u003cb\u003enot\u003c/b\u003e respecting cardinality. That is, remove \u003ci\u003eall\u003c/i\u003e\n     * occurrences of every object contained in the given collection.\n     *\n     * @param coll  the collection to remove\n     * @return \u003ccode\u003etrue\u003c/code\u003e if this call changed the collection\n     ",
      "child_ranges": [
        "(line 172,col 9)-(line 184,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.CollectionBag.retainAll(java.util.Collection\u003c?\u003e)",
      "begin_line": 204,
      "end_line": 220,
      "comment": "\n     * \u003ci\u003e(Change)\u003c/i\u003e\n     * Remove any members of the bag that are not in the given collection,\n     * \u003ci\u003enot\u003c/i\u003e respecting cardinality. That is, any object in the given\n     * collection \u003ccode\u003ecoll\u003c/code\u003e will be retained in the bag with the same\n     * number of copies prior to this operation. All other objects will be\n     * completely removed from this bag.\n     * \u003cp\u003e\n     * This implementation iterates over the elements of this bag, checking\n     * each element in turn to see if it\u0027s contained in \u003ccode\u003ecoll\u003c/code\u003e.\n     * If it\u0027s not contained, it\u0027s removed from this bag. As a consequence,\n     * it is advised to use a collection type for \u003ccode\u003ecoll\u003c/code\u003e that provides\n     * a fast (e.g. O(1)) implementation of {@link Collection#contains(Object)}.\n     *\n     * @param coll  the collection to retain\n     * @return \u003ccode\u003etrue\u003c/code\u003e if this call changed the collection\n     ",
      "child_ranges": [
        "(line 206,col 9)-(line 219,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.CollectionBag.add(E, int)",
      "begin_line": 237,
      "end_line": 241,
      "comment": "\n     * \u003ci\u003e(Change)\u003c/i\u003e\n     * Adds \u003ccode\u003ecount\u003c/code\u003e copies of the specified object to the Bag.\n     * \u003cp\u003e\n     * Since this method always increases the size of the bag, it\n     * will always return \u003ccode\u003etrue\u003c/code\u003e.\n     *\n     * @param object  the object to add\n     * @param count  the number of copies to add\n     * @return \u003ccode\u003etrue\u003c/code\u003e, always\n     ",
      "child_ranges": [
        "(line 239,col 9)-(line 239,col 39)",
        "(line 240,col 9)-(line 240,col 20)"
      ]
    }
  ]
}