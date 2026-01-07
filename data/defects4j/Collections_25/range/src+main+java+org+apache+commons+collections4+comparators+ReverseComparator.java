{
  "filepath": "/tmp/Collections-25b/src/main/java/org/apache/commons/collections4/comparators/ReverseComparator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ReverseComparator",
      "is_interface": false,
      "parent_types": [
        "java.util.Comparator\u003cE\u003e",
        "java.io.Serializable"
      ],
      "begin_line": 33,
      "end_line": 123,
      "comment": "\n * Reverses the order of another comparator by reversing the arguments\n * to its {@link #compare(Object, Object) compare} method.\n *\n * @since 2.0\n * @version $Id$\n *\n * @see java.util.Collections#reverseOrder()\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": " Serialization version from Collections 2.0. "
    },
    {
      "type": "field",
      "varNames": [
        "comparator"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": " The comparator being decorated. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.comparators.ReverseComparator.ReverseComparator()",
      "begin_line": 50,
      "end_line": 52,
      "comment": "\n     * Creates a comparator that compares objects based on the inverse of their\n     * natural ordering.  Using this Constructor will create a ReverseComparator\n     * that is functionally identical to the Comparator returned by\n     * java.util.Collections.\u003cb\u003ereverseOrder()\u003c/b\u003e.\n     *\n     * @see java.util.Collections#reverseOrder()\n     ",
      "child_ranges": [
        "(line 51,col 9)-(line 51,col 19)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.comparators.ReverseComparator.ReverseComparator(java.util.Comparator\u003c? super E\u003e)",
      "begin_line": 62,
      "end_line": 65,
      "comment": "\n     * Creates a comparator that inverts the comparison\n     * of the given comparator.  If you pass in \u003ccode\u003enull\u003c/code\u003e,\n     * the ReverseComparator defaults to reversing the\n     * natural order, as per {@link java.util.Collections#reverseOrder()}.\n     *\n     * @param comparator Comparator to reverse\n     ",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 95)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.comparators.ReverseComparator.compare(E, E)",
      "begin_line": 75,
      "end_line": 77,
      "comment": "\n     * Compares two objects in reverse order.\n     *\n     * @param obj1  the first object to compare\n     * @param obj2  the second object to compare\n     * @return negative if obj1 is less, positive if greater, zero if equal\n     ",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.comparators.ReverseComparator.hashCode()",
      "begin_line": 87,
      "end_line": 90,
      "comment": "\n     * Implement a hash code for this comparator that is consistent with\n     * {@link #equals(Object) equals}.\n     *\n     * @return a suitable hash code\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.comparators.ReverseComparator.equals(java.lang.Object)",
      "begin_line": 108,
      "end_line": 121,
      "comment": "\n     * Returns \u003ccode\u003etrue\u003c/code\u003e iff \u003ci\u003ethat\u003c/i\u003e Object is\n     * is a {@link Comparator} whose ordering is known to be\n     * equivalent to mine.\n     * \u003cp\u003e\n     * This implementation returns \u003ccode\u003etrue\u003c/code\u003e\n     * iff \u003ccode\u003e\u003ci\u003eobject\u003c/i\u003e.{@link Object#getClass() getClass()}\u003c/code\u003e\n     * equals \u003ccode\u003ethis.getClass()\u003c/code\u003e, and the underlying\n     * comparators are equal.\n     * Subclasses may want to override this behavior to remain consistent\n     * with the {@link Comparator#equals(Object) equals} contract.\n     *\n     * @param object  the object to compare to\n     * @return true if equal\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 110,col 9)-(line 112,col 9)",
        "(line 113,col 9)-(line 115,col 9)",
        "(line 116,col 9)-(line 119,col 9)",
        "(line 120,col 9)-(line 120,col 21)"
      ]
    }
  ]
}