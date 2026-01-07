{
  "filepath": "/tmp/Lang-22b/src/main/java/org/apache/commons/lang3/Range.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Range",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 32,
      "end_line": 408,
      "comment": "\n * \u003cp\u003e\u003ccode\u003eRange\u003c/code\u003e represents an immutable range of numbers of the same type.\u003c/p\u003e\n * \u003cp\u003eThe objects need to either be implementations of \u003ccode\u003ejava.lang.Comparable\u003c/code\u003e\n * or you need to supply a \u003ccode\u003ejava.util.Comparator\u003c/code\u003e. \u003c/p\u003e\n * \n * \u003cp\u003e#ThreadSafe#\u003c/p\u003e\n * @author Apache Software Foundation\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": "\n     * Required for serialization support.\n     * \n     * @see java.io.Serializable\n     "
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
      "begin_line": 49,
      "end_line": 49,
      "comment": "\n     * The minimum value in this range (inclusive).\n     "
    },
    {
      "type": "field",
      "varNames": [
        "maximum"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": "\n     * The maximum value in this range (inclusive).\n     "
    },
    {
      "type": "field",
      "varNames": [
        "hashCode"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": "\n     * Cached output hashCode (class is immutable).\n     "
    },
    {
      "type": "field",
      "varNames": [
        "toString"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": "\n     * Cached output toString (class is immutable).\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Range.is(T)",
      "begin_line": 77,
      "end_line": 79,
      "comment": "\n     * \u003cp\u003eConstructs a new \u003ccode\u003eRange\u003c/code\u003e using the specified\n     * element as both the minimum and maximum in this range.\u003c/p\u003e\n     * \u003cp\u003eThe range uses the natural ordering of the elements to \n     * determine where values lie in the range.\u003c/p\u003e\n     *\n     * @param element  the value to use for this range, must not be \u003ccode\u003enull\u003c/code\u003e\n     * @return the new range object\n     * @throws IllegalArgumentException if the value is \u003ccode\u003enull\u003c/code\u003e\n     * @throws ClassCastException if the value is not Comparable\n     ",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Range.between(T, T)",
      "begin_line": 96,
      "end_line": 98,
      "comment": "\n     * \u003cp\u003eConstructs a new \u003ccode\u003eRange\u003c/code\u003e with the specified\n     * minimum and maximum values (both inclusive).\u003c/p\u003e\n     * \u003cp\u003eThe range uses the natural ordering of the elements to \n     * determine where values lie in the range.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe arguments may be passed in the order (min,max) or (max,min). The\n     * getMinimum and getMaximum methods will return the correct values.\u003c/p\u003e\n     *\n     * @param element1  first value that defines the edge of the range, inclusive\n     * @param element2  second value that defines the edge of the range, inclusive\n     * @return the new range object\n     * @throws IllegalArgumentException if either value is \u003ccode\u003enull\u003c/code\u003e\n     * @throws ClassCastException if either value is not Comparable\n     ",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 88)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Range.is(T, java.util.Comparator\u003cT\u003e)",
      "begin_line": 111,
      "end_line": 113,
      "comment": "\n     * \u003cp\u003eConstructs a new \u003ccode\u003eRange\u003c/code\u003e using the specified\n     * element as both the minimum and maximum in this range.\u003c/p\u003e\n     * \u003cp\u003eThe range uses the passed in \u003ccode\u003eComparator\u003c/code\u003e to \n     * determine where values lie in the range.\u003c/p\u003e\n     *\n     * @param element  the value to use for this range, must not be \u003ccode\u003enull\u003c/code\u003e\n     * @param c comparator to be used\n     * @return the new range object\n     * @throws IllegalArgumentException if the value is \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 112,col 9)-(line 112,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Range.between(T, T, java.util.Comparator\u003cT\u003e)",
      "begin_line": 130,
      "end_line": 132,
      "comment": "\n     * \u003cp\u003eConstructs a new \u003ccode\u003eRange\u003c/code\u003e with the specified\n     * minimum and maximum values (both inclusive).\u003c/p\u003e\n     * \u003cp\u003eThe range uses the passed in \u003ccode\u003eComparator\u003c/code\u003e to \n     * determine where values lie in the range.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe arguments may be passed in the order (min,max) or (max,min). The\n     * getMinimum and getMaximum methods will return the correct values.\u003c/p\u003e\n     *\n     * @param element1  first value that defines the edge of the range, inclusive\n     * @param element2  second value that defines the edge of the range, inclusive\n     * @param c comparator to be used\n     * @return the new range object\n     * @throws IllegalArgumentException if either value is \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 131,col 9)-(line 131,col 51)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.Range.Range(T, T, java.util.Comparator\u003cT\u003e)",
      "begin_line": 134,
      "end_line": 152,
      "comment": "",
      "child_ranges": [
        "(line 135,col 9)-(line 138,col 9)",
        "(line 140,col 9)-(line 142,col 9)",
        "(line 144,col 9)-(line 150,col 9)",
        "(line 151,col 9)-(line 151,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Range.getMinimum()",
      "begin_line": 162,
      "end_line": 164,
      "comment": "\n     * \u003cp\u003eGets the minimum value in this range.\u003c/p\u003e\n     *\n     * @return the minimum value in this range\n     ",
      "child_ranges": [
        "(line 163,col 9)-(line 163,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Range.getMaximum()",
      "begin_line": 171,
      "end_line": 173,
      "comment": "\n     * \u003cp\u003eGets the maximum value in this range.\u003c/p\u003e\n     *\n     * @return the maximum value in this range\n     ",
      "child_ranges": [
        "(line 172,col 9)-(line 172,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Range.getComparator()",
      "begin_line": 180,
      "end_line": 182,
      "comment": "\n     * \u003cp\u003eGets the comparator being used to determine if objects are within the range. \u003c/p\u003e\n     *\n     * @return the comparator being used\n     ",
      "child_ranges": [
        "(line 181,col 9)-(line 181,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Range.isDefaultNaturalOrdering()",
      "begin_line": 190,
      "end_line": 192,
      "comment": "\n     * \u003cp\u003eWhether or not the Range is using the default natural comparison method \n     * to compare elements. \u003c/p\u003e\n     *\n     * @return whether or not the default Comparator is in use\n     ",
      "child_ranges": [
        "(line 191,col 9)-(line 191,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Range.contains(T)",
      "begin_line": 205,
      "end_line": 210,
      "comment": "\n     * \u003cp\u003eTests whether the specified element occurs within this range.\u003c/p\u003e\n     * \n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is handled and returns \u003ccode\u003efalse\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param element  the element to test, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the specified element occurs within this range\n     ",
      "child_ranges": [
        "(line 206,col 9)-(line 208,col 9)",
        "(line 209,col 9)-(line 209,col 115)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Range.elementBefore(T)",
      "begin_line": 220,
      "end_line": 226,
      "comment": "\n     * \u003cp\u003eTests whether the specified element occurs before this range.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is handled and returns \u003ccode\u003efalse\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param element  the element to test, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the specified element occurs before this range\n     ",
      "child_ranges": [
        "(line 221,col 9)-(line 223,col 9)",
        "(line 225,col 9)-(line 225,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Range.elementAfter(T)",
      "begin_line": 236,
      "end_line": 242,
      "comment": "\n     * \u003cp\u003eTests whether the specified element occurs after this range.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is handled and returns \u003ccode\u003efalse\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param element  the element to test, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the specified element occurs after this range\n     ",
      "child_ranges": [
        "(line 237,col 9)-(line 239,col 9)",
        "(line 241,col 9)-(line 241,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Range.elementCompareTo(T)",
      "begin_line": 253,
      "end_line": 266,
      "comment": "\n     * \u003cp\u003eTests where the specified element occurs relative to this range.\u003c/p\u003e\n     * \u003cp\u003eThe API is reminiscent of the Comparable interface returning \u003ccode\u003e-1\u003c/code\u003e if \n     * the element is before the range, \u003ccode\u003e0\u003c/code\u003e if contained within the range and \n     * \u003ccode\u003e1\u003c/code\u003e if the element is after the range. \u003c/p\u003e\n     *\n     * @param element  the element to test\n     * @return -1, 0 or +1 depending on the element\u0027s location relative to the range\n     ",
      "child_ranges": [
        "(line 254,col 9)-(line 257,col 9)",
        "(line 258,col 9)-(line 265,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Range.containsRange(org.apache.commons.lang3.Range\u003cT\u003e)",
      "begin_line": 281,
      "end_line": 287,
      "comment": "\n     * \u003cp\u003eTests whether the specified range occurs entirely within this range.\u003c/p\u003e\n     * \n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is handled and returns \u003ccode\u003efalse\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @param range  the range to test, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the specified range occurs entirely within\n     *  this range; otherwise, \u003ccode\u003efalse\u003c/code\u003e\n     * @throws IllegalArgumentException if the \u003ccode\u003eRange\u003c/code\u003e cannot be compared\n     ",
      "child_ranges": [
        "(line 282,col 9)-(line 284,col 9)",
        "(line 285,col 9)-(line 286,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Range.overlapsRange(org.apache.commons.lang3.Range\u003cT\u003e)",
      "begin_line": 299,
      "end_line": 306,
      "comment": "\n     * \u003cp\u003eTests whether the specified range overlaps with this range.\u003c/p\u003e\n     * \n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is handled and returns \u003ccode\u003efalse\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @param range  the range to test, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the specified range overlaps with this\n     *  range; otherwise, \u003ccode\u003efalse\u003c/code\u003e\n     * @throws IllegalArgumentException if the \u003ccode\u003eRange\u003c/code\u003e cannot be compared\n     ",
      "child_ranges": [
        "(line 300,col 9)-(line 302,col 9)",
        "(line 303,col 9)-(line 305,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Range.equals(java.lang.Object)",
      "begin_line": 319,
      "end_line": 331,
      "comment": "\n     * \u003cp\u003eCompares this range to another object to test if they are equal.\u003c/p\u003e.\n     * \n     * \u003cp\u003eTo be equal, the class, minimum and maximum must be equal.\u003c/p\u003e\n     * \n     * @param obj the reference object with which to compare\n     * @return \u003ccode\u003etrue\u003c/code\u003e if this object is equal\n     ",
      "child_ranges": [
        "(line 321,col 9)-(line 330,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Range.hashCode()",
      "begin_line": 338,
      "end_line": 349,
      "comment": "\n     * \u003cp\u003eGets a hashCode for the range.\u003c/p\u003e\n     * \n     * @return a hash code value for this object\n     ",
      "child_ranges": [
        "(line 340,col 9)-(line 340,col 30)",
        "(line 341,col 9)-(line 347,col 9)",
        "(line 348,col 9)-(line 348,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Range.toString()",
      "begin_line": 358,
      "end_line": 372,
      "comment": "\n     * \u003cp\u003eGets the range as a \u003ccode\u003eString\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe format of the String is \u0027Range[\u003ci\u003emin\u003c/i\u003e,\u003ci\u003emax\u003c/i\u003e]\u0027.\u003c/p\u003e\n     * \n     * @return the \u003ccode\u003eString\u003c/code\u003e representation of this range\n     ",
      "child_ranges": [
        "(line 360,col 9)-(line 360,col 33)",
        "(line 361,col 9)-(line 370,col 9)",
        "(line 371,col 9)-(line 371,col 22)"
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
      "begin_line": 375,
      "end_line": 406,
      "comment": " Taken from Commons Collections - documentation removed as not a public class"
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 377,
      "end_line": 377,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "INSTANCE"
      ],
      "begin_line": 379,
      "end_line": 380,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Range.ComparableComparator.getInstance()",
      "begin_line": 382,
      "end_line": 385,
      "comment": "",
      "child_ranges": [
        "(line 384,col 13)-(line 384,col 54)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.Range.ComparableComparator.ComparableComparator()",
      "begin_line": 387,
      "end_line": 389,
      "comment": "",
      "child_ranges": [
        "(line 388,col 13)-(line 388,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Range.ComparableComparator.compare(E, E)",
      "begin_line": 391,
      "end_line": 393,
      "comment": "",
      "child_ranges": [
        "(line 392,col 13)-(line 392,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Range.ComparableComparator.hashCode()",
      "begin_line": 395,
      "end_line": 398,
      "comment": "",
      "child_ranges": [
        "(line 397,col 13)-(line 397,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Range.ComparableComparator.equals(java.lang.Object)",
      "begin_line": 400,
      "end_line": 404,
      "comment": "",
      "child_ranges": [
        "(line 402,col 13)-(line 403,col 85)"
      ]
    }
  ]
}