{
  "filepath": "/tmp/Collections-25b/src/main/java/org/apache/commons/collections4/map/AbstractOrderedMapDecorator.java",
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
      "end_line": 90,
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
      "comment": "\n     * Constructor that wraps (not copies).\n     *\n     * @param map  the map to decorate, must not be null\n     * @throws IllegalArgumentException if the collection is null\n     ",
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
      "end_line": 71,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractOrderedMapDecorator.lastKey()",
      "begin_line": 73,
      "end_line": 75,
      "comment": "",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractOrderedMapDecorator.nextKey(K)",
      "begin_line": 77,
      "end_line": 79,
      "comment": "",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractOrderedMapDecorator.previousKey(K)",
      "begin_line": 81,
      "end_line": 83,
      "comment": "",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractOrderedMapDecorator.mapIterator()",
      "begin_line": 85,
      "end_line": 88,
      "comment": "",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 41)"
      ]
    }
  ]
}