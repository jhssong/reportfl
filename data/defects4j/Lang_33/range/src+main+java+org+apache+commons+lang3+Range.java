{
  "filepath": "/tmp/Lang-33b/src/main/java/org/apache/commons/lang3/Range.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Range",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 29,
      "end_line": 405,
      "comment": "\n * \u003cp\u003e\u003ccode\u003eRange\u003c/code\u003e represents an immutable range of numbers of the same type.\u003c/p\u003e\n * \n * @author Apache Software Foundation\n * @since 3.0\n * @version $Id: Range.java 830032 2009-10-27 00:15:00Z scolebourne $\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": "\n     * Required for serialization support.\n     * \n     * @see java.io.Serializable\n     "
    },
    {
      "type": "field",
      "varNames": [
        "comparator"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": "\n     * The ordering scheme used in this range.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "minimum"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": "\n     * The minimum value in this range (inclusive).\n     "
    },
    {
      "type": "field",
      "varNames": [
        "maximum"
      ],
      "begin_line": 51,
      "end_line": 51,
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
      "begin_line": 61,
      "end_line": 61,
      "comment": "\n     * Cached output toString (class is immutable).\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Range.is(T)",
      "begin_line": 74,
      "end_line": 76,
      "comment": "\n     * \u003cp\u003eConstructs a new \u003ccode\u003eRange\u003c/code\u003e using the specified\n     * element as both the minimum and maximum in this range.\u003c/p\u003e\n     * \u003cp\u003eThe range uses the natural ordering of the elements to \n     * determine where values lie in the range.\u003c/p\u003e\n     *\n     * @param element  the value to use for this range, must not be \u003ccode\u003enull\u003c/code\u003e\n     * @return the new range object\n     * @throws IllegalArgumentException if the value is \u003ccode\u003enull\u003c/code\u003e\n     * @throws ClassCastException if the value is not Comparable\n     ",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Range.between(T, T)",
      "begin_line": 93,
      "end_line": 95,
      "comment": "\n     * \u003cp\u003eConstructs a new \u003ccode\u003eRange\u003c/code\u003e with the specified\n     * minimum and maximum values (both inclusive).\u003c/p\u003e\n     * \u003cp\u003eThe range uses the natural ordering of the elements to \n     * determine where values lie in the range.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe arguments may be passed in the order (min,max) or (max,min). The\n     * getMinimum and getMaximum methods will return the correct values.\u003c/p\u003e\n     *\n     * @param element1  first value that defines the edge of the range, inclusive\n     * @param element2  second value that defines the edge of the range, inclusive\n     * @return the new range object\n     * @throws IllegalArgumentException if either value is \u003ccode\u003enull\u003c/code\u003e\n     * @throws ClassCastException if either value is not Comparable\n     ",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 88)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Range.is(T, java.util.Comparator\u003cT\u003e)",
      "begin_line": 108,
      "end_line": 110,
      "comment": "\n     * \u003cp\u003eConstructs a new \u003ccode\u003eRange\u003c/code\u003e using the specified\n     * element as both the minimum and maximum in this range.\u003c/p\u003e\n     * \u003cp\u003eThe range uses the passed in \u003ccode\u003eComparator\u003c/code\u003e to \n     * determine where values lie in the range.\u003c/p\u003e\n     *\n     * @param element  the value to use for this range, must not be \u003ccode\u003enull\u003c/code\u003e\n     * @param c comparator to be used\n     * @return the new range object\n     * @throws IllegalArgumentException if the value is \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Range.between(T, T, java.util.Comparator\u003cT\u003e)",
      "begin_line": 127,
      "end_line": 129,
      "comment": "\n     * \u003cp\u003eConstructs a new \u003ccode\u003eRange\u003c/code\u003e with the specified\n     * minimum and maximum values (both inclusive).\u003c/p\u003e\n     * \u003cp\u003eThe range uses the passed in \u003ccode\u003eComparator\u003c/code\u003e to \n     * determine where values lie in the range.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe arguments may be passed in the order (min,max) or (max,min). The\n     * getMinimum and getMaximum methods will return the correct values.\u003c/p\u003e\n     *\n     * @param element1  first value that defines the edge of the range, inclusive\n     * @param element2  second value that defines the edge of the range, inclusive\n     * @param c comparator to be used\n     * @return the new range object\n     * @throws IllegalArgumentException if either value is \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 128,col 9)-(line 128,col 51)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.Range.Range(T, T, java.util.Comparator\u003cT\u003e)",
      "begin_line": 131,
      "end_line": 149,
      "comment": "",
      "child_ranges": [
        "(line 132,col 9)-(line 135,col 9)",
        "(line 137,col 9)-(line 139,col 9)",
        "(line 141,col 9)-(line 147,col 9)",
        "(line 148,col 9)-(line 148,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Range.getMinimum()",
      "begin_line": 159,
      "end_line": 161,
      "comment": "\n     * \u003cp\u003eGets the minimum value in this range.\u003c/p\u003e\n     *\n     * @return the minimum value in this range\n     ",
      "child_ranges": [
        "(line 160,col 9)-(line 160,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Range.getMaximum()",
      "begin_line": 168,
      "end_line": 170,
      "comment": "\n     * \u003cp\u003eGets the maximum value in this range.\u003c/p\u003e\n     *\n     * @return the maximum value in this range\n     ",
      "child_ranges": [
        "(line 169,col 9)-(line 169,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Range.getComparator()",
      "begin_line": 177,
      "end_line": 179,
      "comment": "\n     * \u003cp\u003eGets the comparator being used to determine if objects are within the range. \u003c/p\u003e\n     *\n     * @return the comparator being used\n     ",
      "child_ranges": [
        "(line 178,col 9)-(line 178,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Range.isDefaultNaturalOrdering()",
      "begin_line": 187,
      "end_line": 189,
      "comment": "\n     * \u003cp\u003eWhether or not the Range is using the default natural comparison method \n     * to compare elements. \u003c/p\u003e\n     *\n     * @return whether or not the default Comparator is in use\n     ",
      "child_ranges": [
        "(line 188,col 9)-(line 188,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Range.contains(T)",
      "begin_line": 202,
      "end_line": 207,
      "comment": "\n     * \u003cp\u003eTests whether the specified element occurs within this range.\u003c/p\u003e\n     * \n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is handled and returns \u003ccode\u003efalse\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param element  the element to test, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the specified element occurs within this range\n     ",
      "child_ranges": [
        "(line 203,col 9)-(line 205,col 9)",
        "(line 206,col 9)-(line 206,col 115)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Range.elementBefore(T)",
      "begin_line": 217,
      "end_line": 223,
      "comment": "\n     * \u003cp\u003eTests whether the specified element occurs before this range.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is handled and returns \u003ccode\u003efalse\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param element  the element to test, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the specified element occurs before this range\n     ",
      "child_ranges": [
        "(line 218,col 9)-(line 220,col 9)",
        "(line 222,col 9)-(line 222,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Range.elementAfter(T)",
      "begin_line": 233,
      "end_line": 239,
      "comment": "\n     * \u003cp\u003eTests whether the specified element occurs after this range.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is handled and returns \u003ccode\u003efalse\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param element  the element to test, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the specified element occurs after this range\n     ",
      "child_ranges": [
        "(line 234,col 9)-(line 236,col 9)",
        "(line 238,col 9)-(line 238,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Range.elementCompareTo(T)",
      "begin_line": 250,
      "end_line": 263,
      "comment": "\n     * \u003cp\u003eTests where the specified element occurs relative to this range.\u003c/p\u003e\n     * \u003cp\u003eThe API is reminiscent of the Comparable interface returning \u003ccode\u003e-1\u003c/code\u003e if \n     * the element is before the range, \u003ccode\u003e0\u003c/code\u003e if contained within the range and \n     * \u003ccode\u003e1\u003c/code\u003e if the element is after the range. \u003c/p\u003e\n     *\n     * @param element  the element to test\n     * @return -1, 0 or +1 depending on the element\u0027s location relative to the range\n     ",
      "child_ranges": [
        "(line 251,col 9)-(line 254,col 9)",
        "(line 255,col 9)-(line 262,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Range.containsRange(org.apache.commons.lang3.Range\u003cT\u003e)",
      "begin_line": 278,
      "end_line": 284,
      "comment": "\n     * \u003cp\u003eTests whether the specified range occurs entirely within this range.\u003c/p\u003e\n     * \n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is handled and returns \u003ccode\u003efalse\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @param range  the range to test, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the specified range occurs entirely within\n     *  this range; otherwise, \u003ccode\u003efalse\u003c/code\u003e\n     * @throws IllegalArgumentException if the \u003ccode\u003eRange\u003c/code\u003e cannot be compared\n     ",
      "child_ranges": [
        "(line 279,col 9)-(line 281,col 9)",
        "(line 282,col 9)-(line 283,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Range.overlapsRange(org.apache.commons.lang3.Range\u003cT\u003e)",
      "begin_line": 296,
      "end_line": 303,
      "comment": "\n     * \u003cp\u003eTests whether the specified range overlaps with this range.\u003c/p\u003e\n     * \n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is handled and returns \u003ccode\u003efalse\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @param range  the range to test, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the specified range overlaps with this\n     *  range; otherwise, \u003ccode\u003efalse\u003c/code\u003e\n     * @throws IllegalArgumentException if the \u003ccode\u003eRange\u003c/code\u003e cannot be compared\n     ",
      "child_ranges": [
        "(line 297,col 9)-(line 299,col 9)",
        "(line 300,col 9)-(line 302,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Range.equals(java.lang.Object)",
      "begin_line": 316,
      "end_line": 328,
      "comment": "\n     * \u003cp\u003eCompares this range to another object to test if they are equal.\u003c/p\u003e.\n     * \n     * \u003cp\u003eTo be equal, the class, minimum and maximum must be equal.\u003c/p\u003e\n     * \n     * @param obj the reference object with which to compare\n     * @return \u003ccode\u003etrue\u003c/code\u003e if this object is equal\n     ",
      "child_ranges": [
        "(line 318,col 9)-(line 327,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Range.hashCode()",
      "begin_line": 335,
      "end_line": 346,
      "comment": "\n     * \u003cp\u003eGets a hashCode for the range.\u003c/p\u003e\n     * \n     * @return a hash code value for this object\n     ",
      "child_ranges": [
        "(line 337,col 9)-(line 337,col 30)",
        "(line 338,col 9)-(line 344,col 9)",
        "(line 345,col 9)-(line 345,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Range.toString()",
      "begin_line": 355,
      "end_line": 369,
      "comment": "\n     * \u003cp\u003eGets the range as a \u003ccode\u003eString\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe format of the String is \u0027Range[\u003ci\u003emin\u003c/i\u003e,\u003ci\u003emax\u003c/i\u003e]\u0027.\u003c/p\u003e\n     * \n     * @return the \u003ccode\u003eString\u003c/code\u003e representation of this range\n     ",
      "child_ranges": [
        "(line 357,col 9)-(line 357,col 33)",
        "(line 358,col 9)-(line 367,col 9)",
        "(line 368,col 9)-(line 368,col 22)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ComparableComparator",
      "is_interface": false,
      "parent_types": [
        "java.util.Comparator\u003cE\u003e",
        "java.io.Serializable"
      ],
      "begin_line": 372,
      "end_line": 403,
      "comment": " Taken from Commons Collections - documentation removed as not a public class"
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 374,
      "end_line": 374,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "INSTANCE"
      ],
      "begin_line": 376,
      "end_line": 377,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Range.ComparableComparator.getInstance()",
      "begin_line": 379,
      "end_line": 382,
      "comment": "",
      "child_ranges": [
        "(line 381,col 13)-(line 381,col 54)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.Range.ComparableComparator.ComparableComparator()",
      "begin_line": 384,
      "end_line": 386,
      "comment": "",
      "child_ranges": [
        "(line 385,col 13)-(line 385,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Range.ComparableComparator.compare(E, E)",
      "begin_line": 388,
      "end_line": 390,
      "comment": "",
      "child_ranges": [
        "(line 389,col 13)-(line 389,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Range.ComparableComparator.hashCode()",
      "begin_line": 392,
      "end_line": 395,
      "comment": "",
      "child_ranges": [
        "(line 394,col 13)-(line 394,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Range.ComparableComparator.equals(java.lang.Object)",
      "begin_line": 397,
      "end_line": 401,
      "comment": "",
      "child_ranges": [
        "(line 399,col 13)-(line 400,col 85)"
      ]
    }
  ]
}