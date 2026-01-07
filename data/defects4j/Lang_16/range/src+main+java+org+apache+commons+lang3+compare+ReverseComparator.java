{
  "filepath": "/tmp/Lang-16b/src/main/java/org/apache/commons/lang3/compare/ReverseComparator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ReverseComparator",
      "is_interface": false,
      "parent_types": [
        "java.util.Comparator\u003cE\u003e",
        "java.io.Serializable"
      ],
      "begin_line": 31,
      "end_line": 122,
      "comment": "\n * Reverses the order of another comparator by reversing the arguments\n * to its {@link #compare(Object, Object) compare} method.\n *\n * @since Commons Collections 2.0\n * @version $Revision$ $Date$\n *\n * @see java.util.Collections#reverseOrder()\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": " Serialization version from Collections 2.0. "
    },
    {
      "type": "field",
      "varNames": [
        "comparator"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": " The comparator being decorated. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.compare.ReverseComparator.ReverseComparator()",
      "begin_line": 48,
      "end_line": 50,
      "comment": "\n     * Creates a comparator that compares objects based on the inverse of their\n     * natural ordering.  Using this Constructor will create a ReverseComparator\n     * that is functionally identical to the Comparator returned by\n     * java.util.Collections.\u003cb\u003ereverseOrder()\u003c/b\u003e.\n     * \n     * @see java.util.Collections#reverseOrder()\n     ",
      "child_ranges": [
        "(line 49,col 9)-(line 49,col 19)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.compare.ReverseComparator.ReverseComparator(java.util.Comparator\u003cE\u003e)",
      "begin_line": 61,
      "end_line": 64,
      "comment": "\n     * Creates a comparator that inverts the comparison\n     * of the given comparator.  If you pass in \u003ccode\u003enull\u003c/code\u003e,\n     * the ReverseComparator defaults to reversing the\n     * natural order, as per \n     * {@link java.util.Collections#reverseOrder()}\u003c/b\u003e.\n     * \n     * @param comparator Comparator to reverse\n     ",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 95)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.compare.ReverseComparator.compare(E, E)",
      "begin_line": 74,
      "end_line": 76,
      "comment": "\n     * Compares two objects in reverse order.\n     * \n     * @param obj1  the first object to compare\n     * @param obj2  the second object to compare\n     * @return negative if obj1 is less, positive if greater, zero if equal\n     ",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.compare.ReverseComparator.hashCode()",
      "begin_line": 86,
      "end_line": 89,
      "comment": "\n     * Implement a hash code for this comparator that is consistent with\n     * {@link #equals(Object) equals}.\n     * \n     * @return a suitable hash code\n     * @since Commons Collections 3.0\n     ",
      "child_ranges": [
        "(line 88,col 9)-(line 88,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.compare.ReverseComparator.equals(java.lang.Object)",
      "begin_line": 107,
      "end_line": 120,
      "comment": "\n     * Returns \u003ccode\u003etrue\u003c/code\u003e iff \u003ci\u003ethat\u003c/i\u003e Object is \n     * is a {@link Comparator} whose ordering is known to be \n     * equivalent to mine.\n     * \u003cp\u003e\n     * This implementation returns \u003ccode\u003etrue\u003c/code\u003e\n     * iff \u003ccode\u003e\u003ci\u003eobject\u003c/i\u003e.{@link Object#getClass() getClass()}\u003c/code\u003e\n     * equals \u003ccode\u003ethis.getClass()\u003c/code\u003e, and the underlying \n     * comparators are equal.\n     * Subclasses may want to override this behavior to remain consistent\n     * with the {@link Comparator#equals(Object) equals} contract.\n     * \n     * @param object  the object to compare to\n     * @return true if equal\n     * @since Commons Collections 3.0\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 111,col 9)",
        "(line 112,col 9)-(line 114,col 9)",
        "(line 115,col 9)-(line 118,col 9)",
        "(line 119,col 9)-(line 119,col 21)"
      ]
    }
  ]
}