{
  "filepath": "/tmp/Collections-26b/src/test/java/org/apache/commons/collections4/map/AbstractOrderedMapTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractOrderedMapTest",
      "is_interface": false,
      "parent_types": [
        "AbstractIterableMapTest\u003cK,V\u003e"
      ],
      "begin_line": 39,
      "end_line": 253,
      "comment": "\n * Abstract test class for {@link OrderedMap} methods and contracts.\n *\n * @version $Id$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.AbstractOrderedMapTest.AbstractOrderedMapTest(java.lang.String)",
      "begin_line": 46,
      "end_line": 48,
      "comment": "\n     * JUnit constructor.\n     *\n     * @param testName  the test name\n     ",
      "child_ranges": [
        "(line 47,col 9)-(line 47,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractOrderedMapTest.makeObject()",
      "begin_line": 53,
      "end_line": 54,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractOrderedMapTest.makeFullMap()",
      "begin_line": 59,
      "end_line": 62,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractOrderedMapTest.makeConfirmedMap()",
      "begin_line": 70,
      "end_line": 73,
      "comment": "\n     * OrderedMap uses TreeMap as its known comparison.\n     *\n     * @return a map that is known to be valid\n     ",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractOrderedMapTest.getSampleKeys()",
      "begin_line": 79,
      "end_line": 85,
      "comment": "\n     * The only confirmed collection we have that is ordered is the sorted one.\n     * Thus, sort the keys.\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 84)",
        "(line 83,col 9)-(line 83,col 56)",
        "(line 84,col 9)-(line 84,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractOrderedMapTest.testFirstKey()",
      "begin_line": 88,
      "end_line": 100,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 21)",
        "(line 90,col 9)-(line 90,col 44)",
        "(line 91,col 9)-(line 94,col 52)",
        "(line 96,col 9)-(line 96,col 20)",
        "(line 97,col 9)-(line 97,col 27)",
        "(line 98,col 9)-(line 98,col 70)",
        "(line 99,col 9)-(line 99,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractOrderedMapTest.testLastKey()",
      "begin_line": 102,
      "end_line": 117,
      "comment": "",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 21)",
        "(line 104,col 9)-(line 104,col 44)",
        "(line 105,col 9)-(line 108,col 52)",
        "(line 110,col 9)-(line 110,col 20)",
        "(line 111,col 9)-(line 111,col 27)",
        "(line 112,col 9)-(line 112,col 31)",
        "(line 113,col 9)-(line 115,col 9)",
        "(line 116,col 9)-(line 116,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractOrderedMapTest.testNextKey()",
      "begin_line": 120,
      "end_line": 151,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 21)",
        "(line 122,col 9)-(line 122,col 44)",
        "(line 123,col 9)-(line 123,col 63)",
        "(line 124,col 9)-(line 130,col 9)",
        "(line 132,col 9)-(line 132,col 20)",
        "(line 133,col 9)-(line 133,col 27)",
        "(line 134,col 9)-(line 134,col 61)",
        "(line 135,col 9)-(line 135,col 36)",
        "(line 136,col 9)-(line 140,col 9)",
        "(line 141,col 9)-(line 141,col 59)",
        "(line 143,col 9)-(line 150,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractOrderedMapTest.testPreviousKey()",
      "begin_line": 153,
      "end_line": 188,
      "comment": "",
      "child_ranges": [
        "(line 154,col 9)-(line 154,col 21)",
        "(line 155,col 9)-(line 155,col 44)",
        "(line 156,col 9)-(line 156,col 67)",
        "(line 157,col 9)-(line 163,col 9)",
        "(line 165,col 9)-(line 165,col 20)",
        "(line 166,col 9)-(line 166,col 27)",
        "(line 167,col 9)-(line 167,col 66)",
        "(line 168,col 9)-(line 168,col 34)",
        "(line 169,col 9)-(line 169,col 47)",
        "(line 170,col 9)-(line 170,col 36)",
        "(line 171,col 9)-(line 175,col 9)",
        "(line 176,col 9)-(line 176,col 63)",
        "(line 178,col 9)-(line 187,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractOrderedMapTest.bulkTestOrderedMapIterator()",
      "begin_line": 191,
      "end_line": 193,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 192,col 9)-(line 192,col 49)"
      ]
    },
    {
      "type": "class_interface",
      "name": "InnerTestOrderedMapIterator",
      "is_interface": false,
      "parent_types": [
        "AbstractOrderedMapIteratorTest\u003cK,V\u003e"
      ],
      "begin_line": 195,
      "end_line": 244,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.AbstractOrderedMapTest.InnerTestOrderedMapIterator.InnerTestOrderedMapIterator()",
      "begin_line": 196,
      "end_line": 198,
      "comment": "",
      "child_ranges": [
        "(line 197,col 13)-(line 197,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractOrderedMapTest.InnerTestOrderedMapIterator.supportsRemove()",
      "begin_line": 200,
      "end_line": 203,
      "comment": "",
      "child_ranges": [
        "(line 202,col 13)-(line 202,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractOrderedMapTest.InnerTestOrderedMapIterator.isGetStructuralModify()",
      "begin_line": 205,
      "end_line": 208,
      "comment": "",
      "child_ranges": [
        "(line 207,col 13)-(line 207,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractOrderedMapTest.InnerTestOrderedMapIterator.supportsSetValue()",
      "begin_line": 210,
      "end_line": 213,
      "comment": "",
      "child_ranges": [
        "(line 212,col 13)-(line 212,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractOrderedMapTest.InnerTestOrderedMapIterator.makeEmptyIterator()",
      "begin_line": 215,
      "end_line": 219,
      "comment": "",
      "child_ranges": [
        "(line 217,col 13)-(line 217,col 25)",
        "(line 218,col 13)-(line 218,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractOrderedMapTest.InnerTestOrderedMapIterator.makeObject()",
      "begin_line": 221,
      "end_line": 225,
      "comment": "",
      "child_ranges": [
        "(line 223,col 13)-(line 223,col 24)",
        "(line 224,col 13)-(line 224,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractOrderedMapTest.InnerTestOrderedMapIterator.getMap()",
      "begin_line": 227,
      "end_line": 231,
      "comment": "",
      "child_ranges": [
        "(line 230,col 13)-(line 230,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractOrderedMapTest.InnerTestOrderedMapIterator.getConfirmedMap()",
      "begin_line": 233,
      "end_line": 237,
      "comment": "",
      "child_ranges": [
        "(line 236,col 13)-(line 236,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractOrderedMapTest.InnerTestOrderedMapIterator.verify()",
      "begin_line": 239,
      "end_line": 243,
      "comment": "",
      "child_ranges": [
        "(line 241,col 13)-(line 241,col 27)",
        "(line 242,col 13)-(line 242,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractOrderedMapTest.getMap()",
      "begin_line": 249,
      "end_line": 252,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 251,col 9)-(line 251,col 49)"
      ]
    }
  ]
}