{
  "filepath": "/tmp/Collections-26b/src/test/java/org/apache/commons/collections4/comparators/ReverseComparatorTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ReverseComparatorTest",
      "is_interface": false,
      "parent_types": [
        "AbstractComparatorTest\u003cInteger\u003e"
      ],
      "begin_line": 35,
      "end_line": 97,
      "comment": "\n * Tests for ReverseComparator.\n *\n * @version $Id$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.comparators.ReverseComparatorTest.ReverseComparatorTest(java.lang.String)",
      "begin_line": 37,
      "end_line": 39,
      "comment": "",
      "child_ranges": [
        "(line 38,col 9)-(line 38,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.comparators.ReverseComparatorTest.makeObject()",
      "begin_line": 51,
      "end_line": 54,
      "comment": "\n     * For the purposes of this test, return a\n     * ReverseComparator that wraps the java.util.Collections.reverseOrder()\n     * Comparator.  The resulting comparator should\n     * sort according to natural Order.  (Note: we wrap\n     * a Comparator taken from the JDK so that we can\n     * save a \"canonical\" form in SVN.\n     *\n     * @return Comparator that returns \"natural\" order\n     ",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.comparators.ReverseComparatorTest.getCompatibilityVersion()",
      "begin_line": 56,
      "end_line": 59,
      "comment": "",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.comparators.ReverseComparatorTest.getComparableObjectsOrdered()",
      "begin_line": 65,
      "end_line": 74,
      "comment": "",
      "child_ranges": [
        "(line 67,col 9)-(line 67,col 61)",
        "(line 68,col 9)-(line 68,col 37)",
        "(line 69,col 9)-(line 69,col 37)",
        "(line 70,col 9)-(line 70,col 37)",
        "(line 71,col 9)-(line 71,col 37)",
        "(line 72,col 9)-(line 72,col 37)",
        "(line 73,col 9)-(line 73,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.comparators.ReverseComparatorTest.testSerializeDeserializeThenCompare()",
      "begin_line": 81,
      "end_line": 95,
      "comment": "\n     * Override this inherited test since Collections.reverseOrder\n     * doesn\u0027t adhere to the \"soft\" Comparator contract, and we\u0027ve\n     * already \"canonized\" the comparator returned by makeComparator.\n     ",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 101)",
        "(line 86,col 9)-(line 86,col 73)",
        "(line 87,col 9)-(line 87,col 70)",
        "(line 88,col 9)-(line 88,col 30)",
        "(line 89,col 9)-(line 89,col 20)",
        "(line 91,col 9)-(line 91,col 107)",
        "(line 92,col 9)-(line 92,col 44)",
        "(line 93,col 9)-(line 93,col 19)",
        "(line 94,col 9)-(line 94,col 69)"
      ]
    }
  ]
}