{
  "filepath": "/tmp/Collections-26b/src/main/java/org/apache/commons/collections4/bag/TransformedSortedBag.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TransformedSortedBag",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.bag.TransformedBag\u003cE\u003e",
        "org.apache.commons.collections4.SortedBag\u003cE\u003e"
      ],
      "begin_line": 37,
      "end_line": 131,
      "comment": "\n * Decorates another {@link SortedBag} to transform objects that are added.\n * \u003cp\u003e\n * The add methods are affected by this class.\n * Thus objects must be removed or searched for using their transformed form.\n * For example, if the transformation converts Strings to Integers, you must\n * use the Integer form to remove objects.\n * \u003cp\u003e\n * This class is Serializable from Commons Collections 3.1.\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " Serialization version "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.TransformedSortedBag.transformingSortedBag(org.apache.commons.collections4.SortedBag\u003cE\u003e, org.apache.commons.collections4.Transformer\u003c? super E, ? extends E\u003e)",
      "begin_line": 55,
      "end_line": 58,
      "comment": "\n     * Factory method to create a transforming sorted bag.\n     * \u003cp\u003e\n     * If there are any elements already in the bag being decorated, they\n     * are NOT transformed. Contrast this with {@link #transformedSortedBag(SortedBag, Transformer)}.\n     *\n     * @param \u003cE\u003e the type of the elements in the bag\n     * @param bag  the bag to decorate, must not be null\n     * @param transformer  the transformer to use for conversion, must not be null\n     * @return a new transformed SortedBag\n     * @throws NullPointerException if bag or transformer is null\n     * @since 4.0\n     ",
      "child_ranges": [
        "(line 57,col 9)-(line 57,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.TransformedSortedBag.transformedSortedBag(org.apache.commons.collections4.SortedBag\u003cE\u003e, org.apache.commons.collections4.Transformer\u003c? super E, ? extends E\u003e)",
      "begin_line": 75,
      "end_line": 88,
      "comment": "\n     * Factory method to create a transforming sorted bag that will transform\n     * existing contents of the specified sorted bag.\n     * \u003cp\u003e\n     * If there are any elements already in the bag being decorated, they\n     * will be transformed by this method.\n     * Contrast this with {@link #transformingSortedBag(SortedBag, Transformer)}.\n     *\n     * @param \u003cE\u003e the type of the elements in the bag\n     * @param bag  the bag to decorate, must not be null\n     * @param transformer  the transformer to use for conversion, must not be null\n     * @return a new transformed SortedBag\n     * @throws NullPointerException if bag or transformer is null\n     * @since 4.0\n     ",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 97)",
        "(line 79,col 9)-(line 86,col 9)",
        "(line 87,col 9)-(line 87,col 25)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.bag.TransformedSortedBag.TransformedSortedBag(org.apache.commons.collections4.SortedBag\u003cE\u003e, org.apache.commons.collections4.Transformer\u003c? super E, ? extends E\u003e)",
      "begin_line": 101,
      "end_line": 103,
      "comment": "\n     * Constructor that wraps (not copies).\n     * \u003cp\u003e\n     * If there are any elements already in the bag being decorated, they\n     * are NOT transformed.\n     *\n     * @param bag  the bag to decorate, must not be null\n     * @param transformer  the transformer to use for conversion, must not be null\n     * @throws NullPointerException if bag or transformer is null\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.TransformedSortedBag.getSortedBag()",
      "begin_line": 110,
      "end_line": 112,
      "comment": "\n     * Gets the decorated bag.\n     *\n     * @return the decorated bag\n     ",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.TransformedSortedBag.first()",
      "begin_line": 116,
      "end_line": 119,
      "comment": "",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.TransformedSortedBag.last()",
      "begin_line": 121,
      "end_line": 124,
      "comment": "",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.TransformedSortedBag.comparator()",
      "begin_line": 126,
      "end_line": 129,
      "comment": "",
      "child_ranges": [
        "(line 128,col 9)-(line 128,col 43)"
      ]
    }
  ]
}