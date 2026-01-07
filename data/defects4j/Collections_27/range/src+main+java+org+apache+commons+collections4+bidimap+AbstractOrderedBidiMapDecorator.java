{
  "filepath": "/tmp/Collections-27b/src/main/java/org/apache/commons/collections4/bidimap/AbstractOrderedBidiMapDecorator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractOrderedBidiMapDecorator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.bidimap.AbstractBidiMapDecorator\u003cK, V\u003e",
        "org.apache.commons.collections4.OrderedBidiMap\u003cK, V\u003e"
      ],
      "begin_line": 37,
      "end_line": 92,
      "comment": "\n * Provides a base decorator that enables additional functionality to be added\n * to an OrderedBidiMap via decoration.\n * \u003cp\u003e\n * Methods are forwarded directly to the decorated map.\n * \u003cp\u003e\n * This implementation does not perform any special processing with the map views.\n * Instead it simply returns the inverse from the wrapped map. This may be\n * undesirable, for example if you are trying to write a validating implementation\n * it would provide a loophole around the validation.\n * But, you might want that loophole, so this class is kept simple.\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.bidimap.AbstractOrderedBidiMapDecorator.AbstractOrderedBidiMapDecorator(org.apache.commons.collections4.OrderedBidiMap\u003cK, V\u003e)",
      "begin_line": 47,
      "end_line": 49,
      "comment": "\n     * Constructor that wraps (not copies).\n     *\n     * @param map  the map to decorate, must not be null\n     * @throws NullPointerException if the collection is null\n     ",
      "child_ranges": [
        "(line 48,col 9)-(line 48,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.AbstractOrderedBidiMapDecorator.decorated()",
      "begin_line": 56,
      "end_line": 59,
      "comment": "\n     * Gets the map being decorated.\n     *\n     * @return the decorated map\n     ",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.AbstractOrderedBidiMapDecorator.mapIterator()",
      "begin_line": 62,
      "end_line": 65,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.AbstractOrderedBidiMapDecorator.firstKey()",
      "begin_line": 67,
      "end_line": 70,
      "comment": "",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.AbstractOrderedBidiMapDecorator.lastKey()",
      "begin_line": 72,
      "end_line": 75,
      "comment": "",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.AbstractOrderedBidiMapDecorator.nextKey(K)",
      "begin_line": 77,
      "end_line": 80,
      "comment": "",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.AbstractOrderedBidiMapDecorator.previousKey(K)",
      "begin_line": 82,
      "end_line": 85,
      "comment": "",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.AbstractOrderedBidiMapDecorator.inverseBidiMap()",
      "begin_line": 87,
      "end_line": 90,
      "comment": "",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 44)"
      ]
    }
  ]
}