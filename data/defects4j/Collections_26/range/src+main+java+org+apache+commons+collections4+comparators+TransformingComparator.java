{
  "filepath": "/tmp/Collections-26b/src/main/java/org/apache/commons/collections4/comparators/TransformingComparator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TransformingComparator",
      "is_interface": false,
      "parent_types": [
        "java.util.Comparator\u003cI\u003e",
        "java.io.Serializable"
      ],
      "begin_line": 38,
      "end_line": 130,
      "comment": "\n * Decorates another Comparator with transformation behavior. That is, the\n * return value from the transform operation will be passed to the decorated\n * {@link Comparator#compare(Object,Object) compare} method.\n * \u003cp\u003e\n * This class is Serializable from Commons Collections 4.0.\n *\n * @since 2.1\n * @version $Id$\n *\n * @see org.apache.commons.collections4.Transformer\n * @see org.apache.commons.collections4.comparators.ComparableComparator\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " Serialization version from Collections 4.0. "
    },
    {
      "type": "field",
      "varNames": [
        "decorated"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " The decorated comparator. "
    },
    {
      "type": "field",
      "varNames": [
        "transformer"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " The transformer being used. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.comparators.TransformingComparator.TransformingComparator(org.apache.commons.collections4.Transformer\u003c? super I, ? extends O\u003e)",
      "begin_line": 55,
      "end_line": 58,
      "comment": "\n     * Constructs an instance with the given Transformer and a\n     * {@link ComparableComparator ComparableComparator}.\n     *\n     * @param transformer what will transform the arguments to \u003ccode\u003ecompare\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 57,col 9)-(line 57,col 62)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.comparators.TransformingComparator.TransformingComparator(org.apache.commons.collections4.Transformer\u003c? super I, ? extends O\u003e, java.util.Comparator\u003cO\u003e)",
      "begin_line": 66,
      "end_line": 70,
      "comment": "\n     * Constructs an instance with the given Transformer and Comparator.\n     *\n     * @param transformer  what will transform the arguments to \u003ccode\u003ecompare\u003c/code\u003e\n     * @param decorated  the decorated Comparator\n     ",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 35)",
        "(line 69,col 9)-(line 69,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.comparators.TransformingComparator.compare(I, I)",
      "begin_line": 80,
      "end_line": 85,
      "comment": "\n     * Returns the result of comparing the values from the transform operation.\n     *\n     * @param obj1  the first object to transform then compare\n     * @param obj2  the second object to transform then compare\n     * @return negative if obj1 is less, positive if greater, zero if equal\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 58)",
        "(line 83,col 9)-(line 83,col 58)",
        "(line 84,col 9)-(line 84,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.comparators.TransformingComparator.hashCode()",
      "begin_line": 94,
      "end_line": 100,
      "comment": "\n     * Implement a hash code for this comparator that is consistent with\n     * {@link #equals(Object) equals}.\n     *\n     * @return a hash code for this comparator.\n     ",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 23)",
        "(line 97,col 9)-(line 97,col 74)",
        "(line 98,col 9)-(line 98,col 78)",
        "(line 99,col 9)-(line 99,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.comparators.TransformingComparator.equals(java.lang.Object)",
      "begin_line": 114,
      "end_line": 128,
      "comment": "\n     * Returns \u003ccode\u003etrue\u003c/code\u003e iff \u003ci\u003ethat\u003c/i\u003e Object is\n     * is a {@link Comparator} whose ordering is known to be\n     * equivalent to mine.\n     * \u003cp\u003e\n     * This implementation returns \u003ccode\u003etrue\u003c/code\u003e\n     * iff \u003ccode\u003e\u003ci\u003ethat\u003c/i\u003e\u003c/code\u003e is a {@link TransformingComparator}\n     * whose attributes are equal to mine.\n     *\n     * @param object  the object to compare to\n     * @return true if equal\n     ",
      "child_ranges": [
        "(line 116,col 9)-(line 118,col 9)",
        "(line 119,col 9)-(line 121,col 9)",
        "(line 122,col 9)-(line 126,col 9)",
        "(line 127,col 9)-(line 127,col 21)"
      ]
    }
  ]
}