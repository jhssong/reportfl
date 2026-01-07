{
  "filepath": "/tmp/Collections-25b/src/test/java/org/apache/commons/collections4/iterators/BoundedIteratorTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BoundedIteratorTest",
      "is_interface": false,
      "parent_types": [
        "AbstractIteratorTest\u003cE\u003e"
      ],
      "begin_line": 30,
      "end_line": 370,
      "comment": "\n * A unit test to test the basic functions of {@link BoundedIterator}.\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "testArray"
      ],
      "begin_line": 33,
      "end_line": 35,
      "comment": " Test array of size 7 "
    },
    {
      "type": "field",
      "varNames": [
        "testList"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.iterators.BoundedIteratorTest.BoundedIteratorTest(java.lang.String)",
      "begin_line": 39,
      "end_line": 41,
      "comment": "",
      "child_ranges": [
        "(line 40,col 9)-(line 40,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.BoundedIteratorTest.setUp()",
      "begin_line": 43,
      "end_line": 49,
      "comment": "",
      "child_ranges": [
        "(line 47,col 9)-(line 47,col 22)",
        "(line 48,col 9)-(line 48,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.BoundedIteratorTest.makeEmptyIterator()",
      "begin_line": 51,
      "end_line": 54,
      "comment": "",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.BoundedIteratorTest.makeObject()",
      "begin_line": 56,
      "end_line": 59,
      "comment": "",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 101)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.BoundedIteratorTest.testBounded()",
      "begin_line": 68,
      "end_line": 87,
      "comment": "\n     * Test a decorated iterator bounded such that the first element returned is\n     * at an index greater its first element, and the last element returned is\n     * at an index less than its last element.\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 77)",
        "(line 72,col 9)-(line 72,col 35)",
        "(line 73,col 9)-(line 73,col 39)",
        "(line 74,col 9)-(line 74,col 35)",
        "(line 75,col 9)-(line 75,col 39)",
        "(line 76,col 9)-(line 76,col 35)",
        "(line 77,col 9)-(line 77,col 39)",
        "(line 78,col 9)-(line 78,col 35)",
        "(line 79,col 9)-(line 79,col 39)",
        "(line 81,col 9)-(line 81,col 36)",
        "(line 82,col 9)-(line 86,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.BoundedIteratorTest.testSameAsDecorated()",
      "begin_line": 94,
      "end_line": 120,
      "comment": "\n     * Test a decorated iterator bounded such that the \u003ccode\u003eoffset\u003c/code\u003e is\n     * zero and the \u003ccode\u003emax\u003c/code\u003e is its size, in that the BoundedIterator\n     * should return all the same elements as its decorated iterator.\n     ",
      "child_ranges": [
        "(line 96,col 9)-(line 97,col 67)",
        "(line 99,col 9)-(line 99,col 35)",
        "(line 100,col 9)-(line 100,col 39)",
        "(line 101,col 9)-(line 101,col 35)",
        "(line 102,col 9)-(line 102,col 39)",
        "(line 103,col 9)-(line 103,col 35)",
        "(line 104,col 9)-(line 104,col 39)",
        "(line 105,col 9)-(line 105,col 35)",
        "(line 106,col 9)-(line 106,col 39)",
        "(line 107,col 9)-(line 107,col 35)",
        "(line 108,col 9)-(line 108,col 39)",
        "(line 109,col 9)-(line 109,col 35)",
        "(line 110,col 9)-(line 110,col 39)",
        "(line 111,col 9)-(line 111,col 35)",
        "(line 112,col 9)-(line 112,col 39)",
        "(line 114,col 9)-(line 114,col 36)",
        "(line 115,col 9)-(line 119,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.BoundedIteratorTest.testEmptyBounded()",
      "begin_line": 127,
      "end_line": 136,
      "comment": "\n     * Test a decorated iterator bounded to a \u003ccode\u003emax\u003c/code\u003e of 0. The\n     * BoundedIterator should behave as if there are no more elements to return,\n     * since it is technically an empty iterator.\n     ",
      "child_ranges": [
        "(line 129,col 9)-(line 129,col 77)",
        "(line 130,col 9)-(line 130,col 36)",
        "(line 131,col 9)-(line 135,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.BoundedIteratorTest.testNegativeOffset()",
      "begin_line": 142,
      "end_line": 149,
      "comment": "\n     * Test the case if a negative \u003ccode\u003eoffset\u003c/code\u003e is passed to the\n     * constructor. {@link IllegalArgumentException} is expected.\n     ",
      "child_ranges": [
        "(line 144,col 9)-(line 148,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.BoundedIteratorTest.testNegativeMax()",
      "begin_line": 155,
      "end_line": 162,
      "comment": "\n     * Test the case if a negative \u003ccode\u003emax\u003c/code\u003e is passed to the\n     * constructor. {@link IllegalArgumentException} is expected.\n     ",
      "child_ranges": [
        "(line 157,col 9)-(line 161,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.BoundedIteratorTest.testOffsetGreaterThanSize()",
      "begin_line": 169,
      "end_line": 178,
      "comment": "\n     * Test the case if the \u003ccode\u003eoffset\u003c/code\u003e passed to the constructor is\n     * greater than the decorated iterator\u0027s size. The BoundedIterator should\n     * behave as if there are no more elements to return.\n     ",
      "child_ranges": [
        "(line 171,col 9)-(line 171,col 78)",
        "(line 172,col 9)-(line 172,col 36)",
        "(line 173,col 9)-(line 177,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.BoundedIteratorTest.testMaxGreaterThanSize()",
      "begin_line": 186,
      "end_line": 209,
      "comment": "\n     * Test the case if the \u003ccode\u003emax\u003c/code\u003e passed to the constructor is\n     * greater than the size of the decorated iterator. The last element\n     * returned should be the same as the last element of the decorated\n     * iterator.\n     ",
      "child_ranges": [
        "(line 188,col 9)-(line 188,col 78)",
        "(line 190,col 9)-(line 190,col 35)",
        "(line 191,col 9)-(line 191,col 39)",
        "(line 192,col 9)-(line 192,col 35)",
        "(line 193,col 9)-(line 193,col 39)",
        "(line 194,col 9)-(line 194,col 35)",
        "(line 195,col 9)-(line 195,col 39)",
        "(line 196,col 9)-(line 196,col 35)",
        "(line 197,col 9)-(line 197,col 39)",
        "(line 198,col 9)-(line 198,col 35)",
        "(line 199,col 9)-(line 199,col 39)",
        "(line 200,col 9)-(line 200,col 35)",
        "(line 201,col 9)-(line 201,col 39)",
        "(line 203,col 9)-(line 203,col 36)",
        "(line 204,col 9)-(line 208,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.BoundedIteratorTest.testRemoveWithoutCallingNext()",
      "begin_line": 215,
      "end_line": 225,
      "comment": "\n     * Test the \u003ccode\u003eremove()\u003c/code\u003e method being called without\n     * \u003ccode\u003enext()\u003c/code\u003e being called first.\n     ",
      "child_ranges": [
        "(line 217,col 9)-(line 217,col 58)",
        "(line 218,col 9)-(line 218,col 81)",
        "(line 220,col 9)-(line 224,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.BoundedIteratorTest.testRemoveCalledTwice()",
      "begin_line": 231,
      "end_line": 245,
      "comment": "\n     * Test the \u003ccode\u003eremove()\u003c/code\u003e method being called twice without calling\n     * \u003ccode\u003enext()\u003c/code\u003e in between.\n     ",
      "child_ranges": [
        "(line 233,col 9)-(line 233,col 58)",
        "(line 234,col 9)-(line 234,col 81)",
        "(line 236,col 9)-(line 236,col 35)",
        "(line 237,col 9)-(line 237,col 39)",
        "(line 238,col 9)-(line 238,col 22)",
        "(line 240,col 9)-(line 244,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.BoundedIteratorTest.testRemoveFirst()",
      "begin_line": 251,
      "end_line": 277,
      "comment": "\n     * Test removing the first element. Verify that the element is removed from\n     * the underlying collection.\n     ",
      "child_ranges": [
        "(line 253,col 9)-(line 253,col 58)",
        "(line 254,col 9)-(line 254,col 81)",
        "(line 256,col 9)-(line 256,col 35)",
        "(line 257,col 9)-(line 257,col 39)",
        "(line 259,col 9)-(line 259,col 22)",
        "(line 260,col 9)-(line 260,col 48)",
        "(line 262,col 9)-(line 262,col 35)",
        "(line 263,col 9)-(line 263,col 39)",
        "(line 264,col 9)-(line 264,col 35)",
        "(line 265,col 9)-(line 265,col 39)",
        "(line 266,col 9)-(line 266,col 35)",
        "(line 267,col 9)-(line 267,col 39)",
        "(line 268,col 9)-(line 268,col 35)",
        "(line 269,col 9)-(line 269,col 39)",
        "(line 271,col 9)-(line 271,col 36)",
        "(line 272,col 9)-(line 276,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.BoundedIteratorTest.testRemoveMiddle()",
      "begin_line": 283,
      "end_line": 309,
      "comment": "\n     * Test removing an element in the middle of the iterator. Verify that the\n     * element is removed from the underlying collection.\n     ",
      "child_ranges": [
        "(line 285,col 9)-(line 285,col 58)",
        "(line 286,col 9)-(line 286,col 81)",
        "(line 288,col 9)-(line 288,col 35)",
        "(line 289,col 9)-(line 289,col 39)",
        "(line 290,col 9)-(line 290,col 35)",
        "(line 291,col 9)-(line 291,col 39)",
        "(line 292,col 9)-(line 292,col 35)",
        "(line 293,col 9)-(line 293,col 39)",
        "(line 295,col 9)-(line 295,col 22)",
        "(line 296,col 9)-(line 296,col 48)",
        "(line 298,col 9)-(line 298,col 35)",
        "(line 299,col 9)-(line 299,col 39)",
        "(line 300,col 9)-(line 300,col 35)",
        "(line 301,col 9)-(line 301,col 39)",
        "(line 303,col 9)-(line 303,col 36)",
        "(line 304,col 9)-(line 308,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.BoundedIteratorTest.testRemoveLast()",
      "begin_line": 315,
      "end_line": 347,
      "comment": "\n     * Test removing the last element. Verify that the element is removed from\n     * the underlying collection.\n     ",
      "child_ranges": [
        "(line 317,col 9)-(line 317,col 58)",
        "(line 318,col 9)-(line 318,col 81)",
        "(line 320,col 9)-(line 320,col 35)",
        "(line 321,col 9)-(line 321,col 39)",
        "(line 322,col 9)-(line 322,col 35)",
        "(line 323,col 9)-(line 323,col 39)",
        "(line 324,col 9)-(line 324,col 35)",
        "(line 325,col 9)-(line 325,col 39)",
        "(line 326,col 9)-(line 326,col 35)",
        "(line 327,col 9)-(line 327,col 39)",
        "(line 328,col 9)-(line 328,col 35)",
        "(line 329,col 9)-(line 329,col 39)",
        "(line 331,col 9)-(line 331,col 36)",
        "(line 332,col 9)-(line 336,col 9)",
        "(line 338,col 9)-(line 338,col 22)",
        "(line 339,col 9)-(line 339,col 48)",
        "(line 341,col 9)-(line 341,col 36)",
        "(line 342,col 9)-(line 346,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.BoundedIteratorTest.testRemoveUnsupported()",
      "begin_line": 353,
      "end_line": 369,
      "comment": "\n     * Test the case if the decorated iterator does not support the\n     * \u003ccode\u003eremove()\u003c/code\u003e method and throws an {@link UnsupportedOperationException}.\n     ",
      "child_ranges": [
        "(line 355,col 9)-(line 359,col 10)",
        "(line 361,col 9)-(line 361,col 70)",
        "(line 362,col 9)-(line 362,col 35)",
        "(line 363,col 9)-(line 363,col 39)",
        "(line 364,col 9)-(line 368,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.BoundedIteratorTest.Anonymous-23672d7a-8b63-42c8-b33a-9e1499f888fb.remove()",
      "begin_line": 356,
      "end_line": 358,
      "comment": "",
      "child_ranges": [
        "(line 357,col 17)-(line 357,col 58)"
      ]
    }
  ]
}