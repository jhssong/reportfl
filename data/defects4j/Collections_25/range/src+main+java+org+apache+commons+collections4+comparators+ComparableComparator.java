{
  "filepath": "/tmp/Collections-25b/src/main/java/org/apache/commons/collections4/comparators/ComparableComparator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ComparableComparator",
      "is_interface": false,
      "parent_types": [
        "java.util.Comparator\u003cE\u003e",
        "java.io.Serializable"
      ],
      "begin_line": 42,
      "end_line": 128,
      "comment": "\n * A {@link Comparator Comparator} that compares {@link Comparable Comparable}\n * objects.\n * \u003cp\u003e\n * This Comparator is useful, for example, for enforcing the natural order in\n * custom implementations of {@link java.util.SortedSet SortedSet} and {@link java.util.SortedMap SortedMap}.\n * \u003cp\u003e\n * Note: In the 2.0 and 2.1 releases of Commons Collections, this class would\n * throw a {@link ClassCastException} if either of the arguments to\n * {@link #compare(Object, Object) compare} were \u003ccode\u003enull\u003c/code\u003e, not\n * {@link Comparable Comparable}, or for which\n * {@link Comparable#compareTo(Object) compareTo} gave inconsistent results.\n * This is no longer the case. See {@link #compare(Object, Object) compare} for\n * details.\n *\n * @since 2.0\n * @version $Id$\n *\n * @see java.util.Collections#reverseOrder()\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " Serialization version. "
    },
    {
      "type": "field",
      "varNames": [
        "INSTANCE"
      ],
      "begin_line": 48,
      "end_line": 49,
      "comment": " The singleton instance. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator()",
      "begin_line": 63,
      "end_line": 66,
      "comment": "\n     * Gets the singleton instance of a ComparableComparator.\n     * \u003cp\u003e\n     * Developers are encouraged to use the comparator returned from this method\n     * instead of constructing a new instance to reduce allocation and GC overhead\n     * when multiple comparable comparators may be used in the same VM.\n     *\n     * @param \u003cE\u003e  the element type\n     * @return the singleton ComparableComparator\n     * @since 4.0\n     ",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 50)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.comparators.ComparableComparator.ComparableComparator()",
      "begin_line": 74,
      "end_line": 76,
      "comment": "\n     * Constructor whose use should be avoided.\n     * \u003cp\u003e\n     * Please use the {@link #comparableComparator()} method whenever possible.\n     ",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.comparators.ComparableComparator.compare(E, E)",
      "begin_line": 92,
      "end_line": 94,
      "comment": "\n     * Compare the two {@link Comparable Comparable} arguments.\n     * This method is equivalent to:\n     * \u003cpre\u003e((Comparable)obj1).compareTo(obj2)\u003c/pre\u003e\n     *\n     * @param obj1  the first object to compare\n     * @param obj2  the second object to compare\n     * @return negative if obj1 is less, positive if greater, zero if equal\n     * @throws NullPointerException if \u003ci\u003eobj1\u003c/i\u003e is \u003ccode\u003enull\u003c/code\u003e,\n     *         or when \u003ccode\u003e((Comparable)obj1).compareTo(obj2)\u003c/code\u003e does\n     * @throws ClassCastException if \u003ci\u003eobj1\u003c/i\u003e is not a \u003ccode\u003eComparable\u003c/code\u003e,\n     *         or when \u003ccode\u003e((Comparable)obj1).compareTo(obj2)\u003c/code\u003e does\n     ",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.comparators.ComparableComparator.hashCode()",
      "begin_line": 104,
      "end_line": 107,
      "comment": "\n     * Implement a hash code for this comparator that is consistent with\n     * {@link #equals(Object) equals}.\n     *\n     * @return a hash code for this comparator.\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.comparators.ComparableComparator.equals(java.lang.Object)",
      "begin_line": 122,
      "end_line": 126,
      "comment": "\n     * Returns {@code true} iff \u003ci\u003ethat\u003c/i\u003e Object is is a {@link Comparator Comparator}\n     * whose ordering is known to be equivalent to mine.\n     * \u003cp\u003e\n     * This implementation returns {@code true} iff\n     * \u003ccode\u003e\u003ci\u003eobject\u003c/i\u003e.{@link Object#getClass() getClass()}\u003c/code\u003e equals\n     * \u003ccode\u003ethis.getClass()\u003c/code\u003e. Subclasses may want to override this behavior to remain\n     * consistent with the {@link Comparator#equals(Object)} contract.\n     *\n     * @param object  the object to compare with\n     * @return {@code true} if equal\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 124,col 9)-(line 125,col 75)"
      ]
    }
  ]
}