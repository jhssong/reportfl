{
  "filepath": "/tmp/Collections-26b/src/main/java/org/apache/commons/collections4/map/AbstractMapDecorator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractMapDecorator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.map.AbstractIterableMap\u003cK, V\u003e"
      ],
      "begin_line": 41,
      "end_line": 143,
      "comment": "\n * Provides a base decorator that enables additional functionality to be added\n * to a Map via decoration.\n * \u003cp\u003e\n * Methods are forwarded directly to the decorated map.\n * \u003cp\u003e\n * This implementation does not perform any special processing with\n * {@link #entrySet()}, {@link #keySet()} or {@link #values()}. Instead\n * it simply returns the set/collection from the wrapped map. This may be\n * undesirable, for example if you are trying to write a validating\n * implementation it would provide a loophole around the validation.\n * But, you might want that loophole, so this class is kept simple.\n *\n * @param \u003cK\u003e the type of the keys in the map\n * @param \u003cV\u003e the type of the values in the map\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "map"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " The map to decorate "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.AbstractMapDecorator.AbstractMapDecorator()",
      "begin_line": 50,
      "end_line": 52,
      "comment": "\n     * Constructor only used in deserialization, do not use otherwise.\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 51,col 9)-(line 51,col 16)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.AbstractMapDecorator.AbstractMapDecorator(java.util.Map\u003cK, V\u003e)",
      "begin_line": 60,
      "end_line": 65,
      "comment": "\n     * Constructor that wraps (not copies).\n     *\n     * @param map  the map to decorate, must not be null\n     * @throws NullPointerException if the map is null\n     ",
      "child_ranges": [
        "(line 61,col 9)-(line 63,col 9)",
        "(line 64,col 9)-(line 64,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapDecorator.decorated()",
      "begin_line": 72,
      "end_line": 74,
      "comment": "\n     * Gets the map being decorated.\n     *\n     * @return the decorated map\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapDecorator.clear()",
      "begin_line": 77,
      "end_line": 79,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapDecorator.containsKey(java.lang.Object)",
      "begin_line": 81,
      "end_line": 83,
      "comment": "",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapDecorator.containsValue(java.lang.Object)",
      "begin_line": 85,
      "end_line": 87,
      "comment": "",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapDecorator.entrySet()",
      "begin_line": 89,
      "end_line": 91,
      "comment": "",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapDecorator.get(java.lang.Object)",
      "begin_line": 93,
      "end_line": 95,
      "comment": "",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapDecorator.isEmpty()",
      "begin_line": 97,
      "end_line": 99,
      "comment": "",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapDecorator.keySet()",
      "begin_line": 101,
      "end_line": 103,
      "comment": "",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapDecorator.put(K, V)",
      "begin_line": 105,
      "end_line": 107,
      "comment": "",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapDecorator.putAll(java.util.Map\u003c? extends K, ? extends V\u003e)",
      "begin_line": 109,
      "end_line": 111,
      "comment": "",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapDecorator.remove(java.lang.Object)",
      "begin_line": 113,
      "end_line": 115,
      "comment": "",
      "child_ranges": [
        "(line 114,col 9)-(line 114,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapDecorator.size()",
      "begin_line": 117,
      "end_line": 119,
      "comment": "",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapDecorator.values()",
      "begin_line": 121,
      "end_line": 123,
      "comment": "",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapDecorator.equals(java.lang.Object)",
      "begin_line": 125,
      "end_line": 131,
      "comment": "",
      "child_ranges": [
        "(line 127,col 9)-(line 129,col 9)",
        "(line 130,col 9)-(line 130,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapDecorator.hashCode()",
      "begin_line": 133,
      "end_line": 136,
      "comment": "",
      "child_ranges": [
        "(line 135,col 9)-(line 135,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractMapDecorator.toString()",
      "begin_line": 138,
      "end_line": 141,
      "comment": "",
      "child_ranges": [
        "(line 140,col 9)-(line 140,col 38)"
      ]
    }
  ]
}