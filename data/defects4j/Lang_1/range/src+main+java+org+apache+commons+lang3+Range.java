{
  "filepath": "/tmp/Lang-1b/src/main/java/org/apache/commons/lang3/Range.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Range",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 33,
      "end_line": 495,
      "comment": "\n * \u003cp\u003eAn immutable range of objects from a minimum to maximum point inclusive.\u003c/p\u003e\n * \n * \u003cp\u003eThe objects need to either be implementations of {@code Comparable}\n * or you need to supply a {@code Comparator}. \u003c/p\u003e\n *\n * \u003cp\u003e#ThreadSafe# if the objects and comparator are thread-safe\u003c/p\u003e\n * \n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": "\n     * Serialization version.\n     * @see java.io.Serializable\n     "
    },
    {
      "type": "field",
      "varNames": [
        "comparator"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": "\n     * The ordering scheme used in this range.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "minimum"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": "\n     * The minimum value in this range (inclusive).\n     "
    },
    {
      "type": "field",
      "varNames": [
        "maximum"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": "\n     * The maximum value in this range (inclusive).\n     "
    },
    {
      "type": "field",
      "varNames": [
        "hashCode"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": "\n     * Cached output hashCode (class is immutable).\n     "
    },
    {
      "type": "field",
      "varNames": [
        "toString"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": "\n     * Cached output toString (class is immutable).\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Range.is(T)",
      "begin_line": 75,
      "end_line": 77,
      "comment": "\n     * \u003cp\u003eObtains a range using the specified element as both the minimum\n     * and maximum in this range.\u003c/p\u003e\n     * \n     * \u003cp\u003eThe range uses the natural ordering of the elements to determine where\n     * values lie in the range.\u003c/p\u003e\n     *\n     * @param \u003cT\u003e the type of the elements in this range\n     * @param element  the value to use for this range, not null\n     * @return the range object, not null\n     * @throws IllegalArgumentException if the element is null\n     * @throws ClassCastException if the element is not {@code Comparable}\n     ",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Range.is(T, java.util.Comparator\u003cT\u003e)",
      "begin_line": 93,
      "end_line": 95,
      "comment": "\n     * \u003cp\u003eObtains a range using the specified element as both the minimum\n     * and maximum in this range.\u003c/p\u003e\n     * \n     * \u003cp\u003eThe range uses the specified {@code Comparator} to determine where\n     * values lie in the range.\u003c/p\u003e\n     *\n     * @param \u003cT\u003e the type of the elements in this range\n     * @param element  the value to use for this range, must not be {@code null}\n     * @param comparator  the comparator to be used, null for natural ordering\n     * @return the range object, not null\n     * @throws IllegalArgumentException if the element is null\n     * @throws ClassCastException if using natural ordering and the elements are not {@code Comparable}\n     ",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Range.between(T, T)",
      "begin_line": 113,
      "end_line": 115,
      "comment": "\n     * \u003cp\u003eObtains a range with the specified minimum and maximum values (both inclusive).\u003c/p\u003e\n     * \n     * \u003cp\u003eThe range uses the natural ordering of the elements to determine where\n     * values lie in the range.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe arguments may be passed in the order (min,max) or (max,min).\n     * The getMinimum and getMaximum methods will return the correct values.\u003c/p\u003e\n     *\n     * @param \u003cT\u003e the type of the elements in this range\n     * @param fromInclusive  the first value that defines the edge of the range, inclusive\n     * @param toInclusive  the second value that defines the edge of the range, inclusive\n     * @return the range object, not null\n     * @throws IllegalArgumentException if either element is null\n     * @throws ClassCastException if the elements are not {@code Comparable}\n     ",
      "child_ranges": [
        "(line 114,col 9)-(line 114,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Range.between(T, T, java.util.Comparator\u003cT\u003e)",
      "begin_line": 134,
      "end_line": 136,
      "comment": "\n     * \u003cp\u003eObtains a range with the specified minimum and maximum values (both inclusive).\u003c/p\u003e\n     * \n     * \u003cp\u003eThe range uses the specified {@code Comparator} to determine where\n     * values lie in the range.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe arguments may be passed in the order (min,max) or (max,min).\n     * The getMinimum and getMaximum methods will return the correct values.\u003c/p\u003e\n     *\n     * @param \u003cT\u003e the type of the elements in this range\n     * @param fromInclusive  the first value that defines the edge of the range, inclusive\n     * @param toInclusive  the second value that defines the edge of the range, inclusive\n     * @param comparator  the comparator to be used, null for natural ordering\n     * @return the range object, not null\n     * @throws IllegalArgumentException if either element is null\n     * @throws ClassCastException if using natural ordering and the elements are not {@code Comparable}\n     ",
      "child_ranges": [
        "(line 135,col 9)-(line 135,col 68)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.Range.Range(T, T, java.util.Comparator\u003cT\u003e)",
      "begin_line": 145,
      "end_line": 162,
      "comment": "\n     * Creates an instance.\n     *\n     * @param element1  the first element, not null\n     * @param element2  the second element, not null\n     * @param comparator  the comparator to be used, null for natural ordering\n     ",
      "child_ranges": [
        "(line 147,col 9)-(line 150,col 9)",
        "(line 151,col 9)-(line 153,col 9)",
        "(line 154,col 9)-(line 160,col 9)",
        "(line 161,col 9)-(line 161,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Range.getMinimum()",
      "begin_line": 172,
      "end_line": 174,
      "comment": "\n     * \u003cp\u003eGets the minimum value in this range.\u003c/p\u003e\n     *\n     * @return the minimum value in this range, not null\n     ",
      "child_ranges": [
        "(line 173,col 9)-(line 173,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Range.getMaximum()",
      "begin_line": 181,
      "end_line": 183,
      "comment": "\n     * \u003cp\u003eGets the maximum value in this range.\u003c/p\u003e\n     *\n     * @return the maximum value in this range, not null\n     ",
      "child_ranges": [
        "(line 182,col 9)-(line 182,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Range.getComparator()",
      "begin_line": 193,
      "end_line": 195,
      "comment": "\n     * \u003cp\u003eGets the comparator being used to determine if objects are within the range.\u003c/p\u003e\n     * \n     * \u003cp\u003eNatural ordering uses an internal comparator implementation, thus this\n     * method never returns null. See {@link #isNaturalOrdering()}.\u003c/p\u003e\n     *\n     * @return the comparator being used, not null\n     ",
      "child_ranges": [
        "(line 194,col 9)-(line 194,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Range.isNaturalOrdering()",
      "begin_line": 205,
      "end_line": 207,
      "comment": "\n     * \u003cp\u003eWhether or not the Range is using the natural ordering of the elements.\u003c/p\u003e\n     * \n     * \u003cp\u003eNatural ordering uses an internal comparator implementation, thus this\n     * method is the only way to check if a null comparator was specified.\u003c/p\u003e\n     *\n     * @return true if using natural ordering\n     ",
      "child_ranges": [
        "(line 206,col 9)-(line 206,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Range.contains(T)",
      "begin_line": 218,
      "end_line": 223,
      "comment": "\n     * \u003cp\u003eChecks whether the specified element occurs within this range.\u003c/p\u003e\n     *\n     * @param element  the element to check for, null returns false\n     * @return true if the specified element occurs within this range\n     ",
      "child_ranges": [
        "(line 219,col 9)-(line 221,col 9)",
        "(line 222,col 9)-(line 222,col 101)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Range.isAfter(T)",
      "begin_line": 231,
      "end_line": 236,
      "comment": "\n     * \u003cp\u003eChecks whether this range is after the specified element.\u003c/p\u003e\n     *\n     * @param element  the element to check for, null returns false\n     * @return true if this range is entirely after the specified element\n     ",
      "child_ranges": [
        "(line 232,col 9)-(line 234,col 9)",
        "(line 235,col 9)-(line 235,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Range.isStartedBy(T)",
      "begin_line": 244,
      "end_line": 249,
      "comment": "\n     * \u003cp\u003eChecks whether this range starts with the specified element.\u003c/p\u003e\n     *\n     * @param element  the element to check for, null returns false\n     * @return true if the specified element occurs within this range\n     ",
      "child_ranges": [
        "(line 245,col 9)-(line 247,col 9)",
        "(line 248,col 9)-(line 248,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Range.isEndedBy(T)",
      "begin_line": 257,
      "end_line": 262,
      "comment": "\n     * \u003cp\u003eChecks whether this range starts with the specified element.\u003c/p\u003e\n     *\n     * @param element  the element to check for, null returns false\n     * @return true if the specified element occurs within this range\n     ",
      "child_ranges": [
        "(line 258,col 9)-(line 260,col 9)",
        "(line 261,col 9)-(line 261,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Range.isBefore(T)",
      "begin_line": 270,
      "end_line": 275,
      "comment": "\n     * \u003cp\u003eChecks whether this range is before the specified element.\u003c/p\u003e\n     *\n     * @param element  the element to check for, null returns false\n     * @return true if this range is entirely before the specified element\n     ",
      "child_ranges": [
        "(line 271,col 9)-(line 273,col 9)",
        "(line 274,col 9)-(line 274,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Range.elementCompareTo(T)",
      "begin_line": 287,
      "end_line": 299,
      "comment": "\n     * \u003cp\u003eChecks where the specified element occurs relative to this range.\u003c/p\u003e\n     * \n     * \u003cp\u003eThe API is reminiscent of the Comparable interface returning {@code -1} if\n     * the element is before the range, {@code 0} if contained within the range and\n     * {@code 1} if the element is after the range. \u003c/p\u003e\n     *\n     * @param element  the element to check for, not null\n     * @return -1, 0 or +1 depending on the element\u0027s location relative to the range\n     ",
      "child_ranges": [
        "(line 288,col 9)-(line 291,col 9)",
        "(line 292,col 9)-(line 298,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Range.containsRange(org.apache.commons.lang3.Range\u003cT\u003e)",
      "begin_line": 313,
      "end_line": 319,
      "comment": "\n     * \u003cp\u003eChecks whether this range contains all the elements of the specified range.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method may fail if the ranges have two different comparators or element types.\u003c/p\u003e\n     *\n     * @param otherRange  the range to check, null returns false\n     * @return true if this range contains the specified range\n     * @throws RuntimeException if ranges cannot be compared\n     ",
      "child_ranges": [
        "(line 314,col 9)-(line 316,col 9)",
        "(line 317,col 9)-(line 318,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Range.isAfterRange(org.apache.commons.lang3.Range\u003cT\u003e)",
      "begin_line": 330,
      "end_line": 335,
      "comment": "\n     * \u003cp\u003eChecks whether this range is completely after the specified range.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method may fail if the ranges have two different comparators or element types.\u003c/p\u003e\n     *\n     * @param otherRange  the range to check, null returns false\n     * @return true if this range is completely after the specified range\n     * @throws RuntimeException if ranges cannot be compared\n     ",
      "child_ranges": [
        "(line 331,col 9)-(line 333,col 9)",
        "(line 334,col 9)-(line 334,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Range.isOverlappedBy(org.apache.commons.lang3.Range\u003cT\u003e)",
      "begin_line": 349,
      "end_line": 356,
      "comment": "\n     * \u003cp\u003eChecks whether this range is overlapped by the specified range.\u003c/p\u003e\n     * \n     * \u003cp\u003eTwo ranges overlap if there is at least one element in common.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method may fail if the ranges have two different comparators or element types.\u003c/p\u003e\n     *\n     * @param otherRange  the range to test, null returns false\n     * @return true if the specified range overlaps with this\n     *  range; otherwise, {@code false}\n     * @throws RuntimeException if ranges cannot be compared\n     ",
      "child_ranges": [
        "(line 350,col 9)-(line 352,col 9)",
        "(line 353,col 9)-(line 355,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Range.isBeforeRange(org.apache.commons.lang3.Range\u003cT\u003e)",
      "begin_line": 367,
      "end_line": 372,
      "comment": "\n     * \u003cp\u003eChecks whether this range is completely before the specified range.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method may fail if the ranges have two different comparators or element types.\u003c/p\u003e\n     *\n     * @param otherRange  the range to check, null returns false\n     * @return true if this range is completely before the specified range\n     * @throws RuntimeException if ranges cannot be compared\n     ",
      "child_ranges": [
        "(line 368,col 9)-(line 370,col 9)",
        "(line 371,col 9)-(line 371,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Range.intersectionWith(org.apache.commons.lang3.Range\u003cT\u003e)",
      "begin_line": 381,
      "end_line": 392,
      "comment": "\n     * Calculate the intersection of {@code this} and an overlapping Range.\n     * @param other overlapping Range\n     * @return range representing the intersection of {@code this} and {@code other} ({@code this} if equal)\n     * @throws IllegalArgumentException if {@code other} does not overlap {@code this}\n     * @since 3.0.1\n     ",
      "child_ranges": [
        "(line 382,col 9)-(line 385,col 9)",
        "(line 386,col 9)-(line 388,col 9)",
        "(line 389,col 9)-(line 389,col 100)",
        "(line 390,col 9)-(line 390,col 100)",
        "(line 391,col 9)-(line 391,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Range.equals(java.lang.Object)",
      "begin_line": 406,
      "end_line": 419,
      "comment": "\n     * \u003cp\u003eCompares this range to another object to test if they are equal.\u003c/p\u003e.\n     *\n     * \u003cp\u003eTo be equal, the minimum and maximum values must be equal, which\n     * ignores any differences in the comparator.\u003c/p\u003e\n     *\n     * @param obj the reference object with which to compare\n     * @return true if this object is equal\n     ",
      "child_ranges": [
        "(line 408,col 9)-(line 418,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Range.hashCode()",
      "begin_line": 426,
      "end_line": 437,
      "comment": "\n     * \u003cp\u003eGets a suitable hash code for the range.\u003c/p\u003e\n     *\n     * @return a hash code value for this object\n     ",
      "child_ranges": [
        "(line 428,col 9)-(line 428,col 30)",
        "(line 429,col 9)-(line 435,col 9)",
        "(line 436,col 9)-(line 436,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Range.toString()",
      "begin_line": 446,
      "end_line": 460,
      "comment": "\n     * \u003cp\u003eGets the range as a {@code String}.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe format of the String is \u0027[\u003ci\u003emin\u003c/i\u003e..\u003ci\u003emax\u003c/i\u003e]\u0027.\u003c/p\u003e\n     *\n     * @return the {@code String} representation of this range\n     ",
      "child_ranges": [
        "(line 448,col 9)-(line 448,col 33)",
        "(line 449,col 9)-(line 458,col 9)",
        "(line 459,col 9)-(line 459,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Range.toString(java.lang.String)",
      "begin_line": 474,
      "end_line": 476,
      "comment": "\n     * \u003cp\u003eFormats the receiver using the given format.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis uses {@link java.util.Formattable} to perform the formatting. Three variables may\n     * be used to embed the minimum, maximum and comparator.\n     * Use {@code %1$s} for the minimum element, {@code %2$s} for the maximum element\n     * and {@code %3$s} for the comparator.\n     * The default format used by {@code toString()} is {@code [%1$s..%2$s]}.\u003c/p\u003e\n     * \n     * @param format  the format string, optionally containing {@code %1$s}, {@code %2$s} and  {@code %3$s}, not null\n     * @return the formatted string, not null\n     ",
      "child_ranges": [
        "(line 475,col 9)-(line 475,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Range.ComparableComparator.compare(java.lang.Object, java.lang.Object)",
      "begin_line": 489,
      "end_line": 492,
      "comment": "\n         * Comparable based compare implementation. \n         *\n         * @param obj1 left hand side of comparison\n         * @param obj2 right hand side of comparison\n         * @return negative, 0, positive comparison value\n         ",
      "child_ranges": [
        "(line 491,col 13)-(line 491,col 55)"
      ]
    }
  ]
}