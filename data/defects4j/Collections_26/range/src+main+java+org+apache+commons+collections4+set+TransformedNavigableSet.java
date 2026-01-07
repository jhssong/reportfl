{
  "filepath": "/tmp/Collections-26b/src/main/java/org/apache/commons/collections4/set/TransformedNavigableSet.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TransformedNavigableSet",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.set.TransformedSortedSet\u003cE\u003e",
        "java.util.NavigableSet\u003cE\u003e"
      ],
      "begin_line": 35,
      "end_line": 173,
      "comment": "\n * Decorates another \u003ccode\u003eNavigableSet\u003c/code\u003e to transform objects that are added.\n * \u003cp\u003e\n * The add methods are affected by this class.\n * Thus objects must be removed or searched for using their transformed form.\n * For example, if the transformation converts Strings to Integers, you must\n * use the Integer form to remove objects.\n *\n * @since 4.1\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": " Serialization version "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.TransformedNavigableSet.transformingNavigableSet(java.util.NavigableSet\u003cE\u003e, org.apache.commons.collections4.Transformer\u003c? super E, ? extends E\u003e)",
      "begin_line": 53,
      "end_line": 56,
      "comment": "\n     * Factory method to create a transforming navigable set.\n     * \u003cp\u003e\n     * If there are any elements already in the set being decorated, they\n     * are NOT transformed.\n     * Contrast this with {@link #transformedNavigableSet(NavigableSet, Transformer)}.\n     *\n     * @param \u003cE\u003e the element type\n     * @param set  the set to decorate, must not be null\n     * @param transformer  the transformer to use for conversion, must not be null\n     * @return a new transformed {@link NavigableSet}\n     * @throws NullPointerException if set or transformer is null\n     ",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.TransformedNavigableSet.transformedNavigableSet(java.util.NavigableSet\u003cE\u003e, org.apache.commons.collections4.Transformer\u003c? super E, ? extends E\u003e)",
      "begin_line": 72,
      "end_line": 85,
      "comment": "\n     * Factory method to create a transforming navigable set that will transform\n     * existing contents of the specified navigable set.\n     * \u003cp\u003e\n     * If there are any elements already in the set being decorated, they\n     * will be transformed by this method.\n     * Contrast this with {@link #transformingNavigableSet(NavigableSet, Transformer)}.\n     *\n     * @param \u003cE\u003e the element type\n     * @param set  the set to decorate, must not be null\n     * @param transformer  the transformer to use for conversion, must not be null\n     * @return a new transformed {@link NavigableSet}\n     * @throws NullPointerException if set or transformer is null\n     ",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 102)",
        "(line 76,col 9)-(line 83,col 9)",
        "(line 84,col 9)-(line 84,col 25)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.set.TransformedNavigableSet.TransformedNavigableSet(java.util.NavigableSet\u003cE\u003e, org.apache.commons.collections4.Transformer\u003c? super E, ? extends E\u003e)",
      "begin_line": 98,
      "end_line": 101,
      "comment": "\n     * Constructor that wraps (not copies).\n     * \u003cp\u003e\n     * If there are any elements already in the set being decorated, they\n     * are NOT transformed.\n     *\n     * @param set  the set to decorate, must not be null\n     * @param transformer  the transformer to use for conversion, must not be null\n     * @throws NullPointerException if set or transformer is null\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.TransformedNavigableSet.decorated()",
      "begin_line": 108,
      "end_line": 111,
      "comment": "\n     * Gets the decorated navigable set.\n     *\n     * @return the decorated navigable set\n     ",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.TransformedNavigableSet.lower(E)",
      "begin_line": 115,
      "end_line": 118,
      "comment": "",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.TransformedNavigableSet.floor(E)",
      "begin_line": 120,
      "end_line": 123,
      "comment": "",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.TransformedNavigableSet.ceiling(E)",
      "begin_line": 125,
      "end_line": 128,
      "comment": "",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.TransformedNavigableSet.higher(E)",
      "begin_line": 130,
      "end_line": 133,
      "comment": "",
      "child_ranges": [
        "(line 132,col 9)-(line 132,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.TransformedNavigableSet.pollFirst()",
      "begin_line": 135,
      "end_line": 138,
      "comment": "",
      "child_ranges": [
        "(line 137,col 9)-(line 137,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.TransformedNavigableSet.pollLast()",
      "begin_line": 140,
      "end_line": 143,
      "comment": "",
      "child_ranges": [
        "(line 142,col 9)-(line 142,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.TransformedNavigableSet.descendingSet()",
      "begin_line": 145,
      "end_line": 148,
      "comment": "",
      "child_ranges": [
        "(line 147,col 9)-(line 147,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.TransformedNavigableSet.descendingIterator()",
      "begin_line": 150,
      "end_line": 153,
      "comment": "",
      "child_ranges": [
        "(line 152,col 9)-(line 152,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.TransformedNavigableSet.subSet(E, boolean, E, boolean)",
      "begin_line": 155,
      "end_line": 159,
      "comment": "",
      "child_ranges": [
        "(line 157,col 9)-(line 157,col 107)",
        "(line 158,col 9)-(line 158,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.TransformedNavigableSet.headSet(E, boolean)",
      "begin_line": 161,
      "end_line": 165,
      "comment": "",
      "child_ranges": [
        "(line 163,col 9)-(line 163,col 79)",
        "(line 164,col 9)-(line 164,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.TransformedNavigableSet.tailSet(E, boolean)",
      "begin_line": 167,
      "end_line": 171,
      "comment": "",
      "child_ranges": [
        "(line 169,col 9)-(line 169,col 81)",
        "(line 170,col 9)-(line 170,col 59)"
      ]
    }
  ]
}