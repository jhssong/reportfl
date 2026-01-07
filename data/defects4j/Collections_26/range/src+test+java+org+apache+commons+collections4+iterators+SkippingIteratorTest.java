{
  "filepath": "/tmp/Collections-26b/src/test/java/org/apache/commons/collections4/iterators/SkippingIteratorTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SkippingIteratorTest",
      "is_interface": false,
      "parent_types": [
        "AbstractIteratorTest\u003cE\u003e"
      ],
      "begin_line": 30,
      "end_line": 300,
      "comment": "\n * A unit test to test the basic functions of {@link SkippingIterator}.\n *\n * @version $Id$\n "
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
      "signature": "org.apache.commons.collections4.iterators.SkippingIteratorTest.SkippingIteratorTest(java.lang.String)",
      "begin_line": 39,
      "end_line": 41,
      "comment": "",
      "child_ranges": [
        "(line 40,col 9)-(line 40,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.SkippingIteratorTest.setUp()",
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
      "signature": "org.apache.commons.collections4.iterators.SkippingIteratorTest.makeEmptyIterator()",
      "begin_line": 51,
      "end_line": 54,
      "comment": "",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.SkippingIteratorTest.makeObject()",
      "begin_line": 56,
      "end_line": 59,
      "comment": "",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.SkippingIteratorTest.testSkipping()",
      "begin_line": 68,
      "end_line": 89,
      "comment": "\n     * Test a decorated iterator bounded such that the first element returned is\n     * at an index greater its first element, and the last element returned is\n     * at an index less than its last element.\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 75)",
        "(line 72,col 9)-(line 72,col 35)",
        "(line 73,col 9)-(line 73,col 39)",
        "(line 74,col 9)-(line 74,col 35)",
        "(line 75,col 9)-(line 75,col 39)",
        "(line 76,col 9)-(line 76,col 35)",
        "(line 77,col 9)-(line 77,col 39)",
        "(line 78,col 9)-(line 78,col 35)",
        "(line 79,col 9)-(line 79,col 39)",
        "(line 80,col 9)-(line 80,col 35)",
        "(line 81,col 9)-(line 81,col 39)",
        "(line 83,col 9)-(line 83,col 36)",
        "(line 84,col 9)-(line 88,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.SkippingIteratorTest.testSameAsDecorated()",
      "begin_line": 96,
      "end_line": 121,
      "comment": "\n     * Test a decorated iterator bounded such that the \u003ccode\u003eoffset\u003c/code\u003e is\n     * zero, in that the SkippingIterator should return all the same elements\n     * as its decorated iterator.\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 75)",
        "(line 100,col 9)-(line 100,col 35)",
        "(line 101,col 9)-(line 101,col 39)",
        "(line 102,col 9)-(line 102,col 35)",
        "(line 103,col 9)-(line 103,col 39)",
        "(line 104,col 9)-(line 104,col 35)",
        "(line 105,col 9)-(line 105,col 39)",
        "(line 106,col 9)-(line 106,col 35)",
        "(line 107,col 9)-(line 107,col 39)",
        "(line 108,col 9)-(line 108,col 35)",
        "(line 109,col 9)-(line 109,col 39)",
        "(line 110,col 9)-(line 110,col 35)",
        "(line 111,col 9)-(line 111,col 39)",
        "(line 112,col 9)-(line 112,col 35)",
        "(line 113,col 9)-(line 113,col 39)",
        "(line 115,col 9)-(line 115,col 36)",
        "(line 116,col 9)-(line 120,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.SkippingIteratorTest.testOffsetGreaterThanSize()",
      "begin_line": 128,
      "end_line": 137,
      "comment": "\n     * Test the case if the \u003ccode\u003eoffset\u003c/code\u003e passed to the constructor is\n     * greater than the decorated iterator\u0027s size. The SkippingIterator should\n     * behave as if there are no more elements to return.\n     ",
      "child_ranges": [
        "(line 130,col 9)-(line 130,col 76)",
        "(line 131,col 9)-(line 131,col 36)",
        "(line 132,col 9)-(line 136,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.SkippingIteratorTest.testNegativeOffset()",
      "begin_line": 143,
      "end_line": 150,
      "comment": "\n     * Test the case if a negative \u003ccode\u003eoffset\u003c/code\u003e is passed to the\n     * constructor. {@link IllegalArgumentException} is expected.\n     ",
      "child_ranges": [
        "(line 145,col 9)-(line 149,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.SkippingIteratorTest.testRemoveWithoutCallingNext()",
      "begin_line": 156,
      "end_line": 166,
      "comment": "\n     * Test the \u003ccode\u003eremove()\u003c/code\u003e method being called without\n     * \u003ccode\u003enext()\u003c/code\u003e being called first.\n     ",
      "child_ranges": [
        "(line 158,col 9)-(line 158,col 58)",
        "(line 159,col 9)-(line 159,col 79)",
        "(line 161,col 9)-(line 165,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.SkippingIteratorTest.testRemoveCalledTwice()",
      "begin_line": 172,
      "end_line": 186,
      "comment": "\n     * Test the \u003ccode\u003eremove()\u003c/code\u003e method being called twice without calling\n     * \u003ccode\u003enext()\u003c/code\u003e in between.\n     ",
      "child_ranges": [
        "(line 174,col 9)-(line 174,col 58)",
        "(line 175,col 9)-(line 175,col 79)",
        "(line 177,col 9)-(line 177,col 35)",
        "(line 178,col 9)-(line 178,col 39)",
        "(line 179,col 9)-(line 179,col 22)",
        "(line 181,col 9)-(line 185,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.SkippingIteratorTest.testRemoveFirst()",
      "begin_line": 192,
      "end_line": 214,
      "comment": "\n     * Test removing the first element. Verify that the element is removed from\n     * the underlying collection.\n     ",
      "child_ranges": [
        "(line 194,col 9)-(line 194,col 58)",
        "(line 195,col 9)-(line 195,col 79)",
        "(line 197,col 9)-(line 197,col 35)",
        "(line 198,col 9)-(line 198,col 39)",
        "(line 200,col 9)-(line 200,col 22)",
        "(line 201,col 9)-(line 201,col 48)",
        "(line 203,col 9)-(line 203,col 35)",
        "(line 204,col 9)-(line 204,col 39)",
        "(line 205,col 9)-(line 205,col 35)",
        "(line 206,col 9)-(line 206,col 39)",
        "(line 208,col 9)-(line 208,col 36)",
        "(line 209,col 9)-(line 213,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.SkippingIteratorTest.testRemoveMiddle()",
      "begin_line": 220,
      "end_line": 244,
      "comment": "\n     * Test removing an element in the middle of the iterator. Verify that the\n     * element is removed from the underlying collection.\n     ",
      "child_ranges": [
        "(line 222,col 9)-(line 222,col 58)",
        "(line 223,col 9)-(line 223,col 79)",
        "(line 225,col 9)-(line 225,col 35)",
        "(line 226,col 9)-(line 226,col 39)",
        "(line 228,col 9)-(line 228,col 22)",
        "(line 229,col 9)-(line 229,col 48)",
        "(line 231,col 9)-(line 231,col 35)",
        "(line 232,col 9)-(line 232,col 39)",
        "(line 233,col 9)-(line 233,col 35)",
        "(line 234,col 9)-(line 234,col 39)",
        "(line 235,col 9)-(line 235,col 35)",
        "(line 236,col 9)-(line 236,col 39)",
        "(line 238,col 9)-(line 238,col 36)",
        "(line 239,col 9)-(line 243,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.SkippingIteratorTest.testRemoveLast()",
      "begin_line": 250,
      "end_line": 276,
      "comment": "\n     * Test removing the last element. Verify that the element is removed from\n     * the underlying collection.\n     ",
      "child_ranges": [
        "(line 252,col 9)-(line 252,col 58)",
        "(line 253,col 9)-(line 253,col 79)",
        "(line 255,col 9)-(line 255,col 35)",
        "(line 256,col 9)-(line 256,col 39)",
        "(line 257,col 9)-(line 257,col 35)",
        "(line 258,col 9)-(line 258,col 39)",
        "(line 260,col 9)-(line 260,col 36)",
        "(line 261,col 9)-(line 265,col 9)",
        "(line 267,col 9)-(line 267,col 22)",
        "(line 268,col 9)-(line 268,col 48)",
        "(line 270,col 9)-(line 270,col 36)",
        "(line 271,col 9)-(line 275,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.SkippingIteratorTest.testRemoveUnsupported()",
      "begin_line": 282,
      "end_line": 299,
      "comment": "\n     * Test the case if the decorated iterator does not support the\n     * \u003ccode\u003eremove()\u003c/code\u003e method and throws an {@link UnsupportedOperationException}.\n     ",
      "child_ranges": [
        "(line 284,col 9)-(line 289,col 10)",
        "(line 291,col 9)-(line 291,col 68)",
        "(line 292,col 9)-(line 292,col 35)",
        "(line 293,col 9)-(line 293,col 39)",
        "(line 294,col 9)-(line 298,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.SkippingIteratorTest.Anonymous-7bea883d-8a94-4bd7-b3bd-17d7bd0b5a8f.remove()",
      "begin_line": 285,
      "end_line": 288,
      "comment": "",
      "child_ranges": [
        "(line 287,col 17)-(line 287,col 58)"
      ]
    }
  ]
}