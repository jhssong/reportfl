{
  "filepath": "/tmp/Lang-16b/src/main/java/org/apache/commons/lang3/compare/ComparatorUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ComparatorUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 34,
      "end_line": 201,
      "comment": "\n * Provides convenient static utility methods for \u003cCode\u003eComparator\u003c/Code\u003e\n * objects.\n * \u003cp\u003e\n * Most of the functionality in this class can also be found in the \n * \u003ccode\u003ecomparators\u003c/code\u003e package. This class merely provides a \n * convenient central place if you have use for more than one class\n * in the \u003ccode\u003ecomparators\u003c/code\u003e subpackage.\n *\n * @since Commons Collections 2.1\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.compare.ComparatorUtils.ComparatorUtils()",
      "begin_line": 39,
      "end_line": 40,
      "comment": "\n     * ComparatorUtils should not normally be instantiated.\n     ",
      "child_ranges": []
    },
    {
      "type": "field",
      "varNames": [
        "NATURAL_COMPARATOR"
      ],
      "begin_line": 47,
      "end_line": 48,
      "comment": "\n     * Comparator for natural sort order.\n     *\n     * @see ComparableComparator#getInstance\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.compare.ComparatorUtils.naturalComparator()",
      "begin_line": 55,
      "end_line": 58,
      "comment": "\n     * Gets a comparator that uses the natural order of the objects.\n     *\n     * @return  a comparator which uses natural order\n     ",
      "child_ranges": [
        "(line 57,col 9)-(line 57,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.compare.ComparatorUtils.chainedComparator(java.util.Comparator\u003cE\u003e, java.util.Comparator\u003cE\u003e)",
      "begin_line": 71,
      "end_line": 74,
      "comment": "\n     * Gets a comparator that compares using two {@link Comparator}s.\n     * \u003cp\u003e\n     * The second comparator is used if the first comparator returns equal.\n     *\n     * @param comparator1  the first comparator to use, not null\n     * @param comparator2  the first comparator to use, not null\n     * @return a {@link ComparatorChain} formed from the two comparators\n     * @throws NullPointerException if either comparator is null\n     * @see ComparatorChain\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.compare.ComparatorUtils.chainedComparator(java.util.Comparator\u003cE\u003e[])",
      "begin_line": 85,
      "end_line": 94,
      "comment": "\n     * Gets a comparator that compares using an array of {@link Comparator}s, applied\n     * in sequence until one returns not equal or the array is exhausted.\n     *\n     * @param comparators  the comparators to use, not null or empty or containing nulls\n     * @return a {@link ComparatorChain} formed from the input comparators\n     * @throws NullPointerException if comparators array is null or contains a null\n     * @see ComparatorChain\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 60)",
        "(line 87,col 9)-(line 92,col 9)",
        "(line 93,col 9)-(line 93,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.compare.ComparatorUtils.chainedComparator(java.util.Collection\u003cjava.util.Comparator\u003cE\u003e\u003e)",
      "begin_line": 107,
      "end_line": 112,
      "comment": "\n     * Gets a comparator that compares using a collection of {@link Comparator}s,\n     * applied in (default iterator) sequence until one returns not equal or the \n     * collection is exhausted.\n     *\n     * @param comparators  the comparators to use, not null or empty or containing nulls\n     * @return a {@link ComparatorChain} formed from the input comparators\n     * @throws NullPointerException if comparators collection is null or contains a null\n     * @throws ClassCastException if the comparators collection contains the wrong object type\n     * @see ComparatorChain\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 111,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.compare.ComparatorUtils.reversedComparator(java.util.Comparator\u003cE\u003e)",
      "begin_line": 121,
      "end_line": 123,
      "comment": "\n     * Gets a comparator that reverses the order of the given comparator.\n     *\n     * @param comparator  the comparator to reverse\n     * @return  a comparator that reverses the order of the input comparator\n     * @see ReverseComparator\n     ",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.compare.ComparatorUtils.nullLowComparator(java.util.Comparator\u003cE\u003e)",
      "begin_line": 136,
      "end_line": 142,
      "comment": "\n     * Gets a Comparator that controls the comparison of \u003ccode\u003enull\u003c/code\u003e values.\n     * \u003cp\u003e\n     * The returned comparator will consider a null value to be less than\n     * any nonnull value, and equal to any other null value.  Two nonnull\n     * values will be evaluated with the given comparator.\n     *\n     * @param comparator the comparator that wants to allow nulls\n     * @return  a version of that comparator that allows nulls\n     * @see NullComparator\n     ",
      "child_ranges": [
        "(line 138,col 9)-(line 140,col 9)",
        "(line 141,col 9)-(line 141,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.compare.ComparatorUtils.nullHighComparator(java.util.Comparator\u003cE\u003e)",
      "begin_line": 155,
      "end_line": 161,
      "comment": "\n     * Gets a Comparator that controls the comparison of \u003ccode\u003enull\u003c/code\u003e values.\n     * \u003cp\u003e\n     * The returned comparator will consider a null value to be greater than\n     * any nonnull value, and equal to any other null value.  Two nonnull\n     * values will be evaluated with the given comparator.\n     *\n     * @param comparator the comparator that wants to allow nulls\n     * @return  a version of that comparator that allows nulls\n     * @see NullComparator\n     ",
      "child_ranges": [
        "(line 157,col 9)-(line 159,col 9)",
        "(line 160,col 9)-(line 160,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.compare.ComparatorUtils.min(E, E, java.util.Comparator\u003cE\u003e)",
      "begin_line": 173,
      "end_line": 180,
      "comment": "\n     *  Returns the smaller of the given objects according to the given \n     *  comparator, returning the second object if the comparator\n     *  returns equal.\n     * \n     *  @param o1  the first object to compare\n     *  @param o2  the second object to compare\n     *  @param comparator  the sort order to use\n     *  @return  the smaller of the two objects\n     ",
      "child_ranges": [
        "(line 175,col 9)-(line 177,col 9)",
        "(line 178,col 9)-(line 178,col 43)",
        "(line 179,col 9)-(line 179,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.compare.ComparatorUtils.max(E, E, java.util.Comparator\u003cE\u003e)",
      "begin_line": 192,
      "end_line": 199,
      "comment": "\n     *  Returns the larger of the given objects according to the given \n     *  comparator, returning the second object if the comparator \n     *  returns equal.\n     * \n     *  @param o1  the first object to compare\n     *  @param o2  the second object to compare\n     *  @param comparator  the sort order to use\n     *  @return  the larger of the two objects\n     ",
      "child_ranges": [
        "(line 194,col 9)-(line 196,col 9)",
        "(line 197,col 9)-(line 197,col 43)",
        "(line 198,col 9)-(line 198,col 33)"
      ]
    }
  ]
}