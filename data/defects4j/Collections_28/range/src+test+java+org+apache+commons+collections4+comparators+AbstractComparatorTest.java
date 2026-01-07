{
  "filepath": "/tmp/Collections-28b/src/test/java/org/apache/commons/collections4/comparators/AbstractComparatorTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractComparatorTest",
      "is_interface": false,
      "parent_types": [
        "AbstractObjectTest"
      ],
      "begin_line": 36,
      "end_line": 224,
      "comment": "\n * Abstract test class for testing the Comparator interface.\n * \u003cp\u003e\n * Concrete subclasses declare the comparator to be tested.\n * They also declare certain aspects of the tests.\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.comparators.AbstractComparatorTest.AbstractComparatorTest(java.lang.String)",
      "begin_line": 43,
      "end_line": 45,
      "comment": "\n     * JUnit constructor.\n     *\n     * @param testName  the test class name\n     ",
      "child_ranges": [
        "(line 44,col 9)-(line 44,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.comparators.AbstractComparatorTest.getComparableObjectsOrdered()",
      "begin_line": 54,
      "end_line": 54,
      "comment": "\n     * Implement this method to return a list of sorted objects.\n     *\n     * @return sorted objects\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.comparators.AbstractComparatorTest.makeObject()",
      "begin_line": 62,
      "end_line": 63,
      "comment": "\n     * Implements the abstract superclass method to return the comparator.\n     *\n     * @return a full iterator\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.comparators.AbstractComparatorTest.supportsEmptyCollections()",
      "begin_line": 68,
      "end_line": 71,
      "comment": "\n     * Overrides superclass to block tests.\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.comparators.AbstractComparatorTest.supportsFullCollections()",
      "begin_line": 76,
      "end_line": 79,
      "comment": "\n     * Overrides superclass to block tests.\n     ",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.comparators.AbstractComparatorTest.reverseObjects(java.util.List\u003c?\u003e)",
      "begin_line": 85,
      "end_line": 87,
      "comment": "\n     * Reverse the list.\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.comparators.AbstractComparatorTest.randomizeObjects(java.util.List\u003c?\u003e)",
      "begin_line": 92,
      "end_line": 94,
      "comment": "\n     * Randomize the list.\n     ",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.comparators.AbstractComparatorTest.sortObjects(java.util.List\u003cT\u003e, java.util.Comparator\u003c? super T\u003e)",
      "begin_line": 99,
      "end_line": 101,
      "comment": "\n     * Sort the list.\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.comparators.AbstractComparatorTest.testEmptyListSort()",
      "begin_line": 107,
      "end_line": 115,
      "comment": "\n     * Test sorting an empty list\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 49)",
        "(line 110,col 9)-(line 110,col 40)",
        "(line 112,col 9)-(line 112,col 50)",
        "(line 114,col 9)-(line 114,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.comparators.AbstractComparatorTest.testReverseListSort()",
      "begin_line": 120,
      "end_line": 132,
      "comment": "\n     * Test sorting a reversed list.\n     ",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 54)",
        "(line 124,col 9)-(line 124,col 65)",
        "(line 125,col 9)-(line 125,col 35)",
        "(line 126,col 9)-(line 126,col 44)",
        "(line 128,col 9)-(line 128,col 66)",
        "(line 130,col 9)-(line 131,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.comparators.AbstractComparatorTest.testRandomListSort()",
      "begin_line": 137,
      "end_line": 157,
      "comment": "\n     * Test sorting a random list.\n     ",
      "child_ranges": [
        "(line 139,col 9)-(line 139,col 54)",
        "(line 141,col 9)-(line 141,col 65)",
        "(line 142,col 9)-(line 142,col 37)",
        "(line 143,col 9)-(line 143,col 43)",
        "(line 145,col 9)-(line 145,col 66)",
        "(line 154,col 9)-(line 155,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.comparators.AbstractComparatorTest.testComparatorIsSerializable()",
      "begin_line": 162,
      "end_line": 167,
      "comment": "\n     * Nearly all Comparators should be Serializable.\n     ",
      "child_ranges": [
        "(line 164,col 9)-(line 164,col 54)",
        "(line 165,col 9)-(line 166,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.comparators.AbstractComparatorTest.getCanonicalComparatorName(java.lang.Object)",
      "begin_line": 169,
      "end_line": 179,
      "comment": "",
      "child_ranges": [
        "(line 170,col 9)-(line 170,col 57)",
        "(line 171,col 9)-(line 171,col 38)",
        "(line 172,col 9)-(line 172,col 53)",
        "(line 173,col 9)-(line 173,col 81)",
        "(line 174,col 9)-(line 174,col 31)",
        "(line 175,col 9)-(line 175,col 34)",
        "(line 176,col 9)-(line 176,col 49)",
        "(line 177,col 9)-(line 177,col 30)",
        "(line 178,col 9)-(line 178,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.comparators.AbstractComparatorTest.testComparatorCompatibility()",
      "begin_line": 185,
      "end_line": 222,
      "comment": "\n     * Compare the current serialized form of the Comparator\n     * against the canonical version in SVN.\n     ",
      "child_ranges": [
        "(line 188,col 9)-(line 221,col 9)"
      ]
    }
  ]
}