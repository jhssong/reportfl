{
  "filepath": "/tmp/Lang-20b/src/main/java/org/apache/commons/lang3/Range.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Range",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 34,
      "end_line": 467,
      "comment": "\n * \u003cp\u003eAn immutable range of objects from a minimum to maximum point inclusive.\u003c/p\u003e\n * \n * \u003cp\u003eThe objects need to either be implementations of {@code Comparable}\n * or you need to supply a {@code Comparator}. \u003c/p\u003e\n *\n * \u003cp\u003e#ThreadSafe# if the objects and comparator are thread-safe\u003c/p\u003e\n * \n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": "\n     * Serialization version.\n     * @see java.io.Serializable\n     "
    },
    {
      "type": "field",
      "varNames": [
        "comparator"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": "\n     * The ordering scheme used in this range.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "minimum"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": "\n     * The minimum value in this range (inclusive).\n     "
    },
    {
      "type": "field",
      "varNames": [
        "maximum"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": "\n     * The maximum value in this range (inclusive).\n     "
    },
    {
      "type": "field",
      "varNames": [
        "hashCode"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": "\n     * Cached output hashCode (class is immutable).\n     "
    },
    {
      "type": "field",
      "varNames": [
        "toString"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": "\n     * Cached output toString (class is immutable).\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Range.is(T)",
      "begin_line": 76,
      "end_line": 78,
      "comment": "\n     * \u003cp\u003eObtains a range using the specified element as both the minimum\n     * and maximum in this range.\u003c/p\u003e\n     * \n     * \u003cp\u003eThe range uses the natural ordering of the elements to determine where\n     * values lie in the range.\u003c/p\u003e\n     *\n     * @param \u003cT\u003e the type of the elements in this range\n     * @param element  the value to use for this range, not null\n     * @return the range object, not null\n     * @throws IllegalArgumentException if the element is null\n     * @throws ClassCastException if the element is not {@code Comparable}\n     ",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Range.is(T, java.util.Comparator\u003cT\u003e)",
      "begin_line": 94,
      "end_line": 96,
      "comment": "\n     * \u003cp\u003eObtains a range using the specified element as both the minimum\n     * and maximum in this range.\u003c/p\u003e\n     * \n     * \u003cp\u003eThe range uses the specified {@code Comparator} to determine where\n     * values lie in the range.\u003c/p\u003e\n     *\n     * @param \u003cT\u003e the type of the elements in this range\n     * @param element  the value to use for this range, must not be {@code null}\n     * @param comparator  the comparator to be used, null for natural ordering\n     * @return the range object, not null\n     * @throws IllegalArgumentException if the element is null\n     * @throws ClassCastException if using natural ordering and the elements are not {@code Comparable}\n     ",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Range.between(T, T)",
      "begin_line": 114,
      "end_line": 116,
      "comment": "\n     * \u003cp\u003eObtains a range with the specified minimum and maximum values (both inclusive).\u003c/p\u003e\n     * \n     * \u003cp\u003eThe range uses the natural ordering of the elements to determine where\n     * values lie in the range.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe arguments may be passed in the order (min,max) or (max,min).\n     * The getMinimum and getMaximum methods will return the correct values.\u003c/p\u003e\n     *\n     * @param \u003cT\u003e the type of the elements in this range\n     * @param fromInclusive  the first value that defines the edge of the range, inclusive\n     * @param toInclusive  the second value that defines the edge of the range, inclusive\n     * @return the range object, not null\n     * @throws IllegalArgumentException if either element is null\n     * @throws ClassCastException if the elements are not {@code Comparable}\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Range.between(T, T, java.util.Comparator\u003cT\u003e)",
      "begin_line": 135,
      "end_line": 137,
      "comment": "\n     * \u003cp\u003eObtains a range with the specified minimum and maximum values (both inclusive).\u003c/p\u003e\n     * \n     * \u003cp\u003eThe range uses the specified {@code Comparator} to determine where\n     * values lie in the range.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe arguments may be passed in the order (min,max) or (max,min).\n     * The getMinimum and getMaximum methods will return the correct values.\u003c/p\u003e\n     *\n     * @param \u003cT\u003e the type of the elements in this range\n     * @param fromInclusive  the first value that defines the edge of the range, inclusive\n     * @param toInclusive  the second value that defines the edge of the range, inclusive\n     * @param comparator  the comparator to be used, null for natural ordering\n     * @return the range object, not null\n     * @throws IllegalArgumentException if either element is null\n     * @throws ClassCastException if using natural ordering and the elements are not {@code Comparable}\n     ",
      "child_ranges": [
        "(line 136,col 9)-(line 136,col 68)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.Range.Range(T, T, java.util.Comparator\u003cT\u003e)",
      "begin_line": 146,
      "end_line": 163,
      "comment": "\n     * Creates an instance.\n     *\n     * @param element1  the first element, not null\n     * @param element2  the second element, not null\n     * @param comparator  the comparator to be used, null for natural ordering\n     ",
      "child_ranges": [
        "(line 148,col 9)-(line 151,col 9)",
        "(line 152,col 9)-(line 154,col 9)",
        "(line 155,col 9)-(line 161,col 9)",
        "(line 162,col 9)-(line 162,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Range.getMinimum()",
      "begin_line": 173,
      "end_line": 175,
      "comment": "\n     * \u003cp\u003eGets the minimum value in this range.\u003c/p\u003e\n     *\n     * @return the minimum value in this range, not null\n     ",
      "child_ranges": [
        "(line 174,col 9)-(line 174,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Range.getMaximum()",
      "begin_line": 182,
      "end_line": 184,
      "comment": "\n     * \u003cp\u003eGets the maximum value in this range.\u003c/p\u003e\n     *\n     * @return the maximum value in this range, not null\n     ",
      "child_ranges": [
        "(line 183,col 9)-(line 183,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Range.getComparator()",
      "begin_line": 194,
      "end_line": 196,
      "comment": "\n     * \u003cp\u003eGets the comparator being used to determine if objects are within the range.\u003c/p\u003e\n     * \n     * \u003cp\u003eNatural ordering uses an internal comparator implementation, thus this\n     * method never returns null. See {@link #isNaturalOrdering()}.\u003c/p\u003e\n     *\n     * @return the comparator being used, not null\n     ",
      "child_ranges": [
        "(line 195,col 9)-(line 195,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Range.isNaturalOrdering()",
      "begin_line": 206,
      "end_line": 208,
      "comment": "\n     * \u003cp\u003eWhether or not the Range is using the natural ordering of the elements.\u003c/p\u003e\n     * \n     * \u003cp\u003eNatural ordering uses an internal comparator implementation, thus this\n     * method is the only way to check if a null comparator was specified.\u003c/p\u003e\n     *\n     * @return true if using natural ordering\n     ",
      "child_ranges": [
        "(line 207,col 9)-(line 207,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Range.contains(T)",
      "begin_line": 219,
      "end_line": 224,
      "comment": "\n     * \u003cp\u003eChecks whether the specified element occurs within this range.\u003c/p\u003e\n     *\n     * @param element  the element to check for, null returns false\n     * @return true if the specified element occurs within this range\n     ",
      "child_ranges": [
        "(line 220,col 9)-(line 222,col 9)",
        "(line 223,col 9)-(line 223,col 105)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Range.isAfter(T)",
      "begin_line": 232,
      "end_line": 237,
      "comment": "\n     * \u003cp\u003eChecks whether this range is after the specified element.\u003c/p\u003e\n     *\n     * @param element  the element to check for, null returns false\n     * @return true if this range is entirely after the specified element\n     ",
      "child_ranges": [
        "(line 233,col 9)-(line 235,col 9)",
        "(line 236,col 9)-(line 236,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Range.isStartedBy(T)",
      "begin_line": 245,
      "end_line": 250,
      "comment": "\n     * \u003cp\u003eChecks whether this range starts with the specified element.\u003c/p\u003e\n     *\n     * @param element  the element to check for, null returns false\n     * @return true if the specified element occurs within this range\n     ",
      "child_ranges": [
        "(line 246,col 9)-(line 248,col 9)",
        "(line 249,col 9)-(line 249,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Range.isEndedBy(T)",
      "begin_line": 258,
      "end_line": 263,
      "comment": "\n     * \u003cp\u003eChecks whether this range starts with the specified element.\u003c/p\u003e\n     *\n     * @param element  the element to check for, null returns false\n     * @return true if the specified element occurs within this range\n     ",
      "child_ranges": [
        "(line 259,col 9)-(line 261,col 9)",
        "(line 262,col 9)-(line 262,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Range.isBefore(T)",
      "begin_line": 271,
      "end_line": 276,
      "comment": "\n     * \u003cp\u003eChecks whether this range is before the specified element.\u003c/p\u003e\n     *\n     * @param element  the element to check for, null returns false\n     * @return true if this range is entirely before the specified element\n     ",
      "child_ranges": [
        "(line 272,col 9)-(line 274,col 9)",
        "(line 275,col 9)-(line 275,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Range.elementCompareTo(T)",
      "begin_line": 288,
      "end_line": 300,
      "comment": "\n     * \u003cp\u003eChecks where the specified element occurs relative to this range.\u003c/p\u003e\n     * \n     * \u003cp\u003eThe API is reminiscent of the Comparable interface returning {@code -1} if\n     * the element is before the range, {@code 0} if contained within the range and\n     * {@code 1} if the element is after the range. \u003c/p\u003e\n     *\n     * @param element  the element to check for, not null\n     * @return -1, 0 or +1 depending on the element\u0027s location relative to the range\n     ",
      "child_ranges": [
        "(line 289,col 9)-(line 292,col 9)",
        "(line 293,col 9)-(line 299,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Range.containsRange(org.apache.commons.lang3.Range\u003cT\u003e)",
      "begin_line": 314,
      "end_line": 320,
      "comment": "\n     * \u003cp\u003eChecks whether this range contains all the elements of the specified range.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method may fail if the ranges have two different comparators or element types.\u003c/p\u003e\n     *\n     * @param otherRange  the range to check, null returns false\n     * @return true if this range contains the specified range\n     * @throws RuntimeException if ranges cannot be compared\n     ",
      "child_ranges": [
        "(line 315,col 9)-(line 317,col 9)",
        "(line 318,col 9)-(line 319,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Range.isAfterRange(org.apache.commons.lang3.Range\u003cT\u003e)",
      "begin_line": 331,
      "end_line": 336,
      "comment": "\n     * \u003cp\u003eChecks whether this range is completely after the specified range.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method may fail if the ranges have two different comparators or element types.\u003c/p\u003e\n     *\n     * @param otherRange  the range to check, null returns false\n     * @return true if this range is completely after the specified range\n     * @throws RuntimeException if ranges cannot be compared\n     ",
      "child_ranges": [
        "(line 332,col 9)-(line 334,col 9)",
        "(line 335,col 9)-(line 335,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Range.isOverlappedBy(org.apache.commons.lang3.Range\u003cT\u003e)",
      "begin_line": 350,
      "end_line": 357,
      "comment": "\n     * \u003cp\u003eChecks whether this range is overlapped by the specified range.\u003c/p\u003e\n     * \n     * \u003cp\u003eTwo ranges overlap if there is at least one element in common.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method may fail if the ranges have two different comparators or element types.\u003c/p\u003e\n     *\n     * @param otherRange  the range to test, null returns false\n     * @return true if the specified range overlaps with this\n     *  range; otherwise, {@code false}\n     * @throws RuntimeException if ranges cannot be compared\n     ",
      "child_ranges": [
        "(line 351,col 9)-(line 353,col 9)",
        "(line 354,col 9)-(line 356,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Range.isBeforeRange(org.apache.commons.lang3.Range\u003cT\u003e)",
      "begin_line": 368,
      "end_line": 373,
      "comment": "\n     * \u003cp\u003eChecks whether this range is completely before the specified range.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method may fail if the ranges have two different comparators or element types.\u003c/p\u003e\n     *\n     * @param otherRange  the range to check, null returns false\n     * @return true if this range is completely before the specified range\n     * @throws RuntimeException if ranges cannot be compared\n     ",
      "child_ranges": [
        "(line 369,col 9)-(line 371,col 9)",
        "(line 372,col 9)-(line 372,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Range.equals(java.lang.Object)",
      "begin_line": 387,
      "end_line": 399,
      "comment": "\n     * \u003cp\u003eCompares this range to another object to test if they are equal.\u003c/p\u003e.\n     *\n     * \u003cp\u003eTo be equal, the minimum and maximum values must be equal, which\n     * ignores any differences in the comparator.\u003c/p\u003e\n     *\n     * @param obj the reference object with which to compare\n     * @return true if this object is equal\n     ",
      "child_ranges": [
        "(line 389,col 9)-(line 398,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Range.hashCode()",
      "begin_line": 406,
      "end_line": 417,
      "comment": "\n     * \u003cp\u003eGets a suitable hash code for the range.\u003c/p\u003e\n     *\n     * @return a hash code value for this object\n     ",
      "child_ranges": [
        "(line 408,col 9)-(line 408,col 30)",
        "(line 409,col 9)-(line 415,col 9)",
        "(line 416,col 9)-(line 416,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Range.toString()",
      "begin_line": 426,
      "end_line": 440,
      "comment": "\n     * \u003cp\u003eGets the range as a {@code String}.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe format of the String is \u0027[\u003ci\u003emin\u003c/i\u003e..\u003ci\u003emax\u003c/i\u003e]\u0027.\u003c/p\u003e\n     *\n     * @return the {@code String} representation of this range\n     ",
      "child_ranges": [
        "(line 428,col 9)-(line 428,col 33)",
        "(line 429,col 9)-(line 438,col 9)",
        "(line 439,col 9)-(line 439,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Range.toString(java.lang.String)",
      "begin_line": 454,
      "end_line": 456,
      "comment": "\n     * \u003cp\u003eFormats the receiver using the given format.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis uses {@link Formattable} to perform the formatting. Three variables may\n     * be used to embed the minimum, maximum and comparator.\n     * Use {@code %1$s} for the minimum element, {@code %2$s} for the maximum element\n     * and {@code %3$s} for the comparator.\n     * The default format used by {@code toString()} is {@code [%1$s..%2$s]}.\u003c/p\u003e\n     * \n     * @param format  the format string, optionally containing {@code %1$s}, {@code %2$s} and  {@code %3$s}, not null\n     * @return the formatted string, not null\n     ",
      "child_ranges": [
        "(line 455,col 9)-(line 455,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Range.ComparableComparator.compare(java.lang.Object, java.lang.Object)",
      "begin_line": 462,
      "end_line": 464,
      "comment": "",
      "child_ranges": [
        "(line 463,col 13)-(line 463,col 55)"
      ]
    }
  ]
}