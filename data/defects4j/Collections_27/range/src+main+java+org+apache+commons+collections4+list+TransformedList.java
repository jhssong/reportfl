{
  "filepath": "/tmp/Collections-27b/src/main/java/org/apache/commons/collections4/list/TransformedList.java",
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
      "end_line": 202,
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
      "end_line": 131,
      "comment": "",
      "child_ranges": [
        "(line 130,col 9)-(line 130,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.TransformedList.indexOf(java.lang.Object)",
      "begin_line": 133,
      "end_line": 135,
      "comment": "",
      "child_ranges": [
        "(line 134,col 9)-(line 134,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.TransformedList.lastIndexOf(java.lang.Object)",
      "begin_line": 137,
      "end_line": 139,
      "comment": "",
      "child_ranges": [
        "(line 138,col 9)-(line 138,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.TransformedList.remove(int)",
      "begin_line": 141,
      "end_line": 143,
      "comment": "",
      "child_ranges": [
        "(line 142,col 9)-(line 142,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.TransformedList.add(int, E)",
      "begin_line": 147,
      "end_line": 150,
      "comment": "",
      "child_ranges": [
        "(line 148,col 9)-(line 148,col 35)",
        "(line 149,col 9)-(line 149,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.TransformedList.addAll(int, java.util.Collection\u003c? extends E\u003e)",
      "begin_line": 152,
      "end_line": 155,
      "comment": "",
      "child_ranges": [
        "(line 153,col 9)-(line 153,col 31)",
        "(line 154,col 9)-(line 154,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.TransformedList.listIterator()",
      "begin_line": 157,
      "end_line": 159,
      "comment": "",
      "child_ranges": [
        "(line 158,col 9)-(line 158,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.TransformedList.listIterator(int)",
      "begin_line": 161,
      "end_line": 163,
      "comment": "",
      "child_ranges": [
        "(line 162,col 9)-(line 162,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.TransformedList.set(int, E)",
      "begin_line": 165,
      "end_line": 168,
      "comment": "",
      "child_ranges": [
        "(line 166,col 9)-(line 166,col 35)",
        "(line 167,col 9)-(line 167,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.TransformedList.subList(int, int)",
      "begin_line": 170,
      "end_line": 173,
      "comment": "",
      "child_ranges": [
        "(line 171,col 9)-(line 171,col 66)",
        "(line 172,col 9)-(line 172,col 56)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TransformedListIterator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.iterators.AbstractListIteratorDecorator\u003cE\u003e"
      ],
      "begin_line": 178,
      "end_line": 200,
      "comment": "\n     * Inner class Iterator for the TransformedList\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.list.TransformedList.TransformedListIterator.TransformedListIterator(java.util.ListIterator\u003cE\u003e)",
      "begin_line": 185,
      "end_line": 187,
      "comment": "\n         * Create a new transformed list iterator.\n         *\n         * @param iterator  the list iterator to decorate\n         ",
      "child_ranges": [
        "(line 186,col 13)-(line 186,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.TransformedList.TransformedListIterator.add(E)",
      "begin_line": 189,
      "end_line": 193,
      "comment": "",
      "child_ranges": [
        "(line 191,col 13)-(line 191,col 39)",
        "(line 192,col 13)-(line 192,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.TransformedList.TransformedListIterator.set(E)",
      "begin_line": 195,
      "end_line": 199,
      "comment": "",
      "child_ranges": [
        "(line 197,col 13)-(line 197,col 39)",
        "(line 198,col 13)-(line 198,col 42)"
      ]
    }
  ]
}