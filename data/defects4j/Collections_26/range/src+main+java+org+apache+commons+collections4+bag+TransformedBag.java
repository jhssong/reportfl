{
  "filepath": "/tmp/Collections-26b/src/main/java/org/apache/commons/collections4/bag/TransformedBag.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TransformedBag",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.collection.TransformedCollection\u003cE\u003e",
        "org.apache.commons.collections4.Bag\u003cE\u003e"
      ],
      "begin_line": 39,
      "end_line": 148,
      "comment": "\n * Decorates another {@link Bag} to transform objects that are added.\n * \u003cp\u003e\n * The add methods are affected by this class.\n * Thus objects must be removed or searched for using their transformed form.\n * For example, if the transformation converts Strings to Integers, you must\n * use the Integer form to remove objects.\n * \u003cp\u003e\n * This class is Serializable from Commons Collections 3.1.\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " Serialization version "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.TransformedBag.transformingBag(org.apache.commons.collections4.Bag\u003cE\u003e, org.apache.commons.collections4.Transformer\u003c? super E, ? extends E\u003e)",
      "begin_line": 57,
      "end_line": 59,
      "comment": "\n     * Factory method to create a transforming bag.\n     * \u003cp\u003e\n     * If there are any elements already in the bag being decorated, they\n     * are NOT transformed. Contrast this with {@link #transformedBag(Bag, Transformer)}.\n     *\n     * @param \u003cE\u003e the type of the elements in the bag\n     * @param bag  the bag to decorate, must not be null\n     * @param transformer  the transformer to use for conversion, must not be null\n     * @return a new transformed Bag\n     * @throws NullPointerException if bag or transformer is null\n     * @since 4.0\n     ",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.TransformedBag.transformedBag(org.apache.commons.collections4.Bag\u003cE\u003e, org.apache.commons.collections4.Transformer\u003c? super E, ? extends E\u003e)",
      "begin_line": 76,
      "end_line": 87,
      "comment": "\n     * Factory method to create a transforming bag that will transform\n     * existing contents of the specified bag.\n     * \u003cp\u003e\n     * If there are any elements already in the bag being decorated, they\n     * will be transformed by this method.\n     * Contrast this with {@link #transformingBag(Bag, Transformer)}.\n     *\n     * @param \u003cE\u003e the type of the elements in the bag\n     * @param bag  the bag to decorate, must not be null\n     * @param transformer  the transformer to use for conversion, must not be null\n     * @return a new transformed Bag\n     * @throws NullPointerException if bag or transformer is null\n     * @since 4.0\n     ",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 84)",
        "(line 78,col 9)-(line 85,col 9)",
        "(line 86,col 9)-(line 86,col 25)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.bag.TransformedBag.TransformedBag(org.apache.commons.collections4.Bag\u003cE\u003e, org.apache.commons.collections4.Transformer\u003c? super E, ? extends E\u003e)",
      "begin_line": 100,
      "end_line": 102,
      "comment": "\n     * Constructor that wraps (not copies).\n     * \u003cp\u003e\n     * If there are any elements already in the bag being decorated, they\n     * are NOT transformed.\n     *\n     * @param bag  the bag to decorate, must not be null\n     * @param transformer  the transformer to use for conversion, must not be null\n     * @throws NullPointerException if bag or transformer is null\n     ",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.TransformedBag.getBag()",
      "begin_line": 109,
      "end_line": 111,
      "comment": "\n     * Gets the decorated bag.\n     *\n     * @return the decorated bag\n     ",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.TransformedBag.equals(java.lang.Object)",
      "begin_line": 113,
      "end_line": 116,
      "comment": "",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.TransformedBag.hashCode()",
      "begin_line": 118,
      "end_line": 121,
      "comment": "",
      "child_ranges": [
        "(line 120,col 9)-(line 120,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.TransformedBag.getCount(java.lang.Object)",
      "begin_line": 125,
      "end_line": 128,
      "comment": "",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.TransformedBag.remove(java.lang.Object, int)",
      "begin_line": 130,
      "end_line": 133,
      "comment": "",
      "child_ranges": [
        "(line 132,col 9)-(line 132,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.TransformedBag.add(E, int)",
      "begin_line": 137,
      "end_line": 140,
      "comment": "",
      "child_ranges": [
        "(line 139,col 9)-(line 139,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.TransformedBag.uniqueSet()",
      "begin_line": 142,
      "end_line": 146,
      "comment": "",
      "child_ranges": [
        "(line 144,col 9)-(line 144,col 48)",
        "(line 145,col 9)-(line 145,col 67)"
      ]
    }
  ]
}