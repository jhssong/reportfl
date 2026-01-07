{
  "filepath": "/tmp/Collections-26b/src/main/java/org/apache/commons/collections4/bidimap/AbstractBidiMapDecorator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractBidiMapDecorator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.map.AbstractMapDecorator\u003cK, V\u003e",
        "org.apache.commons.collections4.BidiMap\u003cK, V\u003e"
      ],
      "begin_line": 40,
      "end_line": 89,
      "comment": "\n * Provides a base decorator that enables additional functionality to be added\n * to a BidiMap via decoration.\n * \u003cp\u003e\n * Methods are forwarded directly to the decorated map.\n * \u003cp\u003e\n * This implementation does not perform any special processing with the map views.\n * Instead it simply returns the set/collection from the wrapped map. This may be\n * undesirable, for example if you are trying to write a validating implementation\n * it would provide a loophole around the validation.\n * But, you might want that loophole, so this class is kept simple.\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.bidimap.AbstractBidiMapDecorator.AbstractBidiMapDecorator(org.apache.commons.collections4.BidiMap\u003cK, V\u003e)",
      "begin_line": 49,
      "end_line": 51,
      "comment": "\n     * Constructor that wraps (not copies).\n     *\n     * @param map  the map to decorate, must not be null\n     * @throws NullPointerException if the collection is null\n     ",
      "child_ranges": [
        "(line 50,col 9)-(line 50,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.AbstractBidiMapDecorator.decorated()",
      "begin_line": 58,
      "end_line": 61,
      "comment": "\n     * Gets the map being decorated.\n     *\n     * @return the decorated map\n     ",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.AbstractBidiMapDecorator.mapIterator()",
      "begin_line": 64,
      "end_line": 67,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.AbstractBidiMapDecorator.getKey(java.lang.Object)",
      "begin_line": 69,
      "end_line": 72,
      "comment": "",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.AbstractBidiMapDecorator.removeValue(java.lang.Object)",
      "begin_line": 74,
      "end_line": 77,
      "comment": "",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.AbstractBidiMapDecorator.inverseBidiMap()",
      "begin_line": 79,
      "end_line": 82,
      "comment": "",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.AbstractBidiMapDecorator.values()",
      "begin_line": 84,
      "end_line": 87,
      "comment": "",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 36)"
      ]
    }
  ]
}