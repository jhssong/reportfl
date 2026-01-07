{
  "filepath": "/tmp/Collections-28b/src/main/java/org/apache/commons/collections4/map/AbstractOrderedMapDecorator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractOrderedMapDecorator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.map.AbstractMapDecorator\u003cK, V\u003e",
        "org.apache.commons.collections4.OrderedMap\u003cK, V\u003e"
      ],
      "begin_line": 37,
      "end_line": 94,
      "comment": "\n * Provides a base decorator that enables additional functionality to be added\n * to an OrderedMap via decoration.\n * \u003cp\u003e\n * Methods are forwarded directly to the decorated map.\n * \u003cp\u003e\n * This implementation does not perform any special processing with the map views.\n * Instead it simply returns the set/collection from the wrapped map. This may be\n * undesirable, for example if you are trying to write a validating implementation\n * it would provide a loophole around the validation.\n * But, you might want that loophole, so this class is kept simple.\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.AbstractOrderedMapDecorator.AbstractOrderedMapDecorator()",
      "begin_line": 44,
      "end_line": 46,
      "comment": "\n     * Constructor only used in deserialization, do not use otherwise.\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 45,col 9)-(line 45,col 16)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.AbstractOrderedMapDecorator.AbstractOrderedMapDecorator(org.apache.commons.collections4.OrderedMap\u003cK, V\u003e)",
      "begin_line": 54,
      "end_line": 56,
      "comment": "\n     * Constructor that wraps (not copies).\n     *\n     * @param map  the map to decorate, must not be null\n     * @throws NullPointerException if the map is null\n     ",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractOrderedMapDecorator.decorated()",
      "begin_line": 63,
      "end_line": 66,
      "comment": "\n     * Gets the map being decorated.\n     *\n     * @return the decorated map\n     ",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractOrderedMapDecorator.firstKey()",
      "begin_line": 69,
      "end_line": 72,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractOrderedMapDecorator.lastKey()",
      "begin_line": 74,
      "end_line": 77,
      "comment": "",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractOrderedMapDecorator.nextKey(K)",
      "begin_line": 79,
      "end_line": 82,
      "comment": "",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractOrderedMapDecorator.previousKey(K)",
      "begin_line": 84,
      "end_line": 87,
      "comment": "",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractOrderedMapDecorator.mapIterator()",
      "begin_line": 89,
      "end_line": 92,
      "comment": "",
      "child_ranges": [
        "(line 91,col 9)-(line 91,col 41)"
      ]
    }
  ]
}