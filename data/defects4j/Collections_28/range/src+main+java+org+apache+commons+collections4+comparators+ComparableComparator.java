{
  "filepath": "/tmp/Collections-28b/src/main/java/org/apache/commons/collections4/comparators/ComparableComparator.java",
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
      "end_line": 130,
      "comment": "\n * A {@link Comparator Comparator} that compares {@link Comparable Comparable}\n * objects.\n * \u003cp\u003e\n * This Comparator is useful, for example, for enforcing the natural order in\n * custom implementations of {@link java.util.SortedSet SortedSet} and\n * {@link java.util.SortedMap SortedMap}.\n * \u003cp\u003e\n * Note: In the 2.0 and 2.1 releases of Commons Collections, this class would\n * throw a {@link ClassCastException} if either of the arguments to\n * {@link #compare(Object, Object) compare} were \u003ccode\u003enull\u003c/code\u003e, not\n * {@link Comparable Comparable}, or for which\n * {@link Comparable#compareTo(Object) compareTo} gave inconsistent results.\n * This is no longer the case. See {@link #compare(Object, Object) compare} for\n * details.\n *\n * @since 2.0\n * @version $Id$\n *\n * @see java.util.Collections#reverseOrder()\n "
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
      "signature": "org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator()",
      "begin_line": 64,
      "end_line": 67,
      "comment": "\n     * Gets the singleton instance of a ComparableComparator.\n     * \u003cp\u003e\n     * Developers are encouraged to use the comparator returned from this method\n     * instead of constructing a new instance to reduce allocation and GC overhead\n     * when multiple comparable comparators may be used in the same VM.\n     *\n     * @param \u003cE\u003e  the element type\n     * @return the singleton ComparableComparator\n     * @since 4.0\n     ",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 24)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.comparators.ComparableComparator.ComparableComparator()",
      "begin_line": 75,
      "end_line": 77,
      "comment": "\n     * Constructor whose use should be avoided.\n     * \u003cp\u003e\n     * Please use the {@link #comparableComparator()} method whenever possible.\n     ",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.comparators.ComparableComparator.compare(E, E)",
      "begin_line": 93,
      "end_line": 96,
      "comment": "\n     * Compare the two {@link Comparable Comparable} arguments.\n     * This method is equivalent to:\n     * \u003cpre\u003e((Comparable)obj1).compareTo(obj2)\u003c/pre\u003e\n     *\n     * @param obj1  the first object to compare\n     * @param obj2  the second object to compare\n     * @return negative if obj1 is less, positive if greater, zero if equal\n     * @throws NullPointerException if \u003ci\u003eobj1\u003c/i\u003e is \u003ccode\u003enull\u003c/code\u003e,\n     *         or when \u003ccode\u003e((Comparable)obj1).compareTo(obj2)\u003c/code\u003e does\n     * @throws ClassCastException if \u003ci\u003eobj1\u003c/i\u003e is not a \u003ccode\u003eComparable\u003c/code\u003e,\n     *         or when \u003ccode\u003e((Comparable)obj1).compareTo(obj2)\u003c/code\u003e does\n     ",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.comparators.ComparableComparator.hashCode()",
      "begin_line": 106,
      "end_line": 109,
      "comment": "\n     * Implement a hash code for this comparator that is consistent with\n     * {@link #equals(Object) equals}.\n     *\n     * @return a hash code for this comparator.\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.comparators.ComparableComparator.equals(java.lang.Object)",
      "begin_line": 124,
      "end_line": 128,
      "comment": "\n     * Returns {@code true} iff \u003ci\u003ethat\u003c/i\u003e Object is is a {@link Comparator Comparator}\n     * whose ordering is known to be equivalent to mine.\n     * \u003cp\u003e\n     * This implementation returns {@code true} iff\n     * \u003ccode\u003e\u003ci\u003eobject\u003c/i\u003e.{@link Object#getClass() getClass()}\u003c/code\u003e equals\n     * \u003ccode\u003ethis.getClass()\u003c/code\u003e. Subclasses may want to override this behavior to remain\n     * consistent with the {@link Comparator#equals(Object)} contract.\n     *\n     * @param object  the object to compare with\n     * @return {@code true} if equal\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 126,col 9)-(line 127,col 75)"
      ]
    }
  ]
}