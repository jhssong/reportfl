{
  "filepath": "/tmp/Collections-28b/src/main/java/org/apache/commons/collections4/list/TransformedList.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TransformedList",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.collection.TransformedCollection\u003cE\u003e",
        "java.util.List\u003cE\u003e"
      ],
      "begin_line": 40,
      "end_line": 212,
      "comment": "\n * Decorates another \u003ccode\u003eList\u003c/code\u003e to transform objects that are added.\n * \u003cp\u003e\n * The add and set methods are affected by this class.\n * Thus objects must be removed or searched for using their transformed form.\n * For example, if the transformation converts Strings to Integers, you must\n * use the Integer form to remove objects.\n * \u003cp\u003e\n * This class is Serializable from Commons Collections 3.1.\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " Serialization version "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.TransformedList.transformingList(java.util.List\u003cE\u003e, org.apache.commons.collections4.Transformer\u003c? super E, ? extends E\u003e)",
      "begin_line": 59,
      "end_line": 62,
      "comment": "\n     * Factory method to create a transforming list.\n     * \u003cp\u003e\n     * If there are any elements already in the list being decorated, they\n     * are NOT transformed.\n     * Contrast this with {@link #transformedList(List, Transformer)}.\n     *\n     * @param \u003cE\u003e the type of the elements in the list\n     * @param list  the list to decorate, must not be null\n     * @param transformer  the transformer to use for conversion, must not be null\n     * @return a new transformed list\n     * @throws NullPointerException if list or transformer is null\n     * @since 4.0\n     ",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.TransformedList.transformedList(java.util.List\u003cE\u003e, org.apache.commons.collections4.Transformer\u003c? super E, ? extends E\u003e)",
      "begin_line": 79,
      "end_line": 91,
      "comment": "\n     * Factory method to create a transforming list that will transform\n     * existing contents of the specified list.\n     * \u003cp\u003e\n     * If there are any elements already in the list being decorated, they\n     * will be transformed by this method.\n     * Contrast this with {@link #transformingList(List, Transformer)}.\n     *\n     * @param \u003cE\u003e the type of the elements in the list\n     * @param list  the list to decorate, must not be null\n     * @param transformer  the transformer to use for conversion, must not be null\n     * @return a new transformed List\n     * @throws NullPointerException if list or transformer is null\n     * @since 4.0\n     ",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 87)",
        "(line 82,col 9)-(line 89,col 9)",
        "(line 90,col 9)-(line 90,col 25)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.list.TransformedList.TransformedList(java.util.List\u003cE\u003e, org.apache.commons.collections4.Transformer\u003c? super E, ? extends E\u003e)",
      "begin_line": 104,
      "end_line": 106,
      "comment": "\n     * Constructor that wraps (not copies).\n     * \u003cp\u003e\n     * If there are any elements already in the list being decorated, they\n     * are NOT transformed.\n     *\n     * @param list  the list to decorate, must not be null\n     * @param transformer  the transformer to use for conversion, must not be null\n     * @throws NullPointerException if list or transformer is null\n     ",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.TransformedList.getList()",
      "begin_line": 113,
      "end_line": 115,
      "comment": "\n     * Gets the decorated list.\n     *\n     * @return the decorated list\n     ",
      "child_ranges": [
        "(line 114,col 9)-(line 114,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.TransformedList.equals(java.lang.Object)",
      "begin_line": 117,
      "end_line": 120,
      "comment": "",
      "child_ranges": [
        "(line 119,col 9)-(line 119,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.TransformedList.hashCode()",
      "begin_line": 122,
      "end_line": 125,
      "comment": "",
      "child_ranges": [
        "(line 124,col 9)-(line 124,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.TransformedList.get(int)",
      "begin_line": 129,
      "end_line": 132,
      "comment": "",
      "child_ranges": [
        "(line 131,col 9)-(line 131,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.TransformedList.indexOf(java.lang.Object)",
      "begin_line": 134,
      "end_line": 137,
      "comment": "",
      "child_ranges": [
        "(line 136,col 9)-(line 136,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.TransformedList.lastIndexOf(java.lang.Object)",
      "begin_line": 139,
      "end_line": 142,
      "comment": "",
      "child_ranges": [
        "(line 141,col 9)-(line 141,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.TransformedList.remove(int)",
      "begin_line": 144,
      "end_line": 147,
      "comment": "",
      "child_ranges": [
        "(line 146,col 9)-(line 146,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.TransformedList.add(int, E)",
      "begin_line": 151,
      "end_line": 155,
      "comment": "",
      "child_ranges": [
        "(line 153,col 9)-(line 153,col 35)",
        "(line 154,col 9)-(line 154,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.TransformedList.addAll(int, java.util.Collection\u003c? extends E\u003e)",
      "begin_line": 157,
      "end_line": 161,
      "comment": "",
      "child_ranges": [
        "(line 159,col 9)-(line 159,col 31)",
        "(line 160,col 9)-(line 160,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.TransformedList.listIterator()",
      "begin_line": 163,
      "end_line": 166,
      "comment": "",
      "child_ranges": [
        "(line 165,col 9)-(line 165,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.TransformedList.listIterator(int)",
      "begin_line": 168,
      "end_line": 171,
      "comment": "",
      "child_ranges": [
        "(line 170,col 9)-(line 170,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.TransformedList.set(int, E)",
      "begin_line": 173,
      "end_line": 177,
      "comment": "",
      "child_ranges": [
        "(line 175,col 9)-(line 175,col 35)",
        "(line 176,col 9)-(line 176,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.TransformedList.subList(int, int)",
      "begin_line": 179,
      "end_line": 183,
      "comment": "",
      "child_ranges": [
        "(line 181,col 9)-(line 181,col 66)",
        "(line 182,col 9)-(line 182,col 56)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TransformedListIterator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.iterators.AbstractListIteratorDecorator\u003cE\u003e"
      ],
      "begin_line": 188,
      "end_line": 210,
      "comment": "\n     * Inner class Iterator for the TransformedList\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.list.TransformedList.TransformedListIterator.TransformedListIterator(java.util.ListIterator\u003cE\u003e)",
      "begin_line": 195,
      "end_line": 197,
      "comment": "\n         * Create a new transformed list iterator.\n         *\n         * @param iterator  the list iterator to decorate\n         ",
      "child_ranges": [
        "(line 196,col 13)-(line 196,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.TransformedList.TransformedListIterator.add(E)",
      "begin_line": 199,
      "end_line": 203,
      "comment": "",
      "child_ranges": [
        "(line 201,col 13)-(line 201,col 39)",
        "(line 202,col 13)-(line 202,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.TransformedList.TransformedListIterator.set(E)",
      "begin_line": 205,
      "end_line": 209,
      "comment": "",
      "child_ranges": [
        "(line 207,col 13)-(line 207,col 39)",
        "(line 208,col 13)-(line 208,col 42)"
      ]
    }
  ]
}