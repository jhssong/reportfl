{
  "filepath": "/tmp/Collections-25b/src/test/java/org/apache/commons/collections4/iterators/FilterIteratorTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FilterIteratorTest",
      "is_interface": false,
      "parent_types": [
        "AbstractIteratorTest\u003cE\u003e"
      ],
      "begin_line": 36,
      "end_line": 221,
      "comment": "\n * Test the filter iterator.\n *\n * @version $Id$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.iterators.FilterIteratorTest.FilterIteratorTest(java.lang.String)",
      "begin_line": 39,
      "end_line": 41,
      "comment": " Creates new TestFilterIterator ",
      "child_ranges": [
        "(line 40,col 9)-(line 40,col 20)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "array"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "list"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "iterator"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.FilterIteratorTest.setUp()",
      "begin_line": 50,
      "end_line": 54,
      "comment": "\n     * Set up instance variables required by this test case.\n     ",
      "child_ranges": [
        "(line 52,col 9)-(line 52,col 47)",
        "(line 53,col 9)-(line 53,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.FilterIteratorTest.tearDown()",
      "begin_line": 59,
      "end_line": 62,
      "comment": "\n     * Tear down instance variables required by this test case.\n     ",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.FilterIteratorTest.makeEmptyIterator()",
      "begin_line": 70,
      "end_line": 73,
      "comment": "\n     * Returns an full iterator wrapped in a\n     * FilterIterator that blocks all the elements\n     *\n     * @return \"empty\" FilterIterator\n     ",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.FilterIteratorTest.makeObject()",
      "begin_line": 81,
      "end_line": 86,
      "comment": "\n     * Returns an array with elements wrapped in a pass-through\n     * FilterIterator\n     * \n     * @return a filtered iterator\n     ",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 60)",
        "(line 85,col 9)-(line 85,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.FilterIteratorTest.testRepeatedHasNext()",
      "begin_line": 88,
      "end_line": 92,
      "comment": "",
      "child_ranges": [
        "(line 89,col 9)-(line 91,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.FilterIteratorTest.testRepeatedNext()",
      "begin_line": 94,
      "end_line": 100,
      "comment": "",
      "child_ranges": [
        "(line 96,col 9)-(line 98,col 9)",
        "(line 99,col 9)-(line 99,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.FilterIteratorTest.testReturnValues()",
      "begin_line": 102,
      "end_line": 111,
      "comment": "",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 49)",
        "(line 104,col 9)-(line 104,col 56)",
        "(line 105,col 9)-(line 105,col 56)",
        "(line 106,col 9)-(line 106,col 56)",
        "(line 107,col 9)-(line 107,col 61)",
        "(line 108,col 9)-(line 108,col 61)",
        "(line 109,col 9)-(line 109,col 61)",
        "(line 110,col 9)-(line 110,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.FilterIteratorTest.testSetIterator()",
      "begin_line": 117,
      "end_line": 130,
      "comment": "\n     * Test that when the iterator is changed, the hasNext method returns the\n     * correct response for the new iterator.\n     ",
      "child_ranges": [
        "(line 119,col 9)-(line 119,col 85)",
        "(line 120,col 9)-(line 120,col 72)",
        "(line 122,col 9)-(line 122,col 78)",
        "(line 123,col 9)-(line 123,col 53)",
        "(line 125,col 9)-(line 125,col 53)",
        "(line 128,col 9)-(line 128,col 42)",
        "(line 129,col 9)-(line 129,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.FilterIteratorTest.testSetPredicate()",
      "begin_line": 136,
      "end_line": 147,
      "comment": "\n     * Test that when the predicate is changed, the hasNext method returns the\n     * correct response for the new predicate.\n     ",
      "child_ranges": [
        "(line 137,col 9)-(line 137,col 76)",
        "(line 139,col 9)-(line 139,col 77)",
        "(line 140,col 9)-(line 140,col 53)",
        "(line 142,col 9)-(line 142,col 53)",
        "(line 145,col 9)-(line 145,col 73)",
        "(line 146,col 9)-(line 146,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.FilterIteratorTest.verifyNoMoreElements()",
      "begin_line": 149,
      "end_line": 158,
      "comment": "",
      "child_ranges": [
        "(line 150,col 9)-(line 150,col 40)",
        "(line 151,col 9)-(line 157,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.FilterIteratorTest.verifyElementsInPredicate(java.lang.String[])",
      "begin_line": 160,
      "end_line": 188,
      "comment": "",
      "child_ranges": [
        "(line 161,col 9)-(line 170,col 10)",
        "(line 171,col 9)-(line 171,col 23)",
        "(line 172,col 9)-(line 172,col 36)",
        "(line 173,col 9)-(line 177,col 9)",
        "(line 178,col 9)-(line 178,col 31)",
        "(line 181,col 9)-(line 181,col 23)",
        "(line 182,col 9)-(line 182,col 36)",
        "(line 183,col 9)-(line 187,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.FilterIteratorTest.Anonymous-29473e53-8331-4e22-8991-fe9de8d319c5.evaluate(E)",
      "begin_line": 162,
      "end_line": 169,
      "comment": "",
      "child_ranges": [
        "(line 163,col 17)-(line 167,col 17)",
        "(line 168,col 17)-(line 168,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.FilterIteratorTest.initIterator()",
      "begin_line": 190,
      "end_line": 192,
      "comment": "",
      "child_ranges": [
        "(line 191,col 9)-(line 191,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.FilterIteratorTest.makePassThroughFilter(java.util.Iterator\u003cE\u003e)",
      "begin_line": 201,
      "end_line": 206,
      "comment": "\n     * Returns a FilterIterator that does not filter\n     * any of its elements\n     *\n     * @param i      the Iterator to \"filter\"\n     * @return \"filtered\" iterator\n     ",
      "child_ranges": [
        "(line 202,col 9)-(line 204,col 10)",
        "(line 205,col 9)-(line 205,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.FilterIteratorTest.Anonymous-723004fb-c348-4705-b6f5-ac5ac014f748.evaluate(E)",
      "begin_line": 203,
      "end_line": 203,
      "comment": "",
      "child_ranges": [
        "(line 203,col 54)-(line 203,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.FilterIteratorTest.makeBlockAllFilter(java.util.Iterator\u003cE\u003e)",
      "begin_line": 215,
      "end_line": 220,
      "comment": "\n     * Returns a FilterIterator that blocks\n     * all of its elements\n     *\n     * @param i      the Iterator to \"filter\"\n     * @return \"filtered\" iterator\n     ",
      "child_ranges": [
        "(line 216,col 9)-(line 218,col 10)",
        "(line 219,col 9)-(line 219,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.FilterIteratorTest.Anonymous-2bd62f87-8d1b-46d9-ad17-5ac513083b9c.evaluate(E)",
      "begin_line": 217,
      "end_line": 217,
      "comment": "",
      "child_ranges": [
        "(line 217,col 54)-(line 217,col 66)"
      ]
    }
  ]
}