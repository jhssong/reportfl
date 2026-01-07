{
  "filepath": "/tmp/Collections-27b/src/main/java/org/apache/commons/collections4/ComparatorUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ComparatorUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 41,
      "end_line": 239,
      "comment": "\n * Provides convenient static utility methods for \u003cCode\u003eComparator\u003c/Code\u003e\n * objects.\n * \u003cp\u003e\n * Most of the functionality in this class can also be found in the\n * \u003ccode\u003ecomparators\u003c/code\u003e package. This class merely provides a\n * convenient central place if you have use for more than one class\n * in the \u003ccode\u003ecomparators\u003c/code\u003e subpackage.\n *\n * @since 2.1\n * @version $Id$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.ComparatorUtils.ComparatorUtils()",
      "begin_line": 46,
      "end_line": 46,
      "comment": "\n     * ComparatorUtils should not normally be instantiated.\n     ",
      "child_ranges": []
    },
    {
      "type": "field",
      "varNames": [
        "NATURAL_COMPARATOR"
      ],
      "begin_line": 53,
      "end_line": 54,
      "comment": "\n     * Comparator for natural sort order.\n     *\n     * @see ComparableComparator#comparableComparator()\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.ComparatorUtils.naturalComparator()",
      "begin_line": 62,
      "end_line": 65,
      "comment": "\n     * Gets a comparator that uses the natural order of the objects.\n     *\n     * @param \u003cE\u003e  the object type to compare\n     * @return  a comparator which uses natural order\n     ",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.ComparatorUtils.chainedComparator(java.util.Comparator\u003cE\u003e...)",
      "begin_line": 77,
      "end_line": 86,
      "comment": "\n     * Gets a comparator that compares using an array of {@link Comparator}s, applied\n     * in sequence until one returns not equal or the array is exhausted.\n     *\n     * @param \u003cE\u003e  the object type to compare\n     * @param comparators  the comparators to use, not null or empty or containing nulls\n     * @return a {@link ComparatorChain} formed from the input comparators\n     * @throws NullPointerException if comparators array is null or contains a null\n     * @see ComparatorChain\n     ",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 66)",
        "(line 79,col 9)-(line 84,col 9)",
        "(line 85,col 9)-(line 85,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.ComparatorUtils.chainedComparator(java.util.Collection\u003cjava.util.Comparator\u003cE\u003e\u003e)",
      "begin_line": 100,
      "end_line": 105,
      "comment": "\n     * Gets a comparator that compares using a collection of {@link Comparator}s,\n     * applied in (default iterator) sequence until one returns not equal or the\n     * collection is exhausted.\n     *\n     * @param \u003cE\u003e  the object type to compare\n     * @param comparators  the comparators to use, not null or empty or containing nulls\n     * @return a {@link ComparatorChain} formed from the input comparators\n     * @throws NullPointerException if comparators collection is null or contains a null\n     * @throws ClassCastException if the comparators collection contains the wrong object type\n     * @see ComparatorChain\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 104,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.ComparatorUtils.reversedComparator(java.util.Comparator\u003cE\u003e)",
      "begin_line": 115,
      "end_line": 117,
      "comment": "\n     * Gets a comparator that reverses the order of the given comparator.\n     *\n     * @param \u003cE\u003e  the object type to compare\n     * @param comparator  the comparator to reverse\n     * @return  a comparator that reverses the order of the input comparator\n     * @see ReverseComparator\n     ",
      "child_ranges": [
        "(line 116,col 9)-(line 116,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.ComparatorUtils.booleanComparator(boolean)",
      "begin_line": 131,
      "end_line": 133,
      "comment": "\n     * Gets a Comparator that can sort Boolean objects.\n     * \u003cp\u003e\n     * The parameter specifies whether true or false is sorted first.\n     * \u003cp\u003e\n     * The comparator throws NullPointerException if a null value is compared.\n     *\n     * @param trueFirst  when \u003ccode\u003etrue\u003c/code\u003e, sort\n     *        \u003ccode\u003etrue\u003c/code\u003e {@link Boolean}s before\n     *        \u003ccode\u003efalse\u003c/code\u003e {@link Boolean}s.\n     * @return  a comparator that sorts booleans\n     ",
      "child_ranges": [
        "(line 132,col 9)-(line 132,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.ComparatorUtils.nullLowComparator(java.util.Comparator\u003cE\u003e)",
      "begin_line": 147,
      "end_line": 153,
      "comment": "\n     * Gets a Comparator that controls the comparison of \u003ccode\u003enull\u003c/code\u003e values.\n     * \u003cp\u003e\n     * The returned comparator will consider a null value to be less than\n     * any nonnull value, and equal to any other null value.  Two nonnull\n     * values will be evaluated with the given comparator.\n     *\n     * @param \u003cE\u003e  the object type to compare\n     * @param comparator the comparator that wants to allow nulls\n     * @return  a version of that comparator that allows nulls\n     * @see NullComparator\n     ",
      "child_ranges": [
        "(line 149,col 9)-(line 151,col 9)",
        "(line 152,col 9)-(line 152,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.ComparatorUtils.nullHighComparator(java.util.Comparator\u003cE\u003e)",
      "begin_line": 167,
      "end_line": 173,
      "comment": "\n     * Gets a Comparator that controls the comparison of \u003ccode\u003enull\u003c/code\u003e values.\n     * \u003cp\u003e\n     * The returned comparator will consider a null value to be greater than\n     * any nonnull value, and equal to any other null value.  Two nonnull\n     * values will be evaluated with the given comparator.\n     *\n     * @param \u003cE\u003e  the object type to compare\n     * @param comparator the comparator that wants to allow nulls\n     * @return  a version of that comparator that allows nulls\n     * @see NullComparator\n     ",
      "child_ranges": [
        "(line 169,col 9)-(line 171,col 9)",
        "(line 172,col 9)-(line 172,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.ComparatorUtils.transformedComparator(java.util.Comparator\u003cO\u003e, org.apache.commons.collections4.Transformer\u003c? super I, ? extends O\u003e)",
      "begin_line": 189,
      "end_line": 197,
      "comment": "\n     * Gets a Comparator that passes transformed objects to the given comparator.\n     * \u003cp\u003e\n     * Objects passed to the returned comparator will first be transformed\n     * by the given transformer before they are compared by the given\n     * comparator.\n     *\n     * @param \u003cI\u003e  the input object type of the transformed comparator\n     * @param \u003cO\u003e  the object type of the decorated comparator\n     * @param comparator  the sort order to use\n     * @param transformer  the transformer to use\n     * @return  a comparator that transforms its input objects before comparing them\n     * @see  TransformingComparator\n     ",
      "child_ranges": [
        "(line 193,col 9)-(line 195,col 9)",
        "(line 196,col 9)-(line 196,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.ComparatorUtils.min(E, E, java.util.Comparator\u003cE\u003e)",
      "begin_line": 210,
      "end_line": 217,
      "comment": "\n     * Returns the smaller of the given objects according to the given\n     * comparator, returning the second object if the comparator\n     * returns equal.\n     *\n     * @param \u003cE\u003e  the object type to compare\n     * @param o1  the first object to compare\n     * @param o2  the second object to compare\n     * @param comparator  the sort order to use\n     * @return  the smaller of the two objects\n     ",
      "child_ranges": [
        "(line 212,col 9)-(line 214,col 9)",
        "(line 215,col 9)-(line 215,col 49)",
        "(line 216,col 9)-(line 216,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.ComparatorUtils.max(E, E, java.util.Comparator\u003cE\u003e)",
      "begin_line": 230,
      "end_line": 237,
      "comment": "\n     * Returns the larger of the given objects according to the given\n     * comparator, returning the second object if the comparator\n     * returns equal.\n     *\n     * @param \u003cE\u003e  the object type to compare\n     * @param o1  the first object to compare\n     * @param o2  the second object to compare\n     * @param comparator  the sort order to use\n     * @return  the larger of the two objects\n     ",
      "child_ranges": [
        "(line 232,col 9)-(line 234,col 9)",
        "(line 235,col 9)-(line 235,col 49)",
        "(line 236,col 9)-(line 236,col 31)"
      ]
    }
  ]
}