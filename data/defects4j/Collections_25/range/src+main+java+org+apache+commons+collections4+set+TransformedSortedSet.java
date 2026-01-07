{
  "filepath": "/tmp/Collections-25b/src/main/java/org/apache/commons/collections4/set/TransformedSortedSet.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TransformedSortedSet",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.set.TransformedSet\u003cE\u003e",
        "java.util.SortedSet\u003cE\u003e"
      ],
      "begin_line": 37,
      "end_line": 144,
      "comment": "\n * Decorates another \u003ccode\u003eSortedSet\u003c/code\u003e to transform objects that are added.\n * \u003cp\u003e\n * The add methods are affected by this class.\n * Thus objects must be removed or searched for using their transformed form.\n * For example, if the transformation converts Strings to Integers, you must\n * use the Integer form to remove objects.\n * \u003cp\u003e\n * This class is Serializable from Commons Collections 3.1.\n *\n * @since 3.0\n * @version $Id$\n "
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
      "signature": "org.apache.commons.collections4.set.TransformedSortedSet.transformingSortedSet(java.util.SortedSet\u003cE\u003e, org.apache.commons.collections4.Transformer\u003c? super E, ? extends E\u003e)",
      "begin_line": 56,
      "end_line": 59,
      "comment": "\n     * Factory method to create a transforming sorted set.\n     * \u003cp\u003e\n     * If there are any elements already in the set being decorated, they\n     * are NOT transformed.\n     * Contrast this with {@link #transformedSortedSet(SortedSet, Transformer)}.\n     *\n     * @param \u003cE\u003e the element type\n     * @param set  the set to decorate, must not be null\n     * @param transformer  the transformer to use for conversion, must not be null\n     * @return a new transformed {@link SortedSet}\n     * @throws IllegalArgumentException if set or transformer is null\n     * @since 4.0\n     ",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.TransformedSortedSet.transformedSortedSet(java.util.SortedSet\u003cE\u003e, org.apache.commons.collections4.Transformer\u003c? super E, ? extends E\u003e)",
      "begin_line": 76,
      "end_line": 89,
      "comment": "\n     * Factory method to create a transforming sorted set that will transform\n     * existing contents of the specified sorted set.\n     * \u003cp\u003e\n     * If there are any elements already in the set being decorated, they\n     * will be transformed by this method.\n     * Contrast this with {@link #transformingSortedSet(SortedSet, Transformer)}.\n     *\n     * @param \u003cE\u003e the element type\n     * @param set  the set to decorate, must not be null\n     * @param transformer  the transformer to use for conversion, must not be null\n     * @return a new transformed {@link SortedSet}\n     * @throws IllegalArgumentException if set or transformer is null\n     * @since 4.0\n     ",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 96)",
        "(line 80,col 9)-(line 87,col 9)",
        "(line 88,col 9)-(line 88,col 25)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.set.TransformedSortedSet.TransformedSortedSet(java.util.SortedSet\u003cE\u003e, org.apache.commons.collections4.Transformer\u003c? super E, ? extends E\u003e)",
      "begin_line": 102,
      "end_line": 104,
      "comment": "\n     * Constructor that wraps (not copies).\n     * \u003cp\u003e\n     * If there are any elements already in the set being decorated, they\n     * are NOT transformed.\n     *\n     * @param set  the set to decorate, must not be null\n     * @param transformer  the transformer to use for conversion, must not be null\n     * @throws IllegalArgumentException if set or transformer is null\n     ",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.TransformedSortedSet.getSortedSet()",
      "begin_line": 111,
      "end_line": 113,
      "comment": "\n     * Gets the decorated set.\n     *\n     * @return the decorated set\n     ",
      "child_ranges": [
        "(line 112,col 9)-(line 112,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.TransformedSortedSet.first()",
      "begin_line": 116,
      "end_line": 118,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.TransformedSortedSet.last()",
      "begin_line": 120,
      "end_line": 122,
      "comment": "",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.TransformedSortedSet.comparator()",
      "begin_line": 124,
      "end_line": 126,
      "comment": "",
      "child_ranges": [
        "(line 125,col 9)-(line 125,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.TransformedSortedSet.subSet(E, E)",
      "begin_line": 129,
      "end_line": 132,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 130,col 9)-(line 130,col 79)",
        "(line 131,col 9)-(line 131,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.TransformedSortedSet.headSet(E)",
      "begin_line": 134,
      "end_line": 137,
      "comment": "",
      "child_ranges": [
        "(line 135,col 9)-(line 135,col 67)",
        "(line 136,col 9)-(line 136,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.TransformedSortedSet.tailSet(E)",
      "begin_line": 139,
      "end_line": 142,
      "comment": "",
      "child_ranges": [
        "(line 140,col 9)-(line 140,col 69)",
        "(line 141,col 9)-(line 141,col 61)"
      ]
    }
  ]
}