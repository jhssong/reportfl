{
  "filepath": "/tmp/Lang-16b/src/main/java/org/apache/commons/lang3/compare/ComparableComparator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ComparableComparator",
      "is_interface": false,
      "parent_types": [
        "java.util.Comparator\u003cE\u003e",
        "java.io.Serializable"
      ],
      "begin_line": 43,
      "end_line": 129,
      "comment": "\n * A {@link Comparator Comparator} that compares \n * {@link Comparable Comparable} objects.\n * \u003cp /\u003e\n * This Comparator is useful, for example,\n * for enforcing the natural order in custom implementations\n * of SortedSet and SortedMap.\n * \u003cp /\u003e\n * Note: In the 2.0 and 2.1 releases of Commons Collections, \n * this class would throw a {@link ClassCastException} if\n * either of the arguments to {@link #compare(Object, Object) compare}\n * were \u003ccode\u003enull\u003c/code\u003e, not {@link Comparable Comparable},\n * or for which {@link Comparable#compareTo(Object) compareTo} gave\n * inconsistent results.  This is no longer the case.  See\n * {@link #compare(Object, Object) compare} for details.\n *\n * @since Commons Collections 2.0\n * @version $Revision$ $Date$\n *\n * @see java.util.Collections#reverseOrder()\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " Serialization version. "
    },
    {
      "type": "field",
      "varNames": [
        "INSTANCE"
      ],
      "begin_line": 49,
      "end_line": 50,
      "comment": " The singleton instance. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.compare.ComparableComparator.comparableComparator()",
      "begin_line": 62,
      "end_line": 65,
      "comment": "\n     * Gets the singleton instance of a ComparableComparator.\n     * \u003cp\u003e\n     * Developers are encouraged to use the comparator returned from this method\n     * instead of constructing a new instance to reduce allocation and GC overhead\n     * when multiple comparable comparators may be used in the same VM.\n     * \n     * @return the singleton ComparableComparator\n     ",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 50)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.compare.ComparableComparator.ComparableComparator()",
      "begin_line": 73,
      "end_line": 75,
      "comment": "\n     * Constructor whose use should be avoided.\n     * \u003cp\u003e\n     * Please use the {@link #comparableComparator()} method whenever possible.\n     ",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.compare.ComparableComparator.compare(E, E)",
      "begin_line": 91,
      "end_line": 93,
      "comment": "\n     * Compare the two {@link Comparable Comparable} arguments.\n     * This method is equivalent to:\n     * \u003cpre\u003e((Comparable)obj1).compareTo(obj2)\u003c/pre\u003e\n     * \n     * @param obj1  the first object to compare\n     * @param obj2  the second object to compare\n     * @return negative if obj1 is less, positive if greater, zero if equal\n     * @throws NullPointerException when \u003ci\u003eobj1\u003c/i\u003e is \u003ccode\u003enull\u003c/code\u003e, \n     *         or when \u003ccode\u003e((Comparable)obj1).compareTo(obj2)\u003c/code\u003e does\n     * @throws ClassCastException when \u003ci\u003eobj1\u003c/i\u003e is not a \u003ccode\u003eComparable\u003c/code\u003e,\n     *         or when \u003ccode\u003e((Comparable)obj1).compareTo(obj2)\u003c/code\u003e does\n     ",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.compare.ComparableComparator.hashCode()",
      "begin_line": 103,
      "end_line": 106,
      "comment": "\n     * Implement a hash code for this comparator that is consistent with\n     * {@link #equals(Object) equals}.\n     *\n     * @return a hash code for this comparator.\n     * @since Commons Collections 3.0\n     ",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.compare.ComparableComparator.equals(java.lang.Object)",
      "begin_line": 123,
      "end_line": 127,
      "comment": "\n     * Returns \u003ccode\u003etrue\u003c/code\u003e iff \u003ci\u003ethat\u003c/i\u003e Object is \n     * is a {@link Comparator Comparator} whose ordering is \n     * known to be equivalent to mine.\n     * \u003cp\u003e\n     * This implementation returns \u003ccode\u003etrue\u003c/code\u003e\n     * iff \u003ccode\u003e\u003ci\u003eobject\u003c/i\u003e.{@link Object#getClass() getClass()}\u003c/code\u003e\n     * equals \u003ccode\u003ethis.getClass()\u003c/code\u003e.\n     * Subclasses may want to override this behavior to remain consistent\n     * with the {@link Comparator#equals(Object)} contract.\n     * \n     * @param object  the object to compare with\n     * @return true if equal\n     * @since Commons Collections 3.0\n     ",
      "child_ranges": [
        "(line 125,col 9)-(line 126,col 81)"
      ]
    }
  ]
}