{
  "filepath": "/tmp/Collections-25b/src/main/java/org/apache/commons/collections4/multimap/AbstractMultiValuedMapDecorator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractMultiValuedMapDecorator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.MultiValuedMap\u003cK, V\u003e",
        "java.io.Serializable"
      ],
      "begin_line": 42,
      "end_line": 162,
      "comment": "\n * Decorates another \u003ccode\u003eMultiValuedMap\u003c/code\u003e to provide additional behaviour.\n * \u003cp\u003e\n * Each method call made on this \u003ccode\u003eMultiValuedMap\u003c/code\u003e is forwarded to the\n * decorated \u003ccode\u003eMultiValuedMap\u003c/code\u003e. This class is used as a framework to build\n * to extensions such as synchronized and unmodifiable behaviour.\n *\n * @param \u003cK\u003e the type of key elements\n * @param \u003cV\u003e the type of value elements\n *\n * @since 4.1\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " Serialization version "
    },
    {
      "type": "field",
      "varNames": [
        "map"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " MultiValuedMap to decorate "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapDecorator.AbstractMultiValuedMapDecorator(org.apache.commons.collections4.MultiValuedMap\u003cK, V\u003e)",
      "begin_line": 57,
      "end_line": 62,
      "comment": "\n     * Constructor that wraps (not copies).\n     *\n     * @param map the map to decorate, must not be null\n     * @throws NullPointerException if the map is null\n     ",
      "child_ranges": [
        "(line 58,col 9)-(line 60,col 9)",
        "(line 61,col 9)-(line 61,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapDecorator.decorated()",
      "begin_line": 64,
      "end_line": 66,
      "comment": "",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapDecorator.size()",
      "begin_line": 68,
      "end_line": 70,
      "comment": "",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapDecorator.isEmpty()",
      "begin_line": 72,
      "end_line": 74,
      "comment": "",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapDecorator.containsKey(java.lang.Object)",
      "begin_line": 76,
      "end_line": 78,
      "comment": "",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapDecorator.containsValue(java.lang.Object)",
      "begin_line": 80,
      "end_line": 82,
      "comment": "",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapDecorator.containsMapping(java.lang.Object, java.lang.Object)",
      "begin_line": 84,
      "end_line": 86,
      "comment": "",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapDecorator.get(java.lang.Object)",
      "begin_line": 88,
      "end_line": 90,
      "comment": "",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapDecorator.remove(java.lang.Object)",
      "begin_line": 92,
      "end_line": 94,
      "comment": "",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapDecorator.removeMapping(K, V)",
      "begin_line": 96,
      "end_line": 98,
      "comment": "",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapDecorator.clear()",
      "begin_line": 100,
      "end_line": 102,
      "comment": "",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapDecorator.put(K, V)",
      "begin_line": 104,
      "end_line": 106,
      "comment": "",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapDecorator.keySet()",
      "begin_line": 108,
      "end_line": 110,
      "comment": "",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapDecorator.entries()",
      "begin_line": 112,
      "end_line": 114,
      "comment": "",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapDecorator.keys()",
      "begin_line": 116,
      "end_line": 118,
      "comment": "",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapDecorator.values()",
      "begin_line": 120,
      "end_line": 122,
      "comment": "",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapDecorator.asMap()",
      "begin_line": 124,
      "end_line": 126,
      "comment": "",
      "child_ranges": [
        "(line 125,col 9)-(line 125,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapDecorator.putAll(K, java.lang.Iterable\u003c? extends V\u003e)",
      "begin_line": 128,
      "end_line": 130,
      "comment": "",
      "child_ranges": [
        "(line 129,col 9)-(line 129,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapDecorator.putAll(java.util.Map\u003c? extends K, ? extends V\u003e)",
      "begin_line": 132,
      "end_line": 134,
      "comment": "",
      "child_ranges": [
        "(line 133,col 9)-(line 133,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapDecorator.putAll(org.apache.commons.collections4.MultiValuedMap\u003c? extends K, ? extends V\u003e)",
      "begin_line": 136,
      "end_line": 138,
      "comment": "",
      "child_ranges": [
        "(line 137,col 9)-(line 137,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapDecorator.mapIterator()",
      "begin_line": 140,
      "end_line": 142,
      "comment": "",
      "child_ranges": [
        "(line 141,col 9)-(line 141,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapDecorator.equals(java.lang.Object)",
      "begin_line": 144,
      "end_line": 150,
      "comment": "",
      "child_ranges": [
        "(line 146,col 9)-(line 148,col 9)",
        "(line 149,col 9)-(line 149,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapDecorator.hashCode()",
      "begin_line": 152,
      "end_line": 155,
      "comment": "",
      "child_ranges": [
        "(line 154,col 9)-(line 154,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapDecorator.toString()",
      "begin_line": 157,
      "end_line": 160,
      "comment": "",
      "child_ranges": [
        "(line 159,col 9)-(line 159,col 38)"
      ]
    }
  ]
}