{
  "filepath": "/tmp/Collections-28b/src/test/java/org/apache/commons/collections4/iterators/AbstractMapIteratorTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractMapIteratorTest",
      "is_interface": false,
      "parent_types": [
        "AbstractIteratorTest\u003cK\u003e"
      ],
      "begin_line": 37,
      "end_line": 334,
      "comment": "\n * Abstract class for testing the MapIterator interface.\n * \u003cp\u003e\n * This class provides a framework for testing an implementation of MapIterator.\n * Concrete subclasses must provide the list iterator to be tested.\n * They must also specify certain details of how the list iterator operates by\n * overriding the supportsXxx() methods if necessary.\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.iterators.AbstractMapIteratorTest.AbstractMapIteratorTest(java.lang.String)",
      "begin_line": 44,
      "end_line": 46,
      "comment": "\n     * JUnit constructor.\n     *\n     * @param testName  the test class name\n     ",
      "child_ranges": [
        "(line 45,col 9)-(line 45,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.AbstractMapIteratorTest.makeEmptyIterator()",
      "begin_line": 54,
      "end_line": 55,
      "comment": "\n     * Implement this method to return a map iterator over an empty map.\n     *\n     * @return an empty iterator\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.AbstractMapIteratorTest.makeObject()",
      "begin_line": 62,
      "end_line": 63,
      "comment": "\n     * Implement this method to return a map iterator over a map with elements.\n     *\n     * @return a full iterator\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.AbstractMapIteratorTest.getMap()",
      "begin_line": 71,
      "end_line": 71,
      "comment": "\n     * Implement this method to return the map which contains the same data as the\n     * iterator.\n     *\n     * @return a full map which can be updated\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.AbstractMapIteratorTest.getConfirmedMap()",
      "begin_line": 79,
      "end_line": 79,
      "comment": "\n     * Implement this method to return the confirmed map which contains the same\n     * data as the iterator.\n     *\n     * @return a full map which can be updated\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.AbstractMapIteratorTest.supportsSetValue()",
      "begin_line": 87,
      "end_line": 89,
      "comment": "\n     * Whether or not we are testing an iterator that supports setValue().\n     * Default is true.\n     *\n     * @return true if Iterator supports set\n     ",
      "child_ranges": [
        "(line 88,col 9)-(line 88,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.AbstractMapIteratorTest.isGetStructuralModify()",
      "begin_line": 97,
      "end_line": 99,
      "comment": "\n     * Whether the get operation on the map structurally modifies the map,\n     * such as with LRUMap. Default is false.\n     *\n     * @return true if the get method structurally modifies the map\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.AbstractMapIteratorTest.addSetValues()",
      "begin_line": 105,
      "end_line": 108,
      "comment": "\n     * The values to be used in the add and set tests.\n     * Default is two strings.\n     ",
      "child_ranges": [
        "(line 107,col 9)-(line 107,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.AbstractMapIteratorTest.testEmptyMapIterator()",
      "begin_line": 114,
      "end_line": 154,
      "comment": "\n     * Test that the empty list iterator contract is correct.\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 117,col 9)",
        "(line 119,col 9)-(line 119,col 57)",
        "(line 120,col 9)-(line 120,col 42)",
        "(line 123,col 9)-(line 126,col 52)",
        "(line 129,col 9)-(line 132,col 51)",
        "(line 135,col 9)-(line 138,col 51)",
        "(line 140,col 9)-(line 153,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.AbstractMapIteratorTest.testFullMapIterator()",
      "begin_line": 160,
      "end_line": 187,
      "comment": "\n     * Test that the full list iterator contract is correct.\n     ",
      "child_ranges": [
        "(line 161,col 9)-(line 163,col 9)",
        "(line 165,col 9)-(line 165,col 50)",
        "(line 166,col 9)-(line 166,col 39)",
        "(line 167,col 9)-(line 167,col 41)",
        "(line 169,col 9)-(line 169,col 41)",
        "(line 170,col 9)-(line 170,col 44)",
        "(line 171,col 9)-(line 186,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.AbstractMapIteratorTest.testMapIteratorSet()",
      "begin_line": 190,
      "end_line": 234,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 191,col 9)-(line 193,col 9)",
        "(line 195,col 9)-(line 195,col 45)",
        "(line 196,col 9)-(line 196,col 95)",
        "(line 197,col 9)-(line 197,col 50)",
        "(line 198,col 9)-(line 198,col 39)",
        "(line 199,col 9)-(line 199,col 54)",
        "(line 200,col 9)-(line 200,col 41)",
        "(line 201,col 9)-(line 201,col 32)",
        "(line 202,col 9)-(line 202,col 38)",
        "(line 204,col 9)-(line 210,col 9)",
        "(line 211,col 9)-(line 211,col 44)",
        "(line 212,col 9)-(line 212,col 37)",
        "(line 213,col 9)-(line 213,col 75)",
        "(line 214,col 9)-(line 214,col 84)",
        "(line 215,col 9)-(line 215,col 65)",
        "(line 216,col 9)-(line 216,col 73)",
        "(line 218,col 9)-(line 219,col 66)",
        "(line 220,col 9)-(line 220,col 86)",
        "(line 221,col 9)-(line 221,col 17)",
        "(line 223,col 9)-(line 223,col 30)",
        "(line 224,col 9)-(line 224,col 37)",
        "(line 225,col 9)-(line 225,col 75)",
        "(line 226,col 9)-(line 226,col 84)",
        "(line 227,col 9)-(line 227,col 17)",
        "(line 229,col 9)-(line 229,col 31)",
        "(line 230,col 9)-(line 230,col 38)",
        "(line 231,col 9)-(line 231,col 75)",
        "(line 232,col 9)-(line 232,col 85)",
        "(line 233,col 9)-(line 233,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.AbstractMapIteratorTest.testRemove()",
      "begin_line": 237,
      "end_line": 264,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 239,col 9)-(line 239,col 50)",
        "(line 240,col 9)-(line 240,col 39)",
        "(line 241,col 9)-(line 241,col 54)",
        "(line 242,col 9)-(line 242,col 41)",
        "(line 243,col 9)-(line 243,col 32)",
        "(line 245,col 9)-(line 252,col 9)",
        "(line 254,col 9)-(line 254,col 20)",
        "(line 255,col 9)-(line 255,col 30)",
        "(line 256,col 9)-(line 256,col 50)",
        "(line 257,col 9)-(line 257,col 17)",
        "(line 259,col 9)-(line 262,col 9)",
        "(line 263,col 9)-(line 263,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.AbstractMapIteratorTest.testMapIteratorSetRemoveSet()",
      "begin_line": 267,
      "end_line": 288,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 268,col 9)-(line 270,col 9)",
        "(line 271,col 9)-(line 271,col 45)",
        "(line 272,col 9)-(line 272,col 50)",
        "(line 273,col 9)-(line 273,col 54)",
        "(line 275,col 9)-(line 275,col 41)",
        "(line 276,col 9)-(line 276,col 32)",
        "(line 278,col 9)-(line 278,col 30)",
        "(line 279,col 9)-(line 279,col 20)",
        "(line 280,col 9)-(line 280,col 30)",
        "(line 281,col 9)-(line 281,col 17)",
        "(line 283,col 9)-(line 286,col 51)",
        "(line 287,col 9)-(line 287,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.AbstractMapIteratorTest.testMapIteratorRemoveGetKey()",
      "begin_line": 291,
      "end_line": 310,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 292,col 9)-(line 294,col 9)",
        "(line 295,col 9)-(line 295,col 50)",
        "(line 296,col 9)-(line 296,col 54)",
        "(line 298,col 9)-(line 298,col 41)",
        "(line 299,col 9)-(line 299,col 32)",
        "(line 301,col 9)-(line 301,col 20)",
        "(line 302,col 9)-(line 302,col 30)",
        "(line 303,col 9)-(line 303,col 17)",
        "(line 305,col 9)-(line 308,col 51)",
        "(line 309,col 9)-(line 309,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.AbstractMapIteratorTest.testMapIteratorRemoveGetValue()",
      "begin_line": 313,
      "end_line": 332,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 314,col 9)-(line 316,col 9)",
        "(line 317,col 9)-(line 317,col 50)",
        "(line 318,col 9)-(line 318,col 54)",
        "(line 320,col 9)-(line 320,col 41)",
        "(line 321,col 9)-(line 321,col 32)",
        "(line 323,col 9)-(line 323,col 20)",
        "(line 324,col 9)-(line 324,col 30)",
        "(line 325,col 9)-(line 325,col 17)",
        "(line 327,col 9)-(line 330,col 51)",
        "(line 331,col 9)-(line 331,col 17)"
      ]
    }
  ]
}