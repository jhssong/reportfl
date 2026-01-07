{
  "filepath": "/tmp/Collections-27b/src/test/java/org/apache/commons/collections4/bag/AbstractSortedBagTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractSortedBagTest",
      "is_interface": false,
      "parent_types": [
        "AbstractBagTest\u003cT\u003e"
      ],
      "begin_line": 31,
      "end_line": 159,
      "comment": "\n * Abstract test class for\n * {@link org.apache.commons.collections4.SortedBag SortedBag}\n * methods and contracts.\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.bag.AbstractSortedBagTest.AbstractSortedBagTest(java.lang.String)",
      "begin_line": 33,
      "end_line": 35,
      "comment": "",
      "child_ranges": [
        "(line 34,col 9)-(line 34,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.AbstractSortedBagTest.verify()",
      "begin_line": 42,
      "end_line": 67,
      "comment": "\n     * Verification extension, will check the order of elements,\n     * the sets should already be verified equal.\n     ",
      "child_ranges": [
        "(line 44,col 9)-(line 44,col 23)",
        "(line 48,col 9)-(line 48,col 64)",
        "(line 49,col 9)-(line 49,col 63)",
        "(line 50,col 9)-(line 50,col 23)",
        "(line 51,col 9)-(line 51,col 22)",
        "(line 52,col 9)-(line 60,col 9)",
        "(line 61,col 9)-(line 66,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.AbstractSortedBagTest.isNullSupported()",
      "begin_line": 74,
      "end_line": 77,
      "comment": "\n     * Overridden because SortedBags don\u0027t allow null elements (normally).\n     * @return false\n     ",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.AbstractSortedBagTest.makeObject()",
      "begin_line": 82,
      "end_line": 83,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.AbstractSortedBagTest.makeFullCollection()",
      "begin_line": 88,
      "end_line": 91,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.AbstractSortedBagTest.makeConfirmedCollection()",
      "begin_line": 98,
      "end_line": 101,
      "comment": "\n     * Returns an empty {@link TreeBag} for use in modification testing.\n     *\n     * @return a confirmed empty collection\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.AbstractSortedBagTest.resetEmpty()",
      "begin_line": 105,
      "end_line": 109,
      "comment": "",
      "child_ranges": [
        "(line 107,col 9)-(line 107,col 82)",
        "(line 108,col 9)-(line 108,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.AbstractSortedBagTest.resetFull()",
      "begin_line": 111,
      "end_line": 115,
      "comment": "",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 90)",
        "(line 114,col 9)-(line 114,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.AbstractSortedBagTest.getFullNonNullElements()",
      "begin_line": 121,
      "end_line": 130,
      "comment": "\n     * Override to return comparable objects.\n     ",
      "child_ranges": [
        "(line 124,col 9)-(line 124,col 49)",
        "(line 126,col 9)-(line 128,col 9)",
        "(line 129,col 9)-(line 129,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.AbstractSortedBagTest.getOtherNonNullElements()",
      "begin_line": 135,
      "end_line": 143,
      "comment": "\n     * Override to return comparable objects.\n     ",
      "child_ranges": [
        "(line 138,col 9)-(line 138,col 49)",
        "(line 139,col 9)-(line 141,col 9)",
        "(line 142,col 9)-(line 142,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.AbstractSortedBagTest.getCollection()",
      "begin_line": 151,
      "end_line": 154,
      "comment": "\n     * Returns the {@link #collection} field cast to a {@link SortedBag}.\n     *\n     * @return the collection field as a SortedBag\n     ",
      "child_ranges": [
        "(line 153,col 9)-(line 153,col 52)"
      ]
    }
  ]
}