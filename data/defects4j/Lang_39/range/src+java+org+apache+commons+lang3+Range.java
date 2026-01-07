{
  "filepath": "/tmp/Lang-39b/src/java/org/apache/commons/lang3/Range.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Range",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 30,
      "end_line": 362,
      "comment": " TODO: Make class final and use fields instead of getters?"
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "comparator"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "minimum"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "maximum"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Range.is(T)",
      "begin_line": 48,
      "end_line": 50,
      "comment": "\n     * \u003cp\u003eConstructs a new \u003ccode\u003eRange\u003c/code\u003e using the specified\n     * element as both the minimum and maximum in this range.\u003c/p\u003e\n     * \u003cp\u003eThe range uses the natural ordering of the elements to \n     * determine where values lie in the range.\u003c/p\u003e\n     *\n     * @param element  the value to use for this range, must not be \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if the value is \u003ccode\u003enull\u003c/code\u003e\n     * @throws ClassCastException if the value is not Comparable\n     ",
      "child_ranges": [
        "(line 49,col 9)-(line 49,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Range.between(T, T)",
      "begin_line": 66,
      "end_line": 68,
      "comment": "\n     * \u003cp\u003eConstructs a new \u003ccode\u003eRange\u003c/code\u003e with the specified\n     * minimum and maximum values (both inclusive).\u003c/p\u003e\n     * \u003cp\u003eThe range uses the natural ordering of the elements to \n     * determine where values lie in the range.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe arguments may be passed in the order (min,max) or (max,min). The\n     * getMinimum and getMaximum methods will return the correct values.\u003c/p\u003e\n     *\n     * @param element1  first value that defines the edge of the range, inclusive\n     * @param element2  second value that defines the edge of the range, inclusive\n     * @throws IllegalArgumentException if either value is \u003ccode\u003enull\u003c/code\u003e\n     * @throws ClassCastException if either value is not Comparable\n     ",
      "child_ranges": [
        "(line 67,col 9)-(line 67,col 88)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Range.is(T, java.util.Comparator\u003cT\u003e)",
      "begin_line": 80,
      "end_line": 82,
      "comment": "\n     * \u003cp\u003eConstructs a new \u003ccode\u003eRange\u003c/code\u003e using the specified\n     * element as both the minimum and maximum in this range.\u003c/p\u003e\n     * \u003cp\u003eThe range uses the passed in \u003ccode\u003eComparator\u003c/code\u003e to \n     * determine where values lie in the range.\u003c/p\u003e\n     *\n     * @param element  the value to use for this range, must not be \u003ccode\u003enull\u003c/code\u003e\n     * @param c comparator to be used\n     * @throws IllegalArgumentException if the value is \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Range.between(T, T, java.util.Comparator\u003cT\u003e)",
      "begin_line": 98,
      "end_line": 100,
      "comment": "\n     * \u003cp\u003eConstructs a new \u003ccode\u003eRange\u003c/code\u003e with the specified\n     * minimum and maximum values (both inclusive).\u003c/p\u003e\n     * \u003cp\u003eThe range uses the passed in \u003ccode\u003eComparator\u003c/code\u003e to \n     * determine where values lie in the range.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe arguments may be passed in the order (min,max) or (max,min). The\n     * getMinimum and getMaximum methods will return the correct values.\u003c/p\u003e\n     *\n     * @param element1  first value that defines the edge of the range, inclusive\n     * @param element2  second value that defines the edge of the range, inclusive\n     * @param c comparator to be used\n     * @throws IllegalArgumentException if either value is \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 51)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.Range.Range(T, T, java.util.Comparator\u003cT\u003e)",
      "begin_line": 102,
      "end_line": 120,
      "comment": "",
      "child_ranges": [
        "(line 103,col 9)-(line 106,col 9)",
        "(line 108,col 9)-(line 110,col 9)",
        "(line 112,col 9)-(line 118,col 9)",
        "(line 119,col 9)-(line 119,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Range.getMinimum()",
      "begin_line": 130,
      "end_line": 132,
      "comment": "\n     * \u003cp\u003eGets the minimum value in this range.\u003c/p\u003e\n     *\n     * @return the minimum value in this range\n     ",
      "child_ranges": [
        "(line 131,col 9)-(line 131,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Range.getMaximum()",
      "begin_line": 139,
      "end_line": 141,
      "comment": "\n     * \u003cp\u003eGets the maximum value in this range.\u003c/p\u003e\n     *\n     * @return the maximum value in this range\n     ",
      "child_ranges": [
        "(line 140,col 9)-(line 140,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Range.getComparator()",
      "begin_line": 148,
      "end_line": 150,
      "comment": "\n     * \u003cp\u003eGets the comparator being used to determine if objects are within the range. \u003c/p\u003e\n     *\n     * @return the comparator being used\n     ",
      "child_ranges": [
        "(line 149,col 9)-(line 149,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Range.isDefaultNaturalOrdering()",
      "begin_line": 158,
      "end_line": 160,
      "comment": "\n     * \u003cp\u003eWhether or not the Range is using the default natural comparison method \n     * to compare elements. \u003c/p\u003e\n     *\n     * @return whether or not the default Comparator is in use\n     ",
      "child_ranges": [
        "(line 159,col 9)-(line 159,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Range.contains(T)",
      "begin_line": 173,
      "end_line": 178,
      "comment": "\n     * \u003cp\u003eTests whether the specified element occurs within this range.\u003c/p\u003e\n     * \n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is handled and returns \u003ccode\u003efalse\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param element  the element to test, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the specified element occurs within this range\n     ",
      "child_ranges": [
        "(line 174,col 9)-(line 176,col 9)",
        "(line 177,col 9)-(line 177,col 115)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Range.elementBefore(T)",
      "begin_line": 186,
      "end_line": 192,
      "comment": "\n     * \u003cp\u003eTests whether the specified element occurs before this range.\u003c/p\u003e\n     *\n     * @param element  the element to test\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the specified element occurs before this range\n     ",
      "child_ranges": [
        "(line 187,col 9)-(line 189,col 9)",
        "(line 191,col 9)-(line 191,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Range.elementAfter(T)",
      "begin_line": 200,
      "end_line": 206,
      "comment": "\n     * \u003cp\u003eTests whether the specified element occurs after this range.\u003c/p\u003e\n     *\n     * @param element  the element to test\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the specified element occurs after this range\n     ",
      "child_ranges": [
        "(line 201,col 9)-(line 203,col 9)",
        "(line 205,col 9)-(line 205,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Range.elementCompareTo(T)",
      "begin_line": 217,
      "end_line": 230,
      "comment": "\n     * \u003cp\u003eTests where the specified element occurs relative to this range.\u003c/p\u003e\n     * \u003cp\u003eThe API is reminiscent of the Comparable interface returning \u003ccode\u003e-1\u003c/code\u003e if \n     * the element is before the range, \u003ccode\u003e0\u003c/code\u003e if contained within the range and \n     * \u003ccode\u003e1\u003c/code\u003e if the element is after the range. \u003c/p\u003e\n     *\n     * @param element  the element to test\n     * @return -1, 0 or +1 depending on the element\u0027s location relative to the range\n     ",
      "child_ranges": [
        "(line 218,col 9)-(line 221,col 9)",
        "(line 222,col 9)-(line 229,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Range.containsRange(org.apache.commons.lang3.Range\u003cT\u003e)",
      "begin_line": 245,
      "end_line": 251,
      "comment": "\n     * \u003cp\u003eTests whether the specified range occurs entirely within this range.\u003c/p\u003e\n     * \n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is handled and returns \u003ccode\u003efalse\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @param range  the range to test, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the specified range occurs entirely within\n     *  this range; otherwise, \u003ccode\u003efalse\u003c/code\u003e\n     * @throws IllegalArgumentException if the \u003ccode\u003eRange\u003c/code\u003e cannot be compared\n     ",
      "child_ranges": [
        "(line 246,col 9)-(line 248,col 9)",
        "(line 249,col 9)-(line 250,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Range.overlapsRange(org.apache.commons.lang3.Range\u003cT\u003e)",
      "begin_line": 263,
      "end_line": 270,
      "comment": "\n     * \u003cp\u003eTests whether the specified range overlaps with this range.\u003c/p\u003e\n     * \n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is handled and returns \u003ccode\u003efalse\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @param range  the range to test, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the specified range overlaps with this\n     *  range; otherwise, \u003ccode\u003efalse\u003c/code\u003e\n     * @throws IllegalArgumentException if the \u003ccode\u003eRange\u003c/code\u003e cannot be compared\n     ",
      "child_ranges": [
        "(line 264,col 9)-(line 266,col 9)",
        "(line 267,col 9)-(line 269,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Range.equals(java.lang.Object)",
      "begin_line": 283,
      "end_line": 295,
      "comment": "\n     * \u003cp\u003eCompares this range to another object to test if they are equal.\u003c/p\u003e.\n     * \n     * \u003cp\u003eTo be equal, the class, minimum and maximum must be equal.\u003c/p\u003e\n     * \n     * @param obj the reference object with which to compare\n     * @return \u003ccode\u003etrue\u003c/code\u003e if this object is equal\n     ",
      "child_ranges": [
        "(line 285,col 9)-(line 294,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Range.hashCode()",
      "begin_line": 302,
      "end_line": 309,
      "comment": "\n     * \u003cp\u003eGets a hashCode for the range.\u003c/p\u003e\n     * \n     * @return a hash code value for this object\n     ",
      "child_ranges": [
        "(line 304,col 9)-(line 304,col 24)",
        "(line 305,col 9)-(line 305,col 53)",
        "(line 306,col 9)-(line 306,col 55)",
        "(line 307,col 9)-(line 307,col 55)",
        "(line 308,col 9)-(line 308,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Range.toString()",
      "begin_line": 318,
      "end_line": 327,
      "comment": "\n     * \u003cp\u003eGets the range as a \u003ccode\u003eString\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe format of the String is \u0027Range[\u003ci\u003emin\u003c/i\u003e,\u003ci\u003emax\u003c/i\u003e]\u0027.\u003c/p\u003e\n     * \n     * @return the \u003ccode\u003eString\u003c/code\u003e representation of this range\n     ",
      "child_ranges": [
        "(line 320,col 9)-(line 320,col 50)",
        "(line 321,col 9)-(line 321,col 29)",
        "(line 322,col 9)-(line 322,col 33)",
        "(line 323,col 9)-(line 323,col 24)",
        "(line 324,col 9)-(line 324,col 33)",
        "(line 325,col 9)-(line 325,col 24)",
        "(line 326,col 9)-(line 326,col 30)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ComparableComparator",
      "is_interface": false,
      "parent_types": [
        "java.util.Comparator\u003cE\u003e"
      ],
      "begin_line": 331,
      "end_line": 360,
      "comment": " Taken from Commons Collections - documentation removed as not a public class"
    },
    {
      "type": "field",
      "varNames": [
        "INSTANCE"
      ],
      "begin_line": 333,
      "end_line": 334,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Range.ComparableComparator.getInstance()",
      "begin_line": 336,
      "end_line": 339,
      "comment": "",
      "child_ranges": [
        "(line 338,col 13)-(line 338,col 54)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.Range.ComparableComparator.ComparableComparator()",
      "begin_line": 341,
      "end_line": 343,
      "comment": "",
      "child_ranges": [
        "(line 342,col 13)-(line 342,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Range.ComparableComparator.compare(E, E)",
      "begin_line": 345,
      "end_line": 347,
      "comment": "",
      "child_ranges": [
        "(line 346,col 13)-(line 346,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Range.ComparableComparator.hashCode()",
      "begin_line": 349,
      "end_line": 352,
      "comment": "",
      "child_ranges": [
        "(line 351,col 13)-(line 351,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Range.ComparableComparator.equals(java.lang.Object)",
      "begin_line": 354,
      "end_line": 358,
      "comment": "",
      "child_ranges": [
        "(line 356,col 13)-(line 357,col 85)"
      ]
    }
  ]
}